package com.contact.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.contact.model.Contact;
import com.contact.repository.ContactRepository;

@Service
public class ContactServiceImpl{

   
	@Autowired
	private ContactRepository repo;
	
	public Contact getcontactOfUser(Long id) {
	    return repo.findById(id).orElse(null);
	}
	
	public Contact addContact(Contact contact) {
		return repo.save(contact);
	}
	
	public Contact updatecontact(Contact contact) {
		return repo.save(contact);
	}
	
	public void deletecontact(Long cId) {
		repo.deleteById(cId);
	}
	
	public List<Contact> getContactsByUserId(Long userId) {
        return repo.findByUserId(userId);
    }


	
}