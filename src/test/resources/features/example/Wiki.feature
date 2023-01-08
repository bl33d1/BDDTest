@regression
@wiki
Feature: Search Wikipedia

  Scenario: Direct search article
    Given I navigate to "https://www.wikipedia.org/"
    When I enter search term "sdafsfsadsa"
    When i click the search button
    Then The title contains "Leonardo da Vinci - Wikipedia"




