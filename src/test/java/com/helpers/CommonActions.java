package com.helpers;

import io.github.cdimascio.dotenv.Dotenv;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;

public class CommonActions {
    protected static WebDriver driver;

    public static String getUrlFromEnvFile(String url) {
        Dotenv dotenv = Dotenv.load();
        return dotenv.get(url);
    }


    protected boolean isElementClickable(long timeInSeconds, WebElement element) {
        FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(timeInSeconds))
                .pollingEvery(Duration.ofMillis(500))
                .ignoring(StaleElementReferenceException.class)
                .ignoring(NoSuchElementException.class)
                .ignoring(TimeoutException.class);
        try {
            wait.until(ExpectedConditions.elementToBeClickable(element));
            return element.isDisplayed() && element.isEnabled();
        } catch (Exception e) {
            return false;
        }
    }
}
