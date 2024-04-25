package com.practice.app.exceptions;

public class AddRestaurantDuplicateNameError extends Exception{
    private static final String errorDescription = "Exception::AddRestaurant:Name already exists.";
    public AddRestaurantDuplicateNameError() {
        super(errorDescription);
    }
}
