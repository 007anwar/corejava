package com.java.core.collection.list;

import java.util.ArrayList;
import java.util.List;

public class ListMethods {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList();
        for (int i=10;i<=100;i+=10)
        {
            list.add(i);
        }
        System.out.println("orignal list: "+list);

        list.add(2,111);
        System.out.println("list.add(2,111); "+list);

        list.set(2,333);
        System.out.println("list.set(2,333); "+list);//set is replace

        List<Integer> secondList=new ArrayList<>();
        secondList.add(101);
        secondList.add(102);
        secondList.add(103);
        System.out.println("Second List :"+secondList);
        list.addAll(3,secondList);

        System.out.println("Merged list : "+list);

        System.out.println(list.contains(102));

        System.out.println(list.get(1));

        System.out.println(list);

        list.removeIf(a->a%2==1);

        System.out.println(list);
    }
}
