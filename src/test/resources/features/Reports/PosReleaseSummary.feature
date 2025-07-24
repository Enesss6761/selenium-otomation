@reports @posReleaseSummary
Feature: User can see pos release summary in Yemekpay BO

  Background:
    Given User opens Yemekpay BO Url
    And User see welcome button
    And User click welcome button
    And User logins from homepage
    And User verify otp code
    And User welcome to MainPage
    And User click reports left menu
    And User click pos release summary sub left menu
    And User see pos release summary Report Page

  @posReleaseSummaryAllElementsAreDisplayed
  Scenario: User Open Pos Release Summary Report Page and See All Elements are Displayed
    When User click more filters in Pos Release Summary Report Page
    Then User see all elements in Pos Release Summary Report Page

  @posReleaseSummaryReportFilterByBankNamePosName @accountingDemo
  Scenario: User Open Pos Release Summary Page and Filter By Merchant Name
    And User click more filters in Pos Release Summary Report Page
    And User filter by date "1" between "28" days in Pos Release Summary Report Page
    And User click Bank PF Filter in Pos Release Summary Report Page
    And User type bank name to search field in Pos Release Summary Report Page
    And User click bank name to search field in Pos Release Summary Report Page
    And User click bank name selection in Pos Release Summary Report Page
    And User click Pos Filter in Pos Release Summary Report Page
    And User type Pos to search field in Pos Release Summary Report Page
    And User click Pos to search field in Pos Release Summary Report Page
    And User click Pos selection in Pos Release Summary Report Page
    When User click search button on Pos Release Summary Report Page
    Then User see merchant name on list in Pos Release Summary Report Page

  @posReleaseSummaryReportExportToHistory @accountingDemo
  Scenario: User Open Pos Release Summary Report Page and Export To History
    And User filter by date "1" between "28" days in Pos Release Summary Report Page
    And User click search button on Pos Release Summary Report Page
    And User click Pos Release Summary Report Page Export
    And User see success message on Pos Release Summary Report Page
    And User click Pos Release Summary Report Export History
    When User see Pos Release Summary Report in Report History