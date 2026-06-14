package com.springbootapplication.application.async;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;

@Configuration
@EnableAsync
public class EnterpriseAsyncConfig implements AsyncConfigurer {

    @Override
    @Bean(name = "globalEnterpriseExecutor")
    public Executor getAsyncExecutor() {
        ThreadPoolTaskExecutor poolTaskExecutor = new ThreadPoolTaskExecutor();
        poolTaskExecutor.setCorePoolSize(3);
        poolTaskExecutor.setMaxPoolSize(10);
        poolTaskExecutor.setQueueCapacity(50);
        poolTaskExecutor.setThreadNamePrefix("EnterpriseWorker-");
        poolTaskExecutor.initialize();
        return poolTaskExecutor;
    }
}