package com.stringmethods;

public class Task_5 {
    public static void main(String[] args) {
        String s="WelcomewelcomeWelcoMe";
        // count how many times welcome is repeated in the string
        int counter=0;
        String temp="";
       for (char c:s.toLowerCase().toCharArray()){
           //System.out.println(c);
           temp=temp+c;
           if(temp.equals("welcome")){
               counter++;
               temp="";
           }

       }
        System.out.println(counter);

    }

}
