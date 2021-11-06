package com.java.core.refflectionapi;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        //loading class
        Class<?> myClass = Class.forName(Calculator.class.getName());

        //loading no args constructor
        Constructor<?> noArgsConst = myClass.getConstructor(null);
        Object noArgs = noArgsConst.newInstance();

        //loading args contructor
        Constructor<?> constructor = myClass.getConstructor(int.class,int.class);
        Object Args = constructor.newInstance(10,20);

//        Field num1 = myClass.getDeclaredField("num1");
//        num1.setAccessible(true);
//        num1.set(myClass,123);

        //calling method
        Method displayMethod = myClass.getMethod("display", String.class);
        System.out.println("Invoking display using no args constructors object");
         displayMethod.invoke(noArgs,"hi");
        System.out.println("Invoking display using all args constructors object");
        displayMethod.invoke(Args,"Hello");


        Annotation[] annotations = myClass.getAnnotations();
        System.out.println(Arrays.toString(annotations));
    }
}
