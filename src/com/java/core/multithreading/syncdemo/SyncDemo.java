package com.java.core.multithreading.syncdemo;

public class SyncDemo {
    public static void main(String[] args) {
        DisplayMessage displayMessage = new DisplayMessage();
        Mythread mythread1 = new Mythread(displayMessage,"Anwar");
        Mythread mythread2 = new Mythread(displayMessage,"Mulla");
        mythread1.start();
        mythread2.start();
    }
}
