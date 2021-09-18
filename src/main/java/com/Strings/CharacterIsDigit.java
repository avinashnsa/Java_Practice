package com.Strings;

public class CharacterIsDigit {
    public static void main(String[] args) {
        String s="ABC123";
        int sum=0;
        //char[] arr=s.toCharArray();
        for (char c:s.toCharArray()){
            if(Character.isDigit((c))){
                System.out.println(c);
                sum=sum+Integer.parseInt(String.valueOf(c));

            }
        }System.out.println(sum);
    }
}
