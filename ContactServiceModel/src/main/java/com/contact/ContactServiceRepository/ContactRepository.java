package com.contact.ContactServiceRepository;
import com.contact.ContactServiceModel.ContactModel;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ContactRepository extends JpaRepository<ContactModel, Long> {
    List<ContactModel> findByUserId(Long userId);
}
