package com.java.core.multithreading.basic;

public
class SingleThreaded {
    public static void main(String[] args) {
        for(int j=0;j<200;j++)
        {
            System.out.print("J:"+j+"\t");
        }
        new SingleThreaded().printNumbers();
    }
    void printNumbers()
    {
        for(int i=0;i<200;i++)
        {
            System.out.print("I:"+i+"\t");
        }
    }

}
