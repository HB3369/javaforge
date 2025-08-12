package com.paymentservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class PaymentserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(PaymentserviceApplication.class, args);
    }

    @GetMapping("/health")
    public String health() {
        return "🚀 Paymentservice is running!";
    }
}