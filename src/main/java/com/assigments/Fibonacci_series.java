package com.assigments;

import java.util.Scanner;

public class Fibonacci_series {
    public static void main(String[] args) {
        int a=0;
        int b=1;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter A Number");
        int num= scanner.nextInt();
        for(int i=1;i<=num;i++){
            int c=a+b;
            System.out.println(c);
            a=b;
            b=c;

        }
    }
}
