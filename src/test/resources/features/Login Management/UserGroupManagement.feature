@userGroupManagement @loginManagement
Feature: User can see user group management in Yemekpay BO

  Background:
    Given User opens Yemekpay BO Url
    And User see welcome button
    And User click welcome button
    And User logins from homepage
    And User verify otp code
    And User welcome to MainPage
    And User click login management left menu
    And User click user group management sub left menu
    And User see User Group Management Page

  @userGroupManagementAllElementsAreDisplayed
  Scenario: User Open User Group Management Page and See All Elements are Displayed
    When User see all elements in User Group Management Page

  @userGroupManagementAddRole
  Scenario: User Open User Group Management Page and Click Add Button See All Elements are Displayed
    And User click add in User Group Management Page
    When User see Add User Group Page
    Then User see all elements in User Group Add Page