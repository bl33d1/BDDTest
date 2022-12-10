Feature: Verify that i can login using valid credentials

  Scenario:
    Given i navigate to "https://vesaxi-edudb-qa-client.azurewebsites.net/"
    When i provide the email "edudb.dev.em@hotmail.com" and click next
    And i provide the password "EduDB123!"
    And i click the button No for staying signed in