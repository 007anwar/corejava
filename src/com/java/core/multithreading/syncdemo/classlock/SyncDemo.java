package com.java.core.multithreading.syncdemo.classlock;

public class SyncDemo {
    public static void main(String[] args) {
        Mythread mythread1 = new Mythread("Anwar");
        Mythread mythread2 = new Mythread("Mulla");
        mythread1.start();
        mythread2.start();
    }
}
