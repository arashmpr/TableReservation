package com.practice.app.exceptions;

public class AddUserDuplicateEmailError extends Exception {
    private static final String errorDescription = "Exception::AddUer:Email already exists.";
    public AddUserDuplicateEmailError() {
        super(errorDescription);
    }
}
