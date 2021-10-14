package com.java.core.packageb;

import com.java.core.packagea.packagedemo;
import com.java.core.packageb.subpackage.Subpackage;

public class packageb {
    public static void main(String[] args) {
        packagedemo packagedemo = new packagedemo();
        packagedemo.methodB();
        Subpackage subpackage = new Subpackage();
        subpackage.mehtod();
    }
}
