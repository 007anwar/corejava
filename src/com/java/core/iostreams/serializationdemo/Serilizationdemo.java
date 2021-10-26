package com.java.core.iostreams.serializationdemo;

import java.io.*;

public class Serilizationdemo {
    public static void main(String[] args) {
        Employee anwar = new Employee(1, "Anwar", 28271.00f, 12345);
        FileInputStream fis=null;
        FileOutputStream fos=null;
        try {
            fos=new FileOutputStream("C:\\Users\\anwar.mulla\\source\\corejava\\src\\com\\java\\core\\iostreams\\serializationdemo\\Employee.ser");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fos);
            objectOutputStream.writeObject(anwar);
            System.out.println("Employee object Ser");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
