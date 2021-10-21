package com.java.core.multithreading.yield;

public class MyThread extends Thread {
    @Override
    public void run() {
    for(int i=0;i<100;i++)
    {
        System.out.println(i);
      Thread.yield();
      /*Yield is basically used when you what to for main thread to be excuted before other
      threads but gurantee of this cannot be given
       */
    }}
}
