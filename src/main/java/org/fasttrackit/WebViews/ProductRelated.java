package org.fasttrackit.WebViews;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductRelated {

    @FindBy(css = ".sort-by ")
    private WebElement sortByButton;


    @FindBy(xpath = "//select//option[normalize-space(text())='Name']")
    private WebElement sortByNameOption;


    @FindBy(xpath = "//a[@class='button' and ./ancestor::*[a[@title='Pillow and Throw Set']]]")
    private WebElement viewDetailsButton;


    @FindBy(className = "list")
    private WebElement displayAsListOption;



    @FindBy(xpath = "//li//span[text()='Reviews']")
    private WebElement reviewButton;

    @FindBy(xpath = "//a[text()='Be the first to review this product']")
    private WebElement firstToRReviewBtn;


    @FindBy(xpath = "//tr[@class='first odd']//td[@class='value last']")
    private WebElement firstVlueReviewBtn;


    @FindBy(xpath = "//label[contains(@for, 'Price_1')]")
    private WebElement secondValueReviewBtn;


    @FindBy(xpath = "//label[contains(@for, 'Value_3')]")
    private WebElement lastValueReviewBtn;



    @FindBy(xpath = "//textarea[@id='review_field']")
    private WebElement firstReviewField;

    @FindBy(xpath = "//input[@id='summary_field']")
    private WebElement summaryReviewField;

    @FindBy(xpath = "//input[@id='nickname_field']")
    private WebElement nicknameField;

    @FindBy(xpath = "//button//span[text()='Submit Review']")
    private WebElement submitReviewBtn;


    @FindBy(xpath = "//button[@class='button2 btn-continue']")
    private WebElement continueShoppingBtn;


    public WebElement getSortByButton() {
        return sortByButton;
    }

    public WebElement getSortByNameOption() {
        return sortByNameOption;
    }

    public WebElement getDisplayAsListOption() {
        return displayAsListOption;
    }

    public WebElement getViewDetailsButton() {
        return viewDetailsButton;
    }
    public WebElement getReviewButton() {
        return reviewButton;
    }

    public WebElement getFirstToRReviewBtn() {
        return firstToRReviewBtn;
    }
    public WebElement getFirstVlueReviewBtn() {
        return firstVlueReviewBtn;
    }
    public WebElement getSecondValueReviewBtn() {
        return secondValueReviewBtn;
    }
    public WebElement getLastValueReviewBtn() {
        return lastValueReviewBtn;
    }
    public WebElement getFirstReviewField() {
        return firstReviewField;
    }

    public WebElement getSummaryReviewField() {
        return summaryReviewField;
    }
    public WebElement getNicknameField() {
        return nicknameField;
    }

    public WebElement getSubmitReviewBtn() {
        return submitReviewBtn;
    }
    public WebElement getContinueShoppingBtn() {
        return continueShoppingBtn;
    }
}
