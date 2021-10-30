package com.java.core.collection.random;

import java.util.Random;

public class RandomDemo {
    public static void main(String[] args) {
        Random random = new Random();

        System.out.println(random.nextInt(300));
        System.out.println(random.nextInt());

    }
}
