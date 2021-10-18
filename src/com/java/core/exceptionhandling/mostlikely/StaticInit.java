package com.java.core.exceptionhandling.mostlikely;

public class StaticInit {
    static {
        int i=20/0;
    }
    public static void main(String[] args) {

    }
//    Exception in thread "main" java.lang.ExceptionInInitializerError
//    Caused by: java.lang.ArithmeticException: / by zero
//    at com.java.core.exceptionhandling.mostlikely.StaticInit.<clinit>(StaticInit.java:5)
}
