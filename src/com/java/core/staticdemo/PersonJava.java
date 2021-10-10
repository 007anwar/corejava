package com.java.core.staticdemo;

import java.util.List;

public class PersonJava {
    @Override
    public String toString() {
        return "PersonJava{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", list=" + list +
                '}';
    }

    private int age;
    private String name;
    final private List<Object> list;

    public PersonJava(int age, String name, List<Object> list) {
        this.age = age;
        this.name = name;
        this.list = list;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public List<Object> getList() {
        return List.of(list);
    }


}