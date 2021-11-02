package com.java.core.javaeight.lambdas;

public class Test {
    public static void main(String[] args) {
        A a=new C();
      //  a.myMethod1();
        A obj=(x,y)-> System.out.println("Addition is : "+(x+y));
        obj.add(10,20);
    }
}
