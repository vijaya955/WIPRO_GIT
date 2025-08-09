package com.connect.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.connect.model.Contact;

@FeignClient(name = "contact-service", url = "http://localhost:9002")
public interface ContactService {

    @GetMapping("/contact/getcontactbyuserid/{id}")
    List<Contact> getContactsByUserId(@PathVariable("id") Long userId);
}
