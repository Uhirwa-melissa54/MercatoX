package com.chinese.e_commerce_backend;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.chinese.e_commerce_backend.entities.Product;
import com.chinese.e_commerce_backend.repository.ProductRepository;

@SpringBootApplication
public class ECommerceBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(ECommerceBackendApplication.class, args);
    }



}
