package com.restaurant.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restaurant.model.Restaurant;
import com.restaurant.service.Restaurantservice;


@RestController
@RequestMapping("/rest")

public class RestaurantController {

    @Autowired
    private Restaurantservice restaurantservice;

    @GetMapping("/get")
    public List<Restaurant> getAllRestaurants() {
        return restaurantservice.getAllRestaurants();
    }

    @GetMapping("/{id}")
    public Restaurant getRestaurantById(@PathVariable int id) {
        return restaurantservice.getRestaurantById(id);
    }
}
