package com.JavaPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendEmail {

    public WebDriver driver;
    static String baseUrl;

    public void login(){

        driver = new ChromeDriver();
        baseUrl = "https://www.google.com/gmail/about/#";
        driver.get(baseUrl);
        driver.manage().window().maximize();


    }

    public static void

}
