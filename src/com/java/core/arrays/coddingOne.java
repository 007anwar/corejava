package com.java.core.arrays;

public class coddingOne {
    public static void main(String[] args) {
        int input[]={2,3,8,5,3,5,5};
        for(int i=0;i<input.length-1;i++)
        {
            if(input[i]==3&&input[i+1]==5)
            {
                input[i+1]=0;
            }
        }
        for (int i:input
             ) {
            System.out.print(i+" ");

        }
    }
}
