package com.contact.ContactAssessment;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.contact.model.Contact;
import com.contact.repository.ContactRepository;
import com.contact.service.ContactServiceImpl;

@SpringBootTest
class ContactAssessmentApplicationTests {

	@Mock
    private ContactRepository repo; 

	@InjectMocks
    private ContactServiceImpl contactService;

    @Test
    void testGetContactByIdFound() {
        Contact contact = new Contact();
        contact.setcId(1L);
        contact.setContactName("John Doe");
        contact.setEmail("john.doe@example.com");

        when(repo.findById(1L)).thenReturn(Optional.of(contact));

        Contact result = contactService.getcontactOfUser(1L);

        assertNotNull(result);
        assertEquals("John Doe", result.getContactName());
    }

    @Test
    void testAddContact() {
        Contact contact = new Contact();
        contact.setcId(1L);
        contact.setContactName("John Doe");
        contact.setEmail("john.doe@example.com");

        when(repo.save(contact)).thenReturn(contact);
        when(repo.findById(1L)).thenReturn(Optional.of(contact));

        Contact result = contactService.addContact(contact);

        assertEquals("John Doe", result.getContactName());
    }

    @Test
    void testUpdateContactSuccess() {
        Contact updatedContact = new Contact();
        updatedContact.setcId(1L);
        updatedContact.setContactName("Jane Smith");
        updatedContact.setEmail("jane.smith@example.com");

        when(repo.existsById(1L)).thenReturn(true);
        when(repo.save(updatedContact)).thenReturn(updatedContact);
        when(repo.findById(1L)).thenReturn(Optional.of(updatedContact));

        Contact result = contactService.updatecontact(updatedContact);

        assertEquals("Jane Smith", result.getContactName());
        assertEquals("jane.smith@example.com", result.getEmail());
    }

    @Test
    void testDeleteContactSuccess() {
        when(repo.existsById(1L)).thenReturn(true);
        doNothing().when(repo).deleteById(1L);
        when(repo.findById(1L)).thenReturn(Optional.empty());

        contactService.deletecontact(1L);

        Contact result = contactService.getcontactOfUser(1L);

        assertNull(result);
    }
    @Test
    void contextLoads() {}
}
