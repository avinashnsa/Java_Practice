package com.accessspecifiers;

public class Child_Noinher {
    public static void main(String[] args) {
        System.out.println(Parent_Acc.a);
        Parent_Acc.b="Prote";
       // Parent_Acc.c=7;
        Parent_Acc.d="Def";
    }
}
