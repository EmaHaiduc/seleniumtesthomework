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
    public WebElement getSearchField() {
        return searchField;
    }
}
