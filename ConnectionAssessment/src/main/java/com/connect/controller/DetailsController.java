package com.connect.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.connect.model.Contact;
import com.connect.model.Details;
import com.connect.model.User;
import com.connect.service.ContactService;
import com.connect.service.DetailsService;

@RestController
@RequestMapping("/details")
public class DetailsController {

    @Autowired
    private DetailsService userService;

    @Autowired
    private ContactService contactClient;

    @GetMapping("/{userId}")
    public ResponseEntity<Details> getUser(@PathVariable Long userId) {
    	User user = userService.getUserbyId(userId);
    	Details details = new Details();
    	details.setUserId(user.getUserId());
    	details.setName(user.getName());
    	details.setPhone(user.getPhone());
        List<Contact> contacts = contactClient.getContactsByUserId(userId);
        details.setContacts(contacts);
        return ResponseEntity.ok(details);
    }

}

