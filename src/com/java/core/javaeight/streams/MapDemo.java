package com.java.core.javaeight.streams;

import java.util.List;
import java.util.stream.Collectors;

public class MapDemo {
    public static void main(String[] args) {
        List<String> input=List.of("Nihilent","Wipro","Deliotte","Pwc");
        List<String> upperCase = input.stream().map(str -> str.toUpperCase()).collect(Collectors.toList());
        System.out.println(upperCase);

    }
}
