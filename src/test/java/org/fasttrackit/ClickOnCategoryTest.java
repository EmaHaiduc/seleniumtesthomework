package org.fasttrackit;

import org.fasttrackit.WebViews.ClickOnCategory;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.StringContains.containsString;

public class ClickOnCategoryTest extends TestBase {


@Test
public void clickOnWomen(){
    ClickOnCategory clickOnCategory=PageFactory.initElements(driver, ClickOnCategory.class);
    clickOnCategory.getWomenCategory().click();
    WebElement successMessage= driver.findElement(By.xpath("//div[@class='page-title category-title']"));
    assertThat("No category found.", successMessage.getText(), containsString("WOMEN"));
    clickOnCategory.getAccesoriesCategory().click();}


    @Test
            public void clickOnAccesories(){
    WebElement successMsg=driver.findElement(By.xpath("//div[@class='page-title category-title']"));
    assertThat("No category found.", successMsg.getText(), containsString("ACCESORIES"));
}



}