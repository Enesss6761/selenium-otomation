@fraud @fraudRules
Feature: User can see fraud page in Yemekpay BO

  Background:
    Given User opens Yemekpay BO Url
    And User see welcome button
    And User click welcome button
    And User logins from homepage
    And User verify otp code
    And User welcome to MainPage
    And User click fraud left menu
    And User click fraud rules sub left menu
    And User see fraud rules Page

  @fraudRulesAllElementsAreDisplayed
  Scenario: User Open Fraud Rules Page and See All Elements are Displayed
    When User click more filters in Fraud Rules Page
    Then User see all elements in Fraud Rules Page

  @fraudRulesAddRulePageAllElementsAreDisplayed
  Scenario: User Open Fraud Rules Add Rule Page and See All Elements are Displayed
    And User click Add on Fraud Rules Page
    When User see Add Rules Page
    Then User see all elements in Fraud Rules Add Page

  @fraudRulesAddRuleAddConditionPagePaymentMethodAllElementsAreDisplayed
  Scenario: User Open Fraud Rules Add Rule Add Condition Page Payment Method and See All Elements are Displayed
    And User click Add on Fraud Rules Page
    When User see Add Rules Page
    And User click Add Condition on Add Fraud Rule Page
    When User see Add Condition Page
    Then User see all elements Payment Method in Add Condition Page

  @fraudRulesAddRuleAddConditionPageTransactionTypeAllElementsAreDisplayed
  Scenario: User Open Fraud Rules Add Rule Add Condition Page Transaction Type and See All Elements are Displayed
    And User click Add on Fraud Rules Page
    When User see Add Rules Page
    And User click Add Condition on Add Fraud Rule Page
    And User click Transaction Type
    When User see Add Condition Page
    Then User see all elements Transaction Type in Add Condition Page

  @fraudRulesAddRuleAddConditionPageCardTypeAllElementsAreDisplayed
  Scenario: User Open Fraud Rules Add Rule Add Condition Page Card Type and See All Elements are Displayed
    And User click Add on Fraud Rules Page
    When User see Add Rules Page
    And User click Add Condition on Add Fraud Rule Page
    And User click Card Type
    When User see Add Condition Page
    Then User see all elements Card Type in Add Condition Page

  @fraudRulesAddRuleAddConditionPageAmountAllElementsAreDisplayed
  Scenario: User Open Fraud Rules Add Rule Add Condition Page Amount and See All Elements are Displayed
    And User click Add on Fraud Rules Page
    When User see Add Rules Page
    And User click Add Condition on Add Fraud Rule Page
    And User click Amount on Conditions Page
    When User see Add Condition Page
    Then User see all elements Amount in Add Condition Page

  @fraudRulesAddRuleAddConditionPageTransactionStatusAllElementsAreDisplayed
  Scenario: User Open Fraud Rules Add Rule Add Condition Page Transaction Status and See All Elements are Displayed
    And User click Add on Fraud Rules Page
    When User see Add Rules Page
    And User click Add Condition on Add Fraud Rule Page
    And User click Transaction Status
    When User see Add Condition Page
    Then User see all elements Transaction Status in Add Condition Page

  @fraudRulesAddRuleAddConditionPageForeignCardsAllElementsAreDisplayed
  Scenario: User Open Fraud Rules Add Rule Add Condition Page Foreign Cards and See All Elements are Displayed
    And User click Add on Fraud Rules Page
    When User see Add Rules Page
    And User click Add Condition on Add Fraud Rule Page
    And User click Foreign Cards
    When User see Add Condition Page
    Then User see all elements Foreign Cards in Add Condition Page

  @fraudRulesAddRuleAddConditionPageBINAllElementsAreDisplayed
  Scenario: User Open Fraud Rules Add Rule Add Condition Page BIN and See All Elements are Displayed
    And User click Add on Fraud Rules Page
    When User see Add Rules Page
    And User click Add Condition on Add Fraud Rule Page
    And User click BIN
    When User see Add Condition Page
    Then User see all elements BIN in Add Condition Page

  @fraudRulesAddRuleAddConditionPageErrorCodesAllElementsAreDisplayed
  Scenario: User Open Fraud Rules Add Rule Add Condition Page Error Codes and See All Elements are Displayed
    And User click Add on Fraud Rules Page
    When User see Add Rules Page
    And User click Add Condition on Add Fraud Rule Page
    And User click Error Codes
    When User see Add Condition Page
    Then User see all elements Error Codes in Add Condition Page

  @fraudRulesAddRuleAddConditionPageMinimumEventAllElementsAreDisplayed
  Scenario: User Open Fraud Rules Add Rule Add Condition Page Minimum Event and See All Elements are Displayed
    And User click Add on Fraud Rules Page
    When User see Add Rules Page
    And User click Add Condition on Add Fraud Rule Page
    And User click Minimum Event on Conditions Page
    When User see Add Condition Page
    Then User see all elements Minimum Event in Add Condition Page

  @fraudRulesAddRuleAddConditionPageTransactionPeriodAllElementsAreDisplayed
  Scenario: User Open Fraud Rules Add Rule Add Condition Page Transaction Period and See All Elements are Displayed
    And User click Add on Fraud Rules Page
    When User see Add Rules Page
    And User click Add Condition on Add Fraud Rule Page
    And User click Transaction Period on Conditions Page
    When User see Add Condition Page
    Then User see all elements Transaction Period in Add Condition Page

  @fraudRulesAddRuleAddConditionPageTimeLimitAllElementsAreDisplayed
  Scenario: User Open Fraud Rules Add Rule Add Condition Page Time Limit and See All Elements are Displayed
    And User click Add on Fraud Rules Page
    When User see Add Rules Page
    And User click Add Condition on Add Fraud Rule Page
    And User click Time Limit on Conditions Page
    When User see Add Condition Page
    Then User see all elements Time Limit in Add Condition Page

  @fraudRulesAddRule
  Scenario: User Create New Fraud Rule
    And User click Add on Fraud Rules Page
    And User fill with Rule Name and Description text fields on Add Fraud Rule Page
    And User select with "Offline Fraud" Rule Category on Add Fraud Rule Page
    And User click Add Condition on Add Fraud Rule Page
    And User click Amount on Conditions Page
    And User fill with "1900" Amount on Conditions Page
    And User click Add Condition on Add Fraud Rule Page
    And User click Minimum Event on Conditions Page
    And User fill with "2" Minimum Event on Conditions Page
    And User click Add Condition on Add Fraud Rule Page
    And User click Transaction Period on Conditions Page
    And User select with "09" Start Hour and "18" End Hour on Conditions Page
    And User click Add Condition on Add Fraud Rule Page
    And User click Time Limit on Conditions Page
    And User select with "Saat" Time and "3" Value on Conditions Page
    And User click Save button on Add Fraud Rule Page
    Then User see "İşlem başarılı şekilde kaydedildi ve onaylanması için sıraya alındı." information text on Fraud Rules Page
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

  @fraudRulesUpdateRule
  Scenario: User Update Fraud Rule
    And User click more filters on Fraud Rules Page
    When User filter by "Otomasyon" Rule Name on Fraud Rules Page
    And User click search button on Fraud Rules Page
    When User click edit button on Fraud Rules Page
    And User select active notify on Add Fraud Rule Page
    And User click Save button on Update Fraud Rule Page
    Then User see "İşlem başarılı şekilde kaydedildi ve onaylanması için sıraya alındı." information text on Fraud Rules Page
    Then User see "Kural güncellendi" information text on Fraud Rules Page
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

  @fraudRulesFilterByRuleName
  Scenario: User Filter By Rule Name On Fraud Rules Page
    And User click more filters on Fraud Rules Page
    When User filter by "Otomasyon" Rule Name on Fraud Rules Page
    And User click search button on Fraud Rules Page
    Then User see filtered "Otomasyon" Rule Name on data table Fraud Rules Page

  @fraudRulesFilterByRuleType
  Scenario: User Filter By Rule Type On Fraud Rules Page
    And User click more filters on Fraud Rules Page
    When User filter by "AML" Rule Type on Fraud Rules Page
    And User click search button on Fraud Rules Page
    Then User see filtered "AML" Rule Type on data table Fraud Rules Page

  @fraudRulesExportToExcel
  Scenario: User Export To Excel On Fraud Rules Page
    And User click more filters on Fraud Rules Page
    When User filter by "AML" Rule Type on Fraud Rules Page
    And User click search button on Fraud Rules Page
    And User click Export to Excel on Fraud Rules Page








