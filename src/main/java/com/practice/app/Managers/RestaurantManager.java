package com.practice.app.Managers;

import com.practice.app.Models.Restaurant;
import com.practice.app.Validators.RestaurantValidator;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class RestaurantManager {
    private static final RestaurantManager INSTANCE = new RestaurantManager();
    private List<Restaurant> restaurants;

    private HashSet<String> names;
    private RestaurantManager() {
        this.restaurants = new ArrayList<>();
        this.names = new HashSet<>();
    }

    public static RestaurantManager getInstance() {
        return INSTANCE;
    }

    public void addRestaurant(Restaurant restaurant) throws Exception {

        RestaurantValidator rv = new RestaurantValidator(restaurant);
        rv.validate();

        restaurants.add(restaurant);
        names.add(restaurant.getName());
    }

    public HashSet<String> getNames() {
        return names;
    }
}
