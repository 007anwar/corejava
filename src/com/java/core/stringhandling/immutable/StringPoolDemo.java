package com.java.core.stringhandling.immutable;

public class StringPoolDemo {
    public static void main(String[] args) {
        User user1 = new User("1", "abc");
        User user2 = new User("1", "abc");
        System.out.println(user1);
        System.out.println(user2);
        String s1="abcs";
        String s2="abc";
        String s3="abc";
//        System.out.println(s1+":"+s1.hashCode());
//        System.out.println(s2+":"+s2.hashCode());
//        System.out.println(s3+":"+s3.hashCode());
//
//        System.out.println(s1==s2);
//        System.out.println(s1.equals(s3));
        System.out.println(user1==user2);
        System.out.println(user1.equals(user2));
    }
}
