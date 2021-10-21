package com.java.core.multithreading.syncdemo;

public class Mythread extends Thread {
    DisplayMessage ds;
    String name;


    public Mythread(DisplayMessage ds, String name) {
        this.ds = ds;
        this.name = name;
    }

    @Override
    public void run() {
        ds.sayHello(name);
    }



}
