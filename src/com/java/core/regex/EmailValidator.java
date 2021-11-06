package com.java.core.regex;

public class EmailValidator {
    public static void main(String[] args) {
        String email="abc@sa.om";
        if(email.matches("[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}"))
            System.out.println(email);
    }
}
