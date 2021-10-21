package com.java.core.multithreading.syncdemo.intercommuniction;

public class Mythread extends Thread {
    int total=0;
    @Override
    public void run() {
        synchronized (this)
        {
        for (int i=0;i<100;i++)
        {
            total+=i;
    }
        this.notify();
        }}
}
