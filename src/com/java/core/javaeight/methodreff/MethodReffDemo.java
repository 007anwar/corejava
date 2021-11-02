package com.java.core.javaeight.methodreff;

public class MethodReffDemo {
    public static void myMethod()
    {for (int i=0;i<10;i++)
        System.out.println("myMethod : "+i);
    }
    public static void main(String[] args) {
Runnable r=MethodReffDemo::myMethod;
new Thread(r).start();
for (int i=10;i<20;i++)
    System.out.println("main method : "+i);
    }
}
