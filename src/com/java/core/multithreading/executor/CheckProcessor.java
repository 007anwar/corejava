package com.java.core.multithreading.executor;

public class CheckProcessor implements Runnable {
    String name;

    public CheckProcessor(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+ " is processing check from: "+name);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+" has completed the processing the check from: "+name);
    }
}
