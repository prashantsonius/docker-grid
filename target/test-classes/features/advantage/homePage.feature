@advantageRegression

Feature: advantage shopping page tests

  @advantageHomePage
  Scenario: verify advantage home page is loaded
    Given I open advantage url
    Then I verify homepage is loaded

