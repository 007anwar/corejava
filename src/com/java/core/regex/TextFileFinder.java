package com.java.core.regex;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextFileFinder {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\anwar.mulla\\source\\corejava\\src\\com\\java\\core\\regex");
        String[] fileName = file.list();
        Pattern pattern = Pattern.compile("[a-z]*+'.'+[a-z]*");
        for (String name:fileName)
        {
            Matcher matcher = pattern.matcher(name);
            if(matcher.matches())
                System.out.println(name);
        }

    }
}
