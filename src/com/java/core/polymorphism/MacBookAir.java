package com.java.core.polymorphism;

public class MacBookAir extends MacBook{
    @Override
    void start() {
        System.out.println("Inside MacBookAir Start");
    }

    @Override
    void stop() {
        System.out.println("Inside MacBookAir Stop");
    }
}
