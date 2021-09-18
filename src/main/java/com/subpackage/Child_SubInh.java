package com.subpackage;

import com.accessspecifiers.Parent_Acc;

public class Child_SubInh extends Parent_Acc {
    public static void main(String[] args) {
        System.out.println(Parent_Acc.a);
        System.out.println(Parent_Acc.b);
       // Parent_Acc.c=25;
       // Parent_Acc.d=25;
    }
}
