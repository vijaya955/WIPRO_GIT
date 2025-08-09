package com.user.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.user.model.Order;
import com.user.service.OrderService;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {
	
	@Autowired
    private final OrderService service;

    public OrderController(OrderService service) {
        this.service = service;
    }

    @PostMapping("/add")
    public Order place(@RequestBody Order order) {
        return service.placeOrder(order);
    }

    @GetMapping("/get")
    public List<Order> list() {
        return service.getAllOrders();
    }
}

