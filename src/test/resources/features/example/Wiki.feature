@regression
@wiki
Feature: Search Wikipedia

  Scenario: Direct search article
    Given I navigate to "https://www.wikipedia.org/"
    When I enter search term "Leonardo da Vinci"
    Then The title is equal to "Leonardo da Vinci - Wikipedia"




