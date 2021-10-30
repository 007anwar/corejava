package com.java.core.collection.set;

import java.util.*;

public class HashSetDemo {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<10;i++)
            list.add(random.nextInt(5));
        System.out.println("List "+list);
        Set<Integer> set = new HashSet<>(list);
        System.out.println("Set :"+set);



    }
}
