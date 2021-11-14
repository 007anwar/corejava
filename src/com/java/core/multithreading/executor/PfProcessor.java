package com.java.core.multithreading.executor;

public class PfProcessor extends Thread {
    @Override
    public void run() {
        System.out.println("Processing the pf request :"+Thread.currentThread().getName());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Pf processing complete "+Thread.currentThread().getName());
    }
}
