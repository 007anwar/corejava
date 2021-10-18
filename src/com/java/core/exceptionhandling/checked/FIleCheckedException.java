package com.java.core.exceptionhandling.checked;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FIleCheckedException {
    void readFile() throws FileNotFoundException
    {
            FileInputStream fis = new FileInputStream("");
    }
    public static void main(String[] args) throws FileNotFoundException {
        FIleCheckedException fIleCheckedException = new FIleCheckedException();
        fIleCheckedException.readFile();
    }
}
