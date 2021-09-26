package com.java.core.nonstaticdemo;

public class Demo {
   static Demo demoObj;
    public static void main(String[] args) {
        System.out.println(demoObj);
    }
    static {
        init();
        System.out.println(demoObj);
      demoObj = new Demo();
        System.out.println(demoObj);
    }

    static void init()
    {
demoObj=new Demo();
    }
}
