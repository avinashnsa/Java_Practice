package com.Methods;

public class Lib {
    public void add(){
        int a=10 ,b=20,result=a+b;
        System.out.println(result);
    }
    // static methot
    public static void sub(int a,int b){
        System.out.println("Static block"+" "+(a-b));
    }
    // user addition instance method
    public int uadd(int a,int b){
        return a+b;
    }

    //user passed two multiplication instance method
    public void multi(int a,int b){
        System.out.println(a*b);
    }
    //main method
    public static void main(String[] args) {
        Lib lib=new Lib();
        lib.add();
        int result=lib.uadd(2,3);
        System.out.println("Instance block"+"  "+result);
        lib.multi(5,5);
        sub(20,10);
    }
}
