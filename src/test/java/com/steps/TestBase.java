package com.steps;

import com.helpers.CommonActions;
import io.cucumber.java.Before;
import io.cucumber.java.After;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestBase extends CommonActions {
    public static final String CHROME_DRIVER_PATH = System.getProperty("user.dir") + "/src/test/resources/drivers/chromedriver";


    @Before
    public void startTest() {

        System.setProperty("webdriver.chrome.driver", CHROME_DRIVER_PATH);
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("start-fullscreen");
        driver = new ChromeDriver(chromeOptions);


    }

    @After
    public void closeTest() {
        driver.quit();
    }
}
