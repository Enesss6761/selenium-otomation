@payment @bankManagement
Feature: User can see bank management in Yemekpay BO

  Background:
    Given User opens Yemekpay BO Url
    And User see welcome button
    And User click welcome button
    And User logins from homepage
    And User verify otp code
    And User welcome to MainPage
    And User click management left menu
    And User click Bank Management sub left menu
    And User see Bank Management Page

  @bankManagementAllElementsAreDisplayed
  Scenario: User Open Bank Management Page and See All Elements are Displayed
    When User click more filters on Bank Management Page
    Then User see all elements on Bank Management Page

  @bankManagementAddBank
  Scenario: User Open Bank Management Page and Click Add Button See All Elements are Displayed
    And User click add on Bank Management Page
    When User see Add Bank Page
    Then User see all elements on Bank Add Page

  @bankManagementAddBank @paymentDemo
  Scenario: User Add New Bank
    When User click add on Bank Management Page
    And User select with "ALTERNATİFBANK A.Ş." Bank Name and "Çift" Cancel Flow and "Pasif" Status on Add Bank Page
    And User fill with "ZiraatGateway" Service Provider field on Add Bank Page
    And User fill Bank Ica field on Add Bank Page
    And User click Save button on Add Bank Page
    Then User see "İşlem başarılı şekilde kaydedildi ve onaylanması için sıraya alındı." information text on Bank Management Page
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

  @bankManagementUpdateBank
  Scenario: User Update Bank
    When User click more filters on Bank Management Page
    And User filter by "ADABANK A.Ş." Bank Name on Bank Management Page
    And User click search button on Bank Management Page
    When User click edit button on Bank Management Page
    And User update Bank Ica field on Update Bank Page
    And User click Save button on Update Bank Page
    Then User see "İşlem başarılı şekilde kaydedildi ve onaylanması için sıraya alındı." information text on Bank Management Page
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

  @bankManagementFilterByBankName
  Scenario: User Filter By Bank Name On Bank Management Page
    When User click more filters on Bank Management Page
    And User filter by "ADABANK A.Ş." Bank Name on Bank Management Page
    And User click search button on Bank Management Page
    Then User check "ADABANK A.Ş." Bank Name on data table Bank Management Page

  @bankManagementFilterByServiceProvider @paymentDemo
  Scenario: User Filter By Service Provider On Bank Management Page
    When User click more filters on Bank Management Page
    And User fill with "ZiraatGateway" Service Provider field on Bank Management Page
    And User click search button on Bank Management Page
    Then User see filtered "ZiraatGateway" on data table Bank Management Page



