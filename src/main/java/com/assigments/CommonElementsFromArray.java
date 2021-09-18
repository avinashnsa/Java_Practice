package com.assigments;

public class CommonElementsFromArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {4, 5, 6, 7, 8};
        int[] arr3 = {4,5,7, 8, 9, 10, 11};

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                for (int k=0;k< arr3.length;k++){
                    if (arr1[i] == arr2[j] && arr1[i]==arr3[k]) {
                        System.out.println(arr1[i]);
                    }
                }

            }
        }
    }
}