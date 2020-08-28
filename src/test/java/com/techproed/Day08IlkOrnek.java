package com.techproed;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day08IlkOrnek {

    //Diger tum methodlardan erisebilmek icin buraya classin icine ekledik.
    static WebDriver driver;

    @BeforeClass
    public static void setUp(){

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(50000, TimeUnit.MILLISECONDS);


    }

    @Test
    public void test1(){
        driver.get("https://www.google.com");

        try{
            Thread.sleep(5000);

        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }

    @AfterClass
    public static void tearDown(){
        driver.quit();


    }




}
