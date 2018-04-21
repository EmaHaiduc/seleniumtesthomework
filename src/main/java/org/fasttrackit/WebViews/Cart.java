package org.fasttrackit.WebViews;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Cart {
    public  WebElement getaddToCartBut(String productName, WebDriver driver){
        return driver.findElement(By.xpath("//button[contains(@class, 'btn-cart') and ./ ancestor::* [a [@ title= 'Shay Printed Pillow']]]"));

    }

    @FindBy(xpath = "//input[@class='input-text qty']")
    private WebElement valuefield;



    @FindBy(xpath = "//button[contains(@class, 'btn-cart') and ./ ancestor::*[a[@title='Silver Desert Necklace']]]")
    private WebElement addtoCartBtn;


    @FindBy(xpath = "//button[contains(@class, 'btn-cart') and ./ ancestor::* [a [@ title= 'Shay Printed Pillow']]]")
    private WebElement AddToCartBtn;


    @FindBy(xpath = "//td[@class='a-center product-cart-remove last']//a[@title='Remove Item']")
    private WebElement removeFromCart;


    public WebElement getAddToCartBtn() {
        return AddToCartBtn;
    }

    public WebElement getRemoveFromCart() {
        return removeFromCart;
    }


    public WebElement getvaluefield() {
        return valuefield;
    }


    public WebElement getAddtoCartBtn() {
        return addtoCartBtn;
    }

}

