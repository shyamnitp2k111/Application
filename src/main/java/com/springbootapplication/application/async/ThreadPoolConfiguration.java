package com.springbootapplication.application.async;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@Configuration
public class ThreadPoolConfiguration {

    @Bean(name = "customThreadPool")
    public Executor buildThreadPool() {
        ThreadPoolTaskExecutor threadPoolTaskExecutor = new ThreadPoolTaskExecutor();
        threadPoolTaskExecutor.setCorePoolSize(2); // Core persistent thread allocation
        threadPoolTaskExecutor.setMaxPoolSize(6);  // Maximum scaling thread ceiling
        threadPoolTaskExecutor.setQueueCapacity(10); // Bounded staging queue capacity

        threadPoolTaskExecutor.setThreadNamePrefix("MyThread-");
        threadPoolTaskExecutor.initialize();
        return threadPoolTaskExecutor;
    }


    @Bean(name = "customJavaExecutor")
    public ThreadPoolExecutor customJavaExecutor() {
        return new ThreadPoolExecutor(
                2, 4, 1L, TimeUnit.HOURS,
                new ArrayBlockingQueue<>(3)
        );
    }
}
