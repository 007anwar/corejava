package com.java.core.javaten;

import java.util.List;
import java.util.stream.Collectors;

public class CollectorsDemo {
    public static void main(String[] args) {
        List<Integer> list = List.of(12, 34, 56, 234, 345);
        List<Integer> newList = list.stream().filter(obj -> obj % 3 == 0).collect(Collectors.toUnmodifiableList());
        newList.add(01);
        System.out.println(newList);
    }
}
