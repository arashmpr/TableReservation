package com.practice.app.Exceptions.UserExceptions;

public class AddUserAddressHasNoCountryError extends Exception{
    private static final String errorDescription = "Exception::AddUer:Address has no country.";
    public AddUserAddressHasNoCountryError() {
        super(errorDescription);
    }
}
