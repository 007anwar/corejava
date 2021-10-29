package com.java.core.collection.set;

import java.util.Set;
import java.util.TreeSet;

public class StringBufferTreeSet {
    public static void main(String[] args) {
        Set<StringBuffer> sets=new TreeSet<>();
        sets.add(new StringBuffer("nop"));
        sets.add(new StringBuffer("mnp"));
        sets.add(new StringBuffer("abc"));
        sets.add(new StringBuffer("mnp"));
        sets.add(new StringBuffer("mnp"));
        for (StringBuffer s:sets) {
            System.out.println(s);
        }
    }
}
