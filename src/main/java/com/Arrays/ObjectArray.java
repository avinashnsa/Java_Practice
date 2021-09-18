package com.Arrays;

public class ObjectArray {
    public static void main(String[] args) {
        Object[] arr=new Object[5];
        arr[0]=123;
        arr[1]="Avinash";
        arr[2]=98.4;
        arr[3]="c";
        arr[4]=false;

        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }
}
