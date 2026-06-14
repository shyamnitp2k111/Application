package com.springbootapplication.application.aop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class AOPService {

    @Autowired
    private AOPLogic aopLogic;

    public void printArrayList(int[] arr) {
        Arrays.stream(arr).forEach(System.out::println);
        int sum = aopLogic.calSum(arr);
        System.out.println("sum is "+ sum);
    }


}
