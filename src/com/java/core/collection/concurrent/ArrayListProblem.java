package com.java.core.collection.concurrent;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ArrayListProblem extends Thread{
    static List<String> courses=new CopyOnWriteArrayList();
    @Override
    public void run() {
        courses.add("Kuberneties");
    }

    public static void main(String[] args) throws InterruptedException {
        ArrayListProblem arrayListProblem = new ArrayListProblem();
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
