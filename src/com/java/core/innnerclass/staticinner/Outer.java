package com.java.core.innnerclass.staticinner;

public class Outer {
    static class Inner{
        static void f1()
        {
            System.out.println("Inner static method");
        }
        public void m1()
        {
            System.out.println("Inner non static method");
        }
    }
    public static void main(String[] args) {
Outer.f1();
Outer.Inner.f1();
        Inner inner = new Inner();
        inner.m1();
    }
    static void f1()
    {
        System.out.println("Outers static method");
    }
    public void m1()
    {
        System.out.println("Outer non static method");
    }

}
