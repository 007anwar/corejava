package com.java.core.innnerclass.staticinner;

public class Test {
    public static void main(String[] args) {
        Outer.Inner inner = new Outer.Inner();//if inner class is static
        inner.m1();
        Outer.Inner.f1();
    }
}
