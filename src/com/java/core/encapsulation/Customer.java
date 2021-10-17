package com.java.core.encapsulation;

public class Customer {
    String firstName;
    String lastName;
    private  String creditCard;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCreditCard(String secret) {
        if(secret=="password")
        return creditCard;
        else
            return "00000";
    }

    public void setCreditCard(String creditCard) {
        if(creditCard.length()<10)
            throw new RuntimeException("Invalid credit card number");
        this.creditCard = creditCard;
    }

    public Customer(String firstName, String lastName, String creditCard) {
        if(creditCard.length()<10)
            throw new RuntimeException("Invalid credit card number");
        this.firstName = firstName;
        this.lastName = lastName;
        this.creditCard = creditCard;
    }
}
