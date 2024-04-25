package com.practice.app.Exceptions.UserExceptions;

public class AddUserRoleIsInvalidError extends Exception {
    private static final String errorDescription = "Exception::AddUer:This role does not exist.";
    public AddUserRoleIsInvalidError() {
        super(errorDescription);
    }
}
