package com.java.core.iostreams;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReaderAndWritterDemo {
    public static void main(String[] args) {
        FileReader fr=null;
        FileWriter fw=null;
        try {
            fr=new FileReader("C:\\Users\\anwar.mulla\\source\\corejava\\src\\com\\java\\core\\iostreams\\input.txt");
            fw=new FileWriter("C:\\Users\\anwar.mulla\\source\\corejava\\src\\com\\java\\core\\iostreams\\output.txt");
            int ch;
            while ((ch=fr.read())!=-1)
            {
                fw.write(ch);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {

            try {
                fr.close();
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
