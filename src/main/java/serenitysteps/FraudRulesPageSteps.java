package serenitysteps;

import net.thucydides.core.annotations.Step;
import pages.FraudRulesPage;

public class FraudRulesPageSteps {
    FraudRulesPage fraudpage;

    @Step("User click fraud rules sub left menu")
    public void userClickFraudRulesSubLeftMenu() {
        fraudpage.leftSubMenuFraudRulesSubmit();
    }

    @Step("User see fraud rules Page")
    public void userSeeFraudRulesPage() throws Exception {
        fraudpage.fraudRulesPagePageControlUrl();
    }

    @Step("User click more filters in Fraud Rules Page")
    public void userClickMoreFiltersInFraudRulesPage() {
        fraudpage.leftSubMenuFraudRulesMoreFiltersSubmit();
    }

    @Step("User see all elements in Fraud Rules Page")
    public void userSeeAllElementsInFraudRulesPage() {
        fraudpage.fraudRulesPageAllElementsAreDisplayed();
    }

    @Step("User click Add in Fraud Rules Page")
    public void userClickAddInFraudRulesPage() {
        fraudpage.fraudRulesPageAddFraudSubmit();
    }

    @Step("User see Add Rules Page")
    public void userSeeAddRulesPage() throws Exception {
        fraudpage.fraudRulesPageAddRuleControlUrl();
    }

    @Step("User see all elements in Fraud Rules Add Page")
    public void userSeeAllElementsInFraudRulesAddPage() {
        fraudpage.fraudRulesPageAddRuleAllElementsAreDisplayed();
    }

    @Step("User click Add Condition in Add Fraud Page")
    public void userClickAddConditionInAddFraudPage() {
        fraudpage.fraudRulesPageAddConditionSubmit();
    }

    @Step("User see Add Condition Page")
    public void userSeeAddConditionPage() {
        fraudpage.fraudRulesPageAddConditionPageControlPopUp();
    }

    @Step("User see all elements Payment Method in Add Condition Page")
    public void userSeeAllElementsPaymentMethodInAddConditionPage() {
        fraudpage.fraudRulesAddConditionPaymentMethodAllElementsAreDisplayed();
    }

    @Step("User click Transaction Type")
    public void userClickTransactionType() {
        fraudpage.fraudRulesPageAddConditionTransactionTypeSubmit();
    }

    @Step("User see all elements Transaction Type in Add Condition Page")
    public void userSeeAllElementsTransactionTypeInAddConditionPage() {
        fraudpage.fraudRulesAddConditionTransactionTypeAllElementsAreDisplayed();
    }

    @Step("User click Card Type")
    public void userClickCardType() {
        fraudpage.fraudRulesPageAddConditionCardTypeSubmit();
    }

    @Step("User see all elements Card Type in Add Condition Page")
    public void userSeeAllElementsCardTypeInAddConditionPage() {
        fraudpage.fraudRulesAddConditionCardTypeAllElementsAreDisplayed();
    }

    @Step("User click Amount")
    public void userClickAmount() {
        fraudpage.fraudRulesPageAddConditionAmountSubmit();
    }

    @Step("User see all elements Amount in Add Condition Page")
    public void userSeeAllElementsAmountInAddConditionPage() {
        fraudpage.fraudRulesAddConditionAmountAllElementsAreDisplayed();
    }

    @Step("User click Transaction Status")
    public void userClickTransactionStatus() {
        fraudpage.fraudRulesPageAddConditionTransactionStatusSubmit();
    }

    @Step("User see all elements Transaction Status in Add Condition Page")
    public void userSeeAllElementsTransactionStatusInAddConditionPage() {
        fraudpage.fraudRulesAddConditionTransactionStatusAllElementsAreDisplayed();
    }

    @Step("User click Foreign Cards")
    public void userClickForeignCards() {
        fraudpage.fraudRulesPageAddConditionForeignCardsSubmit();
    }

    @Step("User see all elements Foreign Cards in Add Condition Page")
    public void userSeeAllElementsForeignCardsInAddConditionPage() {
        fraudpage.fraudRulesAddConditionForeignCardsAllElementsAreDisplayed();
    }

    @Step("User click BIN")
    public void userClickBIN() {
        fraudpage.fraudRulesPageAddConditionBinSubmit();
    }

    @Step("User see all elements BIN in Add Condition Page")
    public void userSeeAllElementsBinInAddConditionPage() {
        fraudpage.fraudRulesAddConditionBinAllElementsAreDisplayed();
    }

    @Step("User click Error Codes")
    public void userClickErrorCodes() {
        fraudpage.fraudRulesPageAddConditionErrorCodesSubmit();
    }

