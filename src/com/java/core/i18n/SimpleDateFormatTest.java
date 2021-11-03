package com.java.core.i18n;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat simpleDateFormatTest = new SimpleDateFormat("dd-MMM-YYYY hh:mm:ss");
        String format = simpleDateFormatTest.format(new Date());
        System.out.println(format);
        String date="03-11-2021";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-mm-yyyy");
        Date parse = simpleDateFormat.parse(date);
        System.out.println(parse);

    }
}
