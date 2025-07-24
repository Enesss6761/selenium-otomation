package cucumbersteps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import serenitysteps.PosReleaseSummaryPageSteps;

public class PosReleaseSummarySteps {
    @Steps
    PosReleaseSummaryPageSteps posreleasesummarypagesteps;

    @And("User click pos release summary sub left menu")
    public void userClickPosReleaseSummarySubLeftMenu() {
        posreleasesummarypagesteps.userClickPosReleaseSummarySubLeftMenu();
    }

    @And("User see pos release summary Report Page")
    public void userSeePosReleaseSummaryPage() throws Exception {
        posreleasesummarypagesteps.userSeePosReleaseSummaryPage();
    }

    @When("User click more filters in Pos Release Summary Report Page")
    public void userClickMoreFiltersInPosReleaseSummaryPage() {
        posreleasesummarypagesteps.userClickMoreFiltersInPosReleaseSummaryPage();
    }

    @Then("User see all elements in Pos Release Summary Report Page")
    public void userSeeAllElementsInPosReleaseSummaryPage() {
        posreleasesummarypagesteps.userSeeAllElementsInPosReleaseSummaryPage();
    }

    @And("User filter by date {string} between {string} days in Pos Release Summary Report Page")
    public void userFilterByDateBetweenDaysInPosReleaseSummaryReportPage(String startDay, String endDay) {
        posreleasesummarypagesteps.posReleaseSummaryReportPageClickStartDateButton();
        posreleasesummarypagesteps.posReleaseSummaryReportPageChooseStartDate(startDay);
        posreleasesummarypagesteps.posReleaseSummaryReportPageClickEndDateButton();
        posreleasesummarypagesteps.posReleaseSummaryReportPageChooseEndDate(endDay);
    }

    @And("User click Bank PF Filter in Pos Release Summary Report Page")
    public void userClickBankPFFilterInPosReleaseSummaryReportPage() {
        posreleasesummarypagesteps.userClickBankPFFilterInPosReleaseSummaryReportPage();
    }

    @And("User type bank name to search field in Pos Release Summary Report Page")
    public void userTypeBankNameToSearchFieldInPosReleaseSummaryReportPage() {
        posreleasesummarypagesteps.userTypeBankNameToSearchFieldInPosReleaseSummaryReportPage();
    }

    @And("User click bank name to search field in Pos Release Summary Report Page")
    public void userClickBankNameToSearchFieldInPosReleaseSummaryReportPage() {
        posreleasesummarypagesteps.userClickBankNameToSearchFieldInPosReleaseSummaryReportPage();
    }

    @And("User click bank name selection in Pos Release Summary Report Page")
    public void userClickBankNameSelectionInPosReleaseSummaryReportPage() {
        posreleasesummarypagesteps.userClickBankNameSelectionInPosReleaseSummaryReportPage();
    }

    @And("User click Pos Filter in Pos Release Summary Report Page")
    public void userClickPosFilterInPosReleaseSummaryReportPage() {
        posreleasesummarypagesteps.userClickPosFilterInPosReleaseSummaryReportPage();
    }

    @And("User type Pos to search field in Pos Release Summary Report Page")
    public void userTypePosToSearchFieldInPosReleaseSummaryReportPage() {
        posreleasesummarypagesteps.userTypePosToSearchFieldInPosReleaseSummaryReportPage();
    }

    @And("User click Pos to search field in Pos Release Summary Report Page")
    public void userClickPosToSearchFieldInPosReleaseSummaryReportPage() {
        posreleasesummarypagesteps.userClickPosToSearchFieldInPosReleaseSummaryReportPage();
    }

    @And("User click Pos selection in Pos Release Summary Report Page")
    public void userClickPosSelectionInPosReleaseSummaryReportPage() {
        posreleasesummarypagesteps.userClickPosSelectionInPosReleaseSummaryReportPage();
    }

    @When("User click search button on Pos Release Summary Report Page")
    public void userClickSearchButtonOnPosReleaseSummaryReportPage() {
        posreleasesummarypagesteps.userClickSearchButtonOnPosReleaseSummaryReportPage();
    }

    @Then("User see merchant name on list in Pos Release Summary Report Page")
    public void userSeeMerchantNameOnListInPosReleaseSummaryReportPage() {
        posreleasesummarypagesteps.userSeeMerchantNameOnListInPosReleaseSummaryReportPage();
    }

    @And("User click Pos Release Summary Report Page Export")
    public void userClickPosReleaseSummaryReportPageExport() {
        posreleasesummarypagesteps.userClickPosReleaseSummaryReportPageExport();
    }

    @And("User see success message on Pos Release Summary Report Page")
    public void userSeeSuccessMessageOnPosReleaseSummaryReportPage() {
        posreleasesummarypagesteps.userSeeSuccessMessageOnPosReleaseSummaryReportPage();
    }

    @And("User click Pos Release Summary Report Export History")
    public void userClickPosReleaseSummaryReportExportHistory() {
        posreleasesummarypagesteps.userClickPosReleaseSummaryReportExportHistory();
    }

    @When("User see Pos Release Summary Report in Report History")
    public void userSeePosReleaseSummaryReportInReportHistory() {
        posreleasesummarypagesteps.userSeePosReleaseSummaryReportInReportHistory();
    }
}
