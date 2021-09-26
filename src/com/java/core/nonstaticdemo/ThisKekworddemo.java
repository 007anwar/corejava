package com.java.core.nonstaticdemo;

public class ThisKekworddemo {
    private int x;
    ThisKekworddemo()
    {
        System.out.println(x);
        System.out.println(this);
        System.out.println(this.x);
    }

    public static void main(String[] args) {
        new ThisKekworddemo();
        new ThisKekworddemo();
    }
}

