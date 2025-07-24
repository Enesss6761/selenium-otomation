@reports @eMoneyProtectedBalanceReport
Feature: User can see emoney protected balance report in Yemekpay BO

  Background:
    Given User opens Yemekpay BO Url
    And User see welcome button
    And User click welcome button
    And User logins from homepage with Admin
    And User verify otp code
    And User welcome to MainPage with admin
    And User click reports left menu
    And User click emoney protected balance report sub left menu
    And User see emoney protected balance report Page

  @eMoneyProtectedBalanceReportAllElementsAreDisplayed
  Scenario: User Open EMoney Protected Balance Report Page and See All Elements are Displayed
    When User see all elements in EMoney Protected Balance Report Page

  @eMoneyProtectedBalanceReportFilterByMerchantName
  Scenario: User Open EMoney Protected Balance Report Page and Filter By Merchant Name
    And User click Merchant Filter in EMoney Protected Balance Report Page
    And User type merchant name to search field in EMoney Protected Balance Report Page
    And User click merchant name search in EMoney Protected Balance Report Page
    And User click merchant name selection in EMoney Protected Balance Report Page
    When User click search button on EMoney Protected Amount Balance Report
    Then User see merchant name on list in EMoney Protected Balance Report Page

  @eMoneyProtectedBalanceReportExportToHistory
  Scenario: User Open EMoney Protected Balance Report Page and Export To History
    And User click EMoney Protected Balance Report Export
    And User see success message on EMoney Protected Balance Report Page
    And User click EMoney Protected Balance Report Export History
    When User see EMoney Protected Balance Report in Report History
