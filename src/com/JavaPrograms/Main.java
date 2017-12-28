package com.JavaPrograms;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.io.File;
import java.io.IOException;
import java.time.temporal.Temporal;

import static org.openqa.selenium.OutputType.FILE;


public class Main {

public static WebDriver driver;

    public static void main(String[] args) throws IOException {


        System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //driver.get("http://www.google.com");

       // WebDriver driver = new ChromeDriver();
        //System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");

        driver.get("https://timeandexpense.teksystems.com/webtime/");
        driver.manage().window().maximize();


//String TagName=driver.findElement(By.id("lblUsername")).getTagName();
        // System.out.println(TagName);

        WebElement myelement = driver.findElement(By.name("txtUserName"));
        myelement.sendKeys("sampathK1119@gmail.com" + Keys.TAB);
        WebElement myelement1 = driver.findElement(By.name("txtPassword"));
        myelement1.sendKeys("samPU991@" + Keys.TAB);
        driver.findElement(By.id("lBtnLogin")).click();

        // List<WebElement> element = weekSelect.getOptions();
        //int isize = weekSelect.getOptions().size();

        //for (int i =0 ;i<isize;i++){
        //  System.out.println(element.get(i).getText());
        //}
        String[] weekSeldct = {"10/7/2017","10/14/2017","10/21/2017","10/28/2017"};

        for(int i= 0; i<weekSeldct.length;i++){
            Select weekSelect = new Select(driver.findElement(By.id("WeekEnding1")));
            weekSelect.selectByValue(weekSeldct[i]);
            By.xpath("//*[@id=\"repStandardTimecards_ctl00_StandardTime_PrintableVersionButton\"]").findElement(driver).click();
            getScreenShots(driver);
            driver.navigate().back();
        }

       // weekSelect.selectByValue("11/22/2014");
       // By.xpath("//*[@id=\"repStandardTimecards_ctl00_StandardTime_PrintableVersionButton\"]").findElement(driver).click();
       // getScreenShots(driver);
        System.out.println("Test succesfull");


    }

static int count =0;

    public static void getScreenShots( WebDriver driver) throws IOException {

        File srcfile = ((TakesScreenshot)driver).getScreenshotAs(FILE);
        File file = new File("C:\\Users\\Sampath.Jonnalagadda\\Desktop\\tekshhets\\Tektime"+count+".png");
        FileUtils.copyFile(srcfile,file);
count++;

    }

}
