package com.java.core.bouns;

public class BankAccount {
    static String bankName="ICICI";//Initialized when class is loaded,stored on Method Area
    private String name,number;//Initialized when object is created,stored on heap memory
    float balance;
    public static void main(String[] args) {
        System.out.println(BankAccount.bankName);
        BankAccount bankAccount = new BankAccount();
        bankAccount.name="ICICI";
    }
}
