package com.collections;

import java.util.HashMap;
import java.util.Map;

public class GenricEx {
    //Print the occurance of each character
    public static void main(String[] args) {
        String s="asdasjfsdjcmnmfeda";
        char[] arr=s.toCharArray();
        Map<Character, Integer> allChar=new HashMap<>();
        //iterating char array
        for(char c:arr){
            if(!allChar.containsKey(c)){
                allChar.put(c,1);
            }else{
                allChar.put(c,allChar.get(c)+1);
            }
        }
        System.out.println(allChar);



    }
}
