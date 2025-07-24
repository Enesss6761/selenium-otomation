@merchants @merchantManagement
Feature: User can see merchant management in Yemekpay BO

  Background:
    Given User opens Yemekpay BO Url
    And User see welcome button
    And User click welcome button
    And User logins from homepage
    And User verify otp code
    And User welcome to MainPage
    And User click merchant management left menu
    And User click merchants sub left menu
    And User see merchants Page

  @merchantsAllElementsAreDisplayed
  Scenario: User Open Merchants Page and See All Elements are Displayed
    And User click more filters in Merchant Management Page
    When User see all elements in Merchant Management Page

  @merchantsFilterByAllFilters @accountingDemo
  Scenario: User Open Merchants Page and Filter By All Filters
    And User click more filters in Merchant Management Page
    And User filter by date "1" between "31" days in Merchant Management Page
    And User click status filter in Merchant Management Page
    And User select status in Merchant Management Page
    And User click date type filter in Merchant Management Page
    And User select date type in Merchant Management Page
    And User type merchant name in Merchant Management Page
    And User type merchant legal name in Merchant Management Page
    And User type authorized name in Merchant Management Page
    And User type authorized email in Merchant Management Page
    And User type authorized phone number in Merchant Management Page
    When User click search button in Merchant Management Page
    Then User see merchant name on list in Merchant Management Page

  @merchantsDetailPopUp @accountingDemo
  Scenario: User Open Merchants Page and Click Merchant Detail
    And User click merchant detail in Merchant Management Page
    When User see merchant name of merchant detail in Merchant Management Page







