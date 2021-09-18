package com.collections;

import java.util.HashMap;
import java.util.Map;

public class GenricExCharPrac {
    public static void main(String[] args) {
        String s="asdasjfsdjcmnmfeda";

        char[] arr=s.toCharArray();

        Map<Character,Integer> allchar=new HashMap<>();

        for(char c:arr){
            if(!allchar.containsKey(c)){
                allchar.put(c,1);

            }else {
                allchar.put(c,allchar.get(c)+1);
            }
        }
        System.out.println(allchar);


    }
}
