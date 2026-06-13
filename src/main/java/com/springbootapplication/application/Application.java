package com.springbootapplication.application;

import com.springbootapplication.application.services.NumberService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application implements CommandLineRunner {

    private ApplicationContext applicationContext;

    public Application(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}


    @Override
    public void run(String... args) throws Exception {

        System.out.println("----------------------- [ START ] [ CommandLineRunner ] ------------------------------");
        System.out.println("Inside run method ");
        NumberService numberService = (NumberService) applicationContext.getBean("numberService");
        System.out.println(numberService);

        NumberService numberService2 = (NumberService) applicationContext.getBean("numberService");
        System.out.println(numberService2);

        boolean scope = applicationContext.isPrototype("numberService");
        System.out.println(scope);

        System.out.println("----------------------- [ END ] [ CommandLineRunner ] ------------------------------");
    }
}
