package com.java.core.multithreading.yield;

public class YieldDemo {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();

        for(int i=100;i<200;i++)
        {
            System.out.println(i);
    }}
}
