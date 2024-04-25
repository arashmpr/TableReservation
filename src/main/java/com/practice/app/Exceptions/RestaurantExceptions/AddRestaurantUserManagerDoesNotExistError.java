package com.practice.app.Exceptions.RestaurantExceptions;

public class AddRestaurantUserManagerDoesNotExistError extends Exception {
    private static final String errorDescription = "Exception::AddRestaurant:User manager doest not exist.";
    public AddRestaurantUserManagerDoesNotExistError() {
        super(errorDescription);
    }
}
