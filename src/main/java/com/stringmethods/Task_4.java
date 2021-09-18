package com.stringmethods;

public class Task_4 {
    public static void main(String[] args) {
        String s="the voucher number (9087)";
        /*
        dont use loop statement or character.isdidgit
        HINT use indexof method
         */
        //using indexof method
        System.out.println(s.substring((s.indexOf("(")+1),s.indexOf(")")));

    }
}
