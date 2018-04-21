package org.fasttrackit.WebViews;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.awt.event.KeyEvent;

public class Header {


    @FindBy(id = "search")
    private WebElement searchField;


    @FindBy( xpath = "//input[@class='input-text required-entry']")
     private WebElement typeInSearchField;


    @FindBy(xpath = "//span[text()='Cart']")
    private WebElement cart;


    public WebElement getSearchField() {
        return searchField;
    }

    public WebElement getCart() {
        return cart;
    }

    public WebElement getTypeInSearchField() {
        return typeInSearchField;
    }
}
