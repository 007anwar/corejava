package com.java.core.javanine;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StrimingApi {
    public static void main(String[] args) {
        //List<Integer> integers = Arrays.asList(10, 20, 23, 45, 231, 32, 43, 7,null);
        List<Integer> integers=new ArrayList<>();
        integers.add(10);
        integers.add(20);
        integers.add(null);
        System.out.println(integers);
         integers.removeIf(x->x==null);
        System.out.println(integers);
        //takes only which satisfies the condition
        List<Integer> multipleOfFive = integers.stream().filter(x -> x % 5 == 0).collect(Collectors.toList());
        System.out.println(multipleOfFive);
        //takes only till condition is satisfied, once condition is not satisfied it drops all other elements without check
        List<Integer> takeWhileStream = integers.stream().takeWhile(x -> x % 5 == 0).collect(Collectors.toList());//takes till condition is satisfied
        System.out.println(takeWhileStream);
        //drops till condition is satisfied takes all after condition is not satisfied
        List<Integer> dropWhile = integers.stream().dropWhile(x -> x % 5 == 0).collect(Collectors.toList());//drops till condition is satisfied
        System.out.println(dropWhile);
        integers.removeIf(x->x==null);
        System.out.println(integers);


    }
}
