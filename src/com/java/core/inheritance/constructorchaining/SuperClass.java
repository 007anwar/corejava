package com.java.core.inheritance.constructorchaining;

public class SuperClass {
    int x;

    public SuperClass(int x) {
        this();
        this.x = x;
        System.out.println("One args superclass constructor:"+x);
    }

    public SuperClass() {
        System.out.println("No args superclass constructor:"+x);
    }
}
