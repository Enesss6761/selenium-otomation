@mainpage @dashboard
Feature: User can see dashboard Yemekpay BO

  Background:
    Given User opens Yemekpay BO Url
    And User see welcome button
    And User click welcome button
    And User logins from homepage
    And User verify otp code
    And User welcome to MainPage

  @dashboardPendingApprovals
  Scenario: Use to Dashboard Panel for Pending Approvals
    When User click pending approvals show all button on Dashboard
    Then User see pending approvals page

  @dashboardLastLoginAttemps
  Scenario: Use to Dashboard Panel for Last Login Attempts
    When User click last login attempts show all button on Dashboard
    Then User see last login attempts list