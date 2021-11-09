package com.java.core.staticdemo;

public class Pallindrom {
    public static void main(String[] args) {
checkPallindrom("pallindrom");
    }


    private static void checkPallindrom(String str) {
        int strLength = str.length();
        String revString = "";
        for (int i = strLength - 1; i >= 0; i--) {
            revString = revString + str.charAt(i);
        }
        System.out.println(revString);
    }
}