package com.java.core.exceptionhandling.unchecked;

public class MultiCatch {
    public static void main(String[] args) {
        try {
            String input = args[0];
            System.out.println("Input is: " + input);
            int output = Integer.parseInt(input);
            System.out.println("Output is: " + output);
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Input is required");
        }
        catch (NumberFormatException e)
        {
            System.out.println("Invalid input, input must be a number");
        }
        catch (Exception e)
        {
            System.out.println("Handing exception");
        }
        System.out.println("More code can go here");
    }
}
