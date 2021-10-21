package com.java.core.multithreading.basic;

import java.util.Scanner;

public class JoinDemo extends Thread{
    static int num,sum;
    public static void main(String[] args) {
        System.out.println("Enter value for n");
        Scanner scanner = new Scanner(System.in);
        num=scanner.nextInt();
        JoinDemo joinDemo = new JoinDemo();
        joinDemo.start();

        try {
            joinDemo.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for(int i=0;i<num;i++) {
            sum += i;
            System.out.print("SUM : " + sum);
            System.out.print("\tI : "+i);
            System.out.println();
        }
        System.out.println("Sum of first "+num+"numbers is "+sum);
    }

    @Override
    public void run() {
        for(int i=0;i<num;i++) {
            sum += i;
            System.out.print("SUM : " + sum);
            System.out.print("\tI : "+i);
            System.out.println();
        }
    }
}
