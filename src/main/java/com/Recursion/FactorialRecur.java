package com.Recursion;

public class FactorialRecur {
    public int factorial(int n){
      return   n*factorial(n-1);
    }

    public static void main(String[] args) {
        FactorialRecur f=new FactorialRecur();
        System.out.println(f.factorial(4));
    }
}
