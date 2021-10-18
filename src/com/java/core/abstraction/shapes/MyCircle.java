package com.java.core.abstraction.shapes;

public class MyCircle implements Circle,Circle2{
    @Override
    public void calculateArea() {
        System.out.println("Calculating area, pi="+Circle.pi);
    }

    public static void main(String[] args) {
        new MyCircle().calculateArea();
    }


}
