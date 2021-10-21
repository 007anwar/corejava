package com.java.core.multithreading.corrupt;

public class Test {
    public static void main(String[] args) {
        new PrintSum().start();
        new PrintSum().start();
        new PrintSum().start();
        new PrintSum().start();
        new PrintSum().start();

    }
}
