package com.java.core.polymorphism;

public class CompileTimeBinding {
    void add(int a,int b)
    {
        System.out.println("Addition is :"+(a+b));
    }
    /*

     */
    void add(float a,float b,float c)
    {
        System.out.println("Addition is :"+(a+b+c));
    }
    void add(int a,int b,int c){
        System.out.println("Addition is :"+(a+b+c));
    }

    public static void main(String[] args) {
        CompileTimeBinding compileTimeBinding = new CompileTimeBinding();
        compileTimeBinding.add(10,29);
        compileTimeBinding.add(10,20,30);
        compileTimeBinding.add(10.45f,20.65f,34.34f);
    }
}
