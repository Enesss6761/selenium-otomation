package cucumbersteps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import serenitysteps.FraudManagementPageSteps;

public class FraudManagementSteps {
    @Steps
    FraudManagementPageSteps fraudmanagementpagesteps;

    @And("User click fraud management sub left menu")
    public void userClickFraudManagementSubLeftMenu() {
        fraudmanagementpagesteps.userClickFraudManagementSubLeftMenu();
    }

    @And("User see fraud management Page")
    public void userSeeFraudManagementPage() throws Exception {
        fraudmanagementpagesteps.userSeeFraudManagementPage();
    }

    @When("User click more filters on Fraud Management Page")
    public void userClickMoreFiltersOnFraudManagementPage() {
        fraudmanagementpagesteps.userClickMoreFiltersInFraudManagementPage();
    }

    @Then("User see all elements on Fraud Management Page")
    public void userSeeAllElementsOnFraudManagementPage() {
        fraudmanagementpagesteps.userSeeAllElementsInFraudManagementPage();
    }

    @And("User filter by {string} Min Score {string} Max Score and {string} Min Amount {string} Max Amount on Fraud Management Page")
    public void userFilterByMinScoreMaxScoreAndMinAmountMaxAmountOnFraudManagementPage(String minScore, String maxScore, String minAmount, String maxAmount) {
        fraudmanagementpagesteps.userTypeMinMaxScoresAndAmounts(minScore,maxScore,minAmount,maxAmount);
    }

    @And("User click search button on Fraud Management Page")
    public void userClickSearchButtonOnFraudManagementPage() {
        fraudmanagementpagesteps.userClickSearchButton();
    }

    @Then("User see filtered {string} score on Fraud Management data table")
    public void userSeeFilteredScoreOnFraudManagementDataTable(String score) {
        fraudmanagementpagesteps.userCheckScoreOnTable(score);
    }

    @Then("User see filtered {string} amount on Fraud Management data table")
    public void userSeeFilteredAmountOnFraudManagementDataTable(String value) {
        fraudmanagementpagesteps.userCheckAmountOnTable(value);
    }

    @And("User filter by {string} Merchant Name on Fraud Management Page")
    public void userFilterByMerchantNameOnFraudManagementPage(String merchantName) {
        fraudmanagementpagesteps.userClickMerchantNameDropdown();
        fraudmanagementpagesteps.userSelectMerchantName(merchantName);
    }

    @Then("User see filtered {string} on Fraud Management data table")
    public void userSeeFilteredOnFraudManagementDataTable(String valueOnTable) {
        fraudmanagementpagesteps.userSeeFilteredOnDataTable(valueOnTable);
    }

    @And("User filter by {string} Transaction Status on Fraud Management Page")
    public void userFilterByTransactionStatusOnFraudManagementPage(String status) {
        fraudmanagementpagesteps.userClickTransactionStausDropdown();
        fraudmanagementpagesteps.userSelectTransactionStaus(status);
    }

    @And("User click Export to Excel on Fraud Management Page")
    public void userClickExportToExcelOnFraudManagementPage() {
        fraudmanagementpagesteps.userClickExportToExcel();
    }
}
