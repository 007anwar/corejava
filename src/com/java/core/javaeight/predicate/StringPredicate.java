package com.java.core.javaeight.predicate;

import java.util.function.Predicate;

public class StringPredicate {
    public static void main(String[] args) {
        Predicate<String> greaterThen=s->s.length()>3;
        System.out.println(greaterThen.test("Anwar"));
        System.out.println(greaterThen.test("abc"));
    }
}
