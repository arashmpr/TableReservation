package com.practice.app;

import java.util.ArrayList;
import java.util.List;

public class RestaurantManager {
    private List<Restaurant> restaurants;

    public RestaurantManager() {
        this.restaurants = new ArrayList<>();
    }

    public void addRestaurant(Restaurant restaurant) {
        restaurants.add(restaurant);
    }
}
