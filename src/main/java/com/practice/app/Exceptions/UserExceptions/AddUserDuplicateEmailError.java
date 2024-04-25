package com.practice.app.Exceptions.UserExceptions;

public class AddUserDuplicateEmailError extends Exception {
    private static final String errorDescription = "Exception::AddUer:Email already exists.";
    public AddUserDuplicateEmailError() {
        super(errorDescription);
    }
}
