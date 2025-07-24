@reports @merchantPayouts
Feature: User can see merchant payouts in Yemekpay BO

  Background:
    Given User opens Yemekpay BO Url
    And User see welcome button
    And User click welcome button
    And User logins from homepage with Admin
    And User verify otp code
    And User welcome to MainPage with admin
    And User click reports left menu
    And User click merchant payouts sub left menu
    And User see merchant payouts Page

  @merchantPayoutsAllElementsAreDisplayed
  Scenario: User Open Merchant Payouts Page and See All Elements are Displayed
    When User click more filters in Merchant Payouts Page
    Then User see all elements in Merchant Payouts Page

  @merchantPayoutsAddPayoutAllElementsAreDisplayed
  Scenario: User Open Merchant Payouts Page and Click Add Button See All Elements are Displayed
    And User click add in Merchant Payouts Page
    When User see Add Payouts Page
    Then User see all elements in Payout Add Page

  @merchantPayoutsReceiptAllElementsAreDisplayed
  Scenario: User Open Merchant Payouts Page Receipt See All Elements are Displayed
    And User click receipt in Merchant Payouts Page
    And User see all elements in Payout Receipt Popup

  @addNewMerchantPayouts @accountingDemo
  Scenario: User Open Merchant Payouts Page and Add New Merchant Payouts
    And User click add new merchant payouts in Merchant Payouts Page
    And User click new merchant payouts merchant filter in Merchant Payouts Page
    And User type new merchant payouts merchant name to search field in Merchant Payouts Page
    And User click new merchant payouts merchant name search in Merchant Payouts Page
    And User click new merchant payouts merchant name selection in Merchant Payouts Page
    And User type new payouts gross amount in Merchant Payouts Page
    And User type new payouts net amount in Merchant Payouts Page
    And User type new merchant commission amount amount in Merchant Payouts Page
    And User click new payouts currency list in Merchant Payouts Page
    And User select new payouts currency in Merchant Payouts Page
    And User click new payouts save in Merchant Payouts Page
    And User see success message in Merchant Payouts Page
    And User click pending jobs left menu
    And User click pending approvals sub left menu
    And User click approvals view in Pending Approvals Page
    And User see approvals detail in Pending Approvals Page
    And User see merchant payouts approval in Pending Approvals Page
    And User click approve merchant payouts in Pending Approvals Page
    And User type "Test Automation Merchant Payouts" Description on Pending Approvals Page
    And User click Save button on Pending Approvals Page
    And User see "Talebiniz uzman sisteme iletilmiştir. Talebinizin sonucunu Arşiv menüsünde İşlem Durumu altından takip edebilirsiniz" information text on Pending Approvals Page
    And User click Archive button on Pending Approvals Page
    And User see filtered "Onaylandı" on Pending Approvals Archive data table
    And User see filtered "Başarılı" on Pending Approvals Archive data table
    And User click merchant payouts sub left menu
    Then User see transactions records on list in Merchant Payouts Page

  @merchantPayoutsFilterByAllFilters @accountingDemo
  Scenario: User Open Merchant Payouts Page and Filter By All Filters
    And User click more filters in Merchant Payouts Page
    And User filter by date "1" between "28" days in Merchant Payouts Page
    And User click status in Merchant Payouts Page
    And User select status in Merchant Payouts Page
    And User click Merchant Filter in Merchant Payouts Page
    And User type merchant name to search field in Merchant Payouts Page
    And User click merchant name search in Merchant Payouts Page
    And User click merchant name selection in Merchant Payouts Page
    When User click search button in Merchant Payouts Page
    Then User see transactions records on list in Merchant Payouts Page

