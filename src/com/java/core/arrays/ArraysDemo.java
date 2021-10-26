package com.java.core.arrays;

public class ArraysDemo {
    public static void main(String[] args) {
        //int arr[5];
        //int arr[]={10,20,30,40};
        int arr[]=new int[5];
        arr[0]=10;
        arr[1]=new Integer(30);//autoboxing
        arr[3]=30;
        for (int x:arr) {
            System.out.println(x);
        }


       // long arr1=new long[];


    }
}
