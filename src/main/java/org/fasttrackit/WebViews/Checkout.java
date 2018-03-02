package org.fasttrackit.WebViews;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Checkout {


    @FindBy(css = "input[id='login:guest']")

    private WebElement checkoutMethod;


    @FindBy(id = "billing:firstname")
    private WebElement firstNameField;

    @FindBy(id = "billing:lastname")
    private WebElement lastNameField;

    @FindBy(id = "billing:email")
    private WebElement emailField;

    @FindBy(id = "billing:street1")
    private WebElement streetField;

    @FindBy(id = "billing:city")
    private WebElement cityField;


    @FindBy(xpath = "//select[@id='billing:region_id'] ")

    private WebElement stateProvinceSelectList;

    @FindBy(id = "billing:postcode")
    private WebElement postalCodeField;

    @FindBy(id = "billing:country_id")
    private WebElement countrySelectList;

    @FindBy(id = "billing:telephone")
    private WebElement phoneNumberField;

    @FindBy(id = "billing:use_for_shipping_yes")
    private WebElement shipToSameAddressBtn;


    @FindBy(xpath = "//div[@id='billing-buttons-container']//button[@title='Continue']")
    private WebElement continueButton;

    @FindBy(id = "s_method_freeshipping_freeshipping")
    private WebElement freeShippingBtn;


    @FindBy(css = "#shipping-method-buttons-container")
    private WebElement continueAfterShippingDetailsBtn;


    @FindBy(id = "payment-buttons-container")
    private WebElement continueAfterPaymentOptionBtn;


    @FindBy(xpath = "//button[@title='Place Order']")
    private WebElement placeOrderButton;


    public WebElement getCheckoutMethod() {
        return checkoutMethod;
    }

    public WebElement getFirstName() {
        return firstNameField;
    }

    public WebElement getLastName() {
        return lastNameField;
    }

    public WebElement getEmail() {
        return emailField;
    }

    public WebElement getStreet() {
        return streetField;
    }

    public WebElement getCity() {
        return cityField;
    }

    public Select getStateProvince() { return new Select(stateProvinceSelectList); }

    public WebElement getPostalCode() {
        return postalCodeField;
    }

    public Select getCountry() {
        return new Select(countrySelectList);
    }

    public WebElement getPhoneNumber() {
        return phoneNumberField;
    }

    public WebElement getShipToSameAddress() {
        return shipToSameAddressBtn;
    }

    public WebElement getContinueButton() {
        return continueButton;
    }

    public WebElement getFreeShipping() {
        return freeShippingBtn;
    }

    public WebElement getContinueAfterShippingDetails() {
        return continueAfterShippingDetailsBtn;
    }

    public WebElement getContinueAfterPaymentOption() {
        return continueAfterPaymentOptionBtn;
    }

    public WebElement getPlaceOrderButton() {
        return placeOrderButton;
    }
}
