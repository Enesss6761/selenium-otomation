package cucumbersteps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import serenitysteps.FraudRulesPageSteps;

public class FraudRulesSteps {
    @Steps
    FraudRulesPageSteps fraudrulespagesteps;

    @And("User click fraud rules sub left menu")
    public void userClickFraudRulesSubLeftMenu() {
        fraudrulespagesteps.userClickFraudRulesSubLeftMenu();
    }

    @And("User see fraud rules Page")
    public void userSeeFraudRulesPage() throws Exception {
        fraudrulespagesteps.userSeeFraudRulesPage();
    }

    @And("User click more filters on Fraud Rules Page")
    public void userClickMoreFiltersOnFraudRulesPage() {
        fraudrulespagesteps.userClickMoreFiltersInFraudRulesPage();
    }

    @Then("User see all elements in Fraud Rules Page")
    public void userSeeAllElementsInFraudRulesPage() {
        fraudrulespagesteps.userSeeAllElementsInFraudRulesPage();
    }

    @And("User click Add on Fraud Rules Page")
    public void userClickAddOnFraudRulesPage() {
        fraudrulespagesteps.userClickAddInFraudRulesPage();
    }

    @When("User see Add Rules Page")
    public void userSeeAddRulesPage() throws Exception {
        fraudrulespagesteps.userSeeAddRulesPage();
    }

    @Then("User see all elements in Fraud Rules Add Page")
    public void userSeeAllElementsInFraudRulesAddPage() {
        fraudrulespagesteps.userSeeAllElementsInFraudRulesAddPage();
    }

    @And("User click Add Condition on Add Fraud Rule Page")
    public void userClickAddConditionOnAddFraudRulePage() {
        fraudrulespagesteps.userClickAddConditionInAddFraudPage();
    }

    @When("User see Add Condition Page")
    public void userSeeAddConditionRulesPage() {
        fraudrulespagesteps.userSeeAddConditionPage();
    }

    @Then("User see all elements Payment Method in Add Condition Page")
    public void userSeeAllElementsPaymentMethodInAddConditionPage() {
        fraudrulespagesteps.userSeeAllElementsPaymentMethodInAddConditionPage();
    }

    @And("User click Transaction Type")
    public void userClickTransactionType() {
        fraudrulespagesteps.userClickTransactionType();
    }

    @Then("User see all elements Transaction Type in Add Condition Page")
    public void userSeeAllElementsTransactionTypeInAddConditionPage() {
        fraudrulespagesteps.userSeeAllElementsTransactionTypeInAddConditionPage();
    }

    @And("User click Card Type")
    public void userClickCardType() {
        fraudrulespagesteps.userClickCardType();
    }

    @Then("User see all elements Card Type in Add Condition Page")
    public void userSeeAllElementsCardTypeInAddConditionPage() {
        fraudrulespagesteps.userSeeAllElementsCardTypeInAddConditionPage();
    }

    @And("User click Amount on Conditions Page")
    public void userClickAmountOnConditionsPage() {
        fraudrulespagesteps.userClickAmount();
    }

    @Then("User see all elements Amount in Add Condition Page")
    public void userSeeAllElementsAmountInAddConditionPage() {
        fraudrulespagesteps.userSeeAllElementsAmountInAddConditionPage();
    }

    @And("User click Transaction Status")
    public void userClickTransactionStatus() {
        fraudrulespagesteps.userClickTransactionStatus();
    }

    @Then("User see all elements Transaction Status in Add Condition Page")
    public void userSeeAllElementsTransactionStatusInAddConditionPage() {
        fraudrulespagesteps.userSeeAllElementsTransactionStatusInAddConditionPage();
    }

    @And("User click Foreign Cards")
    public void userClickForeignCards() {
        fraudrulespagesteps.userClickForeignCards();
    }

    @Then("User see all elements Foreign Cards in Add Condition Page")
    public void userSeeAllElementsForeignCardsInAddConditionPage() {
        fraudrulespagesteps.userSeeAllElementsForeignCardsInAddConditionPage();
    }

    @And("User click BIN")
    public void userClickBIN() {
        fraudrulespagesteps.userClickBIN();
    }

    @Then("User see all elements BIN in Add Condition Page")
    public void userSeeAllElementsBinInAddConditionPage() {
        fraudrulespagesteps.userSeeAllElementsBinInAddConditionPage();
    }

    @And("User click Error Codes")
    public void userClickErrorCodes() {
        fraudrulespagesteps.userClickErrorCodes();
    }

    @Then("User see all elements Error Codes in Add Condition Page")
    public void userSeeAllElementsErrorCodesInAddConditionPage() {
        fraudrulespagesteps.userSeeAllElementsErrorCodesInAddConditionPage();
    }

    @And("User click Minimum Event on Conditions Page")
    public void userClickMinimumEventOnConditionsPage() {
        fraudrulespagesteps.userClickMinimumEvent();
    }

