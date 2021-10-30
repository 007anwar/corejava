package com.java.core.collection.arrays;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArraysAndList {
    public static void main(String[] args) {
        String str[]={"n","i","h","i","l","e","n","t"};
        List<String> arlist= Arrays.asList(str);
        List<String> collect = arlist.stream().map(o -> o = o + "x").collect(Collectors.toList());
        System.out.println(collect);
        System.out.println(arlist);
    }
}
