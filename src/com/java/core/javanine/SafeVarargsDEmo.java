package com.java.core.javanine;

public class SafeVarargsDEmo {
    public static void main(String[] args) {
      myMethods(new String[]{"abc", "a"});
    }
    static void myMethods(String ...s)
    {

for(String ip:s)
    System.out.println(ip);
    }
}
