package com.sites.advantage.pages;

import com.helpers.CommonActions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class HomePage extends CommonActions {
    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "speakersImg")
    private WebElement speakersImg;

    @FindBy(id = "tabletsImg")
    private WebElement tabletsImg;

    public void verifyHomepage() {
        Assert.assertTrue(isElementClickable(15, speakersImg));
    }
}
