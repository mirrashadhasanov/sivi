package com.heroku.sivi;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/customers")
public class CustomerController {
    private CustomerRepository customerRepository;

    public CustomerController(CustomerRepository customerRepository){
        this.customerRepository = customerRepository;
    }

    @GetMapping
    List<Customer> customers() {
        return customerRepository.findAll();
    }

    @GetMapping("/{id}")
    Optional<Customer> byId(Long id){
        return customerRepository.findById(id);
    }

    @PostMapping
    Customer save(Customer customer){
        return customerRepository.save(customer);
    }

    @DeleteMapping("/{customer}")
    void delete(@PathVariable Customer customer){
        customerRepository.delete(customer);
    }

    @GetMapping("/search")
    List<Customer> searchByAge(@RequestParam int age){
        return customerRepository.findByAge(age);
    }

}
