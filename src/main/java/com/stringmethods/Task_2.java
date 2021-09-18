package com.stringmethods;

public class Task_2 {
    public String str="veeru";
    public static String str1="Avinash";
    public static void main(String[] args) {
        // print the sum of all the numbers
        String s="AB65BC75DE180";
        //65+75+180
        s=s.replaceAll("[^0-9]","@");
        System.out.println(s);
        String[] arr=s.split("@");
        int sum =0;
        for (String num:arr){
            if((num.length()>0)){
                sum=sum+Integer.valueOf(num);
            }
        }
        System.out.println(sum);
    }
}
