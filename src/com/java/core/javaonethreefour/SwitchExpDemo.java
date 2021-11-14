package com.java.core.javaonethreefour;

public class SwitchExpDemo {
    public static void main(String[] args) {
        int key = 1;
        String result = switch (key) {
            case 1:
                yield "Case 1";
            default:
                yield "Default case";
        };
        System.out.println(result);


        String response = switch (key){
            case 1->{yield "ntt";}
                case 2->{yield "nihilent";}

//        }

            default -> throw new IllegalStateException("Unexpected value: " + key);
        };
        System.out.printf(response);
}}
