package com.practice.app.exceptions;

public class AddUserDuplicateUsernameError extends Exception {
    private static final String errorDescription = "Exception::AddUer:Username already exists.";
    public AddUserDuplicateUsernameError() {
        super(errorDescription);
    }
}
