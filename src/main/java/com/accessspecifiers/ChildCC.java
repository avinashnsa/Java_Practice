package com.accessspecifiers;

public class ChildCC extends Parent_Acc{
    public static void main(String[] args) {
        System.out.println(Parent_Acc.a);
        Parent_Acc.b="Childcc Private";
      //  Parent_Acc.c=6;
        Parent_Acc.d="Childcc Default";
    }
}
