package com.springbootapplication.application.controller;

import com.springbootapplication.application.services.NumberService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/demo")
public class ApiController {

    private final NumberService numberService;

    public ApiController(NumberService numberService) {
        this.numberService = numberService;
    }

    @GetMapping("/valid-number/{number}")
    public ResponseEntity<?> getName(@PathVariable String number) {
        boolean flag = numberService.validNumber(number);
        return ResponseEntity.ok(flag);
    }

    @GetMapping("/fetchUser")
    public ResponseEntity<?> fetchUsers(@RequestParam("firstName") String firstName,
                                        @RequestParam("lastName") String lastName,
                                        @RequestParam("age") int age) {

        System.out.println("firstName is ..." + firstName + " LastName is " + lastName +" age is "+age);

        return ResponseEntity.status(HttpStatus.OK).body("sucess");
    }


}
