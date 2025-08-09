package com.contact;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
public class ContactServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(ContactServiceApplication.class, args);
    }
}
