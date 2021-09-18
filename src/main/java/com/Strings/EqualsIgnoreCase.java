package com.Strings;

public class EqualsIgnoreCase {
    public static void main(String[] args) {
        String str1="india";
        String str2="INDIA";
        // compare two strngs
        System.out.println(str1.equals(str2));
        // using ignorecase
        System.out.println(str1.equalsIgnoreCase(str2));
    }
}
