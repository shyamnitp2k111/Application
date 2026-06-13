package com.springbootapplication.application.springlifecycle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class CustomCommandLineRunner implements CommandLineRunner {

    @Autowired
    ApplicationContext applicationContext;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("----------------------- [ START ] [ CommandLineRunner ] ------------------------------");
        System.out.println("inside custom runner " + applicationContext.toString().length());
        System.out.println("----------------------- [ END ] [ CommandLineRunner ] ------------------------------");
    }
}
