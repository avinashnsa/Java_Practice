package com.constructor;

public class Const_Unders {
   public Const_Unders(int a){
       this(a,34,56);
        System.out.println(a);
    }

    public Const_Unders(int a,int b){
        System.out.println(a+b);
    }

    public Const_Unders(int a,int b,int c){
       this(12,45);
        System.out.println(a+b+c);;
    }


    public static void main(String[] args) {
        Const_Unders const_unders=new Const_Unders(10);

    }
}
