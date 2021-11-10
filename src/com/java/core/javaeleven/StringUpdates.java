package com.java.core.javaeleven;

import java.util.SortedMap;
import java.util.stream.Collectors;

public class StringUpdates {
    public static void main(String[] args) {
        String str=" hello world ";
        System.out.println(str.isBlank());
        System.out.println(str.isEmpty());
        str="I am the\n creator of\n my destiny";
        System.out.println(str.lines().collect(Collectors.toList()));
        String sttr=" hello world ";
        System.out.println(sttr);
        System.out.println(sttr.strip());
        System.out.println(sttr);
        System.out.println(new String("-").repeat(150));


        System.out.println(str.isEmpty());
    }
}
