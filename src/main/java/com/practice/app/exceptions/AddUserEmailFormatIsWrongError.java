package com.practice.app.exceptions;

public class AddUserEmailFormatIsWrongError extends Exception{
    private static final String errorDescription = "Exception::AddUer:Email format is wrong.";

    public AddUserEmailFormatIsWrongError() {
        super(errorDescription);
    }
}
