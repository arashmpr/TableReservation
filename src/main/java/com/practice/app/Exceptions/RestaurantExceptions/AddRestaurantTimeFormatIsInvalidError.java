package com.practice.app.Exceptions.RestaurantExceptions;

public class AddRestaurantTimeFormatIsInvalidError extends Exception {
    private static final String errorDescription = "Exception::AddRestaurant:Time format is invalid.";
    public AddRestaurantTimeFormatIsInvalidError() {
        super(errorDescription);
    }
}
