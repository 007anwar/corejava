package com.java.core.javaeleven;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileUpdates {
    public static void main(String[] args) {
        try {
            Path test = Files.writeString(Files.createTempFile("Test", ".txt"), "creating file in java 11");
            System.out.println(test);
            String string = Files.readString(test);
            System.out.println("Data in file : "+string);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
