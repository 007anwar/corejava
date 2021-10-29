package com.java.core.collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

public class WeekHashMapDemo {
    public static void main(String[] args) throws InterruptedException {
        Map<User,String> user=new WeakHashMap<>();
        User user1 = new User();
        user.put(user1,"tom");
        System.out.println(user);
        user1=null;
        System.gc();
        Thread.sleep(500);
        System.out.println(user);
    }
}
