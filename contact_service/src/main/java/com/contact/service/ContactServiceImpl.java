package com.contact.service;

import com.contact.entity.Contact;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContactServiceImpl implements ContactService {

    //fake list of contacts

    List<Contact> list = List.of(
            new Contact(1L, "Lee@gmail.com", "Lee", 101L),
            new Contact(2L, "John@gmail.com", "John", 102L),
            new Contact(3L, "Johnson@gmail.com", "Johnson", 103L),
            new Contact(4L, "sameer@gmail.com", "Sameer", 104L)
    );


    @Override
    public List<Contact> getContactsOfUser(Long userId) {
        return list.stream().filter(contact -> contact.getUserId().equals(userId)).collect(Collectors.toList());
    }
}