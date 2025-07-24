@reports @manualCorrections
Feature: User can see manual corrections in Yemekpay BO

  Background:
    Given User opens Yemekpay BO Url
    And User see welcome button
    And User click welcome button
    And User logins from homepage with Admin
    And User verify otp code
    And User welcome to MainPage with admin
    And User click reports left menu
    And User click manual corrections sub left menu
    And User see manual corrections Page

  @manualCorrectionsAllElementsAreDisplayed
  Scenario: User Open Manual Corrections Page and See All Elements are Displayed
    And User click more filters in Manual Corrections Page
    When User see all elements in Manual Corrections Page

  @manualCorrectionsAddCorrectionsAllElementsAreDisplayed
  Scenario: User Open Manual Corrections Page and Click Add Button See All Elements are Displayed
    And User click add in Manual Corrections Page
    When User see Add Manual Corrections
    Then User see all elements in Manual Corrections Add Page

  @manualCorrectionsReceiptAllElementsAreDisplayed
  Scenario: User Open Manual Corrections Page Receipt See All Elements are Displayed
    And User click receipt in Manual Corrections Page
    And User see all elements in Manual Corrections Popup

  @addNewManualCorrections @accountingDemo
  Scenario: User Open Manual Corrections Page and Add New Manual Corrections
    And User click add new manual correction in Manual Corrections Page
    And User click new manual correction merchant filter in Manual Corrections Page
    And User type new manual correction merchant name to search field in Manual Corrections Page
    And User click new manual correction merchant name search in Manual Corrections Page
    And User click new manual correction merchant name selection in Manual Corrections Page
    And User click new manual correction transaction type list in Manual Corrections Page
    And User select new manual correction transaction type in Manual Corrections Page
    And User type new manual correction gross amount in Manual Corrections Page
    And User click new manual correction currency list in Manual Corrections Page
    And User select new manual correction currency in Manual Corrections Page
    And User type new manual correction description in Manual Corrections Page
    And User click new manual correction save in Manual Corrections Page
    And User click new manual corrections popup close in Manual Corrections Page
    And User see success message in Manual Corrections Page
    And User click pending jobs left menu
    And User click pending approvals sub left menu
    And User click approvals view in Pending Approvals Page
    And User see approvals detail in Pending Approvals Page
    And User see manual correction approval in Pending Approvals Page
    And User click approve manual correction in Pending Approvals Page
    And User type "Test Automation MANUAL_INCOMING_TRANSFER" Description on Pending Approvals Page
    And User click Save button on Pending Approvals Page
    And User see "Talebiniz uzman sisteme iletilmiştir. Talebinizin sonucunu Arşiv menüsünde İşlem Durumu altından takip edebilirsiniz" information text on Pending Approvals Page
    And User click Archive button on Pending Approvals Page
    And User see filtered "Onaylandı" on Pending Approvals Archive data table
    And User see filtered "Başarılı" on Pending Approvals Archive data table
    And User click manual corrections sub left menu
    Then User see transactions records on list in Manual Corrections Page

  @manualCorrectionsFilterByAllFilters @accountingDemo
  Scenario: User Open Manual Corrections Page and Filter By All Filters
    And User click more filters in Manual Corrections Page
    And User filter by date "1" between "12" days in Manual Corrections Page
    And User click status in Manual Corrections Page
    And User select status in Manual Corrections Page
    And User click Merchant Filter in Manual Corrections Page
    And User type merchant name to search field in Manual Corrections Page
    And User click merchant name search in Manual Corrections Page
    And User click merchant name selection in Manual Corrections Page
    And User click report type in Manual Corrections Page
    And User select report type in Manual Corrections Page
    When User click search button in Manual Corrections Page
    Then User see transactions records on list in Manual Corrections Page












    