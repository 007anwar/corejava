package com.java.core.exceptionhandling.unchecked;

public class StringParser {
    public static void main(String[] args) {
        String s="abcd";
        try {

            int i=Integer.parseInt(s);
            System.out.println(i);
        }
        catch (NumberFormatException e)
        {
            System.out.println("Input must be a number");
        }
    }
}
