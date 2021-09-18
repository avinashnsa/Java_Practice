package com.testcases;

import com.genricmethods.WebLid;

public class TC01 {
    public static void main(String[] args) {
        WebLid weblib=new WebLid();
        weblib.lunchBrowser("chrome");
        weblib.verifyPage("Home");
        weblib.elementExits("register");
    }

}