    @Step("User see all elements Error Codes in Add Condition Page")
    public void userSeeAllElementsErrorCodesInAddConditionPage() {
        fraudpage.fraudRulesAddConditionErrorCodesAllElementsAreDisplayed();
    }

    @Step("User click Minimum Event")
    public void userClickMinimumEvent() {
        fraudpage.fraudRulesPageAddConditionMinimumEventSubmit();
    }

    @Step("User see all elements Minimum Event in Add Condition Page")
    public void userSeeAllElementsMinimumEventInAddConditionPage() {
        fraudpage.fraudRulesAddConditionMinimumEventAllElementsAreDisplayed();
    }

    @Step("User click Transaction Period")
    public void userClickTransactionPeriod() {
        fraudpage.fraudRulesPageAddConditionTransactionPeriodSubmit();
    }

    @Step("User see all elements Transaction Period in Add Condition Page")
    public void userSeeAllElementsTransactionPeriodInAddConditionPage() {
        fraudpage.fraudRulesAddConditionTransactionPeriodAllElementsAreDisplayed();
    }

    @Step("User click Time Limit")
    public void userClickTimeLimit() {
        fraudpage.fraudRulesPageAddConditionTimeLimitSubmit();
    }

    @Step("User see all elements Time Limit in Add Condition Page")
    public void userSeeAllElementsTimeLimitInAddConditionPage() {
        fraudpage.fraudRulesAddConditionTimeLimitAllElementsAreDisplayed();
    }

    @Step("User type Rule Name on Add Page")
    public void userTypeRuleNameOnAddPage() {
        fraudpage.fraudRulesPageAddTypeRuleName();
    }

    @Step("User type Rule Description")
    public void userTypeRuleDescription() {
        fraudpage.fraudRulesPageAddTypeRuleDescription();
    }

    @Step("User type Rule Score")
    public void userTypeRuleScore() {
        fraudpage.fraudRulesPageAddTypeRuleScore();
    }

    @Step("User select Rule Category")
    public void userSelectRuleCategory(String category) {
        fraudpage.fraudRulesPageAddCategoryDropDown(category);
    }

    @Step("User select Active Notify")
    public void userSelectActiveNotify() {
        fraudpage.fraudRulesPageAddSelectActiveNotify();
    }

    @Step("User type Amount")
    public void userTypeAmount(String amount) {
        fraudpage.fraudRulesPageAddTypeAmount(amount);
    }

    @Step("User type Minimum Event")
    public void userTypeMinimumEvent(String event) {
        fraudpage.fraudRulesPageAddTypeMinimumEvent(event);
    }

    @Step("User select Start Hour and End Hour")
    public void userSelectStartAndEndHours(String startHour, String endHour) {
        fraudpage.fraudRulesPageAddSelectStartAndEndHoursDropDown(startHour,endHour);
    }

    @Step("User select Time and Value")
    public void userSelectTimeAndValue(String time, String value) {
        fraudpage.fraudRulesPageAddSelectTimeLimit(time,value);
    }

    @Step("User click Save Button")
    public void userClickSaveButton() {
        fraudpage.fraudRulesPageAddSaveButtonClick();
    }

    @Step("User type Rule Name")
    public void userTypeRuleName(String ruleName) {
        fraudpage.fraudRulesPageTypeRuleName(ruleName);
    }

    @Step("User click Search Button")
    public void userClickSearchbutton() {
        fraudpage.fraudRulesPageSearchButtonClick();
    }

    @Step("User click Rule Type Dropdown")
    public void userClickRuleTypeDropdown() {
        fraudpage.fraudRulesPageRuleTypeDropdownClick();
    }

    @Step("User click Rule Type")
    public void userClickRuleType(String ruleType) {
        fraudpage.fraudRulePageRuleTypeClick(ruleType);
    }

    @Step("User see filtered on data table")
    public void userSeeFilteredOnDataTable(String valueOnTable) {
        fraudpage.checkDataTable(valueOnTable);
    }

    @Step("User click Edit Button")
    public void userClickEditButton() {
        fraudpage.fraudRulesPageEditButtonClick();
    }

    @Step("User check rule name on data table")
    public void userCheckRuleNameOnTable(String RuleName) {
        fraudpage.fraudRulesCheckFraudNameOnTable(RuleName);
    }

    @Step("User click export to excel on Fraud Rules Page")
    public void userClickExportToExcel() {
        fraudpage.fraudRulesPageExportToExcelClick();
    }

    @Step("User see information text")
    public void userSeeInformation(String info) {
        fraudpage.fraudRulesPageInformationText(info);
    }
}
