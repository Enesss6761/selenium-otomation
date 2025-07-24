package cucumbersteps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import serenitysteps.PosTransactionsPageSteps;

public class PosTransactionsSteps {
    @Steps
    PosTransactionsPageSteps postransactionspagesteps;

    @And("User click pos transactions sub left menu")
    public void userClickPosTransactionsSubLeftMenu() {
        postransactionspagesteps.userClickPosTransactionsSubLeftMenu();
    }

    @And("User see pos transactions Page")
    public void userSeePosTransactionsPage() throws Exception {
        postransactionspagesteps.userSeePosTransactionsPage();
    }

    @When("User click more filters in Pos Transactions Page")
    public void userClickMoreFiltersInPosTransactionsPage() {
        postransactionspagesteps.userClickMoreFiltersInPosTransactionsPage();
    }

    @Then("User see all elements in Pos Transactions Page")
    public void userSeeAllElementsInPosTransactionsPage() {
        postransactionspagesteps.userSeeAllElementsInPosTransactionsPage();
    }

    @And("User filter by date {string} between {string} days in Pos Transactions Report Page")
    public void userFilterByDateBetweenDaysInPosTransactionsReportPage(String startDay, String endDay) {
        postransactionspagesteps.posTransactionsPageClickStartDateButton();
        postransactionspagesteps.posTransactionsPageChooseStartDate(startDay);
        postransactionspagesteps.posTransactionsPageClickEndDateButton();
        postransactionspagesteps.posTransactionsPageChooseEndDate(endDay);
    }

    @And("User click Bank PF Filter in Pos Transactions Report Page")
    public void userClickBankPFFilterInPosTransactionsReportPage() {
        postransactionspagesteps.userClickBankPFFilterInPosTransactionsReportPage();
    }

    @And("User type bank name to search field in Pos Transactions Report Page")
    public void userTypeBankNameToSearchFieldInPosTransactionsReportPage() {
        postransactionspagesteps.userTypeBankNameToSearchFieldInPosTransactionsReportPage();
    }

    @And("User click bank name to search field in Pos Transactions Report Page")
    public void userClickBankNameToSearchFieldInPosTransactionsReportPage() {
        postransactionspagesteps.userClickBankNameToSearchFieldInPosTransactionsReportPage();
    }

    @And("User click bank name selection in Pos Transactions Report Page")
    public void userClickBankNameSelectionInPosTransactionsReportPage() {
        postransactionspagesteps.userClickBankNameSelectionInPosTransactionsReportPage();
    }

    @And("User click Pos Filter in Pos Transactions Report Page")
    public void userClickPosFilterInPosTransactionsReportPage() {
        postransactionspagesteps.userClickPosFilterInPosTransactionsReportPage();
    }

    @And("User type Pos to search field in Pos Transactions Report Page")
    public void userTypePosToSearchFieldInPosTransactionsReportPage() {
        postransactionspagesteps.userTypePosToSearchFieldInPosTransactionsReportPage();
    }

    @And("User click Pos to search field in Pos Transactions Report Page")
    public void userClickPosToSearchFieldInPosTransactionsReportPage() {
        postransactionspagesteps.userClickPosToSearchFieldInPosTransactionsReportPage();
    }

    @And("User click Pos selection in Pos Transactions Report Page")
    public void userClickPosSelectionInPosTransactionsReportPage() {
        postransactionspagesteps.userClickPosSelectionInPosTransactionsReportPage();
    }

    @And("User click Merchant Filter in Pos Transactions Report Page")
    public void userClickMerchantFilterInPosTransactionsReportPage() {
        postransactionspagesteps.userClickMerchantFilterInPosTransactionsReportPage();
    }

    @And("User type merchant name to search field in Pos Transactions Report Page")
    public void userTypeMerchantNameToSearchFieldInPosTransactionsReportPage() {
        postransactionspagesteps.userTypeMerchantNameToSearchFieldInPosTransactionsReportPage();
    }

    @And("User click merchant name search in Pos Transactions Report Page")
    public void userClickMerchantNameSearchInPosTransactionsReportPage() {
        postransactionspagesteps.userClickMerchantNameSearchInPosTransactionsReportPage();
    }

    @And("User click merchant name selection in Pos Transactions Report Page")
    public void userClickMerchantNameSelectionInPosTransactionsReportPage() {
        postransactionspagesteps.userClickMerchantNameSelectionInPosTransactionsReportPage();
    }

    @When("User click search button on Pos Transactions Report")
    public void userClickSearchButtonOnPosTransactionsReport() {
        postransactionspagesteps.userClickSearchButtonOnPosTransactionsReport();
    }

    @Then("User see merchant name on list in Pos Transactions Report Page")
    public void userSeeMerchantNameOnListInPosTransactionsReportPage() {
        postransactionspagesteps.userSeeMerchantNameOnListInPosTransactionsReportPage();
    }

    @And("User click Pos Transactions Report Export")
    public void userClickPosTransactionsReportExport() {
        postransactionspagesteps.userClickPosTransactionsReportExport();
    }

    @And("User see success message on Pos Transactions Report Page")
    public void userSeeSuccessMessageOnPosTransactionsReportPage() {
        postransactionspagesteps.userSeeSuccessMessageOnPosTransactionsReportPage();
    }

    @And("User click Pos Transactions Report Export History")
    public void userClickPosTransactionsReportExportHistory() {
        postransactionspagesteps.userClickPosTransactionsReportExportHistory();
    }

    @When("User see Pos Transactions Report in Report History")
    public void userSeePosTransactionsReportInReportHistory() {
        postransactionspagesteps.userSeePosTransactionsReportInReportHistory();
    }
}
