package com.springbootapplication.application.aop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/aop")
public class AOPController {

    @Autowired
    private AOPService aopService;

    @GetMapping("print")
    public ResponseEntity<?> printArray() {

        System.out.println("----------------------------------- [ Start ] AOP Logging -------------------------------------");
        int[] arr = {1, 3, 4};
        aopService.printArrayList(arr);

        System.out.println("----------------------------------- [ END ] AOP Logging -------------------------------------");
        return ResponseEntity.status(HttpStatus.OK).body("Success");
    }
}
