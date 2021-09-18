package com.test;

public class Test {
    public static void main(String[] args) {
        String s="i am running java";
        String[] arr=s.split(" ");

        for (int i=1;i>=arr.length;i++){
            //StringBuffer buffer=new StringBuffer(arr[i]);
            //buffer.reverse();
            //System.out.println(buffer);
            System.out.println(arr[(arr.length-i)]);

        }
    }
}
