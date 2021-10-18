package com.java.core.exceptionhandling.unchecked;

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        int a,b,c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Divident");
        a=scanner.nextInt();
        System.out.println("Enter Divisor");
        b=scanner.nextInt();
        try {
            c=a/b;
            System.out.println("Division is :"+c);
        }
        catch (ArithmeticException e)
        {
            System.out.println("INVALID INPUT: Divisor cannot be zero");
        }
        finally {
            System.out.println("Finally");
        }
    
        System.out.println("more code here");
    }
}
