package com.assigments;

import java.util.Scanner;

public class Even_OddNum {
    public static void main(String[] args) {
        System.out.println("Enter a Number");
        Scanner scanner=new Scanner(System.in);
        int num= scanner.nextInt();
        for(int i=1;i<=num;i++){
            if((i%2)==0){
                System.out.println(i+" "+"is Even Number");
            }else{
                System.out.println(i+" "+"is Odd Number");
            }
        }


    }
}
