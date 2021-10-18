package com.java.core.exceptionhandling.custom;

public class Test {
    public static void main(String[] args) throws CheckedCustomException {
        throw new CheckedCustomException("My custom exception");
    }
}
