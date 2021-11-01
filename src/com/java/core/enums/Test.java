package com.java.core.enums;

public class Test {
    public static void main(String[] args) {
        PaymentType pt=PaymentType.DEBITCARD;
        System.out.println(pt);
        PaymentType[] values = PaymentType.values();
        for(PaymentType s:values)
            System.out.println(s+" : "+s.ordinal() +" Fees: "+s.getFee());
    }
}