    @Then("User see all elements Minimum Event in Add Condition Page")
    public void userSeeAllElementsMinimumEventInAddConditionPage() {
        fraudrulespagesteps.userSeeAllElementsMinimumEventInAddConditionPage();
    }

    @And("User click Transaction Period on Conditions Page")
    public void userClickTransactionPeriodOnConditionsPage() {
        fraudrulespagesteps.userClickTransactionPeriod();
    }

    @Then("User see all elements Transaction Period in Add Condition Page")
    public void userSeeAllElementsTransactionPeriodInAddConditionPage() {
        fraudrulespagesteps.userSeeAllElementsTransactionPeriodInAddConditionPage();
    }

    @And("User click Time Limit on Conditions Page")
    public void userClickTimeLimitOnConditionsPage() {
        fraudrulespagesteps.userClickTimeLimit();
    }

    @Then("User see all elements Time Limit in Add Condition Page")
    public void userSeeAllElementsTimeLimitInAddConditionPage() {
        fraudrulespagesteps.userSeeAllElementsTimeLimitInAddConditionPage();
    }

    @And("User fill with Rule Name and Description text fields on Add Fraud Rule Page")
    public void userFillWithRuleNameAndDescriptionTextFieldsOnAddFraudRulePage() {
        fraudrulespagesteps.userTypeRuleNameOnAddPage();
        fraudrulespagesteps.userTypeRuleDescription();
        fraudrulespagesteps.userTypeRuleScore();
    }

    @And("User select with {string} Rule Category on Add Fraud Rule Page")
    public void userSelectWithRuleCategoryOnAddFraudRulePage(String category) {
        fraudrulespagesteps.userSelectRuleCategory(category);
    }

    @And("User select active notify on Add Fraud Rule Page")
    public void userSelectActiveNotifyOnAddFraudRulePage() {
        fraudrulespagesteps.userSelectActiveNotify();
    }

    @And("User fill with {string} Amount on Conditions Page")
    public void userFillWithAmountOnConditionsPage(String amount) {
        fraudrulespagesteps.userTypeAmount(amount);
    }

    @And("User fill with {string} Minimum Event on Conditions Page")
    public void userFillWithMinimumEventOnConditionsPage(String event) {
        fraudrulespagesteps.userTypeMinimumEvent(event);
    }

    @And("User select with {string} Start Hour and {string} End Hour on Conditions Page")
    public void userSelectWithStartHourAndEndHourOnConditionsPage(String startHour, String endHour) {
        fraudrulespagesteps.userSelectStartAndEndHours(startHour, endHour);
    }

    @And("User select with {string} Time and {string} Value on Conditions Page")
    public void userSelectWithTimeAndValueOnConditionsPage(String time, String value) {
        fraudrulespagesteps.userSelectTimeAndValue(time, value);
    }

    @And("User click Save button on Add Fraud Rule Page")
    public void userClickSaveButtonOnAddFraudRulePage() {
        fraudrulespagesteps.userClickSaveButton();
    }

    @When("User filter by {string} Rule Name on Fraud Rules Page")
    public void userFilterByRuleNameOnFraudRulesPage(String ruleName) {
        fraudrulespagesteps.userTypeRuleName(ruleName);
    }

    @And("User click search button on Fraud Rules Page")
    public void userClickSearchButtonOnFraudRulesPage() {
        fraudrulespagesteps.userClickSearchbutton();
    }

    @When("User filter by {string} Rule Type on Fraud Rules Page")
    public void userFilterByRuleTypeOnFraudRulesPage(String ruleType) {
        fraudrulespagesteps.userClickRuleTypeDropdown();
        fraudrulespagesteps.userClickRuleType(ruleType);
    }

    @Then("User see filtered {string} Rule Type on data table Fraud Rules Page")
    public void userSeeFilteredRuleTypeOnDataTableFraudRulesPage(String valueOnTable) {
        fraudrulespagesteps.userSeeFilteredOnDataTable(valueOnTable);
    }

    @When("User click edit button on Fraud Rules Page")
    public void userClickEditButtonOnFraudRulesPage() {
        fraudrulespagesteps.userClickEditButton();
    }

    @Then("User see filtered {string} Rule Name on data table Fraud Rules Page")
    public void userSeeFilteredRuleNameOnDataTableFraudRulesPage(String RuleName) {
        fraudrulespagesteps.userCheckRuleNameOnTable(RuleName);
    }

    @And("User click Export to Excel on Fraud Rules Page")
    public void userClickExportToExcelOnFraudRulesPage() {
        fraudrulespagesteps.userClickExportToExcel();
    }

    @And("User click Save button on Update Fraud Rule Page")
    public void userClickSaveButtonOnUpdateFraudRulePage() {
        fraudrulespagesteps.userClickSaveButton();
    }

    @Then("User see {string} information text on Fraud Rules Page")
    public void userSeeInformationTextOnFraudRulesPage(String text) {
        fraudrulespagesteps.userSeeInformation(text);
    }
}
