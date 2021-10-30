package com.java.core.collection.collectionsutility;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReversingCollectionDemo {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(10, 8, 50, 78);//this is immutable list cannot be modified
        List<Integer> integers = new ArrayList<>();
        integers.add(10);
        integers.add(3);
        integers.add(90);
        integers.add(76);
        System.out.println("Before reverse");
        System.out.println(integers);
        Collections.reverse(integers);
        System.out.println("After reverse");
        System.out.println(integers);
    }
}
