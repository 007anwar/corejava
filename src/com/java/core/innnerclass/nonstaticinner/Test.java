package com.java.core.innnerclass.nonstaticinner;

public class Test {
    public static void main(String[] args) {
        Outter outter = new Outter(10);
        outter.f1();
        Outter.Innner innner = outter.new Innner();//If inner class in non static
        innner.f1();
    }
}
