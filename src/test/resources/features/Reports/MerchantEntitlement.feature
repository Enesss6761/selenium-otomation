@reports @merchantEntitlement
Feature: User can see merchant entitlemement in Yemekpay BO

  Background:
    Given User opens Yemekpay BO Url
    And User see welcome button
    And User click welcome button
    And User logins from homepage
    And User verify otp code
    And User welcome to MainPage
    And User click reports left menu
    And User click merchant entitlemement sub left menu
    And User see merchant entitlemement Page

  @merchantEntitlementAllElementsAreDisplayed
  Scenario: User Open Merchant Entitlemement Page and See All Elements are Displayed
    When User see all elements in Merchant Entitlemement Page

  @merchantEntitlementReportFilterByMerchantName
  Scenario: User Open Merchant Entitlement Report Page and Filter By Merchant Name
    And User click Merchant Filter in Merchant Entitlement Report Page
    And User type merchant name to search field in Merchant Entitlement Report Page
    And User click merchant name search in Merchant Entitlement Report Page
    And User click merchant name selection in Merchant Entitlement Report Page
    When User click search button on Merchant Entitlement Report
    Then User see merchant name on list in Merchant Entitlement Report Page

  @merchantEntitlementReportExportToHistory
  Scenario: User Open Merchant Entitlement Report Page and Export To History
    And User click Merchant Entitlement Report Export
    And User see success message on Merchant Entitlement Report Page
    And User click Merchant Entitlement Report Export History
    When User see Merchant Entitlement Report in Report History