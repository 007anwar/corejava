package com.java.core.regex;

public class PhoneNumberlValidator {
    public static void main(String[] args) {
        String phoneNumber="7972791732";
        if(phoneNumber.matches("^\\d{10}$"))
            System.out.println(phoneNumber);
    }
}
