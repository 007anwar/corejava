package com.java.core.polymorphism.oveloading;

public class AutomaticPromotion {
    public void print(int i)
    {
        System.out.println("Inside int print:"+i);
    }
    public void print(float i)
    {
        System.out.println("Inside float print:"+i);
    }
//    public void print(String s)
//    {
//        System.out.println("String vesion:"+s);
//    }
    public void print(Object s)
    {
        System.out.println("Object vesion:"+s);
    }
////////
    public static void main(String[] args) {
        AutomaticPromotion automaticPromotion = new AutomaticPromotion();
        automaticPromotion.print(123);
        automaticPromotion.print(10.5f);
        automaticPromotion.print("String");

    }
}
