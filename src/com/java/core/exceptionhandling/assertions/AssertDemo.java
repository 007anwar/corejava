package com.java.core.exceptionhandling.assertions;

public class AssertDemo {
    public static void main(String[] args) {
        int withdrawlAmount=100;
        int currentBalance=60;
        assert (withdrawlAmount<currentBalance):"Withdrwl is more then current balance";
    }
}
