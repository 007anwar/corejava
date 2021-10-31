package com.java.core.collection.concurrent;

import java.util.concurrent.ArrayBlockingQueue;

public class BlockingQueueTest {
    public static void main(String[] args) {
        ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(1024);
        OrderProducer orderProducer = new OrderProducer(queue);
        OrderConsumer orderConsumer = new OrderConsumer(queue);
        new Thread(orderProducer).start();
        new Thread(orderConsumer).start();
    }
}
