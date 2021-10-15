package com.java.core.inheritance.single;

public class SingleInheritance {
    void m1()
    {
        System.out.println("inside method");
    }

    public static void main(String[] args) {
        SingleInheritance singleInheritance = new SingleInheritance();
        singleInheritance.m1();
        System.out.println(singleInheritance.hashCode());
        System.out.println(singleInheritance.getClass());
    }
}
