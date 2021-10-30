package com.java.core.collection.generic;

import java.util.ArrayList;
import java.util.List;

public class TypeCastingProblem {
    public static void main(String[] args) {
        String s[]=new String[10];
        s[0]="John";
        s[1]="Rob";
        //s[3]=123;
        List<String> l=new ArrayList();
        l.add("john");
        l.add("rob");
      //  l.add(123);
        String name1=(String)l.get(0);
        String name2=(String)l.get(1);
     //   String name3=(String)l.get(2);
    }
}
