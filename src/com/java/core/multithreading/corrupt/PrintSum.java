package com.java.core.multithreading.corrupt;

public class PrintSum extends Thread{
    static int result;

    @Override
    synchronized public void run() {
    for(int i=0;i<10;i++) {
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        result += i;
    }
        System.out.println("Result is:"+result);
    }
}
