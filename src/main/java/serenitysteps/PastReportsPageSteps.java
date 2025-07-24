package serenitysteps;

import net.thucydides.core.annotations.Step;
import pages.PastReportsPage;

public class PastReportsPageSteps {
    PastReportsPage pastreportspage;

    @Step("User click past reports sub left menu")
    public void userClickPastReportsSubLeftMenu() {
        pastreportspage.leftSubMenuPastReportsSubmit();
    }

    @Step("User see past reports Page")
    public void userSeePastReportsPage() throws Exception {
        pastreportspage.pastReportsPageControlUrl();
    }

    @Step("User click more filters in Past Reports Page")
    public void userClickMoreFiltersInPastReportsPage() {
        pastreportspage.leftSubMenuPastReportsMoreFiltersSubmit();
    }

    @Step("User see all elements in Past Reports Page")
    public void userSeeAllElementsInPastReportsPage() {
        pastreportspage.pastReportsPageAllElementsAreDisplayed();
    }

    @Step("User click start date button in Past Reports Page")
    public void pastReportsPageClickStartDateButton() {
        pastreportspage.pastReportsPageClickStartDateButton();
    }

    @Step("User choose start date in Past Reports Page")
    public void pastReportsPageChooseStartDate(String startDate) {
        pastreportspage.pastReportsPageChooseStartDate(startDate);
    }

    @Step("User click end date button in Past Reports Page")
    public void pastReportsPageClickEndDateButton() {

        pastreportspage.pastReportsPageClickEndDateButton();
    }

    @Step("User choose end date in Past Reports Page")
    public void pastReportsPageChooseEndDate(String endDate) {
        pastreportspage.pastReportsPageChooseEndDate(endDate);
    }

    @Step("User click status in Past Reports Page")
    public void userClickStatusInPastReportsPage() {
        pastreportspage.pastReportsStatusSubmit();
    }

    @Step("User select status in Past Reports Page")
    public void userSelectStatusInPastReportsPage() {
        pastreportspage.pastReportsStatusSelectSubmit();
    }

    @Step("User click report type in Past Reports Page")
    public void userClickReportTypeInPastReportsPage() {
        pastreportspage.pastReportsReportTypeSubmit();
    }

    @Step("User select report type in Past Reports Page")
    public void userSelectReportTypeInPastReportsPage() {
        pastreportspage.pastReportsReportTypeSelectSubmit();
    }

    @Step("User type requestor in Past Reports Page")
    public void userTypeRequestorInPastReportsPage() {
        pastreportspage.typeRequestorPastReports();
    }

    @Step("User click search button in Past Reports Page")
    public void userClickSearchButtonInPastReportsPage() {
        pastreportspage.pastReportsSearchSubmit();
    }

    @Step("User see past report records on list in Past Reports Page")
    public void userSeePastReportRecordsOnListInPastReportsPage() {
        pastreportspage.seeRecordsOnListPastReportsReport();
    }

    @Step("User click past reports detail in Past Reports Page")
    public void userClickPastReportsDetailInPastReportsPage() {
        pastreportspage.pastReportsDetailSubmit();
    }

    @Step("User see detail information equals to past reports list information in Past Reports Page")
    public void userSeeDetailInformationEqualsToPastReportsListInformationInPastReportsPage() {
        pastreportspage.seeReportDetailsPastReportsReport();
    }

    @Step("User click a Past Report Export in Past Reports Page")
    public void userClickAPastReportExportInPastReportsPage() {
        pastreportspage.pastReportsExportSubmit();
    }

    @Step("User see success message in Past Reports Page")
    public void userSeeSuccessMessageInPastReportsPage() {
        pastreportspage.seePastReportExportSuccessMessage();
    }
}
