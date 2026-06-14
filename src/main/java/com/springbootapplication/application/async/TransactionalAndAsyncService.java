package com.springbootapplication.application.async;


import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class TransactionalAndAsyncService {

    @Autowired
    private TransactionalAndAsyncComponent transactionalAndAsyncComponent;

    //case - 1
    @Transactional
    public void case1() {
        System.out.println("[ Case 1 - Service ] Thread Name -"+ Thread.currentThread().getName());
        transactionalAndAsyncComponent.saveDataForCase1(20);
    }

    //case - 2
    @Transactional
    @Async
    public void case2() {
        System.out.println("[ Case 2 - Service ] Thread Name -"+ Thread.currentThread().getName());
        transactionalAndAsyncComponent.saveData(10);
    }


    @Async
    public void case3() {
        System.out.println("[ Case 3 - Service ] Thread Name -"+ Thread.currentThread().getName());
        transactionalAndAsyncComponent.saveDataCase3(10);
    }
}
