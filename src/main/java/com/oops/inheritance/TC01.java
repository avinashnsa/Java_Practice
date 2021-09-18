package com.oops.inheritance;

public class TC01 extends GenericMethods {
    public void validateTC01(){
        lunchBrowser();
        verifyPageElement("Home Page");
        ClickElement("Sigin","Home Page");
        verifyPageElement("Login");
        String username=getData("TC01");
        sendData("Username",username);
        String password=getData("TC01");
        sendData("password",password);
        ClickElement("Login","login Page");
        verifyPageElement("XYZ");
    }

    public static void main(String[] args){
        TC01 tc01=new TC01();
        tc01.validateTC01();
    }

}
