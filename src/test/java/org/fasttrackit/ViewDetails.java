package org.fasttrackit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ViewDetails {

    @Test
    public void viewDetails() {
        System.setProperty("webdriver.chrome.driver", AppConfig.getChromeDriverPath());
        WebDriver driver = new ChromeDriver();
        driver.get(AppConfig.getSiteUrl());
        driver.findElement(By.id("search")).sendKeys("pillow" + Keys.ENTER);
        driver.findElement(By.xpath("//a[@class='button' and ./ancestor::*[a[@title='Pillow and Throw Set']]]")).click();
    }
}
