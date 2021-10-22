package com.java.core.innnerclass.nonstaticinner;

public class Outter {
    private static int z=50;
    private int y;

    public Outter(int y) {
        this.y = y;
    }

    class Innner{
        void f1()
        {
            int x=10/0;
            System.out.println("Inner class non static method, z="+ Outter.z);
            System.out.println("Inner class non static method, x="+ Outter.this.y);
        }

    }
    void f1()
    {
        System.out.println("Outer class non static method");
    }
}
