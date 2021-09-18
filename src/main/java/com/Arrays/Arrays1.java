package com.Arrays;

public class Arrays1 {
    public static int a=8;
    public static int [] abc={1,2,3};
    public static void main(String[] args) {
        String [] empNames=new String[5];
        empNames[0]="First";
        empNames[1]="Second";
        empNames[2]="Third";
        empNames[3]="Four";
        empNames[4]="Five";
        //empNames[2]="3";
//        System.out.println(empNames[2]);
//        for (String emp:empNames){
//            System.out.println(emp);

        //Using for loop to get all names
        for (int i=0;i<=empNames.length-1;i++){
            System.out.println(i);
            System.out.println(empNames[i]);
        }
        Arrays1 arrays1=new Arrays1();
        arrays1.conNames(empNames);

        }
        String Con1;
        void conNames(String[] temp){
        for (String s:temp){
            Con1=Con1+s;
        }
            System.out.println(Con1);

        }

    }
