package com.java.core.javaeight.methodreff;

public class MyClass {
    public static void main(String[] args) {
        MyInterFace f=i-> System.out.println("input : "+i);
        f.myMethod(10);
        MyClass myClass = new MyClass();
        MyInterFace f1=myClass::myMeth;
        f1.myMethod(20);
    }
    public void myMeth(int x)
    {
        System.out.println("Input inside my method : "+x);
    }
}
