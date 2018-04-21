package org.fasttrackit.WebViews;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ClickOnCategory {
    @FindBy(xpath = "//li[@class='level0 nav-1 first parent']")
    private WebElement womenCategory;


    @FindBy(xpath = "//li[@class='level0 nav-3 parent']")
    private WebElement accesoriesCategory;






    public WebElement getWomenCategory() {
        return womenCategory;
    }
    public WebElement getAccesoriesCategory() {
        return accesoriesCategory;
    }
}
