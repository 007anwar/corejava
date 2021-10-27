package com.java.core.arrays;

public class CharacterArray {
    public static void main(String[] args) {
        char[] ch={'a','f','v','a'};
        if(ch[0]==ch[ch.length-1])
            System.out.println("Start and end element is same");
        else
            System.out.println("First and last elements are different");
    }
}
