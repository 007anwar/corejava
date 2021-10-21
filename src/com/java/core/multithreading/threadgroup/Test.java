package com.java.core.multithreading.threadgroup;

public class Test {
    public static void main(String[] args) {
        ThreadGroup myThreadGroup = new ThreadGroup("MyThreadGroup");
        CustomThread thread1 = new CustomThread(myThreadGroup, "Thread1");
        CustomThread thread2 = new CustomThread(myThreadGroup, "Thread2");
        thread1.start();
        thread2.start();
       myThreadGroup.list();
    }
}
