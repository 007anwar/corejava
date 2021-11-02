package com.java.core.javaeight.lambdas.annonymous;

public class Test {
    public static void main(String[] args) {
        for(int i=1;i<=10;i++)
            System.out.println("main thread");
        Thread t=new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=1;i<=10;i++)
                    System.out.println("child t");
            }
        });

        Thread t1=new Thread(()->{  for(int i=1;i<=10;i++)
            System.out.println("child t1");});
        t.start();
        t1.start();

    }
}
