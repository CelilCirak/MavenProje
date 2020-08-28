package com.techproed;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day08BeforeAfterClass {

    @BeforeClass //Bu annotationa sahip method, her class calismadan once sadece 1 kere calisir.
    public  static void  setUp(){
        System.out.println("SetUp");
    }
    @Test
    public void test1() {

        System.out.println("Test 1");
//        WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(50000, TimeUnit.MILLISECONDS);
//        driver.get("https://www.google.com");


    }
    @Test
    public void test3(){
        System.out.println("Test3");
    }

    @AfterClass
    public static void tearDown(){
        System.out.println("TearDown");



    }
}