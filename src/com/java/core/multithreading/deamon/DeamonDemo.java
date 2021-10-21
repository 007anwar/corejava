package com.java.core.multithreading.deamon;

public class DeamonDemo extends Thread{
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().isDaemon());
        DeamonDemo deamonDemo = new DeamonDemo();
      //  deamonDemo.setDaemon(true);
        System.out.println(deamonDemo.isDaemon());
        deamonDemo.start();
    }

    @Override
    public void run() {
    for (int i=0;i<10;i++)
    {
        System.out.println(i);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }}
}
