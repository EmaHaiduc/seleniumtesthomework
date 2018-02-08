package org.fasttrackit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.StringContains.containsString;

public class Cart {

    @Test
    public void  addProductToCart(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nelu\\Desktop\\drivere\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://fasttrackit.org/selenium-test/");
        driver.findElement(By.id("search")).sendKeys("pillow"+ Keys.ENTER);
        System.out.println("Pressed Enter in search field.");
        driver.findElement(By.xpath("//button[contains(@class, 'btn-cart') and ./ ancestor::* [a [@ title= 'Shay Printed Pillow']]]")).click();
        WebElement sucessMessageContainer =driver.findElement(By.cssSelector(".success-msg"));
        assertThat("Product not added to cart.",  sucessMessageContainer.getText(), containsString("PILLOW"));
        }



     @Test
     public void increaseProductQuantityFromCart(){
         System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nelu\\Desktop\\drivere\\chromedriver.exe");
         WebDriver driver= new ChromeDriver();
         driver.get("https://fasttrackit.org/selenium-test/");
         driver.findElement(By.id("search")).sendKeys("pillow"+ Keys.ENTER);
         driver.findElement(By.xpath("//button[contains(@class, 'btn-cart') and ./ ancestor::* [a [@ title= 'Shay Printed Pillow']]]")).click();
         driver.findElement(By.xpath("//td[@class='product-cart-actions']/input[@value='1']")).clear();
         driver.findElement(By.xpath("//input[@class='input-text qty']")).sendKeys("2"+ Keys.ENTER);
        }
    @Test
    public void deleteProductFromCart(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nelu\\Desktop\\drivere\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://fasttrackit.org/selenium-test/");
        driver.findElement(By.id("search")).sendKeys("pillow"+ Keys.ENTER);
        System.out.println("Pressed Enter in search field.");
        driver.findElement(By.xpath("//button[contains(@class, 'btn-cart') and ./ ancestor::* [a [@ title= 'Shay Printed Pillow']]]")).click();
        driver.findElement(By.xpath("//td[@class='a-center product-cart-remove last']//a[@title='Remove Item']")).click();
        WebElement successMessageContainer= driver.findElement(By.className("cart-empty"));
        assertThat("You have items in your shopping cart", successMessageContainer.getText(), containsString("EMPTY"));
    }
    }
