package com.springbootapplication.application.exceptionhandling;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1")
public class ExceptionController {

    @GetMapping("/exceptions/{number}")
    public ResponseEntity<?> exceptionManagement(@PathVariable String number) {

        int val = Integer.parseInt(number);
        if(val == 0 ) {
            throw new CustomException("invalid number");
        }

        if(val == 1) {
            throw new CustomGlobalException("message from global handler");
        }
        return ResponseEntity.status(HttpStatus.OK).body("success");
    }


    @ExceptionHandler(CustomException.class)
    public ResponseEntity<?> catchException() {
        return new ResponseEntity<>("Invalid number message from local handler ", HttpStatus.BAD_REQUEST);
    }
}
