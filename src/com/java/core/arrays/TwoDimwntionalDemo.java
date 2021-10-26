package com.java.core.arrays;

public class TwoDimwntionalDemo {
    public static void main(String[] args) {
        int metrix[][]=new int[3][3];
        int metrix2[][]={{1,2,3},{4,5,6},{7,8,9}};
        for (int[] x:metrix2) {
for(int y:x)
{
    System.out.print(y+" ");
}
            System.out.println();
        }
    }
}
