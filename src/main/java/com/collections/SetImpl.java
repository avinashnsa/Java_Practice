package com.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetImpl {
    public static void main(String[] args) {
        Set<String> allEleements=new HashSet<>();

        allEleements.add("Avinash");
        allEleements.add("veeru");
        allEleements.add("Aashritha");
        allEleements.add("Avinash");
        allEleements.add("veeru");

        System.out.println(allEleements.size());

        Iterator iterator=allEleements.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
