package com.java.core.collection.collectionsutility;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsClass {
    public static void main(String[] args) {
        List<String> list=new ArrayList();
        list.add("zyx");
        list.add("abc");
        list.add("np");
        list.add("a");
        list.add("b");
        list.add("n");
        list.add("s");
        System.out.println("Before sorting");
        System.out.println(list);
        System.out.println("After sorting");
        Collections.sort(list,(s1,s2)->{return s2.compareTo(s1);});
        System.out.println(list);
        //if custom comparator is used to sort elements then comparator should be passed to binarySearch
        int s = Collections.binarySearch(list, "s",(s1,s2)->{return s2.compareTo(s1);});
        System.out.println("index of element s is: "+s);
    }
}
