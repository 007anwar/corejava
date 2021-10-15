package com.java.core.inheritance.superdemo;

public class Child extends Parent {
    int c,d;

    public Child(int a,int b, int c, int d) {
        super(a,b);
        this.c = c;
        this.d = d;
    }

    @Override
    void f1()
    {
        System.out.println("Inside childs f1");
        super.f1();
    }

    void display()
    {
        System.out.println("Parents a:"+a);
        System.out.println("Parents b:"+b);
        System.out.println("Childs c:"+c);
        System.out.println("Childs d:"+d);
    }

}
