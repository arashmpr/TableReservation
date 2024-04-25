package com.practice.app.Exceptions.RestaurantExceptions;

public class AddRestaurantAddressHasNoStreetError extends Exception {
    private static final String errorDescription = "Exception::AddRestaurant:Address has no street.";
    public AddRestaurantAddressHasNoStreetError() {
        super(errorDescription);
    }
}
