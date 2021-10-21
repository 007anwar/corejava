package com.java.core.multithreading.intrupt;

public class Test {
    public static void main(String[] args) {
        MyThread multiThreaded = new MyThread();
        multiThreaded.start();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        multiThreaded.interrupt();
        System.out.println("End of main thread");
    }
}
