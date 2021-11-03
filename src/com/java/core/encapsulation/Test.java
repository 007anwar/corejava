package com.java.core.encapsulation;

public class Test {
    public static void main(String[] args) {
        Customer customer = new Customer("Anwar", "Mulla", "password");
        customer.setCreditCard("123");
customer.setCreditCard("000000");
        System.out.println(customer.firstName);
        System.out.println(customer.lastName);
        System.out.println(customer);
    }
}
