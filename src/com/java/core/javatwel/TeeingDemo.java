package com.java.core.javatwel;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TeeingDemo {
    public static void main(String[] args) {
        Stream<Integer> integerStream = Stream.of(10, 20, 12, 19, 3, 4, 15);
//        Result collect = integerStream.collect(
//                Collectors.teeing(
//                        Collectors.counting(),
//                        Collectors.filtering(
//                                obj -> Integer.parseInt(obj.toString()) < 10, Collectors.toList()),
//                        Result::new
//                )
//        );
//        System.out.println(collect);
        ResultLists collect1 = integerStream.collect(
                Collectors.teeing(
                        Collectors.filtering(
                                obj -> obj % 2 != 0, Collectors.toList()),
                        Collectors.filtering(
                                obj -> obj % 2 == 0, Collectors.toList()),
                        ResultLists::new
                )

        );
        System.out.println(collect1);




    }
}
