package com.collections;

import java.util.ArrayList;
import java.util.List;

public class ListImpl {
    public static void main(String[] args) {
        List list=new ArrayList<>();//generic type, we can add any type of data.

        list.add("India");
        list.add("China");
        list.add("America");

        List mylist=new ArrayList<>();

        //iterate to add elements
        for (int i=0;i<=50;i++){
            mylist.add(i);
        }
        //for each loop to print all elements
        for(Object i:mylist){
            //System.out.println(i);
        }

        for(int a=0;a<mylist.size();a++){
            System.out.println(mylist.get(a));
        }

        System.out.println(mylist.size());
        System.out.println(list.get(1));
        System.out.println(list.size());
        System.out.println(mylist.contains(50));

    }

}
