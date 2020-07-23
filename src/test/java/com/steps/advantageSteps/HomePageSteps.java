package com.steps.advantageSteps;

import com.helpers.CommonActions;
import com.helpers.Constants;
import com.sites.advantage.pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class HomePageSteps extends CommonActions {

    private final HomePage homePage = new HomePage();

    @Given("I open advantage url")
    public void iOpenAdvantageUrl() {
        driver.navigate().to(Constants.ADVANTAGE_URL);
    }

    @Then("I verify homepage is loaded")
    public void iVerifyHomepageIsLoaded() {
        homePage.verifyHomepage();
    }
}
