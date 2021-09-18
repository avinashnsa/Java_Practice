package com.assigments;

public class CheckArr2isSubsetOfArr1 {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7, 8, 9};
        int[] arr2 = {1,7, 3};
        //int [] arr3=new int[2];
        int count=0;
        System.out.println("Common Elements in both lists are");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    //arr3[i]=arr3[i];
                    System.out.println(arr1[i]);
                    count++;

                }
            }
        }
        if (count==arr1.length || count==arr2.length){
            System.out.println("Arr2 is subset of arr1");
        }else {
            System.out.println("Arr2 is NOT subset of arr1");
        }

    }
}
