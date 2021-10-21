package com.java.core.multithreading.syncdemo.block;

public class DisplayMessage {
    public void sayHello(String name)
    {
        System.out.println("NOT SYNCronized: "+this);
        synchronized (this) {
            System.out.println("SYNCronized: "+this);
            for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Hi, How are you " + name);
            }
        }
    }
}
