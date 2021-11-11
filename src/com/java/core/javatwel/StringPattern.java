package com.java.core.javatwel;

import java.text.NumberFormat;
import java.util.Locale;

public class StringPattern {
    public static void main(String[] args) {
        String s="You are the creator of your destiny";
        System.out.println(s.indent(10));//adds 10 spaces at the stating of string
        NumberFormat compactNumberInstance = NumberFormat.getCompactNumberInstance();
        System.out.println(compactNumberInstance.format(50000));
        NumberFormat compactNumberInstance1 = NumberFormat.getCompactNumberInstance(Locale.UK,NumberFormat.Style.LONG);
        System.out.println(compactNumberInstance1.format(4000));
        System.out.println(compactNumberInstance1.format(1000000));
    }
}