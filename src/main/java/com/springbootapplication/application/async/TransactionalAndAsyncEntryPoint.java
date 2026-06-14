package com.springbootapplication.application.async;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class TransactionalAndAsyncEntryPoint implements CommandLineRunner {

    @Autowired
    private TransactionalAndAsyncService transactionalAndAsyncService;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("[ Entry Point ] Thread Name -"+ Thread.currentThread().getName());
        //case - 1
        transactionalAndAsyncService.case1();


        //case - 2
        transactionalAndAsyncService.case2();

        //case - 3
        transactionalAndAsyncService.case3();
    }
}
