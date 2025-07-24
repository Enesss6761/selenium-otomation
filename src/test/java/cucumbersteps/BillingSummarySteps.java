package cucumbersteps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import serenitysteps.BillingSummaryPageSteps;

public class BillingSummarySteps {
    @Steps
    BillingSummaryPageSteps billingsummarypagesteps;

    @And("User click billing summary sub left menu")
    public void userClickBillingSummarySubLeftMenu() {
        billingsummarypagesteps.userClickBillingSummarySubLeftMenu();
    }

    @And("User see billing summary Page")
    public void userSeeBillingSummaryPage() throws Exception {
        billingsummarypagesteps.userSeeBillingSummaryPage();
    }

    @When("User see all elements in Billing Summary Page")
    public void userSeeAllElementsInBillingSummaryPage() {
        billingsummarypagesteps.userSeeAllElementsInBillingSummaryPage();
    }

    @And("User filter by date {string} between {string} days in Billing Summary Report Page")
    public void userFilterByDateBetweenDaysInBillingSummaryReportPage(String startDay, String endDay) {
        billingsummarypagesteps.billingSummaryPageClickStartDateButton();
        billingsummarypagesteps.billingSummaryPageChooseStartDate(startDay);
        billingsummarypagesteps.billingSummaryPageClickEndDateButton();
        billingsummarypagesteps.billingSummaryPageChooseEndDate(endDay);
    }

    @And("User click Merchant Filter in Billing Summary Report Page")
    public void userClickMerchantFilterInBillingSummaryReportPage() {
        billingsummarypagesteps.userClickMerchantFilterInBillingSummaryReportPage();
    }

    @And("User type merchant name to search field in Billing Summary Report Page")
    public void userTypeMerchantNameToSearchFieldInBillingSummaryReportPage() {
        billingsummarypagesteps.userTypeMerchantNameToSearchFieldInBillingSummaryReportPage();
    }

    @And("User click merchant name search in Billing Summary Report Page")
    public void userClickMerchantNameSearchInBillingSummaryReportPage() {
        billingsummarypagesteps.userClickMerchantNameSearchInBillingSummaryReportPage();
    }

    @And("User click merchant name selection in Billing Summary Report Page")
    public void userClickMerchantNameSelectionInBillingSummaryReportPage() {
        billingsummarypagesteps.userClickMerchantNameSelectionInBillingSummaryReportPage();
    }

    @When("User click search button on Billing Summary Report")
    public void userClickSearchButtonOnBillingSummaryReport() {
        billingsummarypagesteps.userClickSearchButtonOnBillingSummaryReport();
    }

    @Then("User see merchant name on list in Billing Summary Report Page")
    public void userSeeMerchantNameOnListInBillingSummaryReportPage() {
        billingsummarypagesteps.userSeeMerchantNameOnListInBillingSummaryReportPage();
    }

    @And("User click Billing Summary Report Export")
    public void userClickBillingSummaryReportExport() {
        billingsummarypagesteps.userClickBillingSummaryReportExport();
    }

    @And("User see success message on Billing Summary Report Page")
    public void userSeeSuccessMessageOnBillingSummaryReportPage() {
        billingsummarypagesteps.userSeeSuccessMessageOnBillingSummaryReportPage();
    }

    @And("User click Billing Summary Report Export History")
    public void userClickBillingSummaryReportExportHistory() {
        billingsummarypagesteps.userClickBillingSummaryReportExportHistory();
    }

    @When("User see Billing Summary Report in Report History")
    public void userSeeBillingSummaryReportInReportHistory() {
        billingsummarypagesteps.userSeeBillingSummaryReportInReportHistory();
    }
}
