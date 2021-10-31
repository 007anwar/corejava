package com.java.core.collection.concurrent;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

public class ArraySetProblem extends Thread{
    static Set<String> courses=new CopyOnWriteArraySet<>();
    @Override
    public void run() {
        courses.add("Kuberneties");
    }

    public static void main(String[] args) throws InterruptedException {
        ArraySetProblem arrayListProblem = new ArraySetProblem();
        arrayListProblem.start();
        courses.add("Java");
        courses.add("Python");
        courses.add("Docker");
        courses.add("Jpa");
        Iterator<String> iterator = courses.iterator();
        courses.add("NTT");
        while (iterator.hasNext()) {
            Thread.sleep(2000);
            System.out.println(iterator.next());
        }
        System.out.println(courses);
    }
}
