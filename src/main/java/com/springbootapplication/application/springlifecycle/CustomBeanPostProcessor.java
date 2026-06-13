package com.springbootapplication.application.springlifecycle;

import com.springbootapplication.application.services.NumberService;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class CustomBeanPostProcessor implements BeanPostProcessor {


    @PostConstruct
    public void postConstruct() {
        System.out.println("----------------------- [ START ] [ BeanPostProcessor ] ------------------------------");
        System.out.println("Inside post construct");
        System.out.println("----------------------- [ END ] [ BeanPostProcessor ] ------------------------------");
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {

        if(bean instanceof NumberService) {
            System.out.println("----------------------- [ START ] [ BeanPostProcessor ] ------------------------------");
            System.out.println("Inside before bean initialization ..." + beanName);
            System.out.println("----------------------- [ END ] [ BeanPostProcessor ] ------------------------------");
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {

        if(bean instanceof NumberService) {
            System.out.println("----------------------- [ START ] [ BeanPostProcessor ] ------------------------------");
            System.out.println("Inside post bean initialization ..." + beanName);
            System.out.println("Number service beans is "+ beanName);
            System.out.println("----------------------- [ END ] [ BeanPostProcessor ] ------------------------------");
        }

        return bean;
    }

}
