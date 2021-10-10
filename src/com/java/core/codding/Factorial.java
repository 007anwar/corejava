package com.java.core.codding;

public class Factorial {
    public static void main(String[] args) {
       findFactorial(5);
    }
    private static void findFactorial(int number)
    {
        int factorial=1;
        for(int i=1;i<=number;++i)
        {
            factorial*=i;
        }
        System.out.println(factorial);
    }
}
