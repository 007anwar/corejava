package com.java.core.stringhandling.bufferandbuilder;

public class SBDemo {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer();
        System.out.println(stringBuffer.capacity());
        stringBuffer.append("all the power is with");
        stringBuffer.append(" adding more string");
        System.out.println(stringBuffer);
        System.out.println(stringBuffer.capacity());
        StringBuffer abcde = new StringBuffer("abcde");
        System.out.println(abcde.reverse());
        System.out.println(stringBuffer.insert(3," abc "));
    }
}
