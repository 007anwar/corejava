package com.java.core.collection.concurrent;

import java.util.concurrent.BlockingQueue;

public class OrderProducer implements Runnable {
    private BlockingQueue<String> myqueue;

    public OrderProducer(BlockingQueue<String> myqueue) {
        this.myqueue = myqueue;
    }

    @Override
    public void run() {
        try {
            myqueue.put("Mac book");
            myqueue.put("Apple");
            myqueue.put("Dell");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
