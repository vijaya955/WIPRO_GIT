package com.ecommerce.service;

import com.ecommerce.model.Order;
import com.ecommerce.repository.OrderRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class OrderService {
    private final OrderRepository repo;

    public OrderService(OrderRepository repo) {
        this.repo = repo;
    }

    public Order placeOrder(Order order) {
        order.setOrderDate(LocalDate.now());
        order.setStatus("PLACED");
        return repo.save(order);
    }

    public List<Order> getAllOrders() {
        return repo.findAll();
    }
}
