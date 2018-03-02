package org.fasttrackit;

import org.fasttrackit.WebViews.Checkout;
import org.fasttrackit.WebViews.Header;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.StringContains.containsString;

public class CartTest extends TestBase {

    @Test
    public void addProductToCart() throws InterruptedException {

        String keyword = "pillow";
        Header header = PageFactory.initElements(driver, Header.class);
        header.typeInSearchField("pillow");
        System.out.println("Pressed Enter in search field.");
        driver.findElement(By.xpath("//button[contains(@class, 'btn-cart') and ./ ancestor::* [a [@ title= 'Shay Printed Pillow']]]")).click();
        WebElement sucessMessageContainer = driver.findElement(By.cssSelector(".success-msg"));
        assertThat("Product not added to cart.", sucessMessageContainer.getText(), containsString("Shay Printed Pillow was added to your shopping cart."));
        driver.findElement(By.xpath("//ul[@class='checkout-types top']//button[@class='button btn-proceed-checkout btn-checkout']")).click();
        Checkout checkout = PageFactory.initElements(driver, Checkout.class);
        checkout.getCheckoutMethod().click();
        driver.findElement(By.xpath("//span[text()='Continue']")).click();
        checkout.getFirstName().sendKeys("Ema");
        checkout.getLastName().sendKeys("Haiduc");
        checkout.getEmail().sendKeys("haiema@yahoo.ro");
        checkout.getStreet().sendKeys("17th Avenue");
        checkout.getCity().sendKeys("Florida");
        checkout.getStateProvince().selectByVisibleText("Florida");
        checkout.getPostalCode().sendKeys("336HG");
        checkout.getCountry().selectByVisibleText("Statele Unite ale Americii");
        checkout.getPhoneNumber().sendKeys("4876493");
        checkout.getShipToSameAddress().click();
        checkout.getContinueButton().click();
        Thread.sleep(10000);
        checkout.getFreeShipping().click();
        WebElement successMesageContainer=driver.findElement(By.xpath("//h3[text()='Do you have any gift items in your order?']"));
        assertThat("No gift item.", successMesageContainer.getText(),containsString("DO YOU HAVE ANY GIFT ITEMS IN YOUR ORDER"));
        checkout.getContinueAfterShippingDetails().click();
        checkout.getContinueAfterShippingDetails().click();


    }


    @Test
    public void increaseProductQuantityFromCart() {
        String keyword;
        Header header = PageFactory.initElements(driver, Header.class);
        header.getSearchField().sendKeys("pillow" + Keys.ENTER);
        driver.findElement(By.xpath("//button[contains(@class, 'btn-cart') and ./ ancestor::* [a [@ title= 'Shay Printed Pillow']]]")).click();
        driver.findElement(By.xpath("//td[@class='product-cart-actions']/input[@value='1']")).clear();
        driver.findElement(By.xpath("//input[@class='input-text qty']")).sendKeys("2" + Keys.ENTER);
    }

    @Test
    public void deleteProductFromCart() {

        String keyword;
        Header header = PageFactory.initElements(driver, Header.class);
        header.getSearchField().sendKeys("pillow" + Keys.ENTER);
        System.out.println("Pressed Enter in search field.");
        driver.findElement(By.xpath("//button[contains(@class, 'btn-cart') and ./ ancestor::* [a [@ title= 'Shay Printed Pillow']]]")).click();
        driver.findElement(By.xpath("//td[@class='a-center product-cart-remove last']//a[@title='Remove Item']")).click();
        WebElement successMessageContainer = driver.findElement(By.className("cart-empty"));
        assertThat("You have items in your shopping cart", successMessageContainer.getText(), containsString("You have no items in your shopping cart." +
                "Click here to continue shopping."));
    }
}
