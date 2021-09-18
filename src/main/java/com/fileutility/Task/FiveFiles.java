package com.fileutility.Task;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FiveFiles {
    public static void main(String[] args) throws IOException {
        File f ;
        FileWriter fileWriter;
        PrintWriter printWriter;
        for(int i=65;i<70;i++) {
            f = new File("resources/" , (char)i + ".txt");
            f.createNewFile();
            fileWriter=new FileWriter(f);
            printWriter=new PrintWriter(fileWriter);
            printWriter.println((char)i);
            printWriter.println(i);
            printWriter.flush();
            printWriter.close();

        }
    }
}
