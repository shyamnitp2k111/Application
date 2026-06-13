package com.springbootapplication.application.springlifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {

        System.out.println("----------------------- [ START ] [ Bean Factory Post Processor ] ------------------------------");
        System.out.println("Inside postProcessBeanFactory method");

        BeanDefinition beanFact = beanFactory.getBeanDefinition("numberService");
        beanFact.setScope(BeanDefinition.SCOPE_PROTOTYPE);

        System.out.println("-----------------------[ END ] [ Bean Factory Post Processor ] ------------------------------");
    }
}
