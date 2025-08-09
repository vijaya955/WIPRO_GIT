package com.ecommerce.service;

import com.ecommerce.model.Customer;
import com.ecommerce.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    private final CustomerRepository repo;

    public CustomerService(CustomerRepository repo) {
        this.repo = repo;
    }

    public Customer addCustomer(Customer customer) {
        return repo.save(customer);
    }

    public List<Customer> getAll() {
        return repo.findAll();
    }
}
