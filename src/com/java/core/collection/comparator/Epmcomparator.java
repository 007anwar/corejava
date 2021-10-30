package com.java.core.collection.comparator;

import java.util.Comparator;
/**
* comparator is custom
* comparator can be passed to list
* comparator is not part of pojo it is created separately
* */
public class Epmcomparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return o2.getName().compareTo(o1.getName());
    }
}
