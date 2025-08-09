package com.contact.ContactServiceController;

import com.contact.ContactServiceModel.ContactModel;
import com.contact.ContactServiceRepository.ContactRepository;
import com.contact.ContactServiceService.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contact")
public class ContactController {

    @Autowired
    private ContactService contactService;

    @Autowired
    private ContactRepository contactRepository;

    // 🔹 GET all contacts for a given userId
    @GetMapping("/user/{userId}")
    public List<ContactModel> getContactsByUserId(@PathVariable Long userId) {
        return contactService.getContactsByUserId(userId);
    }
}
