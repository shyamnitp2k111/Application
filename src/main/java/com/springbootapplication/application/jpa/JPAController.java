package com.springbootapplication.application.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class JPAController {

    @Autowired
    private JPAService jpaService;

    @PostMapping("/users")
    public ResponseEntity<?> saveUserInfo(@RequestBody UserInfo userInfo) {
        System.out.println("Save through jdbc template .....");
        jpaService.saveUserInfo(userInfo);
        return ResponseEntity.status(HttpStatus.ACCEPTED).body("created");
    }

    @PostMapping("/v2/users")
    public ResponseEntity<?> saveUser(@RequestBody UserDetails userDetails) {
        System.out.println("save through JPA Interface");
        jpaService.saveUser(userDetails);
        return ResponseEntity.status(HttpStatus.OK).body("save successfully");
    }
}
