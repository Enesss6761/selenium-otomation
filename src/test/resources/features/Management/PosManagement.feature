@payment @posManagement
Feature: User can see pos management in Yemekpay BO

  Background:
    Given User opens Yemekpay BO Url
    And User see welcome button
    And User click welcome button
    And User logins from homepage
    And User verify otp code
    And User welcome to MainPage
    And User click management left menu
    And User click Pos Management sub left menu
    And User see Pos Management Page

  @posManagementAllElementsAreDisplayed
  Scenario: User Open Pos Management Page and See All Elements are Displayed
    When User click more filters on Pos Management Page
    Then User see all elements on Pos Management Page

  @posManagementAddAllElementsAreDisplayed
  Scenario: User Open Pos Management Page and Click Create Button See All Elements are Displayed
    And User click add on Pos Management Page
    And User see Add Pos Page
    And User see all elements General Information in Pos Create Page
    And User click Next Button on General Information Page
    And User see all elements Commission Settings in Pos Create Page
    And User click Back Button on Commission Settings Page
    And User click Next Button on General Information Page
    And User click Next Button on Commission Settings Page
    And User see all elements Pos Credentials in Pos Create Page
    When User click Back Button in Pos Credentials
    Then User see Pos Commission Page

  @posManagementCreatePos @paymentDemo
  Scenario: User Create New Pos
    When User click add on Pos Management Page
    And User fill with Pos Name Value Date and Bin Number text fields on General Informations Page
    And User select with "YapiKredi" Pos Bank and "Axess" Card Program and "Pasif" Status on General Informations Page
    And User click Next Button on General Information Page
    And User fill with "0.012" Onus CC "0.013" Not Onus CC and "0.014" Onus Debit "0.015" Not Onus Debit commision rate on Commission Settings Page
    And User click Next Button on Commission Settings Page
    And User type "test" Parameter Name and "1234321" Parameter Value on Pos Credentials Page
    And User click Save button on Add Pos Page
    Then User see "İşlem başarılı şekilde kaydedildi ve onaylanması için sıraya alındı." information on Pos Management Page
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

  @posManagementUpdatePos
  Scenario: User Update Pos
    When User click edit button on Pos Management Page
    And User update with Pos Name and Value Date fields on General Informations Page
    And User click Next Button on General Information Page
    And User click Next Button on Commission Settings Page
    And User click Save button on Update Pos Page
    Then User see "İşlem başarılı şekilde kaydedildi ve onaylanması için sıraya alındı." information on Pos Management Page
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

  @posManagementFilterByPosName
  Scenario: User Filter By Pos Name On Pos Management Page
    When User click more filters on Pos Management Page
    And User filter by "testregres" Pos Name on Pos Management Page
    And User click search button on Pos Management Page
    Then User check "testregres" on data table Pos Management Page

  @posManagementFilterByPosBank @paymentDemo
  Scenario: User Filter By Pos Bank On Pos Management Page
    When User click more filters on Pos Management Page
    And User filter by "Akbank" Pos Bank on Pos Management Page
    And User click search button on Pos Management Page
    Then User see filtered "Akbank" on data table Pos Management Page

  @posManagementUpdatePosDefaultByPosSwitchButton
  Scenario: User Update Pos Default By Pos Switch Button On Pos Management Page
    When User click more filters on Pos Management Page
    And User filter by "testregres" Pos Name on Pos Management Page
    And User click search button on Pos Management Page
    And User click pos status switch on Pos Management Page
    Then User see "Varsayılan POS başarıyla güncellendi" information on Pos Management Page

  @posManagementUpdatePosStatusByPosSwitchButton @paymentDemo
  Scenario: User Update Pos Status By Pos Switch Button On Pos Management Page
    When User click more filters on Pos Management Page
    And User filter by "testregres" Pos Name on Pos Management Page
    And User click search button on Pos Management Page
    And User click pos default switch on Pos Management Page
    Then User see "POS durumu başarıyla güncellendi" information on Pos Management Page



