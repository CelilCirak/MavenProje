package com.techproed;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.*;
import java.util.concurrent.TimeUnit;

public class Day09Assertion {

    private static WebDriver driver;


    @BeforeClass
    public static void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);

    }

    @Test
    public void test1(){
        driver.get("http://google.com");
        String title = driver.getTitle();

      //  Assert.assertTrue(false);
        Assert.assertEquals("Google Arama Sayfasi", title);


        }

        @Test
        public void  test2(){
            driver.get("http://amazon.com");
            String title = driver.getTitle();
           // Assert.assertEquals("Amazon", title);


            boolean varmi = title.contains("Amazon");

            //Parantezin ici true ise test basarili demektir.
            Assert.assertTrue(varmi);

        }

        @Test
        public void test3(){
            driver.get("http://facebook.com");
            String title = driver.getTitle();

            boolean varmi = title.contains(("Youtube"));

            // False oldugunu bekliyoruz, dolayisi ile dogrulama bekliyoruz.
            //Parantezin ici false ise test basarili demektir.
            Assert.assertFalse(varmi);

        }
        @Test
        public void test4(){

            driver.get("http://google.com");
            String title = driver.getTitle();

            System.out.println("Merhabalar");

            //  Assert.assertTrue(false);
            Assert.assertEquals("Google", title);

            //Eger test basarili ise burayi yazdirir. Basarisiz olursa yazdirmaz.
            System.out.println("Test Basarili");

        }


    @AfterClass
    public static void tearDown(){
        // driver.quit();
    }
}
