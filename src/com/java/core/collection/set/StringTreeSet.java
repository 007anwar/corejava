package com.java.core.collection.set;

import java.util.Set;
import java.util.TreeSet;

public class StringTreeSet {
    public static void main(String[] args) {
        Set<String> strings=new TreeSet<>();
        strings.add("xyz");
        strings.add("mnp");
        strings.add("abc");
        strings.add("mnp");
        strings.add("mnp");
        for (String s:strings) {
            System.out.println(s);
        }
    }
}
