package com.springbootapplication.application.aop;

import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class AOPLogic {

    public int calSum(int[] arr) {
        return Arrays.stream(arr).sum();
    }
}
