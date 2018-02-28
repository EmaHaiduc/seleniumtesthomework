package org.fasttrackit;

import org.fasttrackit.WebViews.Header;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class ProductDisplay extends TestBase {

    @Test
    public void sortByName (){

        String keyword;
        Header header = PageFactory.initElements(driver, Header.class);
        header.getSearchField().sendKeys("pillow" + Keys.ENTER);
        driver.findElement(By.xpath("//select[@title='Sort By']")).click();
        driver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div[2]/div[2]/div/div[2]/div[2]/div[3]/div[1]/div[1]/div/select/option[2]")).click();

    }
    @Test
    public void displayInPageAsList(){

        String keyword;
        Header header = PageFactory.initElements(driver, Header.class);
        header.getSearchField().sendKeys("pillow" + Keys.ENTER);
        driver.findElement(By.className("list")).click();

    }
    @Test
    public void viewDetails() {

        String keyword;
        Header header = PageFactory.initElements(driver, Header.class);
        header.getSearchField().sendKeys("pillow" + Keys.ENTER);
        driver.findElement(By.xpath("//a[@class='button' and ./ancestor::*[a[@title='Pillow and Throw Set']]]")).click();
    }
}