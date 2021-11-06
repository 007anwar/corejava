package com.java.core.regex;

import java.util.regex.Pattern;

public class SplitDemo {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("\\s");
        String[] words= pattern.split("How are you");
        for(String word:words)
            System.out.println(word);
    }
}
