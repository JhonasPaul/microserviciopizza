package com.example.efjonathanortizpizza;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@EnableDiscoveryClient
@SpringBootApplication
public class EfJonathanOrtizPizzaApplication {

    public static void main(String[] args) {
        SpringApplication.run(EfJonathanOrtizPizzaApplication.class, args);
    }

}
