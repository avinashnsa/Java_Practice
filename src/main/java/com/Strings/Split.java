package com.Strings;

public class Split {
    public static void main(String[] args) {
        String str="india America";
        /*This method will break the string into words bassed on delimiter
        this method will return an array
        when there  is no delimiter ,split will not happen
         */
        String[] arr=str.split(" ");
        System.out.println(arr.length);
        // loop method to print
        for (int i=0;i< arr.length;i++){
            System.out.println(arr[i]);
        }
        //Method 2
        for (String c:arr){
            System.out.println(c);
        }
        // converting to character
        char[] arr1=str.toCharArray();
        System.out.println(arr1.length);
        for (char c1:arr1){
            System.out.println(c1);
        }

    }
}
