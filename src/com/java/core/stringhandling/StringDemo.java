package com.java.core.stringhandling;

import java.util.Arrays;

public class StringDemo {
    public static void main(String[] args) {
        String s1="String one";
        String s2=new String("String two");
        char ch[]={'a','u','o','e','i','a'};
        Arrays.sort(ch);
        String s3=new String(ch);
        char[] chars = s3.toCharArray();
        Arrays.sort(chars);
        System.out.println(chars);
        byte b[]={65,66,67,68};
        String s4 = new String(b);
        System.out.println("S1:"+s1);
        System.out.println("S2:"+s2);
        System.out.println("S3:"+s3);
        System.out.println("S4:"+s4);
    }
}
