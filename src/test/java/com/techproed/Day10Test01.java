package com.techproed;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day10Test01 {

    /* titleTest => Sayfa başlığının "Best" içerdiğini(contains) doğrulayın
        logoTest => BestBuy logosunun görüntülenip görüntülenmediğini doğrulayın
        mexicoLinkTest => Linkin görüntülenip görüntülenmediğini doğrulayın
    */

    static WebDriver driver; // instance variable
    @BeforeClass
    public static void setUp(){

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
    }
    @Before
    public void beforeMethod() {
        driver.get("http://bestbuy.com");

    }

    @After
    public void afterMethod() {
        driver.quit();
    }


    @Test
    public void titleTest() {
        String title = driver.getTitle();
        boolean bestKelimesiVarmi = title.contains("Best");
        Assert.assertTrue(bestKelimesiVarmi);

    }
    @Test
      public void logoTest(){
        WebElement logo = driver.findElement(By.className("logo"));
        boolean gorunuyorMu = logo.isDisplayed();
        Assert.assertTrue(gorunuyorMu);
    }
    @Test
    public void mexicoLinkTest(){
       WebElement mexicoLinki = driver.findElement(By.linkText("Mexico"));
       boolean linkVarmi = mexicoLinki.isDisplayed();
       Assert.assertTrue(linkVarmi);


    }
    @AfterClass
    public static void tearDown(){


    }

}


