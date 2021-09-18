package com.Strings;

public class MemoryManagement {
    public static void main(String[] args) {
        String s1="india";
        String s2="india";
        System.out.println(s1==s2);

        String s3=new String("india");
        System.out.println(s1==s3);
    }
}
