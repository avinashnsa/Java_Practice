package com.assigments;

public class SwapVariabels {
    //swap using third variable
    public void Swap1() {
        int a = 1;
        int b = 2;
        int c = a;
        a = b;
        b = c;
        System.out.println("Swaped usinhg third variable ");
        System.out.println(a);
        System.out.println(b);
    }

    // Swap Without using third variable
    public void Swap2(){
        int a=5;
        int b=10;
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("Swaped without third variable");
        System.out.println(a);
        System.out.println(b);
        }

    public static void main(String[] args) {
        SwapVariabels swapVariabels=new SwapVariabels();
        swapVariabels.Swap1();
        swapVariabels.Swap2();
    }
}
