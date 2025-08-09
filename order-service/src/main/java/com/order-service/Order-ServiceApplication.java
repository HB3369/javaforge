package com.order-service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Order-ServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(Order-ServiceApplication.class, args);
    }

    @GetMapping("/health")
    public String health() {
        return "🚀 order-service is running!";
    }
}