@chargeback @listOfPendingApproval
Feature: User can see List of Pending Approval in Yemekpay BO

  Background:
    Given User opens Yemekpay BO Url
    And User see welcome button
    And User click welcome button
    And User logins from homepage
    And User verify otp code
    And User welcome to MainPage
    And User click chargeback left menu
    And User click list of pending approval sub left menu
    And User see list of pending approval Page

  @listOfPendingApprovalAllElementsAreDisplayed
  Scenario: User Open List of Pending Approval Page and See All Elements are Displayed
    When User see all elements in List of Pending Approval Page