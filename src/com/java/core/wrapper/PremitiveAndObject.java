package com.java.core.wrapper;

public class PremitiveAndObject {
    public static void main(String[] args) {
        int i=10;
        Integer wrapperInteger = Integer.valueOf(i);
        String s = String.valueOf(i);
        Long.parseLong(s);
        System.out.println(wrapperInteger);
        int intValue = wrapperInteger.intValue();
        System.out.println(intValue);
    }
}
