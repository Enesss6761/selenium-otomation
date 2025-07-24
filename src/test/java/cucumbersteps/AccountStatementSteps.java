package cucumbersteps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import serenitysteps.AccountStatementPageSteps;

public class AccountStatementSteps {
    @Steps
    AccountStatementPageSteps accountstatementpagesteps;

    @And("User click account statement sub left menu")
    public void userClickAccountStatementSubLeftMenu() {
        accountstatementpagesteps.userClickAccountStatementSubLeftMenu();
    }

    @And("User see account statement Page")
    public void userSeeAccountStatementPage() throws Exception {
        accountstatementpagesteps.userSeeAccountStatementPage();
    }

    @And("User click more filters in Account Statement Page")
    public void userClickMoreFiltersInAccountStatementPage() {
        accountstatementpagesteps.userClickMoreFiltersInAccountStatementPage();
    }

    @When("User see all elements in Account Statement Page")
    public void userSeeAllElementsInAccountStatementPage() {
        accountstatementpagesteps.userSeeAllElementsInAccountStatementPage();
    }

    @And("User filter by date {string} between {string} days in Account Statement Page")
    public void userFilterByDateBetweenDaysInAccountStatementPage(String startDay, String endDay) {
        accountstatementpagesteps.accountStatementPageClickStartDateButton();
        accountstatementpagesteps.accountStatementPageChooseStartDate(startDay);
        accountstatementpagesteps.accountStatementPageClickEndDateButton();
        accountstatementpagesteps.accountStatementPageChooseEndDate(endDay);
    }

    @And("User click Merchant Filter in Account Statement Page")
    public void userClickMerchantFilterInAccountStatementPage() {
        accountstatementpagesteps.userClickMerchantFilterInAccountStatementPage();
    }

    @And("User type merchant name to search field in Account Statement Page")
    public void userTypeMerchantNameToSearchFieldInAccountStatementPage() {
        accountstatementpagesteps.userTypeMerchantNameToSearchFieldInAccountStatementPage();
    }

    @And("User click merchant name search in Account Statement Page")
    public void userClickMerchantNameSearchInAccountStatementPage() {
        accountstatementpagesteps.userClickMerchantNameSearchInAccountStatementPage();
    }

    @And("User click merchant name selection in Account Statement Page")
    public void userClickMerchantNameSelectionInAccountStatementPage() {
        accountstatementpagesteps.userClickMerchantNameSelectionInAccountStatementPage();
    }

    @And("User click Bank PF Filter in Account Statement Page")
    public void userClickBankPFFilterInAccountStatementPage() {
        accountstatementpagesteps.userClickBankPFFilterInAccountStatementPage();
        ;
    }

    @And("User type bank name to search field in Account Statement Page")
    public void userTypeBankNameToSearchFieldInAccountStatementPage() {
        accountstatementpagesteps.userTypeBankNameToSearchFieldInAccountStatementPage();
    }

    @And("User click bank name to search field in Account Statement Page")
    public void userClickBankNameToSearchFieldInAccountStatementPage() {
        accountstatementpagesteps.userClickBankNameToSearchFieldInAccountStatementPage();
    }

    @And("User click bank name selection in Account Statement Page")
    public void userClickBankNameSelectionInAccountStatementPage() {
        accountstatementpagesteps.userClickBankNameSelectionInAccountStatementPage();
    }

    @And("User click Pos Filter in Account Statement Page")
    public void userClickPosFilterInAccountStatementPage() {
        accountstatementpagesteps.userClickPosFilterInAccountStatementPage();
    }

    @And("User type Pos to search field in Account Statement Page")
    public void userTypePosToSearchFieldInAccountStatementPage() {
        accountstatementpagesteps.userTypePosToSearchFieldInAccountStatementPage();
    }

    @And("User click Pos to search field in Account Statement Page")
    public void userClickPosToSearchFieldInAccountStatementPage() {
        accountstatementpagesteps.userClickPosToSearchFieldInAccountStatementPage();
    }

    @And("User click Pos selection in Account Statement Page")
    public void userClickPosSelectionInAccountStatementPage() {
        accountstatementpagesteps.userClickPosSelectionInAccountStatementPage();
    }

    @And("User type order id {string} in Account Statement Page")
    public void userTypeOrderIdInAccountStatementPage(String orderId) {
        accountstatementpagesteps.userTypeOrderIdInAccountStatementPage(orderId);
    }

    @And("User click transaction type in Account Statement Page")
    public void userClickTransactionTypeInAccountStatementPage() {
        accountstatementpagesteps.userClickTransactionTypeInAccountStatementPage();
    }

    @And("User select transaction type in Account Statement Page")
    public void userSelectTransactionTypeInAccountStatementPage() {
        accountstatementpagesteps.userSelectTransactionTypeInAccountStatementPage();
    }

    @When("User click search button in Account Statement Page")
    public void userClickSearchButtonInAccountStatementPage() {
        accountstatementpagesteps.userClickSearchButtonInAccountStatementPage();
    }

    @Then("User see transaction records on list in Account Statement Page")
    public void userSeeTransactionRecordsOnListInAccountStatementPage() {
        accountstatementpagesteps.userSeeTransactionRecordsOnListInAccountStatementPage();
    }

    @And("User click Account Statement Report Export")
    public void userClickAccountStatementReportExport() {
        accountstatementpagesteps.userClickAccountStatementReportExport();
    }

    @And("User see success message on Account Statement Report Page")
    public void userSeeSuccessMessageOnAccountStatementReportPage() {
        accountstatementpagesteps.userSeeSuccessMessageOnAccountStatementReportPage();
    }

    @And("User click Account Statement Report Export History")
    public void userClickAccountStatementReportExportHistory() {
        accountstatementpagesteps.userClickAccountStatementReportExportHistory();
    }

    @When("User see Account Statement Report in Report History")
    public void userSeeAccountStatementReportInReportHistory() {
        accountstatementpagesteps.userSeeAccountStatementReportInReportHistory();
    }
}
