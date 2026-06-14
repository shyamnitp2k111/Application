package com.springbootapplication.application.exceptionhandling;

public class CustomGlobalException extends RuntimeException{
    public CustomGlobalException(String message) {
        super(message);
    }
}
