package com.java.core.stringhandling.programs;

import java.util.Scanner;

public class StringReversal {
    public static void main(String[] args) {
        System.out.println("Enter a string to reverse");
        String input = new Scanner(System.in).next();
        String output="";
        for(int i=input.length()-1;i>=0;i--)
            output+=input.charAt(i);
        System.out.println("Reversed String: "+output);


        byte[] s1 = input.getBytes();
        byte[] s2=new byte[s1.length];
        for (int i=0;i<s1.length;i++)
            s2[i]=s1[s1.length-i-1];
        String reversed = new String(s2);
        System.out.println("Reversed string using byte array: "+reversed);


    }
}
