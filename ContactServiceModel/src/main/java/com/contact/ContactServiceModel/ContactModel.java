package com.contact.ContactServiceModel;

import jakarta.persistence.*;

@Entity
@Table(name = "contacts")
public class ContactModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long contactId;

    private String email;
    private String phone;
    private Long userId;

    public ContactModel() {}

    public ContactModel(Long contactId, String email, String phone, Long userId) {
        this.contactId = contactId;
        this.email = email;
        this.phone = phone;
        this.userId = userId;
    }

    // Getters and setters
    public Long getContactId() {
        return contactId;
    }

    public void setContactId(Long contactId) {
        this.contactId = contactId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
