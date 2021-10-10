package com.java.core.datatypes;

public class ImplecitCast {
    public static void main(String[] args) {
        byte b=100;
        int i=b;
        System.out.println("i="+i);
        long l=i;
        char ch='A';
        int chNum=ch;
        System.out.println("Char="+chNum);
    }
}
