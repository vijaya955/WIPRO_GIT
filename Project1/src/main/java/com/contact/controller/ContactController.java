package com.contact.controller;
import com.contact.model.Contact;
import com.contact.repository.ContactRepository;
import com.contact.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contacts")
public class ContactController {

    @Autowired
    private ContactService contactService;

    @Autowired
    private ContactRepository contactRepository;

    // 🔹 GET all contacts for a given userId
    @GetMapping("/user/{Id}")
    public List<Contact> getContactsByUserId(@PathVariable Long userId) {
        return contactService.getContactsByUserId(userId);
    }

    // 🔹 POST a new contact
    @PostMapping
    public Contact createContact(@RequestBody Contact contact) {
        return contactRepository.save(contact);  // or use contactService.saveContact(contact)
    }
}
