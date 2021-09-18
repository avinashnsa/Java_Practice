package com.Strings;

public class CharacterWithIsUpper {
    public static void main(String[] args) {
        String s="ABCabc";
        for(char c:s.toCharArray()){
            if(Character.isUpperCase(c)){
                System.out.println(c);
            }
        }
    }
}
