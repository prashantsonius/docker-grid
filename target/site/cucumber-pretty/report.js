$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/advantage/homePage.feature");
formatter.feature({
  "name": "advantage shopping page tests",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@advantageRegression"
    }
  ]
});
formatter.scenario({
  "name": "verify advantage home page is loaded",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@advantageRegression"
    },
    {
      "name": "@advantageHomePage"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I open advantage url",
  "keyword": "Given "
});
formatter.match({
  "location": "HomePageSteps.iOpenAdvantageUrl()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify homepage is loaded",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageSteps.iVerifyHomepageIsLoaded()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});