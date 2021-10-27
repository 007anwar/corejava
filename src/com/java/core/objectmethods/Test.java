package com.java.core.objectmethods;

public class Test {
    public static void main(String[] args) {
        Passanger passanger2 = new Passanger(1,"Anwar", "Mulla");
        Passanger passanger1 = new Passanger(1, "Anwar", "Mulla");

        System.out.println(passanger1.equals(passanger2));

    }
}
