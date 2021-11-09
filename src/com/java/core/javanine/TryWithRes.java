package com.java.core.javanine;

public class TryWithRes implements AutoCloseable {

public  void doSomething()
{
    System.out.println("Doing something");
}
    @Override
    public void close() throws Exception {
        System.out.println("Closing the resource");
    }
}
