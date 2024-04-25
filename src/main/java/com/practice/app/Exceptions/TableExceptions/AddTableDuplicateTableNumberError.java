package com.practice.app.Exceptions.TableExceptions;

public class AddTableDuplicateTableNumberError extends Exception {
    private static final String errorDescription = "Exception::AddTable:Table number already exists.";
    public AddTableDuplicateTableNumberError() {
        super(errorDescription);
    }
}
