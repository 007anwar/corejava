package com.java.core.encapsulation;

public class Test {
    public static void main(String[] args) {
        Customer customer = new Customer("Anwar", "Mulla", "0123456789");
        customer.setCreditCard("123");
        System.out.println(customer.getCreditCard("password"));
        System.out.println(customer.firstName);
        System.out.println(customer.lastName);
        System.out.println(customer);
    }
}
