package com.java.core.javaeight.predicatejoin;

import java.util.Random;
import java.util.function.Predicate;

public class PassingPredicateToFuncation {
    public static void main(String[] args) {
        Predicate<Integer> greaterThan=(x)->x>20;
         for(int i=0;i<20;i++)
             printGreater(greaterThan, new Random().nextInt(60));

    }
    static void printGreater(Predicate p,int x)
    {
        System.out.println(x+ "is greater than 20 :"+p.test(x));
    }
}
