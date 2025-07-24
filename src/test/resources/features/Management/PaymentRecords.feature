@payment @paymentRecords
Feature: User can see payment records in Yemekpay BO

  Background:
    Given User opens Yemekpay BO Url
    And User see welcome button
    And User click welcome button
    And User logins from homepage
    And User verify otp code
    And User welcome to MainPage
    And User click management left menu
    And User click Payment Records sub left menu
    And User see Payment Records Page

  @paymentRecordsAllElementsAreDisplayed
  Scenario: User Open Payment Records Page and See All Elements are Displayed
    When User click more filters on Payment Records Page
    And User see all elements on Payment Records Page

  @paymentRecordsFilterByOrderNumber
  Scenario: User Filter By Order Number On Payment Records Page
    When User click more filters on Payment Records Page
    And User filters by order number on Payment Records Page
    And User click search button on Payment Records Page
    Then User see filtered "Order Number" on data table Payment Records Page

  @paymentRecordsFilterByPlatformOrderNumber
  Scenario: User Filter By Platform Order Number On Payment Records Page
    When User click more filters on Payment Records Page
    And User filter by platform order number on Payment Records Page
    And User click search button on Payment Records Page
    Then User see filtered "Platform Order Number" on data table Payment Records Page

  @paymentRecordsFilterByPaymentStatus
  Scenario: User Filter By Payment Status On Payment Records Page
    When User click more filters on Payment Records Page
    And User filter by payment status "CANCEL" on Payment Records Page
    And User click search button on Payment Records Page
    Then User see filtered "İptal" on data table Payment Records Page

  @paymentRecordsFilterByMerchantName
  Scenario: User Filter By Merchant Name On Payment Records Page
    When User click more filters on Payment Records Page
    And User filter by merchant name "BANABI" on Payment Records Page
    And User click search button on Payment Records Page
    Then User see filtered "Banabi" on data table Payment Records Page

  @paymentRecordsFilterBy3DInfo
  Scenario: User Filter By ThreeD Info On Payment Records Page
    When User click more filters on Payment Records Page
    And User filter by threeD info "NO" on Payment Records Page
    And User click search button on Payment Records Page
    Then User see filtered "Hayır" on data table Payment Records Page

  @paymentRecordsCheckPaymentDetails @paymentDemo
  Scenario: User Check Payment Details On Payment Records Page
    When User click more filters on Payment Records Page
    And User filter by payment status "CANCEL" on Payment Records Page
    And User click search button on Payment Records Page
    Then User check "İptal" is value of "Ödeme Durumu" on payment details

  @paymentRecordsFilterByDate @paymentDemo
  Scenario: User Filter By Date On Payment Records Page
    When User click more filters on Payment Records Page
    And User filter by date "9" between "10" days on Payment Records Page
    And User click search button on Payment Records Page
    Then User check "2025-04-09" date on data table Payment Records Page

  @paymentRecordsExportToExcel
  Scenario: User Export To Excel On Payment Records Page
    When User click more filters on Payment Records Page
    And User filter by platform order number on Payment Records Page
    And User click search button on Payment Records Page
    And User click Export to Excel on Payment Records Page

  @paymentRecordsManualRefund
  Scenario: User Manual Refund On Payment Records Page
    When I send the payment request
    And User click more filters on Payment Records Page
    And User filters by internal order number on Payment Records Page
    And User click search button on Payment Records Page
    And User click manuel refund on Payment Records Page
    And User fill manuel refund "Fazla Çekim" reason and "12,21" amount on Payment Records Page
    Then User see "İşlem başarılı şekilde kaydedildi ve onaylanması için sıraya alındı." information on Payment Records Page
    And User click mainpage profile icon
    And User click mainpage logout button
    And User click mainpage logout confirm button
    And User click welcome button
    And User logins from homepage with Admin
    And User verify otp code
    And User welcome to MainPage with admin
    And User click pending jobs left menu
    And User click pending approvals sub left menu
    And User click Approve on Pending Approvals Page
    And User type "OK" Description on Pending Approvals Page
    And User click Save button on Pending Approvals Page
    Then User see "Talebiniz uzman sisteme iletilmiştir. Talebinizin sonucunu Arşiv menüsünde İşlem Durumu altından takip edebilirsiniz" information text on Pending Approvals Page
    And User click management left menu
    And User click Payment Records sub left menu
    And User click more filters on Payment Records Page
    And User filters by internal order number on Payment Records Page
    And User click search button on Payment Records Page
    Then User see filtered "İade" on data table Payment Records Page

  @paymentRecordsFilterByInternalOrderNumber
  Scenario: User Auth Then Filter By Internal Order Number On Payment Records Page
    When I send the payment request
    And User click more filters on Payment Records Page
    And User filters by internal order number on Payment Records Page
    And User click search button on Payment Records Page
    Then User see filtered "Order Number" on data table Payment Records Page






