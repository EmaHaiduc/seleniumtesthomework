package org.fasttrackit;

import org.fasttrackit.WebViews.Cart;
import org.fasttrackit.WebViews.Header;
import org.fasttrackit.WebViews.ProductRelated;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.StringContains.containsString;

public class ProductRelatedTest extends TestBase {

    @Test
    public void sortByName (){

        Header header = PageFactory.initElements(driver, Header.class);
        header.getSearchField().sendKeys("vase" + Keys.ENTER);
        ProductRelated productDisplay=PageFactory.initElements(driver,ProductRelated.class);
        productDisplay.getSortByButton().click();
        productDisplay.getSortByNameOption().click();
        WebElement successMessageContainer= driver.findElement(By.xpath("//h2[@class='product-name']"));
        assertThat("No products to sort.", successMessageContainer.getText(),containsString("MODERN MURRAY CERAMIC VASE"));


    }
    @Test
    public void displayInPageAsList(){

        Header header = PageFactory.initElements(driver, Header.class);
        header.getSearchField().sendKeys("pillow" + Keys.ENTER);
        ProductRelated productDisplay=PageFactory.initElements(driver, ProductRelated.class);
        productDisplay.getDisplayAsListOption().click();

    }
    @Test
    public void viewDetails() {

        Header header = PageFactory.initElements(driver, Header.class);
        header.getSearchField().sendKeys("pillow" + Keys.ENTER);
        ProductRelated productDisplay= PageFactory.initElements(driver, ProductRelated.class);
        productDisplay.getViewDetailsButton().click();
        WebElement successmsg=driver.findElement(By.xpath("//div[@class='extra-info']"));
        assertThat("No details about this product.", successmsg.getText(), containsString("IN STOCK" ));


    }

    @Test
    public void productReview(){

        Header header= PageFactory.initElements(driver,Header.class);
        header.getSearchField().click();
        header.getTypeInSearchField().sendKeys("pillow"+Keys.ENTER);
        ProductRelated productRelated=PageFactory.initElements(driver,ProductRelated.class);
        productRelated.getViewDetailsButton().click();
        productRelated.getReviewButton().click();
        WebElement successMSG=driver.findElement(By.xpath("//p[@class='no-rating']"));
        assertThat("You already reviewed this product.", successMSG.getText(), containsString("Be the first to review this product"));
        productRelated.getFirstToRReviewBtn().click();
        productRelated.getFirstVlueReviewBtn().click();
        productRelated.getSecondValueReviewBtn().click();
        productRelated.getLastValueReviewBtn().click();
        productRelated.getFirstReviewField().sendKeys("great quality");
        productRelated.getSummaryReviewField().sendKeys("great product");
        productRelated.getNicknameField().sendKeys("user56");
        productRelated.getSubmitReviewBtn().click();
        WebElement successMessage=driver.findElement(By.xpath("//li[@class='success-msg']"));
        assertThat("Unable to review this product.", successMessage.getText(),containsString("Your review has been accepted for moderation."));

    }

    @Test
    public void productIsStillInCartAfterContinueShopping(){
        Header header=PageFactory.initElements(driver,Header.class);
        header.getSearchField().sendKeys("necklace"+Keys.ENTER);
        Cart cart = PageFactory.initElements(driver, Cart.class);
        cart.getAddtoCartBtn().click();
        WebElement successMessage=driver.findElement(By.xpath("//li[@class='success-msg']"));
        assertThat("Cart empty", successMessage.getText(),containsString("Silver Desert Necklace was added to your shopping cart."));
         ProductRelated productRelated=PageFactory.initElements(driver, ProductRelated.class);
         productRelated.getContinueShoppingBtn().click();
         WebElement successMSG=driver.findElement(By.xpath("//div[@class='header-minicart']"));
         assertThat("0 items in shopping cart.", successMSG.getText(),containsString("1"));

    }
}