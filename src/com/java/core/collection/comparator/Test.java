package com.java.core.collection.comparator;

import java.util.Set;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        Set<Employee> emp=new TreeSet<>(new Epmcomparator());
        emp.add(new Employee(1,"Anwar"));
        emp.add(new Employee(2,"Aariz"));
        emp.add(new Employee(3,"Zidan"));
        System.out.println(emp);
    }
}
