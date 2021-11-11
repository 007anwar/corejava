package com.java.core.javatwel;

import java.util.List;

public class ResultLists {
    List<Integer> odd;
    List<Integer> even;

    public List<Integer> getOdd() {
        return odd;
    }

    public void setOdd(List<Integer> odd) {
        this.odd = odd;
    }

    public List<Integer> getEven() {
        return even;
    }

    public void setEven(List<Integer> even) {
        this.even = even;
    }

    public ResultLists(List<Integer> odd, List<Integer> even) {
        this.odd = odd;
        this.even = even;
    }

    @Override
    public String toString() {
        return "ResultLists{" +
                "odd=" + odd +
                ", even=" + even +
                '}';
    }
}