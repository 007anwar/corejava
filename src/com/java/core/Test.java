package com.java.core;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        int i=0;
        List<String> cites = List.of("Pune", "Mumbai", "Kolkata","Satara","Goa");
        cites.stream().filter(city -> city.startsWith("P")).map(String::toUpperCase).forEach(System.out::println);
        Map<String, String> stringMap = cites.stream().collect(Collectors.toMap(Function.identity(), String::toString));
        System.out.println("String map");
        System.out.println(stringMap);
    }

















}
