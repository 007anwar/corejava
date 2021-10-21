package com.java.core.multithreading.threadgroup;

public class ThreadGroupDemo {
    public static void main(String[] args) {
      //  System.out.println(Thread.currentThread().getThreadGroup().getName());
    //    System.out.println(Thread.currentThread().getThreadGroup().getParent().getName());

        ThreadGroup parent = new ThreadGroup("Parent");
      //  System.out.println(parent.getName());

        ThreadGroup child = new ThreadGroup(parent, "Child");
      //  System.out.println(child.getParent().getName());


        Thread parent_thread = new Thread(parent, () -> {
            System.out.println("Parent thread");
        });
        Thread child_thread = new Thread(child, () -> {
            System.out.println("child thread");
        });
        child_thread.start();
          parent_thread.start();
    }
    
}
