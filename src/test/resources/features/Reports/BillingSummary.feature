@reports @billingSummary
Feature: User can see billing summary in Yemekpay BO

  Background:
    Given User opens Yemekpay BO Url
    And User see welcome button
    And User click welcome button
    And User logins from homepage
    And User verify otp code
    And User welcome to MainPage
    And User click reports left menu
    And User click billing summary sub left menu
    And User see billing summary Page

  @billingSummaryAllElementsAreDisplayed
  Scenario: User Open Billing Summary Page and See All Elements are Displayed
    When User see all elements in Billing Summary Page

  @billingSummaryReportFilterByMerchantName
  Scenario: User Open Billing Summary Report Page and Filter By Merchant Name
    And User filter by date "1" between "28" days in Billing Summary Report Page
    And User click Merchant Filter in Billing Summary Report Page
    And User type merchant name to search field in Billing Summary Report Page
    And User click merchant name search in Billing Summary Report Page
    And User click merchant name selection in Billing Summary Report Page
    When User click search button on Billing Summary Report
    Then User see merchant name on list in Billing Summary Report Page

  @billingSummaryReportExportToHistory
  Scenario: User Open Billing Summary Report Page and Export To History
    And User filter by date "1" between "28" days in Billing Summary Report Page
    And User click search button on Billing Summary Report
    And User click Billing Summary Report Export
    And User see success message on Billing Summary Report Page
    And User click Billing Summary Report Export History
    When User see Billing Summary Report in Report History