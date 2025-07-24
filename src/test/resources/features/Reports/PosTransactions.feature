@reports @posTransactions
Feature: User can see pos transactions in Yemekpay BO

  Background:
    Given User opens Yemekpay BO Url
    And User see welcome button
    And User click welcome button
    And User logins from homepage
    And User verify otp code
    And User welcome to MainPage
    And User click reports left menu
    And User click pos transactions sub left menu
    And User see pos transactions Page

  @posTransactionsAllElementsAreDisplayed
  Scenario: User Open Pos Transactions Page and See All Elements are Displayed
    When User click more filters in Pos Transactions Page
    Then User see all elements in Pos Transactions Page

  @posTransactionsReportFilterByMerchantNameBankNamePosName
  Scenario: User Open Pos Transactions Report Page and Filter By Merchant Name
    And User click more filters in Pos Transactions Page
    And User filter by date "1" between "28" days in Pos Transactions Report Page
    And User click Bank PF Filter in Pos Transactions Report Page
    And User type bank name to search field in Pos Transactions Report Page
    And User click bank name to search field in Pos Transactions Report Page
    And User click bank name selection in Pos Transactions Report Page
    And User click Pos Filter in Pos Transactions Report Page
    And User type Pos to search field in Pos Transactions Report Page
    And User click Pos to search field in Pos Transactions Report Page
    And User click Pos selection in Pos Transactions Report Page
    And User click Merchant Filter in Pos Transactions Report Page
    And User type merchant name to search field in Pos Transactions Report Page
    And User click merchant name search in Pos Transactions Report Page
    And User click merchant name selection in Pos Transactions Report Page
    When User click search button on Pos Transactions Report
    Then User see merchant name on list in Pos Transactions Report Page

  @posTransactionsReportExportToHistory
  Scenario: User Open Pos Transactions Report Page and Export To History
    And User filter by date "1" between "28" days in Pos Transactions Report Page
    And User click search button on Pos Transactions Report
    And User click Pos Transactions Report Export
    And User see success message on Pos Transactions Report Page
    And User click Pos Transactions Report Export History
    When User see Pos Transactions Report in Report History