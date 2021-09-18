package com.loopingstatements;

public class Recursion {
    public void printNumber(int i,int num){
        if (i<=num){
            System.out.println(i);
            i++;
            printNumber(i,num);
        }
    }
    public static void main(String[] args) {
        Recursion recursion=new Recursion();
        recursion.printNumber(1,50);

    }
}
