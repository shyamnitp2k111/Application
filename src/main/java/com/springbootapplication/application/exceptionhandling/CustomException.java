package com.springbootapplication.application.exceptionhandling;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(reason = "Invalid Number provided", value = HttpStatus.BAD_REQUEST)
public class CustomException extends RuntimeException{

    public CustomException(String message) {
        super(message);
    }
}
