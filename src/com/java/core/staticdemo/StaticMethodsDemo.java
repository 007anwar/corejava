package com.java.core.staticdemo;

public class StaticMethodsDemo {
    public static void main(String[] args) {
        StaticMethodsDemo.method1();
        System.out.println("inside main");
         method1();
    }
    static void method1()
    {
        System.out.println("Inside method 1");
    }
    static
    {
        method1();
    }
}
