package com.java.core.exceptionhandling.unchecked;

import com.java.core.exceptionhandling.unchecked.ArrayIndexOutOfBound;

public class NullPointerException {
    static ArrayIndexOutOfBound obj;
    public static void main(String[] args) {
        obj.method();
    }
}
