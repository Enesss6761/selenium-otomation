@chargeback @chargebackAdd @chargebackList
Feature: User can see Chargeback in Yemekpay BO

  Background:
    Given User opens Yemekpay BO Url
    And User see welcome button
    And User click welcome button
    And User logins from homepage
    And User verify otp code
    And User welcome to MainPage
    And User click chargeback left menu
    And User click Chargeback List sub left menu
    And User see chargeback list Page

  @chargebackListAllElementsAreDisplayed
  Scenario: User Open Chargeback List Page and See All Elements are Displayed
    When User click more filters in Chargeback List Page
    Then User see all elements in Chargeback List Page

  @chargebackListAddChargeback
  Scenario: User Open Chargeback List Page and Click Add Button See All Elements are Displayed
    And User click add in Chargeback List Page
    When User see Add Chargeback List
    Then User see all elements in Chargeback List Add Page

  @chargebackListAddChargeback12
  Scenario: User Add New Chargeback
    When I send the payment request
    And User click add in Chargeback List Page
    And User fill Order No on New Chargeback
    And User fill DateTime on New Chargeback
    And User fill Amount on New Chargeback
    And User choose Chargeback Reason "OTHERS" on New Chargeback
    And User type Description on New Chargeback
    And User click Save Button on New Chargeback
    And User see "Harcama İtirazı Oluşturuldu" information on Chargeback List Page
    And User click mainpage profile icon
    And User click mainpage logout button
    And User click mainpage logout confirm button
    And User click welcome button
    And User logins from homepage with Admin
    And User verify otp code
    And User welcome to MainPage with admin
    And User click chargeback left menu
    And User click list of pending approval sub left menu
    And User click Approve on Pending Approvals List Page
    And User type "OK" Description on Pending Approvals List Page
    And User click Save button on Pending Approvals List Page
    And User click management left menu
    And User click Payment Records sub left menu
    And User click more filters on Payment Records Page
    And User filters by internal order number on Payment Records Page
    And User click search button on Payment Records Page
    Then User see filtered "Ters İbraz" on data table Payment Records Page




