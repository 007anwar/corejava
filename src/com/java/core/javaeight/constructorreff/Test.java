package com.java.core.javaeight.constructorreff;

public class Test {
    public static void main(String[] args) {
        MyInterFace m=s->new MyClass(s);
        m.get("String");
MyInterFace f2=MyClass::new;
f2.get("avc");
    }
}
