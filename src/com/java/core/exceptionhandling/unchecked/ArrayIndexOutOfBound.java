package com.java.core.exceptionhandling.unchecked;

public class ArrayIndexOutOfBound {
    public static void main(String[] args) {
    int arr[]={10,20,30};
    for (int i=0;i<5;i++)
    {
        try {
            System.out.println(arr[i]);
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Cannot access element beyond the limit");
        }
    }
    }
    void method()
    {
        System.out.println("Inside method");
    }
}
