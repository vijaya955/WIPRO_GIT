package com.contact.controller;

import com.contact.model.Contact;
import com.contact.service.ContactService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.ResponseEntity;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class ContactControllerTest {

    @InjectMocks
    private ContactController contactController;

    @Mock
    private ContactService contactService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void getContactsByUserId_returnsContacts() {
        Contact contact = new Contact(1L, "John Doe", 1L);
        when(contactService.getContactsByUserId(1L)).thenReturn(List.of(contact));

        List<Contact> result = contactController.getContactsByUserId(1L);

        assertEquals(1, result.size());
        assertEquals("John Doe", result.get(0).getContactName());
        verify(contactService, times(1)).getContactsByUserId(1L);
    }
}
