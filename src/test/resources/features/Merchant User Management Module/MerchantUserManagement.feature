@merchantsUserManagement
Feature: User can see merchant user management in Yemekpay BO

  Background:
    Given User opens Yemekpay BO Url
    And User see welcome button
    And User click welcome button
    And User logins from homepage
    And User verify otp code
    And User welcome to MainPage
    And User click merchant user management module left menu
    And User click merchant user management sub left menu
    And User see merchants user management Page

  @merchantUserManagementAllElementsAreDisplayed
  Scenario: User Open Merchant User Management Page and See All Elements are Displayed
    And User see all elements in Merchant User Management Page
    And User click merchant user edit in Merchant User Management Page
    And User see all elements in Merchant User Management Edit Page

  @merchantUserManagementFilterByAllFilter
  Scenario: User Open Merchant User Management Page and Filter By All Filters
    And User click merchant list in Merchant User Management Page
    And User select merchant in Merchant User Management Page
    And User type merchant user name to name field in Merchant User Management Page
    And User type merchant user surname to surname field in Merchant User Management Page
    And User type merchant user email to email field in Merchant User Management Page
    When User click search button in Merchant User Management Page
    Then User see merchant user records on list in Merchant User Management Page


