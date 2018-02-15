package org.fasttrackit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SortProduct {

    @Test
    public void sortByName (){
        System.setProperty("webdriver.chrome.driver", AppConfig.getChromeDriverPath());
        WebDriver driver= new ChromeDriver();
        driver.get(AppConfig.getSiteUrl());
        driver.findElement(By.id("search")).sendKeys("pillow"+ Keys.ENTER);
        driver.findElement(By.xpath("//select[@title='Sort By']")).click();
        driver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div[2]/div[2]/div/div[2]/div[2]/div[3]/div[1]/div[1]/div/select/option[2]")).click();

    }
    @Test
    public void displayInPageAsList(){
        System.setProperty("webdriver.chrome.driver", AppConfig.getChromeDriverPath());
        WebDriver driver= new ChromeDriver();
        driver.get(AppConfig.getSiteUrl());
        driver.findElement(By.id("search")).sendKeys("pillow"+ Keys.ENTER);
        driver.findElement(By.className("list")).click();

    }
}