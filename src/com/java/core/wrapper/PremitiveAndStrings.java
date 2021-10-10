package com.java.core.wrapper;

public class PremitiveAndStrings {
    public static void main(String[] args) {
        byte x=100;
        String byteString = Byte.toString(x);
        byte stringToByte = Byte.parseByte(byteString);
        System.out.println(stringToByte);
    }
}
