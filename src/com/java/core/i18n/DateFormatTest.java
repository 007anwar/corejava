package com.java.core.i18n;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormatTest {
    public static void main(String[] args) {
        DateFormat usdf=DateFormat.getDateInstance(DateFormat.FULL, Locale.US);
        DateFormat ukdf=DateFormat.getDateInstance(0, Locale.UK);
        Date date = new Date();
        System.out.println("Date in us formate : "+usdf.format(date));
        System.out.println("Date un uk formate : "+ukdf.format(date));


        DateFormat timeInstance = DateFormat.getTimeInstance(1);
        System.out.println(timeInstance.format(date));
    }
}
