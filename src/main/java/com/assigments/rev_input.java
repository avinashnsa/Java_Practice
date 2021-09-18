package com.assigments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class rev_input {
    public static void main(String[] args) {

        List numbers = new ArrayList();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter some numbers.");

        while (scanner.hasNextInt()) {
            int i = scanner.nextInt();
            numbers.add(i);
        }
        Collections.rotate(numbers, 1);
        System.out.println("Rotated");
        System.out.println(numbers);
        //System.out.println(numbers.get(numbers.size()-1));
        //for(int i=0;i<= numbers.size()-2;i++){
        //    System.out.println(numbers.get(i));
       // }
    }
}

