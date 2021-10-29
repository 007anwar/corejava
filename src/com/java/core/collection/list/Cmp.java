package com.java.core.collection.list;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Cmp {
    public static void main(String[] args) {
        Comparator<StringBuffer> sbCompsrator=(o1,o2)->{
            StringBuffer s1= (StringBuffer) o1;
            StringBuffer s2= (StringBuffer) o2;
            if(s1.length()<s2.length())
                return -1;
            else if (s1.length()>s2.length())
                return 1;
            else
                return 0;
        };
        Set<StringBuffer> s= new TreeSet();
        s.add(new StringBuffer("x"));
        s.add(new StringBuffer("abc"));
        s.add(new StringBuffer("ab"));
        s.add(new StringBuffer("abcdd"));
        s.add(new StringBuffer("abdc"));
        System.out.println(s);

    }
}
