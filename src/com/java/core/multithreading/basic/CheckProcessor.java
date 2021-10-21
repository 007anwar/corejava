package com.java.core.multithreading.basic;

public class CheckProcessor implements Runnable {
    @Override
    public void run() {
        System.out.println("Processed the check's");
    }

    public static void main(String[] args) {
        CheckProcessor checkProcessor = new CheckProcessor();
        Thread thread = new Thread(checkProcessor);
        thread.start();
    }
}
