@payment @paymentTransactions
Feature: User can see transactions in Yemekpay BO

  Background:
    Given User opens Yemekpay BO Url
    And User see welcome button
    And User click welcome button
    And User logins from homepage
    And User verify otp code
    And User welcome to MainPage
    And User click management left menu
    And User click Transactions sub left menu
    And User see Transactions Page

  @paymentTransactionsAllElementsAreDisplayed
  Scenario: User Open Payment Transactions Page and See All Elements are Displayed
    When User click more filters on Payment Transactions Page
    And User see all elements on Payment Transactions Page

  @paymentTransactionsFilterByOrderNumber
  Scenario: User Filter By Order Number On Payment Transactions Page
    When User click more filters on Payment Transactions Page
    And User filters by order number on Payment Transactions Page
    And User click search button on Payment Transactions Page
    Then User see filtered "Order Number" on data table Payment Transactions Page

  @paymentTransactionsFilterByPlatformOrderNumber
  Scenario: User Filter By Platform Order Number On Payment Transactions Page
    When User click more filters on Payment Transactions Page
    And User filters by platform order number on Payment Transactions Page
    And User click search button on Payment Transactions Page
    Then User see filtered "Platform Order Number" on data table Payment Transactions Page

  @paymentTransactionsFilterByTransactionType
  Scenario: User Filter By Transaction Type On Payment Transactions Page
    When User click more filters on Payment Transactions Page
    And User filter by transaction type "REFUND" on Payment Transactions Page
    And User click search button on Payment Transactions Page
    Then User see filtered "İade" on data table Payment Transactions Page

  @paymentTransactionsFilterByTransactionStatus
  Scenario: User Filter By Transaction Status On Payment Transactions Page
    When User click more filters on Payment Transactions Page
    And User filter by transaction status "SUCCESS" on Payment Transactions Page
    And User click search button on Payment Transactions Page
    Then User see filtered "Başarılı" on data table Payment Transactions Page

  @paymentTransactionsCheckTransactionDetails @paymentDemo
  Scenario: User Check Transaction Details On Payment Transactions Page
    When User click more filters on Payment Transactions Page
    And User filter by transaction type "REFUND" on Payment Transactions Page
    And User click search button on Payment Transactions Page
    Then User check "İade" is value of "İşlem Tipi" on transaction details

  @paymentTransactionsFilterByDate
  Scenario: User Filter By Date On Payment Transactions Page
    When User click more filters on Payment Transactions Page
    And User filter by date "4" between "5" days on Payment Transactions Page
    And User click search button on Payment Transactions Page
    Then User check "2025-03-04" date on data table Payment Transactions Page

  @paymentTransactionsExportToExcel @paymentDemo
  Scenario: User Export To Excel On Payment Transactions Page
    When User click more filters on Payment Transactions Page
    And User filter by transaction type "REFUND" on Payment Transactions Page
    And User click search button on Payment Transactions Page
    And User click Export to Excel on Payment Transactions Page
