package com.practice.app;

import com.practice.app.exceptions.AddRestaurantDuplicateNameError;
import com.practice.app.exceptions.AddRestaurantUserManagerDoesNotExistError;

import java.util.HashSet;

public class RestaurantValidator {
    private Restaurant restaurant;
    private UserManager userManager;

    public RestaurantValidator(Restaurant restaurant, UserManager userManager) {
        this.restaurant = restaurant;
        this.userManager = userManager;
    }

    public void validate(HashSet<String> names) throws Exception{
        validateNameDoesNotExist(names);
        validateUserManagerExists();
    }

    private void validateNameDoesNotExist(HashSet<String> names) throws Exception {
        if (names.contains(restaurant.getName())) {
            throw new AddRestaurantDuplicateNameError();
        }
    }

    private void validateUserManagerExists() throws Exception {
        if (!userManager.getUsernames().contains(restaurant.getManagerUsername())) {
            throw new AddRestaurantUserManagerDoesNotExistError();
        }
    }
}
