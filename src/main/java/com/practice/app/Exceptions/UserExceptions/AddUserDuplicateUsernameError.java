package com.practice.app.Exceptions.UserExceptions;

public class AddUserDuplicateUsernameError extends Exception {
    private static final String errorDescription = "Exception::AddUer:Username already exists.";
    public AddUserDuplicateUsernameError() {
        super(errorDescription);
    }
}
