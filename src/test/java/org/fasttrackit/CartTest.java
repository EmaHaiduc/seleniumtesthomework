package org.fasttrackit;

import org.fasttrackit.WebViews.Cart;
import org.fasttrackit.WebViews.Checkout;
import org.fasttrackit.WebViews.Header;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
        Cart cart = PageFactory.initElements(driver, Cart.class);
        cart.getInputvaluefield().clear();
        cart.getInsertquantity().sendKeys("2" + Keys.ENTER);
        WebElement successMessagecontainer = driver.findElement(By.xpath("//span[@class='cart-price' and ./span[contains(.,'420,00')] ]"));
        assertThat("Couldn't increase quantity.", successMessagecontainer.getText(), containsString("420,00 RON"));
        Checkout checkout = PageFactory.initElements(driver, Checkout.class);
        checkout.getProceedToCheckoutButton().click();
        checkout.getCheckoutMethod().click();
        checkout.getContinueAfterCheckoutMethodButton().click();
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
        checkout.getFreeShippingBtn().click();
        WebElement element = (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#shipping-method-buttons-container")));
        checkout.getContinueAfterShippingDetailsBtn().click();
        WebElement continueBtn = driver.findElement(By.cssSelector("#shipping-method-buttons-container"));
        assertThat("Unable to continue.", continueBtn.getText(), containsString("CONTINUE"));
        Thread.sleep(10000);
        checkout.getContinueAfterPaymentOptionBtn().click();

        Thread.sleep(10000);
        checkout.getPlaceOrderButton().click();

    }


    @Test
    public void deleteProductFromCart() {

        String keyword;
        Header header = PageFactory.initElements(driver, Header.class);
        header.getSearchField().sendKeys("pillow" + Keys.ENTER);
        System.out.println("Pressed Enter in search field.");
        Cart cart = PageFactory.initElements(driver, Cart.class);
        cart.getAddToCartBtn().click();
        cart.getRemoveFromCart().click();
        WebElement successMessageContainer = driver.findElement(By.xpath("//h1[text()='Shopping Cart is Empty']"));
        assertThat("You have items in your shopping cart", successMessageContainer.getText(), containsString("SHOPPING CART IS EMPTY"));
    }

    @Test
    public void updateCartIcon() {

        String keyword;
        Header header = PageFactory.initElements(driver, Header.class);
        header.getSearchField().sendKeys("necklace" + Keys.ENTER);
        Cart cart = PageFactory.initElements(driver, Cart.class);
        cart.getAddtoCartBtn().click();
        cart.getInputvaluefield().clear();
        cart.getInsertquantity().sendKeys("6" + Keys.ENTER);
        WebElement successIcon = driver.findElement(By.xpath("//span[@class='count']"));
        assertThat("0", successIcon.getText(), containsString("6"));

    }

    @Test
    public void checkValidValues(){

        String keyword;
        Header header=PageFactory.initElements(driver, Header.class);
        header.getSearchField().sendKeys("pillow"+Keys.ENTER);
        Cart cart= PageFactory.initElements(driver, Cart.class);
        cart.getAddToCartButton().click();
        header.getSearchField().sendKeys("necklace"+Keys.ENTER);
        cart.getAddtoCartBtn().click();
        cart.getInputvaluefield().clear();
        cart.getInsertquantity().sendKeys("999"+ Keys.ENTER);
        WebElement successMessage= driver.findElement(By.xpath("//span[text()='The requested quantity for \"Shay Printed Pillow\" is not available.']"));
        assertThat("Item was updated with the wanted quantity.",successMessage.getText(), containsString(" not available") );


    }
}
