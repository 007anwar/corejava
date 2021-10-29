package com.java.core.collection.map;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        //insertion order is maintained
        Map<String,Integer> map=new LinkedHashMap<>();

        map.put("Anwar",90);
        map.put("abcd",78);
        map.put("tom",66);
        map.put("lee",99);
        map.put("brad",80);


        Set<String> keySet = map.keySet();
        System.out.println(keySet);
        Collection<Integer> values = map.values();
        System.out.println(values);
        for (String key:keySet)
            System.out.println(key+" : "+map.get(key));
    }
}
