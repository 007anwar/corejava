package com.java.core.iostreams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {
    public static void main(String[] args) {
        FileInputStream fis=null;
        FileOutputStream fos=null;
        try {
            fis=new FileInputStream("C:\\Users\\anwar.mulla\\source\\corejava\\src\\com\\java\\core\\iostreams\\input.txt");
            fos=new FileOutputStream("C:\\Users\\anwar.mulla\\source\\corejava\\src\\com\\java\\core\\iostreams\\output.txt");
            int data;
            while ((data=fis.read())!=-1)
            {
fos.write(data);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                fis.close();
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
