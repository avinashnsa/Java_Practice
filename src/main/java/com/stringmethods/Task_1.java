package com.stringmethods;

import com.Strings.CharacterIsDigit;

public class Task_1 {
    public static void PrintPattern(char c,int num){
        for(int i=1;i<=num;i++){
            System.out.print(c);
        }
    }

    public static void main(String[] args) {
        String s="abc2za3b4";
        /*
        output this abcczaaabbbb
         */
        for (int i=0;i<s.length();i++){
            if(!Character.isDigit(s.charAt(i))){
                if(Character.isLetter(s.charAt(i)) && Character.isDigit(s.charAt(i+1))){
                    PrintPattern(s.charAt(i),Integer.parseInt(String.valueOf(s.charAt(i+1))));

                }else{
                    System.out.println(s.charAt(i));
                }

            }

        }
    }
}
