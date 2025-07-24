@reports @pastReports
Feature: User can see past reports in Yemekpay BO

  Background:
    Given User opens Yemekpay BO Url
    And User see welcome button
    And User click welcome button
    And User logins from homepage
    And User verify otp code
    And User welcome to MainPage
    And User click reports left menu
    And User click past reports sub left menu
    And User see past reports Page

  @pastReportsAllElementsAreDisplayed
  Scenario: User Open Past Reports Page and See All Elements are Displayed
    And User click more filters in Past Reports Page
    When User see all elements in Past Reports Page

  @pastReportsFilterByAllFilters
  Scenario: User Open Past Reports Page and Filter By All Filters
    And User click more filters in Past Reports Page
    And User filter by date "1" between "28" days in Past Reports Page
    And User click status in Past Reports Page
    And User select status in Past Reports Page
    And User click report type in Past Reports Page
    And User select report type in Past Reports Page
    And User type requestor in Past Reports Page
    When User click search button in Past Reports Page
    Then User see past report records on list in Past Reports Page

  @pastReportsSeeReportDetail
  Scenario: User Open Past Reports Page and See Report Detail
    And User filter by date "1" between "28" days in Past Reports Page
    When User click past reports detail in Past Reports Page
    Then User see detail information equals to past reports list information in Past Reports Page

  @pastReportsExport
  Scenario: User Open Past Reports Page and Export
    And User click a Past Report Export in Past Reports Page
    And User see success message in Past Reports Page
