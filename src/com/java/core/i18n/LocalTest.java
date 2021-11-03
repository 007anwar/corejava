package com.java.core.i18n;

import java.util.Locale;

public class LocalTest {
    public static void main(String[] args) {
        Locale.setDefault(Locale.CANADA);
        Locale currentDefault = Locale.getDefault();
        System.out.println(currentDefault.getCountry());
        System.out.println(currentDefault.getLanguage());
        System.out.println(currentDefault.getDisplayCountry());
        System.out.println(currentDefault.getDisplayLanguage());
        String[] isoCountries = Locale.getISOCountries();
        for (String s:isoCountries
             ) {
            System.out.println(s);

        }

    }
}
