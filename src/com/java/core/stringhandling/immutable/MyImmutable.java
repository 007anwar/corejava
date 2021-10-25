package com.java.core.stringhandling.immutable;

import java.util.ArrayList;
import java.util.List;

public class MyImmutable {
    int x;
    List<MyImmutable> mylist=new ArrayList<>();
    public MyImmutable(int x) {
        this.x = x;
    }

    public MyImmutable change(int x)
    {
        if(this.x==x)
            return this;
            else return new MyImmutable(x);
    }
    public static void main(String[] args) {
        MyImmutable myImmutable1 = new MyImmutable(10);
        System.out.println(myImmutable1.hashCode());
        MyImmutable myImmutable2 = new MyImmutable(20);
        System.out.println(myImmutable2.hashCode());
        MyImmutable change = myImmutable1.change(20);
        System.out.println(change.hashCode());
    }
}
