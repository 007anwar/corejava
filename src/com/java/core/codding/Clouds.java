package com.java.core.codding;

public class Clouds {

    public static long repeatedString(String s, long n) {
        // Write your code here
        int numberOfaInString=0;
        int numberOfaInEndString=0;
        long result=0;
        //calculate length of input string
        int inputLenght=s.length();
        //form string of length n from input
        long numberOfTimeStringCanBeRepeated=n/inputLenght;
        long remainingChar=n%inputLenght;

        for (int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='a')
                numberOfaInString+=1;
        }
        for (int i=0;i<remainingChar;i++)
        {
            if(s.charAt(i)=='a')
                numberOfaInEndString+=1;
        }
        result=numberOfaInString*numberOfTimeStringCanBeRepeated;
        result=result+numberOfaInEndString;

return result;

    }

    public static void main(String[] args) {
        long abcac = repeatedString("aba", 10);
        System.out.println(abcac);
    }
}
