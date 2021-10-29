package com.java.core.collection.map;

public class User {
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalized");
    }

    @Override
    public String toString() {
        return "User";
    }
}
