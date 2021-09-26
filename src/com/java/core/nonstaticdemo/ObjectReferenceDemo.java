package com.java.core.nonstaticdemo;

public class ObjectReferenceDemo {
    private int x;
    ObjectReferenceDemo()
    {

    }

    public static void main(String[] args) {
        ObjectReferenceDemo obj1 = new ObjectReferenceDemo();
        System.out.println(obj1.x);
    }
}
