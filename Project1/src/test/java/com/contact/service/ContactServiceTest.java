package com.contact.service;

import com.contact.model.Contact;
import com.contact.repository.ContactRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.*;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class ContactServiceTest {

    @InjectMocks
    private ContactService contactService;

    @Mock
    private ContactRepository contactRepository;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void getContactsByUserId_returnsContactList() {
        Contact contact = new Contact(1L, "John Doe", 1L);
        when(contactRepository.findByUserId(1L)).thenReturn(List.of(contact));

        List<Contact> contacts = contactService.getContactsByUserId(1L);

        assertEquals(1, contacts.size());
        assertEquals("John Doe", contacts.get(0).getContactName());
        verify(contactRepository, times(1)).findByUserId(1L);
    }

    @Test
    void createContact_savesAndReturnsContact() {
        Contact contact = new Contact(null, "New Contact", 2L);
        when(contactRepository.save(contact)).thenReturn(contact);

        Contact result = contactService.createContact(contact);

        assertNotNull(result);
        verify(contactRepository, times(1)).save(contact);
    }
}
