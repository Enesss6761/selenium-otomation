@userManagement @loginManagement
Feature: User can see user management in Yemekpay BO

  Background:
    Given User opens Yemekpay BO Url
    And User see welcome button
    And User click welcome button
    And User logins from homepage
    And User verify otp code
    And User welcome to MainPage
    And User click login management left menu
    And User click user management sub left menu
    And User see user Management Page

  @userManagementAllElementsAreDisplayed
  Scenario: User Open User Management Page and See All Elements are Displayed
    When User see all elements in User Management Page

  @userManagementAddUser
  Scenario: User Open User Management Page and Click Add Button See All Elements are Displayed
    And User click add in User Management Page
    When User see Add User Page
    Then User see all elements in User Add Page