package com.practice.app.exceptions;

public class AddRestaurantUserManagerDoesNotExistError extends Exception {
    private static final String errorDescription = "Exception::AddRestaurant:User manager doest not exist.";
    public AddRestaurantUserManagerDoesNotExistError() {
        super(errorDescription);
    }
}
