@resttest
Feature: Testing API
Scenario: GET Test
  Given make a GET request to "https://httpbin.org"
  Then i should receive a status code of 200