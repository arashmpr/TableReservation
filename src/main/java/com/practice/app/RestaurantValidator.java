package com.practice.app;

import com.practice.app.exceptions.AddRestaurantDuplicateNameError;
import com.practice.app.exceptions.AddRestaurantUserManagerDoesNotExistError;

public class RestaurantValidator {
    private Restaurant restaurant;
    private RestaurantManager restaurantManager;
    private UserManager userManager;

    public RestaurantValidator(Restaurant restaurant) {
        this.restaurant = restaurant;
        this.restaurantManager = RestaurantManager.getInstance();
        this.userManager = UserManager.getInstance();
    }

    public void validate() throws Exception{
        validateNameDoesNotExist();
        validateUserManagerExists();
    }

    private void validateNameDoesNotExist() throws Exception {
        if (restaurantManager.getNames().contains(restaurant.getName())) {
            throw new AddRestaurantDuplicateNameError();
        }
    }

    private void validateUserManagerExists() throws Exception {
        if (!userManager.getUsernames().contains(restaurant.getManagerUsername())) {
            throw new AddRestaurantUserManagerDoesNotExistError();
        }
    }
}
