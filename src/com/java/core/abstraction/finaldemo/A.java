package com.java.core.abstraction.finaldemo;

public final class A {
    public A(float pi) {
        this.pi = pi;
    }

    private final float pi;//=3.14f;

    public static void main(String[] args) {
        A a = new A(12.3f);
       // a.pi=2.14f;
    }
}
