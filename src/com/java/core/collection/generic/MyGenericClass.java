package com.java.core.collection.generic;

public class MyGenericClass<T> {
    T obj;
    MyGenericClass(T obj)
    {
        this.obj=obj;
    }
    public void displayDetails()
    {
        System.out.println("The type of object: "+obj.getClass().getName());
    }
    public T getObj()
    {
        return obj;
    }
}
