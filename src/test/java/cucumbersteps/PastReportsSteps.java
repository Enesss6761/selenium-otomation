package cucumbersteps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import serenitysteps.PastReportsPageSteps;

public class PastReportsSteps {
    @Steps
    PastReportsPageSteps pastreportspagesteps;

    @And("User click past reports sub left menu")
    public void userClickPastReportsSubLeftMenu() {
        pastreportspagesteps.userClickPastReportsSubLeftMenu();
    }

    @And("User see past reports Page")
    public void userSeePastReportsPage() throws Exception {
        pastreportspagesteps.userSeePastReportsPage();
    }

    @And("User click more filters in Past Reports Page")
    public void userClickMoreFiltersInPastReportsPage() {
        pastreportspagesteps.userClickMoreFiltersInPastReportsPage();
    }

    @When("User see all elements in Past Reports Page")
    public void userSeeAllElementsInPastReportsPage() {
        pastreportspagesteps.userSeeAllElementsInPastReportsPage();
    }

    @And("User filter by date {string} between {string} days in Past Reports Page")
    public void userFilterByDateBetweenDaysInPastReportsPage(String startDay, String endDay) {
        pastreportspagesteps.pastReportsPageClickStartDateButton();
        pastreportspagesteps.pastReportsPageChooseStartDate(startDay);
        pastreportspagesteps.pastReportsPageClickEndDateButton();
        pastreportspagesteps.pastReportsPageChooseEndDate(endDay);
    }

    @And("User click status in Past Reports Page")
    public void userClickStatusInPastReportsPage() {
        pastreportspagesteps.userClickStatusInPastReportsPage();
    }

    @And("User select status in Past Reports Page")
    public void userSelectStatusInPastReportsPage() {
        pastreportspagesteps.userSelectStatusInPastReportsPage();
    }

    @And("User click report type in Past Reports Page")
    public void userClickReportTypeInPastReportsPage() {
        pastreportspagesteps.userClickReportTypeInPastReportsPage();
    }

    @And("User select report type in Past Reports Page")
    public void userSelectReportTypeInPastReportsPage() {
        pastreportspagesteps.userSelectReportTypeInPastReportsPage();
    }

    @And("User type requestor in Past Reports Page")
    public void userTypeRequestorInPastReportsPage() {
        pastreportspagesteps.userTypeRequestorInPastReportsPage();
    }

    @When("User click search button in Past Reports Page")
    public void userClickSearchButtonInPastReportsPage() {
        pastreportspagesteps.userClickSearchButtonInPastReportsPage();
    }

    @Then("User see past report records on list in Past Reports Page")
    public void userSeePastReportRecordsOnListInPastReportsPage() {
        pastreportspagesteps.userSeePastReportRecordsOnListInPastReportsPage();
    }

    @When("User click past reports detail in Past Reports Page")
    public void userClickPastReportsDetailInPastReportsPage() {
        pastreportspagesteps.userClickPastReportsDetailInPastReportsPage();
    }

    @Then("User see detail information equals to past reports list information in Past Reports Page")
    public void userSeeDetailInformationEqualsToPastReportsListInformationInPastReportsPage() {
        pastreportspagesteps.userSeeDetailInformationEqualsToPastReportsListInformationInPastReportsPage();
    }

    @And("User click a Past Report Export in Past Reports Page")
    public void userClickAPastReportExportInPastReportsPage() {
        pastreportspagesteps.userClickAPastReportExportInPastReportsPage();
    }

    @And("User see success message in Past Reports Page")
    public void userSeeSuccessMessageInPastReportsPage() {
        pastreportspagesteps.userSeeSuccessMessageInPastReportsPage();
    }
}
