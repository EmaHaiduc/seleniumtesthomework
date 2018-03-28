package org.fasttrackit;

import org.fasttrackit.WebViews.Header;
import org.fasttrackit.WebViews.ProductDisplay;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;

public class ProductDisplayTest extends TestBase {

    @Test
    public void sortByName (){

        String keyword;
        Header header = PageFactory.initElements(driver, Header.class);
        header.getSearchField().sendKeys("vase" + Keys.ENTER);
        ProductDisplay productDisplay=PageFactory.initElements(driver,ProductDisplay.class);
        productDisplay.getSortByButton().click();
        productDisplay.getSortByNameOption().click();


    }
    @Test
    public void displayInPageAsList(){

        String keyword;
        Header header = PageFactory.initElements(driver, Header.class);
        header.getSearchField().sendKeys("pillow" + Keys.ENTER);
        ProductDisplay productDisplay=PageFactory.initElements(driver, ProductDisplay.class);
        productDisplay.getDisplayAsListOption().click();

    }
    @Test
    public void viewDetails() {

        String keyword;
        Header header = PageFactory.initElements(driver, Header.class);
        header.getSearchField().sendKeys("pillow" + Keys.ENTER);
        ProductDisplay productDisplay= PageFactory.initElements(driver, ProductDisplay.class);
        productDisplay.getViewDetailsButton().click();
    }
}