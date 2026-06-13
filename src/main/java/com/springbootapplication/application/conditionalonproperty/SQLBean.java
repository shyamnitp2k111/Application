package com.springbootapplication.application.conditionalonproperty;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "flag", havingValue="sql", matchIfMissing = false)
public class SQLBean {

    public SQLBean() {
        System.out.println("------------- [ ConditionalOnProperty ] --------------");
        System.out.println("SQL beans has created");
        System.out.println("------------- [ ConditionalOnProperty ] --------------");
    }
}
