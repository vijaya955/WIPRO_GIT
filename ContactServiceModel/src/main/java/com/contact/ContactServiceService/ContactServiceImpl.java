package com.contact.ContactServiceService;
import com.contact.ContactServiceModel.ContactModel;

import com.contact.ContactServiceRepository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactServiceImpl implements ContactService {

    @Autowired
    private ContactRepository contactRepository;

    @Override
    public List<ContactModel> getContactsByUserId(Long userId) {
        return contactRepository.findByUserId(userId);
    }
}
