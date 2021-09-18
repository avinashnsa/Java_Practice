package com.Arrays;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={1,2,6,8,99,3,4,55,197};

        //finding index posiion of an value using array method
        //Before finding index position of an value we shoud sort the array
 //       Arrays.sort(arr);
 //       System.out.println(Arrays.binarySearch(arr,55));

        int user=99;
        int index=0;
        for (int i=0;i<arr.length;i++){
            if(arr[i]==user){
                index=i;
                break;
            }
        }
        System.out.println(index);
    }
}
