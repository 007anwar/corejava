package com.java.core.collection.set;

import java.util.*;

public class DifferentSetImplementation {
    public static void main(String[] args) {
        Random random = new Random();

       // Set<Integer> set=new HashSet();//no order no sorting no duplicates allowed
       // Set<Integer> set=new LinkedHashSet<>();//ORDERED but not sorted no duplicates allowed
         Set<Integer> set=new TreeSet<>();//SORTED no duplicates allowed
        for(int i=0;i<10;i++) {
            int nextInt = random.nextInt(10);
            System.out.println(nextInt);
            set.add(nextInt);
        }
        System.out.println("Set :"+set);
        Iterator<Integer> itr=set.iterator();
        while (itr.hasNext())
            System.out.println(itr.next());

    }
}
