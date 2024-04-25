package com.practice.app;

import com.practice.app.exceptions.AddRestaurantDuplicateNameError;

import java.util.HashSet;

public class RestaurantValidator {
    private Restaurant restaurant;

    public RestaurantValidator(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public void validate(HashSet<String> names) throws Exception{
        validateNameDoesNotExist(names);
    }

    private void validateNameDoesNotExist(HashSet<String> names) throws Exception {
        if (names.contains(restaurant.getName())) {
            throw new AddRestaurantDuplicateNameError();
        }
    }
}
