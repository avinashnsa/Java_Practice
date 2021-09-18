package com.conditionalstatments;

public class ElseIf {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        if(a>b){
            System.out.println("a is greater than b");
        }else if(a>5 && a<9){
            System.out.println("a is greater than b, but it ranges between of 5 and 9");
        }else{
            System.out.println("a is smaller also not in range of 5 and 9");
        }
    }
}
