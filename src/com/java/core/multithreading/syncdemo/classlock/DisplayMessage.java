package com.java.core.multithreading.syncdemo.classlock;

public class DisplayMessage {
    public synchronized static void sayHello(String name)
    {
        for (int i=0;i<10;i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Hi, How are you "+name);
        }
    }
}
