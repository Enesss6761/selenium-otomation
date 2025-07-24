@reports @accountStatement
Feature: User can see account statement in Yemekpay BO

  Background:
    Given User opens Yemekpay BO Url
    And User see welcome button
    And User click welcome button
    And User logins from homepage
    And User verify otp code
    And User welcome to MainPage
    And User click reports left menu
    And User click account statement sub left menu
    And User see account statement Page

  @accountStatementAllElementsAreDisplayed
  Scenario: User Open Account Statement Page and See All Elements are Displayed
    And User click more filters in Account Statement Page
    When User see all elements in Account Statement Page

  @accountStatementFilterByAllFilters @accountingDemo
  Scenario: User Open Account Statement Page and Filter By All Filters
    And User click more filters in Account Statement Page
    And User filter by date "1" between "28" days in Account Statement Page
    And User click Merchant Filter in Account Statement Page
    And User type merchant name to search field in Account Statement Page
    And User click merchant name search in Account Statement Page
    And User click merchant name selection in Account Statement Page
    And User click Pos Filter in Account Statement Page
    And User type Pos to search field in Account Statement Page
    And User click Pos to search field in Account Statement Page
    And User click Pos selection in Account Statement Page
    And User click Bank PF Filter in Account Statement Page
    And User type bank name to search field in Account Statement Page
    And User click bank name to search field in Account Statement Page
    And User click bank name selection in Account Statement Page
    And User click transaction type in Account Statement Page
    And User select transaction type in Account Statement Page
    When User click search button in Account Statement Page
    Then User see transaction records on list in Account Statement Page

  @accountStatementFilterByTransactionId
  Scenario: User Open Account Statement Page and Filter By Transaction Id
    And User click more filters in Account Statement Page
    And User filter by date "1" between "28" days in Account Statement Page
    And User type order id "20250509091813676541" in Account Statement Page
    When User click search button in Account Statement Page
    Then User see transaction records on list in Account Statement Page

  @accountStatementReportExportToHistory @accountingDemo
  Scenario: User Open Account Statement Page and Export To History
    And User filter by date "1" between "28" days in Account Statement Page
    And User click search button in Account Statement Page
    And User click Account Statement Report Export
    And User see success message on Account Statement Report Page
    And User click Account Statement Report Export History
    When User see Account Statement Report in Report History

