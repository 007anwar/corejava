package com.java.core.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.stream.Collectors;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList();
        list.add(new Integer(20));
        list.add(10);//Auto boxing
        //System.out.println(list);

        list.stream().filter(o->o%2==0).collect(Collectors.toList());
        Iterator<Integer> itr=list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
            itr.remove();
        }
    }
}
