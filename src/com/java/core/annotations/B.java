package com.java.core.annotations;

import java.util.ArrayList;
import java.util.List;

public class B {
    @SuppressWarnings("rawtypes")
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a);
        a.myMethod();

        List list=new ArrayList();
        System.out.println(list);
    }
}
