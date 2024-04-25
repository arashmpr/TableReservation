package com.practice.app.Exceptions.RestaurantExceptions;

public class AddRestaurantAddressHasNoCityError extends Exception {
    private static final String errorDescription = "Exception::AddRestaurant:Address has no city.";
    public AddRestaurantAddressHasNoCityError() {
        super(errorDescription);
    }
}
