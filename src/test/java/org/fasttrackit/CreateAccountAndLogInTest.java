package org.fasttrackit;

import org.fasttrackit.WebViews.CreateAccount;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.StringContains.containsString;

public class CreateAccountAndLogInTest extends TestBase {

    @Test
    public void createAccount() {
        CreateAccount createAccount = PageFactory.initElements(driver, CreateAccount.class);
        createAccount.getAccountDropDownList().click();
        createAccount.getLogIn().click();
        createAccount.getCreateAccount().click();
        createAccount.getFirstName().sendKeys("Eva");
        createAccount.getLastName().sendKeys("Grey");
        createAccount.getEmail().sendKeys("ev.grey@yahoo.com");
        createAccount.getPassword().sendKeys("xyz100");
        createAccount.getConfirmPassword().sendKeys("xyz100");
        createAccount.getRegisterBtn().click();
         WebElement successmsge= driver.findElement(By.xpath("//li[@class='success-msg']"));
         assertThat("Couldn't create account.", successmsge.getText(), containsString("Thank you for registering with Madison Island."));

    }

    @Test
    public void logIn() {

        CreateAccount createAccount = PageFactory.initElements(driver, CreateAccount.class);
        createAccount.getAccountDropDownList().click();
        createAccount.getLogIn().click();
        createAccount.getLogInEmail().sendKeys("ev.grey@yahoo.com");
        createAccount.getLogInPassword().sendKeys("xyz100");
        createAccount.getLogInButton().click();
        WebElement successfulLoginMessage=driver.findElement(By.xpath("//p[@class='hello']//strong"));
        assertThat("Try again.", successfulLoginMessage.getText(), containsString("Hello, Eva Grey!"));

    }

    @Test
    public void logInWithIncorrectPassword(){

        CreateAccount createAccount=PageFactory.initElements(driver,CreateAccount.class);
        createAccount.getAccountDropDownList().click();
        createAccount.getLogIn().click();
        createAccount.getLogInEmail().sendKeys("ev.grey@yahoo.com");
        createAccount.getLogInPassword().sendKeys("dejkre");
        createAccount.getLogInButton().click();
        WebElement successMessageContainer= driver.findElement(By.xpath("//span[text()='Invalid login or password.']"));
        assertThat("Login Successful.", successMessageContainer.getText(), containsString("Invalid login or password."));


    }


    @Test

     public void forgotPassword() {

        CreateAccount createAccount= PageFactory.initElements(driver, CreateAccount.class);
        createAccount.getAccountDropDownList().click();
        createAccount.getLogIn().click();
        createAccount.getForgotYourPasswordButton().click();
        createAccount.getEmailField().sendKeys("ev.grey@yahoo.com");
        createAccount.getSubmitButton().click();
        WebElement successmsg=driver.findElement(By.xpath("//li[@class='success-msg']"));
        assertThat("Email does not exist.", successmsg.getText(), containsString("If there is an account associated with ev.grey@yahoo.com you will receive an email with a link to reset your password."));

    }
    }

