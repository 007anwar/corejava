package com.java.core.javaeight.function;

import java.util.function.Function;

public class FunctionTest {
    public static void main(String[] args) {
        Function<String,Integer> strLength=s-> s.length();
        System.out.println(strLength.apply("Hello World"));
    }
}
