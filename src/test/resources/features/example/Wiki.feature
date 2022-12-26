@regression
@wiki
Feature: Search Wikipedia

  Scenario: Direct search article
    Given I navigate to "https://www.wikipedia.org/"
    When I enter search term "Cucumber"
    When i hit the search button
    Then The title is equal to "Cucumber - Wikipedia"




