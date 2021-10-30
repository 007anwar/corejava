package com.java.core.collection.queue;

import java.util.TreeSet;

public class Navigable {
    public static void main(String[] args) {
        TreeSet<Integer> s=new TreeSet();
        s.add(20);
        s.add(10);
        s.add(50);
        s.add(40);
        s.add(30);
        System.out.println(s);
        System.out.println(s.ceiling(30));//>= 30
        System.out.println(s.higher(30));//> 40
        System.out.println(s.floor(30));//<= 30
        System.out.println(s.lower(30));//< 20
        System.out.println(s.pollFirst());
        System.out.println(s.pollLast());
        System.out.println(s.descendingSet());
        System.out.println(s);
    }
}
