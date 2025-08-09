package com.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class UserServiceApplication {
 
    public static void main(String[] args) {
        SpringApplication.run(UserServiceApplication.class, args);
    }

    // This bean allows us to call other services (like ContactService) via HTTP
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}