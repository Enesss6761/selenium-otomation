@fraud @fraudManagement
Feature: User can see fraud management in Yemekpay BO

  Background:
    Given User opens Yemekpay BO Url
    And User see welcome button
    And User click welcome button
    And User logins from homepage
    And User verify otp code
    And User welcome to MainPage
    And User click fraud left menu
    And User click fraud management sub left menu
    And User see fraud management Page

  @fraudManagementAllElementsAreDisplayed
  Scenario: User Open Fraud Management Page and See All Elements are Displayed
    When User click more filters on Fraud Management Page
    Then User see all elements on Fraud Management Page

  @fraudManagementFilterByScoreAndAmount
  Scenario: User Filter By Score and Amount On Fraud Management Page
    When User click more filters on Fraud Management Page
    And User filter by "100" Min Score "100" Max Score and "550" Min Amount "550" Max Amount on Fraud Management Page
    And User click search button on Fraud Management Page
    Then User see filtered "100" score on Fraud Management data table
    Then User see filtered "550" amount on Fraud Management data table

  @fraudManagementFilterByMerchantName
  Scenario: User Filter By Merchant Name On Fraud Management Page
    When User click more filters on Fraud Management Page
    And User filter by "YEMEKSEPETI" Merchant Name on Fraud Management Page
    And User click search button on Fraud Management Page
    Then User see filtered "Yemeksepeti" on Fraud Management data table

  @fraudManagementFilterByTransactionStatus
  Scenario: User Filter By Transaction Status On Fraud Management Page
    When User click more filters on Fraud Management Page
    And User filter by "BAŞARILI" Transaction Status on Fraud Management Page
    And User click search button on Fraud Management Page
    Then User see filtered "Başarılı" on Fraud Management data table

  @fraudManagementExportToExcel
  Scenario: User Export To Excel On Fraud Management Page
    When User click more filters on Fraud Management Page
    And User filter by "YEMEKSEPETI" Merchant Name on Fraud Management Page
    And User click search button on Fraud Management Page
    And User click Export to Excel on Fraud Management Page


