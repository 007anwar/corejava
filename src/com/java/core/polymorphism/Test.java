package com.java.core.polymorphism;

public class Test {
    public static void main(String[] args) {
        MacBook macBookPro = new MacBookPro();
        MacBook macBookAir = new MacBookAir();
        macBookPro.start();
        macBookPro.stop();      
        macBookAir.start();
        macBookAir.stop();
    }
}
