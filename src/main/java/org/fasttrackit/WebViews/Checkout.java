package org.fasttrackit.WebViews;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Checkout {


    @FindBy(css = "input[id='login:guest']")

    private WebElement checkoutMethod;


    @FindBy(id = "billing:firstname")
    private WebElement firstName;

    @FindBy(id = "billing:lastname")
    private WebElement lastName;

    @FindBy(id = "billing:email")
    private WebElement email;

    @FindBy(id = "billing:street1")
    private WebElement street;

    @FindBy(id = "billing:city")
    private WebElement city;

    @FindBy(xpath = "//select[@id='billing:region_id']//option[text()='Florida']")
    private WebElement stateProvince;

    @FindBy(id = "billing:postcode")
    private WebElement postalCode;

    @FindBy(id = "billing:country_id")
    private WebElement country;

    @FindBy(id = "billing:telephone")
    private WebElement phoneNumber;

    @FindBy(id = "billing:use_for_shipping_yes")
    private WebElement shipToSameAddress;


    @FindBy(xpath = "//div[@id='billing-buttons-container']//button[@title='Continue']")
    private WebElement continueButton;

    @FindBy(id = "s_method_freeshipping_freeshipping")
    private WebElement freeShipping;


    @FindBy(css = "#shipping-method-buttons-container")
    private WebElement continueAfterShippingDetails;


    @FindBy(id = "payment-buttons-container")
    private WebElement continueAfterPaymentOption;


    @FindBy(xpath = "//button[@title='Place Order']")
    private WebElement placeOrderButton;


    public WebElement getCheckoutMethod() {
        return checkoutMethod;
    }

    public WebElement getFirstName() {
        return firstName;
    }

    public WebElement getLastName() {
        return lastName;
    }

    public WebElement getEmail() {
        return email;
    }

    public WebElement getStreet() {
        return street;
    }

    public WebElement getCity() {
        return city;
    }

    public WebElement getStateProvince() {
        return stateProvince;
    }

    public WebElement getPostalCode() {
        return postalCode;
    }

    public WebElement getCountry() {
        return country;
    }

    public WebElement getPhoneNumber() {
        return phoneNumber;
    }

    public WebElement getShipToSameAddress() {
        return shipToSameAddress;
    }

    public WebElement getContinueButton() {
        return continueButton;
    }

    public WebElement getFreeShipping() {
        return freeShipping;
    }

    public WebElement getContinueAfterShippingDetails() {
        return continueAfterShippingDetails;
    }

    public WebElement getContinueAfterPaymentOption() {
        return continueAfterPaymentOption;
    }

    public WebElement getPlaceOrderButton() {
        return placeOrderButton;
    }
}
