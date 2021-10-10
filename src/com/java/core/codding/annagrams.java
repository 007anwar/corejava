package com.java.core.codding;

import java.util.Arrays;
import java.util.Scanner;

public class annagrams {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter word 1");
        String word1=scanner.nextLine();
        System.out.println("Enter word 2");
        String word2=scanner.nextLine();
        if(word1.length()==word2.length())
        {
            char[] word1array = word1.toCharArray();
            Arrays.sort(word1array);
            char[] word2array = word2.toCharArray();
            Arrays.sort(word2array);
           if(Arrays.equals(word1array,word2array))
               System.out.println("Words are anagrams");
           else
               System.out.println("Words are not anagrams" );
       }
        else
        {
            System.out.println("words are not annagrams" );
        }

    }
}
