package com.java.core.multithreading.basic;

public
class MultiThreaded extends Thread {
    public static void main(String[] args) throws InterruptedException {
      Thread t=  new MultiThreaded();
      t.setPriority(MAX_PRIORITY);
      t.setName("ONE");
      t.start();
      t.start();
        Thread t1=  new MultiThreaded();
        t1.setName("TWO");
        t1.setPriority(MIN_PRIORITY);
        t1.start();
        Thread thread = Thread.currentThread();
        System.out.println("Thread name is "+thread.getName());
//        for(int j=0;j<200;j++)
//        {
//            Thread.sleep(100);
//            System.out.print("J:"+j+"\t");
//        }
    }
    @Override
    public void run()
    {
        Thread thread = Thread.currentThread();
        System.out.println("Thread name is "+thread.getName());
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for(int i=0;i<200000;i++)
        {
               System.out.println("Thread name is "+thread.getName());
        }
    }

}
