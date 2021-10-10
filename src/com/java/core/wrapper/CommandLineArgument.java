package com.java.core.wrapper;

public class CommandLineArgument {
    public static void main(String[] args) {
        int i=0;
        for (String str:args) {
            i++;
            System.out.println(i+":"+str);
        }
    }
}
