package com.java.core.staticdemo;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Object> name=new ArrayList<>();
        name.add("abc");
        name.add("xyz");
        PersonJava personJava = new PersonJava(1, "Anwar", name);
        List<Object> list = personJava.getList();
        list.add("def");
        System.out.println(personJava.getList());
    }
}
