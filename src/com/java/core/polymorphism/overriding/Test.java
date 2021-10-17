package com.java.core.polymorphism.overriding;

public class Test {
    public static void main(String[] args) {
        Parent.doSomethig();
        Child.doSomethig();
        Parent parent = new Parent();
        System.out.println(parent.s);
        Child child = new Child();
        System.out.println(child.s);
        Parent p1=new Child();
        System.out.println(p1.s);
    }
}
