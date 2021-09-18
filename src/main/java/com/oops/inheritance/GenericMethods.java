package com.oops.inheritance;

public class GenericMethods extends ReadExceldata {
    public void lunchBrowser(){
        System.out.println("Lunch the application");
    }
    public void verifyPageElement(String pageName){
        System.out.println("verify that the page"+pageName+"is displayed");
    }
    public void ClickElement (String element,String pageName){
        System.out.println("Clicking on the element"+element+"on the page"+pageName);
    }
    public void sendData(String element,String data){
        System.out.println("Sending data to the element"+element+"on the page"+data);
    }
}
