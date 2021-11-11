package com.java.core.javatwel;

import java.util.List;

public class Result {
   private Long count;
   List<Integer> filtered;

    @Override
    public String toString() {
        return "Result{" +
                "count=" + count +
                ", filtered=" + filtered +
                '}';
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public List<Integer> getFiltered() {
        return filtered;
    }

    public Result(Long count, List<Integer> filtered) {
        this.count = count;
        this.filtered = filtered;
    }

    public void setFiltered(List<Integer> filtered) {
        this.filtered = filtered;
    }
}