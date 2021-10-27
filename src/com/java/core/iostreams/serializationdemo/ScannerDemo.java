package com.java.core.iostreams.serializationdemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream fis=new FileInputStream("C:\\Users\\anwar.mulla\\source\\corejava\\src\\com\\java\\core\\iostreams\\serializationdemo\\input.txt");
        Scanner scanner = new Scanner(fis);
        while (scanner.hasNext())
            System.out.println(scanner.nextLine());
    }
}
