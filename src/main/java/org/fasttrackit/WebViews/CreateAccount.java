package org.fasttrackit.WebViews;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateAccount {
    @FindBy(xpath = "//span[text()='Account']")
    private WebElement accountDropDownList;

    @FindBy(linkText = "Log In")
    private WebElement logIn;

    @FindBy(xpath = "//a[@class='button']")
    private WebElement createAccount;

    @FindBy(id = "firstname")
    private WebElement firstName;

    @FindBy(id = "lastname")
    private WebElement lastName;

    @FindBy(id = "email_address")
    private WebElement email;

    @FindBy(id = "password")
    private WebElement password;

    @FindBy(id = "confirmation")
    private WebElement confirmPassword;

    @FindBy(xpath = "//span[text()='Register']")
    private WebElement registerBtn;

    @FindBy(xpath = "//input[@id='email']")
    private WebElement logInEmail;

    @FindBy(id = "pass")
    private WebElement logInPassword;


    @FindBy(id = "send2")

    private WebElement logInButton;


    @FindBy(xpath = "//p[@class='hello']//strong")
    private WebElement forgotYourPasswordButton;


    @FindBy (id = "email_address")
    private  WebElement emailField;


    @FindBy(xpath = "//button[contains(@title, 'Submit')]")
    private WebElement submitButton;

    public WebElement getFirstName() {
        return firstName;
    }

    public WebElement getLastName() {
        return lastName;
    }

    public WebElement getEmail() {
        return email;
    }

    public WebElement getPassword() {
        return password;
    }

    public WebElement getConfirmPassword() {
        return confirmPassword;
    }


    public WebElement getAccountDropDownList() {
        return accountDropDownList;
    }

    public WebElement getLogIn() {
        return logIn;
    }

    public WebElement getCreateAccount() {
        return createAccount;
    }

    public WebElement getRegisterBtn() {
        return registerBtn;
    }
    public WebElement getLogInEmail() {
        return logInEmail;
    }

    public WebElement getLogInPassword() {
        return logInPassword;
    }

    public WebElement getLogInButton() {
        return logInButton;
    }

    public WebElement getForgotYourPasswordButton() {
        return forgotYourPasswordButton;
    }

    public WebElement getEmailField() {
        return emailField;
    }

    public WebElement getSubmitButton() {
        return submitButton;
    }
}
