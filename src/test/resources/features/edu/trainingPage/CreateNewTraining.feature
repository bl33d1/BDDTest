
@trainings
Feature:Aa a user i want to be able to login

  Background:
    Given i navigate to "https://vesaxi-edudb-qa-client.azurewebsites.net/"
    When i provide the email "edudb.dev.em@hotmail.com" and click next
    And i provide the password "EduDB123!"
    And i click the button No for staying signed in

  Scenario: Adding a new Training
    When i click the menu button
    And i click on My Organization and next Training list button
    And i click on New Training button
    And i fill out the text fields