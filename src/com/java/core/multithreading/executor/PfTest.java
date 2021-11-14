package com.java.core.multithreading.executor;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PfTest {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(4);
        List<PfProcessor> pf=new ArrayList<>();
        for(int i=0;i<100;i++)
        pf.add(new PfProcessor());



        for (PfProcessor obj:pf) {
            executorService.submit(obj);

        }
              executorService.shutdown();
    }
}
