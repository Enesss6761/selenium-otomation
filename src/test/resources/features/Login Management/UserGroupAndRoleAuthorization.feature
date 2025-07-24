@userGroupAndRoleAuthorization @loginManagement
Feature: User can see user group and role authorization in Yemekpay BO

  Background:
    Given User opens Yemekpay BO Url
    And User see welcome button
    And User click welcome button
    And User logins from homepage
    And User verify otp code
    And User welcome to MainPage
    And User click login management left menu
    And User click user group and role authorization sub left menu
    And User see User Group And Role Authorization Page

  @userGroupAndRoleAuthorizationAllElementsAreDisplayed
  Scenario: User Open User Group And Role Authorization Page and See All Elements are Displayed
    When User see all elements in User Group And Role Authorization Page