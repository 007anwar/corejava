package com.java.core.i18n;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest {
    public static void main(String[] args) {
        Double d=2323232.2323;
        NumberFormat nf=NumberFormat.getCurrencyInstance(Locale.UK);
        nf.setMaximumFractionDigits(4);
        nf.setMaximumIntegerDigits(3);
        System.out.println(nf.format(d));
    }
}
