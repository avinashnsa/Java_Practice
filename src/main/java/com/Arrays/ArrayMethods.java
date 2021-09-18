package com.Arrays;

import java.util.Arrays;

public class ArrayMethods {
    public static void main(String[] args) {
        int[] arr={1,2,6,8,99,3,4,55,7,197};
        System.out.println(arr[0]);
        arr[9]=300;
        System.out.println("Length "+arr.length);

        //to print all the elements in an array
//        for(int data:arr1){
//            System.out.println(data);
//        }

        //to print max value from an array using loop
/*        int max=arr[0];
        for (int i=0;i<arr.length;i++){
            if (arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);*/

        //to print max value from an arrays method
        //Sorting an array
        Arrays.sort(arr);
        System.out.println(arr[arr.length-1]);

    }

}
