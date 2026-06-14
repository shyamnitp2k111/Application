package com.springbootapplication.application.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspectWithinAnnotation {

    @After("@within(org.springframework.stereotype.Service)")
    public void beforeMethodExecution() {
        System.out.println(
                "[@WITHIN] Class is annotated with @Service"
        );
    }

    @Before("@annotation(org.springframework.web.bind.annotation.GetMapping)")
    public void beforeMethod() {
        System.out.println("[@annotation] inside beforeMethod Aspect");
    }

}
