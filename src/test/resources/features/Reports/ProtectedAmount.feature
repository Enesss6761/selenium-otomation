@reports @protectedAmount
Feature: User can see protected amount in Yemekpay BO

  Background:
    Given User opens Yemekpay BO Url
    And User see welcome button
    And User click welcome button
    And User logins from homepage
    And User verify otp code
    And User welcome to MainPage
    And User click reports left menu
    And User click protected amount sub left menu
    And User see protected amount Page

  @protectedAmountAllElementsAreDisplayed
  Scenario: User Open Protected Amount Page and See All Elements are Displayed
    When User see all elements in Protected Amount Page

  @protectedAmountReportFilterByMerchantName
  Scenario: User Open Protected Amount Report Page and Filter By Merchant Name
    And User click Merchant Filter in Protected Amount Report Page
    And User type merchant name to search field in Protected Amount Report Page
    And User click merchant name search in Protected Amount Report Page
    And User click merchant name selection in Protected Amount Report Page
    When User click search button on Protected Amount Report
    Then User see merchant name on list in Protected Amount Report Page

  @protectedAmountReportExportToHistory
  Scenario: User Open Protected Amount Report Page and Export To History
    And User click Protected Amount Report Export
    And User see success message on Protected Amount Report Page
    And User click Protected Amount Report Export History
    When User see Protected Amount Report in Report History