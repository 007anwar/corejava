package com.java.core.javaten;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class VarDemo {
    public static void main(String[] args) {
        var x=10;
        var n="abc";
        var list=new ArrayList<String>();
        list.add("abc");
        list.add("xyz");
        list.add("ntt");
        list.add("nihilent");
        List<String> n1 = list.stream().filter(obj -> obj.startsWith("n")).collect(Collectors.toList());
        System.out.println(n1);
    }
}
