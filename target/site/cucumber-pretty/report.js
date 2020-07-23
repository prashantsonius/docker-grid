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
  "name": "I am on the advantage homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "HomePageSteps.iAmOnTheAdvantageHomepage()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});