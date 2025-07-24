Feature: Payment API Test

  Scenario: Perform payment and save orderReferenceNumber
    Given the payment request payload is valid
    When I send the payment request
    Then I store the orderReferenceNumber from responsae