package com.springbootapplication.application.jpa.relation;

import com.springbootapplication.application.jpa.relation.onetomanymapping.UserTable;
import com.springbootapplication.application.jpa.relation.onetoonemapping.UserData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/v1")
public class ControllerEndPoint {

    @Autowired
    private ServiceLogic serviceLogic;

    @PostMapping("/user-data")
    public ResponseEntity<?> saveUserInfo(@RequestBody UserData userData) {
        serviceLogic.saveUserValue(userData);
        return ResponseEntity.ok("successfully save");
    }

    @GetMapping("/user-data/{userId}")
    public UserData getUserInfo(@PathVariable int userId) {
        Optional<UserData> userDataOptional = serviceLogic.fetchUserInfo(userId);
        return userDataOptional.orElse(null);
    }

    @PostMapping("/user-table")
    public ResponseEntity<?> saveUserAddressInfo(@RequestBody UserTable userTable) {
        serviceLogic.saveUserData(userTable);
        return ResponseEntity.ok("saved...");
    }

}
