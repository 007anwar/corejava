package com.java.core.collection.concurrent;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurentHashMapDemo extends Thread{
    static Map<String,String> courses=new ConcurrentHashMap<>();
    @Override
    public void run() {
        courses.put("Kuberneties","3.4");
    }

    public static void main(String[] args) throws InterruptedException {
        ConcurentHashMapDemo arrayListProblem = new ConcurentHashMapDemo();
        arrayListProblem.start();
        courses.put("Java","3");
        courses.put("Python","5.0");
        courses.put("Docker","4.4");
        courses.put("Jpa","4,4");
        Iterator<String> iterator = courses.keySet().iterator();
        courses.put("NTT","3.2");
        while (iterator.hasNext()) {
            Thread.sleep(2000);
            System.out.println(courses.get(iterator.next()));
        }
        System.out.println(courses);
    }
}
