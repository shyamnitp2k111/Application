package com.springbootapplication.application.async;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class AsyncUserService {

    @Async("customThreadPool")
    public void fetchUser(String userId) {
        try {
            Thread.sleep(1000);
            System.out.println("[ user id ] Thread Name : "+ Thread.currentThread().getName());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


    @Async("customJavaExecutor")
    public void fetchUserAddress(String userId) {
        try {
            Thread.sleep(1000);
            System.out.println("[ address ] Thread Name : "+ Thread.currentThread().getName());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Async("globalEnterpriseExecutor")
    public void fetchUserSalary(String userId) {
        try {
            Thread.sleep(1000);
            System.out.println("[ Global Async ] Thread Name : "+ Thread.currentThread().getName());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
