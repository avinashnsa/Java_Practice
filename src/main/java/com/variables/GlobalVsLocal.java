package com.variables;

public class GlobalVsLocal {
    static int a=2;
    static int b=3;
    public static void add(int a,int b){
        System.out.println(a+b);
        // this cannot be used in static block
        //System.out.println(this.a+this.b);
    }
    public void multi(int a,int b){
        System.out.println(a*b);
        System.out.println(this.a*this.b);
    }

    public static void main(String[] args) {
        int a=8;
        GlobalVsLocal globalVsLocal=new GlobalVsLocal();
        globalVsLocal.multi(5,5);//since it is in instance block
        add(4,6);
        add(a,b);
        System.out.println(a);
    }
}
