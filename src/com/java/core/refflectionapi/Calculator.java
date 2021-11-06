package com.java.core.refflectionapi;
@MyAnnotation
public class Calculator {
    public Calculator() {
    }

     int num1,num2;

    public Calculator(int num1, int num2) {
        System.out.println("Object created");
        this.num1 = num1;
        this.num2 = num2;
    }

    public void display(String s) {
        System.out.println("Inside display num1 = "+this.num1+" num2 = "+this.num2);
        System.out.println("Method argument : "+s);
    }
    public int add(int num1, int num2) {
        return num1 + num2;
    }
    public int sub(int num1, int num2) {
        return num1 - num2;
    }
    public int div(int num1, int num2) {
        return num1 / num2;
    }
    public int mul(int num1, int num2) {
        return num1 * num2;
    }
}
