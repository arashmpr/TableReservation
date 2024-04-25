package com.practice.app.exceptions;

public class AddTableDuplicateTableNumberError extends Exception {
    private static final String errorDescription = "Exception::AddTable:Table number already exists.";
    public AddTableDuplicateTableNumberError() {
        super(errorDescription);
    }
}
