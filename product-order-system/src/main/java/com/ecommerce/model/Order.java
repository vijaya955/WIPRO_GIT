package com.ecommerce.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity(name = "Orders")
public class Order {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Customer customer;

    @ManyToOne
    private Product product;

    private int quantity;
    private LocalDate orderDate;
    private String status;

    // Getters, Setters, Constructors
    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    
}
