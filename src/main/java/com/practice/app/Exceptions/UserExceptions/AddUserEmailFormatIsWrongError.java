package com.practice.app.Exceptions.UserExceptions;

public class AddUserEmailFormatIsWrongError extends Exception{
    private static final String errorDescription = "Exception::AddUer:Email format is wrong.";

    public AddUserEmailFormatIsWrongError() {
        super(errorDescription);
    }
}
