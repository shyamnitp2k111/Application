package com.springbootapplication.application.profile;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("prod")
public class ProdBean {

    @Value("${username}")
    private String userName;

    @Value("${password}")
    private String password;

    public ProdBean() {
        System.out.println("Prod beans has been created based on active profile");
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("username ... "+ userName + " password ... "+ password);
    }
}
