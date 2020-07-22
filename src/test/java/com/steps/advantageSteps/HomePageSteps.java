package com.steps.advantageSteps;

import com.helpers.CommonActions;
import com.helpers.Constants;
import io.cucumber.java.en.Given;

public class HomePageSteps extends CommonActions {
    @Given("I am on the advantage homepage")
    public void iAmOnTheAdvantageHomepage() {
        driver.navigate().to(Constants.ADVANTAGE_URL);
    }
}
