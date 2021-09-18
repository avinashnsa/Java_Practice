package com.fileutility;

import java.io.*;

public class ReadData {
    public static void main(String[] args) throws IOException {
        File f=new File("resources/testdata","abc.txt");
        FileReader fileReader=new FileReader(f);
        BufferedReader bufferedReader=new BufferedReader(fileReader);
        String Data=bufferedReader.readLine();
        while(!(Data==null)){
            System.out.println(Data);
            Data=bufferedReader.readLine();
        }
    }
}

