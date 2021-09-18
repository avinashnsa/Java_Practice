package com.fileutility;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class test {
    public static void main(String[] args) throws IOException {
        String path="resources";
        String nam="hel.txt";
        File f=new File(path, nam);

        FileWriter fileWriter=new FileWriter(f);
        f.mkdir();
    }
}
