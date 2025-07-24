@loginAndLogout
Feature: User can login the Yemekpay BO App
  As a user I want to login to Yemekpay Backoffice

  Background:
    Given User opens Yemekpay BO Url
    And User see welcome button
    And User click welcome button
    And User logins from homepage

  @login
  Scenario: Login to Yemekpay
    And User verify otp code
    And User welcome to MainPage

  @resenOTP
  Scenario: Resend OTP
    When User click resend otp button
    Then User see otp timer

  @logout1
  Scenario: Logout to Yemekpay 1
    And User verify otp code
    And User click mainpage profile icon
    And User click mainpage logout button
    When User click mainpage logout confirm button
    Then User see welcome page

  @logout2
  Scenario: Logout to Yemekpay 2
    And User verify otp code
    And User click mainpage profile icon
    When User click profilpage button
    And User click profilpage logout button
    When User click profilpage logout confirm button
    Then User see welcome page
