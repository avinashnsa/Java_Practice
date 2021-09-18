package com.assigments;

import java.util.Scanner;

public class Number100to1 {
    public static void main(String[] args) {
        System.out.println("Enter A Number to print in reverse order");
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        for (int i=1;i<=num;i++){
            System.out.println(num-i);
        }
    }
}
