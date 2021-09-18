package com.Strings;

public class AsciiConversion {
    public static void main(String[] args) {
        String s="ABC123";
        // to print ascii value
        System.out.println((int)'0');
        for (char c:s.toCharArray()){
            if(((int)c>=(int)'0') && ((int)c<=(int)'9')){
                System.out.println(c);
            }
        }
    }
}
