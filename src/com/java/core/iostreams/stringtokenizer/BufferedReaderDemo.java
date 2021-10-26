package com.java.core.iostreams.stringtokenizer;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class BufferedReaderDemo {
    public static void main(String[] args) {
        int count=0;
        try(
                FileReader fr=new FileReader("C:\\Users\\anwar.mulla\\source\\corejava\\src\\com\\java\\core\\iostreams\\stringtokenizer\\myfile.txt");
                BufferedReader br=new BufferedReader(fr);
                ) {
            String line;
            while ((line=br.readLine())!=null)
            {
                StringTokenizer stringTokenizer = new StringTokenizer(line);
                while (stringTokenizer.hasMoreTokens()) {
                    System.out.println(stringTokenizer.nextToken());
                    count++;
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
         System.out.println("Number of words in file are: "+count);
    }
}
