package com.fileutility;

import java.io.*;

public class FileHandle {
    public static void main(String[] args) throws IOException {
        //Create a new file
        File f=new File("resources/testdata","abc.txt");

        FileWriter fileWriter=new FileWriter(f);
//        write data on to the physical file(issues no new line ,no numerics)
//        fileWriter.write("Hello");
//        fileWriter.write("india \\n");
//        fileWriter.write(65);
//        fileWriter.flush();

//        BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
//        bufferedWriter.write("hello");
//        bufferedWriter.newLine();
//        bufferedWriter.write(65);
//        bufferedWriter.flush();
//        bufferedWriter.close();

        PrintWriter printWriter=new PrintWriter(fileWriter);

        printWriter.println("INDIA");
        printWriter.println("Nearly 1.33 crore people registered on the Co-Win platform for the next phase of the nationwide coronavirus vaccination drive, which will cover all adults between the ages of 18 and 45. However, with several states flagging an acute shortage of vaccines, the government is faced with a daunting task. Huge pressure is expected since many young men and women will seek vaccination and want to get back to work at the earliest.");
        printWriter.println(65);
        printWriter.flush();
        printWriter.close();

        fileWriter.close();



    }
}
