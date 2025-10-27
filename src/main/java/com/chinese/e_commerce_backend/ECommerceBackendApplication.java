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

    @Bean
    CommandLineRunner commandLineRunner(ProductRepository productRepository) {
        return args -> {
            Product product = new Product("Banana", 5000, 20);
            productRepository.save(product);
        };
    }
}
