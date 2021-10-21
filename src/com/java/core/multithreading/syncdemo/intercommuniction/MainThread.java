package com.java.core.multithreading.syncdemo.intercommuniction;

public class MainThread {
    public static void main(String[] args) throws InterruptedException {
        Mythread mythread = new Mythread();
        mythread.start();
        synchronized (mythread)
        {
            System.out.println("Waiting");
         //   mythread.wait();
            System.out.println(mythread.total);
    }}
}
