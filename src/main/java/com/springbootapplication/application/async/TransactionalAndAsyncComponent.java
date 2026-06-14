package com.springbootapplication.application.async;

import jakarta.transaction.Transactional;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class TransactionalAndAsyncComponent {

    @Async
    public void saveDataForCase1(int val) {
        System.out.println("[ Case 1 - Component ] Thread Name -"+ Thread.currentThread().getName());
    }

    public void saveData(int val) {
        System.out.println("[ Case 2 - Component ] Thread Name -"+ Thread.currentThread().getName());
    }

    @Transactional
    public void saveDataCase3(int val) {
        System.out.println("[ Case 3 - Component ] Thread Name -"+ Thread.currentThread().getName());
    }

}
