package com.java.core.abstraction;

public class Test {
    public static void main(String[] args) {
        BMW threeSeries=new ThreeSeries();
        BMW fiveSeries=new FiveSeries();
        threeSeries.commonFun();
        threeSeries.accelerate();
        fiveSeries.commonFun();
        fiveSeries.accelerate();
    }
}
