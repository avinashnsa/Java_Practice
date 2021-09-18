package com.exceptionhandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedException {
    public static void main(String[] args) {
       // String[] sh=new String[3];
       // sh[6]="hello";

        try {
            //File f = new File("abc.txt");
            //FileReader fileReader = new FileReader(f);
            String[] s=new String[3];
            s[6]="hello";
        }catch (Exception e){
            System.out.println(e.getMessage());
            System.out.println("i am free bird");
        }
    }
}
