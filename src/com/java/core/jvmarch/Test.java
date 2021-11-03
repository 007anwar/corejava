package com.java.core.jvmarch;

import java.lang.reflect.Method;

public class Test {
    public static void main(String[] args) throws ClassNotFoundException {
        Class user1 = Class.forName("com.java.core.jvmarch.User");
        System.out.println(user1.getClassLoader());
        Method[] methods = user1.getMethods();
        for(Method m:methods)
            System.out.println(m.getName());
        Class user2 = Class.forName("com.java.core.jvmarch.User");
        System.out.println(user1==user2);
        System.out.println(user1.getClassLoader().getName());

    }
}
