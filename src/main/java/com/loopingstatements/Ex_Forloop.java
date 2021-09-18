package com.loopingstatements;

import java.util.Scanner;

public class Ex_Forloop {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner scanner=new Scanner(System.in);
        int num= scanner.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(num+" "+" * "+" "+i+" = "+(num*i));
        }
    }
}
