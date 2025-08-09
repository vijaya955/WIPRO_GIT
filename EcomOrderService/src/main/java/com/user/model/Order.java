package com.user.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity(name = "Orders")
public class Order {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "user_id") 
    private User user;
    private Long product;
    private int quantity;
    private LocalDate orderDate;
    private String status;
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Order(Long id, int quantity, LocalDate orderDate, String status) {//, Product product
		super();
		this.id = id;
//		this.product = product;
		this.quantity = quantity;
		this.orderDate = orderDate;
		this.status = status;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getProduct() {
		return product;
	}
	public void setProduct(Long product) {
		this.product = product;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public LocalDate getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
    
}
