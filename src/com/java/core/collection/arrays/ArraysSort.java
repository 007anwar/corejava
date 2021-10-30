package com.java.core.collection.arrays;

import java.util.Arrays;

public class ArraysSort {
    public static void main(String[] args) {
        Object num[]={40,10,15,7};
        System.out.println("Before sort");
//        for(int x:()num)
//            System.out.print(" "+x);
//        Arrays.sort(num);
//        System.out.println("\nAfter sort");
//        for(int x:num)
//            System.out.print(" "+x);

        Arrays.sort(num,(x1,x2)->{
            int a1=(int)x1;
            int a2=(int)x2;
          if(a1<a2)
              return 1;
          else if(a2>a1)
              return -1;
              else
                  return 0;
        });
    }
}
