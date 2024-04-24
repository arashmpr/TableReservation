package com.practice.app.exceptions;

public class AddUserDuplicateUsernameError extends Exception {
    private static final String errorDescription = "AddUser Error: username already exists!";
    public AddUserDuplicateUsernameError() {
        super(errorDescription);
    }
}
