package com.java.core.collection.map;

import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashMapDemo {
    public static void main(String[] args) {
        //use == operator to check if two keys are pointing to same location in memory
        Map<Integer,String> map=new IdentityHashMap<>();
        map.put(new Integer(10),"Anwar");
        map.put(new Integer(10),"Mulla");

        System.out.println(map);
    }
}
