package com.practice.app;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class RestaurantManager {
    private List<Restaurant> restaurants;

    private HashSet<String> names;

    public RestaurantManager() {
        this.restaurants = new ArrayList<>();
        this.names = new HashSet<>();
    }

    public void addRestaurant(Restaurant restaurant) throws Exception {
        RestaurantValidator rv = new RestaurantValidator(restaurant);
        rv.validate(names);

        restaurants.add(restaurant);
        names.add(restaurant.getName());
    }
}
