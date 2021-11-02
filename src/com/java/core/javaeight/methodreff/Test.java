package com.java.core.javaeight.methodreff;

public class Test {
    public static void main(String[] args) {
        Test test = new Test();
        Hello h=test::say;
        h.sayHello("Anwar");
    }

    public void say(String s) {
        System.out.println("Hello :"+s);
    }
}
