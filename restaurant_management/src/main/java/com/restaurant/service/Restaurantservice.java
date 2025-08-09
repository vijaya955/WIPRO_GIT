package com.restaurant.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.restaurant.model.Restaurant;

@Service
public class Restaurantservice {

    List<Restaurant> restaurantList = new ArrayList<>();

    public Restaurantservice() {
        restaurantList.add(new Restaurant(1, "Food Palace", "Hyderabad"));
        restaurantList.add(new Restaurant(2, "Spice Hub", "Delhi"));
        restaurantList.add(new Restaurant(3, "Tandoori Treats", "Mumbai"));
    }

    public List<Restaurant> getAllRestaurants() {
        return restaurantList;
    }

    public Restaurant getRestaurantById(int id) {
        return restaurantList.stream()
                .filter(r -> r.getId() == id)
                .findFirst()
                .orElse(null);
    }
}
