package org.fasttrackit;

import org.fasttrackit.WebViews.Checkout;
import org.fasttrackit.WebViews.Header;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.StringContains.containsString;

public class Cart extends TestBase {

    @Test
    public void addProductToCart() throws InterruptedException {

        String keyword = "pillow";
        Header header = PageFactory.initElements(driver, Header.class);
        header.setSearchField("pillow");
        System.out.println("Pressed Enter in search field.");
        driver.findElement(By.xpath("//button[contains(@class, 'btn-cart') and ./ ancestor::* [a [@ title= 'Shay Printed Pillow']]]")).click();
        WebElement sucessMessageContainer = driver.findElement(By.cssSelector(".success-msg"));
        assertThat("Product not added to cart.", sucessMessageContainer.getText(), containsString("Shay Printed Pillow was added to your shopping cart."));
        driver.findElement(By.xpath("//ul[@class='checkout-types top']//button[@class='button btn-proceed-checkout btn-checkout']")).click();
        Checkout checkout = PageFactory.initElements(driver, Checkout.class);
        checkout.getCheckoutMethod().click();
        driver.findElement(By.xpath("//span[text()='Continue']")).click();
        Checkout firstName = PageFactory.initElements(driver, Checkout.class);
        firstName.getFirstName().sendKeys("Ema");
        Checkout lastName = PageFactory.initElements(driver, Checkout.class);
        lastName.getLastName().sendKeys("Haiduc");
        Checkout email = PageFactory.initElements(driver, Checkout.class);
        email.getEmail().sendKeys("haiema@yahoo.ro");
        Checkout street = PageFactory.initElements(driver, Checkout.class);
        street.getStreet().sendKeys("17th Avenue");
        Checkout city = PageFactory.initElements(driver, Checkout.class);
        city.getCity().sendKeys("Florida");
        Checkout stateProvince = PageFactory.initElements(driver, Checkout.class);
        stateProvince.getStateProvince().click();
        Checkout postalCode = PageFactory.initElements(driver, Checkout.class);
        postalCode.getPostalCode().sendKeys("336HG");
        Checkout country = PageFactory.initElements(driver, Checkout.class);
        country.getCountry().click();
        Checkout phoneNumber = PageFactory.initElements(driver, Checkout.class);
        phoneNumber.getPhoneNumber().sendKeys("4876493");
        Checkout shipToSameAddress = PageFactory.initElements(driver, Checkout.class);
        shipToSameAddress.getShipToSameAddress().click();
        Checkout continueButton = PageFactory.initElements(driver, Checkout.class);
        continueButton.getContinueButton().click();
        Thread.sleep(10000);
        Checkout freeShipping = PageFactory.initElements(driver, Checkout.class);
        freeShipping.getFreeShipping().click();
        Thread.sleep(10000);
        Checkout continueAfterShippingDetails = PageFactory.initElements(driver, Checkout.class);
        continueAfterShippingDetails.getContinueAfterShippingDetails().click();
        Thread.sleep(10000);
        Checkout continueAfterPaymentOption = PageFactory.initElements(driver, Checkout.class);
        continueAfterPaymentOption.getContinueAfterShippingDetails().click();
        Thread.sleep(10000);

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
