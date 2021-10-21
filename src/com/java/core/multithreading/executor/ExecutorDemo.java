package com.java.core.multithreading.executor;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorDemo {
    public static void main(String[] args) {
        CheckProcessor[] cp={new CheckProcessor("ATM"),new CheckProcessor("Bank"),new CheckProcessor("Mobile")};
        ExecutorService executorService = Executors.newFixedThreadPool(4);
        for (CheckProcessor c:cp
             ) {
            executorService.submit(c);
        }
        executorService.shutdown();
                
    }
}
