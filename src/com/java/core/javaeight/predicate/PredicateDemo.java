package com.java.core.javaeight.predicate;

import java.util.Random;
import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
        Predicate<Integer> greaterThan=(x)->x>20;
        for(int i=0;i<30;i++)
        {
            int input = new Random().nextInt(50);
            if(greaterThan.test(input))
                System.out.println(input+ " is greater than 20");
            else
                System.out.println(input+ " is less than 20");
    }}
}
