package com.springbootapplication.application.async;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/")
public class AsyncController {

    private final AsyncUserService asyncUserService;

    public AsyncController(AsyncUserService asyncUserService) {
        this.asyncUserService = asyncUserService;
    }

    @GetMapping("users/{userId}")
    public ResponseEntity<?> fetchUserDetail(@PathVariable  String userId){

        //first async call - 1
        System.out.println("[ Async - 1 ] fetch user details api call for user id "+ userId);
        asyncUserService.fetchUser(userId);

        //first async call - 2
        System.out.println("[ Async - 2 ] fetch user address api call for user id "+ userId);
        asyncUserService.fetchUserAddress(userId);

        //first async call - 3
        System.out.println("[ Async - 3 ] fetch user salary api call for user id "+ userId);
        asyncUserService.fetchUserSalary(userId);
        return ResponseEntity.status(HttpStatus.OK).body(userId);
    }
}
