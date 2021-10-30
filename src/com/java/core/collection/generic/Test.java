package com.java.core.collection.generic;

public class Test {
    public static void main(String[] args) {
        MyGenericClass<String> objectMyGenericClass = new MyGenericClass("Anwar");
          objectMyGenericClass.displayDetails();
        System.out.println(objectMyGenericClass.getObj());
    }
}
