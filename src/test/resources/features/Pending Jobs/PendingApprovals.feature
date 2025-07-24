@pendingJobs @pendingApprovals
Feature: User can see pending approvals in Yemekpay BO

  Background:
    Given User opens Yemekpay BO Url
    And User see welcome button
    And User click welcome button
    And User logins from homepage
    And User verify otp code
    And User welcome to MainPage
    And User click pending jobs left menu
    And User click pending approvals sub left menu
    And User see pending approvals Page

  @pendingApprovalsAllElementsAreDisplayed
  Scenario: User Open Pending Approvals Page and See All Elements are Displayed
    When User see all elements in Pending Approvals Page

  @pendingApprovalsFilterByApproveStatus
  Scenario: User Filter By Approve Status on Open Pending Approvals Archive
    And User click Archive button on Pending Approvals Page
    And User filter by Approve Status "APPROVED" on Pending Approvals Archive
    And User see filtered "Onaylandı" on Pending Approvals Archive data table

  @pendingApprovalsFilterByTransactionStatus
  Scenario: User Filter By Transaction Status on Open Pending Approvals Archive
    And User click Archive button on Pending Approvals Page
    And User filter by Transaction Status "SUCCESS" on Pending Approvals Archive
    And User see filtered "Başarılı" on Pending Approvals Archive data table






