package org.fasttrackit;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {

    protected WebDriver driver;
   @Before
   public void setUp(){

       System.setProperty("webdriver.chrome.driver", AppConfig.getChromeDriverPath());
       driver= new ChromeDriver();

       driver.get(AppConfig.getSiteUrl());
   }


}
