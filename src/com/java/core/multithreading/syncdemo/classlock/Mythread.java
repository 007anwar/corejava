package com.java.core.multithreading.syncdemo.classlock;

public class Mythread extends Thread {

    String name;


    public Mythread( String name) {
        this.name = name;
    }

    @Override
    public void run() {
        DisplayMessage.sayHello(name);
    }



}
