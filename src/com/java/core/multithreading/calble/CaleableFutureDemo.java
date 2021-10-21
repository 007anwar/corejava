package com.java.core.multithreading.calble;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CaleableFutureDemo {
    public static void main(String[] args) {
        MyCallable callable[]={new MyCallable(10),new MyCallable(20),new MyCallable(30),new MyCallable(40)};
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        for(MyCallable c:callable)
        {
            Future<Integer> submit = executorService.submit(c);
            try {
                System.out.println(submit.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }
        executorService.shutdown();

    }
}
