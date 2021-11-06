package com.java.core.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternAndMatchers {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("abc");//string to find
        Matcher matcher = pattern.matcher("abcdefabciolabdclemnfhl");//input string
//        boolean result = matcher.find();
//        System.out.println(result);
        while (matcher.find())
        {
            System.out.println(matcher.start());
            System.out.println(matcher.end());
            System.out.println(matcher.group());
        }

    }
}
