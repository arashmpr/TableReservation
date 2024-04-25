package com.practice.app.Exceptions.UserExceptions;

public class AddUserUsernameFormatIsWrongError extends Exception {
    private static final String errorDescription = "Exception::AddUer:Username format is wrong.";
    public AddUserUsernameFormatIsWrongError() {
        super(errorDescription);
    }

}
