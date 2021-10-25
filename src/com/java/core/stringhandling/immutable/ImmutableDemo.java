package com.java.core.stringhandling.immutable;

public class ImmutableDemo {
    public static void main(String[] args) {
        String s1 = new String("Hell");
        System.out.println(s1.hashCode());
        String s2 = new String("Hell");
        System.out.println(s2.hashCode());

    }
}
