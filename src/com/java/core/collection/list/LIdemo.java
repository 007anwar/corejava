package com.java.core.collection.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LIdemo {
    public static void main(String[] args) {
  List<String> list = new LinkedList<>();
  list.add("abc");
  list.add("def");
  list.add("xyz");
        Iterator<String> iterator = list.iterator();//do not have has previous method
        ListIterator<String> stringListIterator = list.listIterator();
        while (stringListIterator.hasNext()){
            System.out.println(stringListIterator.next());
    }
        System.out.println("Backward");
        while (stringListIterator.hasPrevious())
            System.out.println(stringListIterator.previous());

    }

}
