package com.java.core.staticdemo;

public class Fibonnaci {
    // 1 1 2 3 5 8 13 21....

    public static void main(String[] args) {
        System.out.println(getFibonnaci(0));
    }

    private static int getFibonnaci(int index)
    {

        if(index<=0)
            throw new IllegalArgumentException("Invalid input");
        if(index<=2)
            return 1;
        int a=1,b=1,result=0;
        for(int i=2;i<index;i++)
        {
            result=a+b;
            a=b;
            b=result;
        }
        return result;
    }
}
