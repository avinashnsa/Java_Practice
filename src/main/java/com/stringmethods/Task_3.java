package com.stringmethods;

public class Task_3 {
    public static void main(String[] args) {
        String s="The journal number :1098";
        // print 1098
        //use substring only
        //try with split also

        //Using Split method
        String[] arr=s.split(":");
        System.out.println(arr[1]);

        //using substring method
        System.out.println(s.substring((s.indexOf(":"))+1));

    }
}
