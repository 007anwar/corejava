package com.java.core.collection.concurrent;

import java.util.concurrent.BlockingQueue;

public class OrderConsumer implements Runnable {
    private BlockingQueue<String> myqueue;

    public OrderConsumer(BlockingQueue<String> myqueue) {
        this.myqueue = myqueue;
    }

    @Override
    public void run() {
        try {
            System.out.println(myqueue.take());
            System.out.println(myqueue.take());
            System.out.println(myqueue.take());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
