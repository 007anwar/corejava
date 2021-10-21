package com.java.core.multithreading.syncdemo.deadlock;

public class FirstResource {
    public synchronized void method1(SecondResource sr)
    {
        System.out.println("Inside method1 of FR");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Calling method 2 of sr");
        sr.method2();
    }
    public synchronized void method2()
    {
        System.out.println("Inside method2 of FR");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
