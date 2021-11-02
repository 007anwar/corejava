package com.java.core.javaeight.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class FilterEvenNumbers {
    public static void main(String[] args) {
        List<Integer> numbers=new ArrayList<>();
        for(int i=0;i<30;i++) {
            int num = new Random().nextInt(40);
            System.out.println(num);
            numbers.add(num);
        }
        List<Integer> evenNumbers = numbers.stream()
                .distinct()
                .filter(num -> num % 2 == 0)
                .sorted((o1, o2) -> {if(o1>o2)
                return -1;
                else if (o2>o1)
                    return 1;
                else
                    return 0;

                })
                .collect(Collectors.toList());
        System.out.println(evenNumbers);
        long count = numbers.stream()
                .distinct()
                .filter(num -> num % 2 == 0)
                .count();
        System.out.println("Count of elements on final stream : " +count);
    }
}
