package org.fasttrackit;

import org.fasttrackit.WebViews.Checkout;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class CheckoutSteps extends TestBase {


        public void fillInBiilingInfo() {
        Checkout checkout = PageFactory.initElements( driver,Checkout.class);
        checkout.getFirstName().sendKeys("Ema");
        checkout.getLastName().sendKeys("Haiduc");
        checkout.getEmail().sendKeys("haiema@yahoo.ro");
        checkout.getStreet().sendKeys("17th Avenue");
        checkout.getCity().sendKeys("Florida");
        checkout.getStateProvince().selectByVisibleText("Florida");
        checkout.getPostalCode().sendKeys("336HG");
        checkout.getCountry().selectByVisibleText("Statele Unite ale Americii");
        checkout.getPhoneNumber().sendKeys("4876493");



    }
}
