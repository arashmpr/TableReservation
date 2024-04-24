package com.practice.app.exceptions;

public class AddUserUsernameFormatIsWrongError extends Exception {
    private static final String errorDescription = "Exception::AddUer:Username format is wrong.";
    public AddUserUsernameFormatIsWrongError() {
        super(errorDescription);
    }

}
