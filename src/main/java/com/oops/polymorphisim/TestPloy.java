package com.oops.polymorphisim;

public class TestPloy {
    public void getData(){
        System.out.println("Getting data from excell workbook");
    }
    protected void getData(String testcase){
        System.out.println("Getting data from excell workbook by using test case name"+testcase);
    }
    public String getData(String testcase,String filetype){
        System.out.println("Getting data from an"+filetype+"by using test case name"+testcase);
        return "";
    }
}
