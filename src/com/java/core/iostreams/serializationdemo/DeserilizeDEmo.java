package com.java.core.iostreams.serializationdemo;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserilizeDEmo {
    public static void main(String[] args) {
        try {
            FileInputStream fis=new FileInputStream("C:\\Users\\anwar.mulla\\source\\corejava\\src\\com\\java\\core\\iostreams\\serializationdemo\\Employee.ser");
            ObjectInputStream ois=new ObjectInputStream(fis);

            Employee emp =(Employee) ois.readObject();

            System.out.println(emp);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
