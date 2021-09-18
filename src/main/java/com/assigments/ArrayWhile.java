package com.assigments;

import com.Arrays.Arrays1;

public class ArrayWhile {
    public static void main(String[] args) {
        String [] ver={"ab","bc","cd"};
        Object [] avi={"in",2,0.4};
        String [] Students=new String[5];
        Students[0]="Student 1";
        Students[1]="Student 2";
        Students[2]="Student 3";
        Students[3]="Student 4";
        Students[4]="Student 5";
 //       System.out.println(Arrays1.abc);
//        System.out.println(avi[avi.length-2]);
        int i=0;
       while (i<Students.length){
           System.out.println(Students[i]);
           i++;
       }
        System.out.println(i);
    }

}
