package com.java.core.staticdemo;

public class StaticDemo {
    public static void main(String[] args) {
        System.out.println("Inside Main");
    }
    static {
        System.out.println("Inside static block");
    }
}
