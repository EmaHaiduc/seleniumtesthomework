package org.fasttrackit.WebViews;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.awt.event.KeyEvent;

public class Header {


    @FindBy(id = "search")

    private WebElement searchField;

    public void setSearchField(String keyword){
        searchField.sendKeys("pillow"+ Keys.ENTER);
    }


    @FindBy(xpath = "//span[text()='Cart']")
    private WebElement cart;


    public WebElement getSearchField() {
        return searchField;
    }
    public WebElement getCart() {
        return cart;
    }


}
