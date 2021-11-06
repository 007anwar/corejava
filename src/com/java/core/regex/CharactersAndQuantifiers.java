package com.java.core.regex;

import java.util.regex.Pattern;

public class CharactersAndQuantifiers {
    public static void main(String[] args) {
        System.out.println(Pattern.matches("abc","abc"));//exactly match abc
        System.out.println(Pattern.matches("\\d","1"));//digit
        System.out.println(Pattern.matches("\\D","1"));//not a digit
        System.out.println(Pattern.matches("[a-z]","j"));//single char between a-z
        System.out.println(Pattern.matches("[a-z]*","fahjfgajfgdj"));//any number of char between a-z
    }
}
