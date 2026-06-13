package com.springbootapplication.application.conditionalonproperty;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "flag", havingValue = "nosql", matchIfMissing = false)
public class NoSQLBean {

    public NoSQLBean() {
        System.out.println("------------- [ ConditionalOnProperty ] --------------");
        System.out.println("NoSQL Beans has created");
        System.out.println("------------- [ ConditionalOnProperty ] --------------");
    }
}
