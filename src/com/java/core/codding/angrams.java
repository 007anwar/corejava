package com.java.core.codding;

import java.util.Arrays;
import java.util.Scanner;

public class angrams {
    public static void main(String[] args) {
        System.out.println("Enter the string to check if it is an anagram:");
        String input1 = new Scanner(System.in).next();
        String input2 = new Scanner(System.in).next();

        char[] intput1CharArray = input1.toCharArray();
        char[] intput2CharArray = input2.toCharArray();
        Arrays.sort(intput1CharArray);
        Arrays.sort(intput2CharArray);

        System.out.println(intput1CharArray);
        System.out.println(intput2CharArray);

        if(intput1CharArray.toString()==intput2CharArray.toString()) {
            System.out.println("Strings are anagrams ");
        }
        else
        {
            System.out.println("String are not anagrams");}

    }
}
