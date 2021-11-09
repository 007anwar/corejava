package com.java.core.javanine;

public class Test {
    public static void main(String[] args) {
        TryWithRes res=new TryWithRes();
        try (res){
            res.doSomething();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
