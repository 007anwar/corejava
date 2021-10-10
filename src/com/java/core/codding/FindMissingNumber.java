package com.java.core.codding;

public class FindMissingNumber {
    public static void main(String[] args) {
        int[] array={4,3,8,7,5,2,1};
        System.out.println("Missing number in array is: "+findMissingNumber(array));
    }
    private static int findMissingNumber(int[] arr)
    {
        int sumOfNumbersInArray=0;
        int totoalElementsSum=0;
        int arrLength=arr.length+1;
        for(int i=1;i<=arrLength;i++)
            totoalElementsSum=totoalElementsSum+i;

        for(int num:arr)
        {
            sumOfNumbersInArray=sumOfNumbersInArray+num;
        }

        return totoalElementsSum-sumOfNumbersInArray;

    }
}
