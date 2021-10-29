package com.java.core.collection.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {

        Object obj[]=new Object[1000000];
        for (int i=0;i<obj.length;i++)
            obj[i]=new Object();

        List<Object> listObject=new LinkedList<>();
        long startTime = System.currentTimeMillis();
        for (Object o:obj)
            listObject.add(o);
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken :"+(endTime-startTime));

    }
}
