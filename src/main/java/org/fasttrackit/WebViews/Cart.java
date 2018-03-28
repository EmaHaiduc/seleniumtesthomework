package org.fasttrackit.WebViews;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Cart {
    @FindBy(xpath = "//button[contains(@class, 'btn-cart') and ./ ancestor::* [a [@ title= 'Shay Printed Pillow']]]")
    private WebElement addToCartButton;

    @FindBy(xpath = "//td[@class='product-cart-actions']/input[@value='1']")
    private WebElement inputvaluefield;
    @FindBy(xpath = "//input[@class='input-text qty']")
    private WebElement insertquantity;


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

    public WebElement getAddToCartButton() {
        return addToCartButton;
    }

    public WebElement getInputvaluefield() {
        return inputvaluefield;
    }

    public WebElement getInsertquantity() {
        return insertquantity;
    }

    public WebElement getAddtoCartBtn() {
        return addtoCartBtn;
    }

}
