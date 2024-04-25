package com.practice.app.Exceptions.RestaurantExceptions;

public class AddRestaurantUserManagerRoleIsWrongError extends Exception {
    private static final String errorDescription = "Exception::AddRestaurant:User manager role is wrong.";
    public AddRestaurantUserManagerRoleIsWrongError() {
        super(errorDescription);
    }
}
