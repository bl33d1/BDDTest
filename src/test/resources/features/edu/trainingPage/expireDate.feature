@dateCalculation
Feature: Expire date calculation

  Background:
    Given i navigate to "https://vesaxi-edudb-qa-client.azurewebsites.net/"
    When i provide the email "edudb.dev.em@hotmail.com" and click next
    And i provide the password "EduDB123!"
    And i click the button No for staying signed in
    When i click the menu button
    And i click on My Organization and next Training list button
    And i click on New Training button
    And i click the Add new Class button
   # And i click the newly created class to expand it

  Scenario Outline: Verify that the calculation is correct

    When i fill out the validityInYears input with <validlyInYears>
    #And i set the Month expire checkbox to "true"
    When i set endDate to <endDate>
    Then the ExpirationOfCertificateConfirmation should be <expirationDate>

    Examples:
      | validlyInYears | monthExpire | endDate    | expirationDate |
      | 1              | "true"      | "01/17/2023" | "01/17/2024"      |

#
     | 2              | "false"     | "01/17/2023" | "01/17/2025"     |
#      | 2              | "true"      | 01/17/2023 | 1/31/2025      |
#      | 1              | "false"     | 01/17/2023 | 01/17/2024     |
#      |                |             |            |                |
#      |                |             |            |                |
#      |                |             |            |                |