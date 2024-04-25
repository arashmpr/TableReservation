package com.practice.app.Exceptions.RestaurantExceptions;

public class AddRestaurantAddressHasNoCountryError extends Exception {
    private static final String errorDescription = "Exception::AddRestaurant:Address has no country.";
    public AddRestaurantAddressHasNoCountryError() {
        super(errorDescription);
    }
}
