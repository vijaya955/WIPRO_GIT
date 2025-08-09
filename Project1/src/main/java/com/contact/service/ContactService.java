package com.contact.service;

import com.contact.model.Contact;
import com.contact.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactService {

    @Autowired
    private ContactRepository contactRepository;

    public List<Contact> getContactsByUserId(Long userId) {
        return contactRepository.findByUserId(userId);
    }

    public Contact createContact(Contact contact) {
        return contactRepository.save(contact);
    }
}
