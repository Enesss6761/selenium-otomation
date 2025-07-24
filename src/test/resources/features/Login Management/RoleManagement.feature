@roleManagement @loginManagement
Feature: User can see role management in Yemekpay BO

  Background:
    Given User opens Yemekpay BO Url
    And User see welcome button
    And User click welcome button
    And User logins from homepage
    And User verify otp code
    And User welcome to MainPage
    And User click login management left menu
    And User click role management sub left menu
    And User see Role Management Page

  @roleManagementAllElementsAreDisplayed
  Scenario: User Open Role Management Page and See All Elements are Displayed
    When User see all elements in Role Management Page

  @roleManagementAddRole
  Scenario: User Open Role Management Page and Click Add Button See All Elements are Displayed
    And User click add in Role Management Page
    When User see Add Role Page
    Then User see all elements in Role Add Page