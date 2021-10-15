package com.java.core.inheritance.constructorchaining;

public class Child extends SuperClass {
    public Child(int x) {
        super(x);
        System.out.println("Child class One args const:"+x);
    }

    public Child() {
        this(10);
        System.out.println("Child class no args const:"+x);
    }

    public static void main(String[] args) {
        Child child = new Child();

    }
}
