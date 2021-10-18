package com.java.core.polymorphism.oveloading;

public class MainTest {
    public static void main(String[] args) {
        System.out.println("Default main method");
    }
    public static void main(float args) {
        System.out.println("Overloaded main method");
    }
}
