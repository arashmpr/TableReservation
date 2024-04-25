package com.practice.app.Exceptions.UserExceptions;

public class AddUserAddressHasNoCityError extends Exception {
    private static final String errorDescription = "Exception::AddUer:Address has no city.";
    public AddUserAddressHasNoCityError() {
        super(errorDescription);
    }
}
