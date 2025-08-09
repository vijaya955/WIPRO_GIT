package com.contact.ContactServiceService;
import com.contact.ContactServiceModel.ContactModel;
import java.util.List;

public interface ContactService {
    List<ContactModel> getContactsByUserId(Long userId);
}
