package com.java.core.javaeight.mylambda;

public class Test {
    public static void main(String[] args) {
        Addition obj=(a,b)->{return a+b;};
        int sum = obj.add(10, 20);
        System.out.println("Sum returned by lambda expression = "+sum);

    }
}
