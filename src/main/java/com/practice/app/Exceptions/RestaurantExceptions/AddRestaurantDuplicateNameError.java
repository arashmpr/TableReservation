package com.practice.app.Exceptions.RestaurantExceptions;

public class AddRestaurantDuplicateNameError extends Exception{
    private static final String errorDescription = "Exception::AddRestaurant:Name already exists.";
    public AddRestaurantDuplicateNameError() {
        super(errorDescription);
    }
}
