package com.techproed;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Day07IlkDers {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(50000, TimeUnit.MILLISECONDS);
        driver.get("https://www.amazon.com");
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("samsung headphones" + Keys.ENTER);

        WebElement urunSayisi = driver.findElement(By.xpath("//span[@dir='auto']"));
        System.out.println(urunSayisi.getText());

        List<WebElement> ilkUrun = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));

         //ilkUrun.get(5).getText();  5. urunu getirir.
        for(WebElement w : ilkUrun) {
            System.out.println(w.getText());

        }

    }
}

