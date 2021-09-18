package com.Strings;

public class ToCharArray {
    public static void main(String[] args) {
        String str="india";
        char[] arr=str.toCharArray();
        /*
        here the string data is converted to character array
         */
        for(char c:arr){
            System.out.println(c);
        }
    }
}
