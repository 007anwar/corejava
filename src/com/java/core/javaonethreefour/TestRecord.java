package com.java.core.javaonethreefour;

public class TestRecord {
    public static void main(String[] args) {
        Employee employee2 = new Employee("Anwar", 5720);//this is final
        Employee employee1 = new Employee("Anwar", 5720);
        System.out.println(employee2.hashCode());
        System.out.println(employee1.hashCode());

    }
}
