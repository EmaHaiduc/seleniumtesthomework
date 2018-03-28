package org.fasttrackit.WebViews;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductDisplay {

    @FindBy(css = ".sort-by ")
    private WebElement sortByButton;


    @FindBy(xpath = "//select//option[normalize-space(text())='Name']")
    private WebElement sortByNameOption;


    @FindBy(xpath = "//a[@class='button' and ./ancestor::*[a[@title='Pillow and Throw Set']]]")
    private WebElement viewDetailsButton;


    @FindBy(className = "list")
    private WebElement displayAsListOption;



    public WebElement getSortByButton() {
        return sortByButton;
    }

    public WebElement getSortByNameOption() {
        return sortByNameOption;
    }

    public WebElement getDisplayAsListOption() {
        return displayAsListOption;
    }

    public WebElement getViewDetailsButton() {
        return viewDetailsButton;
    }
}
