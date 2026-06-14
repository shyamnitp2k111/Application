package com.springbootapplication.application.exceptionhandling;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(CustomGlobalException.class)
    public ResponseEntity<?> handlerExceptions() {
        return new ResponseEntity<>("Message from global handler", HttpStatus.BAD_REQUEST);
    }
}
