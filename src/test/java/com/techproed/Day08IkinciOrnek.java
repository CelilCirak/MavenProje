package com.techproed;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day08IkinciOrnek {

    //Diger tum methodlardan erisebilmek icin buraya classin icine ekledik.
    static WebDriver driver;

    @BeforeClass // Class calimaya baslayinca calisacak.
    public static void setUp(){

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
     //   driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(50000, TimeUnit.MILLISECONDS);


    }
    @AfterClass // Class calismayi bitirince calisacak.
    public static void tearDown(){
        driver.quit();

    }

    @Before //Her test methodundan once calisir.
    public void testOncesi(){
        driver.get("https://www.google.com");
    }

    @After //Her test methodundan sonra calisir.
    public void testSonrasi(){
        WebElement sonucSayisi = driver.findElement(By.id("result-stats"));
        System.out.println(sonucSayisi.getText());


    }

    @Test
    public void test1(){
        WebElement aramaKutusu = driver.findElement(By.name("q"));
        aramaKutusu.sendKeys("elma");
        aramaKutusu.submit();

        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
    @Test
    public void test2(){
        WebElement aramaKutusu = driver.findElement(By.name("q"));
        aramaKutusu.sendKeys("kulaklik");
        aramaKutusu.submit();

        try {
            Thread.sleep(8000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void test3(){
        WebElement aramaKutusu = driver.findElement(By.name("q"));
        aramaKutusu.sendKeys("sandalye");
        aramaKutusu.submit();

        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
