@roleAndPageAuthorization @loginManagement
Feature: User can see role and page authorization in Yemekpay BO

  Background:
    Given User opens Yemekpay BO Url
    And User see welcome button
    And User click welcome button
    And User logins from homepage
    And User verify otp code
    And User welcome to MainPage
    And User click login management left menu
    And User click Role and Page Authorization sub left menu
    And User see Role and Page Authorization Page

  @roleAndPageAuthorizationAllElementsAreDisplayed
  Scenario: User Open Role and Page Authorization Page and See All Elements are Displayed
    When User see all elements in Role and Page Authorization Page