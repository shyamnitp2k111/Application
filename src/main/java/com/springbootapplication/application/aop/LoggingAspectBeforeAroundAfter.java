package com.springbootapplication.application.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class LoggingAspectBeforeAroundAfter {

    @Before("execution(public void com.springbootapplication.application.aop.AOPService.printArrayList(int[]))")
    public void exactMatch() {
        System.out.println(
                "[1] EXACT MATCH -> public void AOPService.printArrayList(int[])"
        );
    }

    @After("execution(public void com.springbootapplication.application.aop.AOPService.printArrayList(int[]))")
    public void exactMatchAfter() {
        System.out.println(
                "[AFTER] EXACT MATCH -> Method execution completed"
        );
    }

    @Before("execution(* com.springbootapplication.application.aop.AOPService.printArrayList(int[]))")
    public void anyReturnType() {
        System.out.println(
                "[2] '*' RETURN TYPE -> Any return type, exact method and exact parameter type"
        );
    }

    @Before("execution(* com.springbootapplication.application.aop.AOPService.printArrayList(*))")
    public void singleParameterAnyType() {
        System.out.println(
                "[3] '*' PARAMETER -> Method has exactly ONE parameter of any type"
        );
    }

    @Before("execution(* com.springbootapplication.application.aop.AOPService.*(*))")
    public void anyMethodSingleParameter() {
        System.out.println(
                "[4] ANY METHOD + ONE PARAMETER -> Matches any method having exactly one argument"
        );
    }

    @Before("execution(* com.springbootapplication.application.aop.AOPService.*(..))")
    public void anyMethodAnyParameters() {
        System.out.println(
                "[5] '..' PARAMETERS -> Matches any method with zero or more arguments"
        );
    }

    @Around("execution(* com.springbootapplication.application.aop.AOPService.*(..))")
    public Object aroundMethod(ProceedingJoinPoint joinPoint) throws Throwable {
        // Step 1: Execute actions intended to run BEFORE the actual core method starts
        System.out.println("[ around example ] inside before Method aspect");
        // Step 2: Explicitly trigger the core method processing line using joinPoint reference
        Object result = joinPoint.proceed();
        // Step 3: Execute target logic patterns intended to run AFTER core method ends
        System.out.println("[ around example ] inside after Method aspect");
        return result;
    }
}