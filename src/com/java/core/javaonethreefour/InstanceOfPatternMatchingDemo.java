package com.java.core.javaonethreefour;

public class InstanceOfPatternMatchingDemo {
    public static void main(String[] args) {
        Object o = get();
        if(o instanceof String s){//check and type caste in one line
        System.out.println(s);}
    }
    public static Object get()
    {
        return "pattern matching";
    }
}
