package com.java.core.stringhandling.stringmethods;

public class StringMethods {
    public static void main(String[] args) {
        String s="hello world";
        System.out.println("Length of given string is: "+s.length());
        System.out.println("Index of o is: "+s.indexOf('o'));
        System.out.println("Char at index 4 is: "+s.charAt(4));
        System.out.println("Substring with begining index "+s.substring(2));
        System.out.println("Substring of begining and end endx "+s.substring(0,4));
        String[] result = s.split(" ");
        for (String s1:result) {
            System.out.println(s1);
        }
        System.out.println("Replacing l with k"+s.replace('l','k'));
        System.out.println(s.toUpperCase());
    }
}
