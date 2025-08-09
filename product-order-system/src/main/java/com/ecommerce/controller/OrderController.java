package com.ecommerce.controller;

import com.ecommerce.model.Order;
import com.ecommerce.service.OrderService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {
    private final OrderService service;

    public OrderController(OrderService service) {
        this.service = service;
    }

    @PostMapping
    public Order place(@RequestBody Order order) {
        return service.placeOrder(order);
    }

    @GetMapping
    public List<Order> list() {
        return service.getAllOrders();
    }
}
