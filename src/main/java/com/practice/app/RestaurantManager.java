package com.practice.app;

import java.util.ArrayList;
import java.util.List;

public class RestaurantManager {
    private List<Restaurant> restaurants;

    public RestaurantManager() {
        this.restaurants = new ArrayList<>();
    }

    public void addRestaurant(String name, String managerUsername, String type, int startTime, int endTime, String description, String address) {
        Restaurant restaurant = new Restaurant(name, managerUsername, type, startTime, endTime, description, address);
        restaurants.add(restaurant);
        System.out.println(restaurants.size() + " restaurant is added to this, happy");
    }
}
