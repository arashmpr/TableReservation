package com.practice.app.exceptions;

public class AddRestaurantAddressHasNoStreetError extends Exception {
    private static final String errorDescription = "Exception::AddRestaurant:Address has no street.";
    public AddRestaurantAddressHasNoStreetError() {
        super(errorDescription);
    }
}
