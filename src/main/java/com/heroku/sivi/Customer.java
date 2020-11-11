package com.heroku.sivi;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Customer {
    @Id
    @GeneratedValue
    private Long id;
    private int age;
    private String name;

    Customer(){}

    public Customer (String name, int age){
        this.name = name;
        this.age = age;
    }
}
