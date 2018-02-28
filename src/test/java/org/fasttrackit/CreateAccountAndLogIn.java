package org.fasttrackit;

import org.fasttrackit.WebViews.CreateAccount;
import org.junit.Test;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAccountAndLogIn extends TestBase {

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


    }

    @Test
    public void logIn() {

        CreateAccount createAccount = PageFactory.initElements(driver, CreateAccount.class);
        createAccount.getAccountDropDownList().click();
        createAccount.getLogIn().click();
        createAccount.getLogInEmail().sendKeys("ev.grey@yahoo.com");
        createAccount.getLogInPassword().sendKeys("xyz100");
        createAccount.getLogInButton().click();
    }


}
