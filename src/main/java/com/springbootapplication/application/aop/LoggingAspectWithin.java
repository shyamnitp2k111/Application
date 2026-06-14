package com.springbootapplication.application.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspectWithin {

    @Before("within(com.springbootapplication.application.aop.AOPService)")
    public void beforeMethodExecution() {
        System.out.println(
                "[WITHIN-1] Exact Class Match -> Any method inside AOPService"
        );
    }

    @Before("within(com.springbootapplication.application.aop.*)")
    public void beforeMethodExec() {
        System.out.println(
                "[WITHIN-2] Package Match (*) -> Any method in any class under package 'aop'"
        );
    }
}
