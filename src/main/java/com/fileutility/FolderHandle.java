package com.fileutility;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FolderHandle {
    public static void main(String[] args) {

        //create folder under resource with folder name result
        String path="resources";
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("MMddyyyy");
        Date date=new Date();
        String Todaydate=simpleDateFormat.format(date);
        String reqfolder="Results";

        //String reqfolder2="Results/"+"Avi";
        File f=new File(path,reqfolder);

        //f=new File(path,reqfolder2);
        //System.out.println(simpleDateFormat.format(date));
        //f.mkdirs();

        //to delete folder
        //f.delete();
        // to check folder exists or not
        //System.out.println(f.exists());

        //to print directory list
        File[] arr=f.listFiles();
        //System.out.println(con);
        //To print only directories(folders)
        int counter=0;
        int counf=0;
        for(File con:arr) {
            if(con.isFile()){
                counter++;
                System.out.println(con);
            }else {
                System.out.println("Its file");
                System.out.println(con);
                counf++;
            }
        }
        System.out.println(counter);
        System.out.println(counf);


        //f.mkdir();

    }
}
