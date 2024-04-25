package com.practice.app.exceptions;

public class AddUserAddressHasNoCityError extends Exception {
    private static final String errorDescription = "Exception::AddUer:Address has no city.";
    public AddUserAddressHasNoCityError() {
        super(errorDescription);
    }
}
