package com.test;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/features",
        plugin = {"json:target/cucumber.json", "html:target/site/cucumber-pretty"},
        glue = {"com.steps"},
        tags = {"@advantageHomePage"}

)
public class RunCucumberTest extends AbstractTestNGCucumberTests {

}
