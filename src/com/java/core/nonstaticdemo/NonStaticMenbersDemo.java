package com.java.core.nonstaticdemo;

public class NonStaticMenbersDemo {
    static int num=01;

    NonStaticMenbersDemo()
    {
        System.out.println("Num value in constructor="+NonStaticMenbersDemo.num);
        System.out.println("Inside Constructor");
    }
    {

        num=20;
        System.out.println("Inside non static block");
    }
    void doSomething()
    {
        System.out.println("doing something");
    }

    public static void main(String[] args) {
        System.out.println("Inside main method");
        new NonStaticMenbersDemo().doSomething();
        new NonStaticMenbersDemo();
        new NonStaticMenbersDemo();

    }
    static {
        System.out.println("Inside static block");
    }
}
