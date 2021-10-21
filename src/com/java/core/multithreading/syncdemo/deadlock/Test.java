package com.java.core.multithreading.syncdemo.deadlock;

public class Test implements Runnable {
    FirstResource fr=new FirstResource();
    SecondResource sr=new SecondResource();
    public static void main(String[] args) {
new Test();
    }

    public Test() {
        new Thread(this).start();
        sr.method1(fr);
    }

    @Override
    public void run() {
fr.method1(sr);
    }
}
