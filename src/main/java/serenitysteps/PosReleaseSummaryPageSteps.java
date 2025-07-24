package serenitysteps;

import net.thucydides.core.annotations.Step;
import pages.PosReleaseSummaryPage;

public class PosReleaseSummaryPageSteps {
    PosReleaseSummaryPage posreleasesummarypage;

    @Step("User click pos release summary sub left menu")
    public void userClickPosReleaseSummarySubLeftMenu() {
        posreleasesummarypage.leftSubMenuPosReleaseSummarySubmit();
    }

    @Step("User see pos release summary Report Page")
    public void userSeePosReleaseSummaryPage() throws Exception {
        posreleasesummarypage.posReleaseSummaryPageControlUrl();
    }

    @Step("User click more filters in Pos Release Summary Report Page")
    public void userClickMoreFiltersInPosReleaseSummaryPage() {
        posreleasesummarypage.leftSubMenuPosReleaseSummaryMoreFiltersSubmit();
    }

    @Step("User see all elements in Pos Release Summary Report Page")
    public void userSeeAllElementsInPosReleaseSummaryPage() {
        posreleasesummarypage.posReleaseSummaryPageAllElementsAreDisplayed();
    }

    @Step("User click start date button in Pos Release Summary Report Page")
    public void posReleaseSummaryReportPageClickStartDateButton() {
        posreleasesummarypage.posReleaseSummaryPageClickStartDateButton();
    }

    @Step("User choose start date in Pos Release Summary Report Page")
    public void posReleaseSummaryReportPageChooseStartDate(String startDate) {
        posreleasesummarypage.posReleaseSummaryPageChooseStartDate(startDate);
    }

    @Step("User click end date button in Pos Release Summary Report Page")
    public void posReleaseSummaryReportPageClickEndDateButton() {
        posreleasesummarypage.posReleaseSummaryPageClickEndDateButton();
    }

    @Step("User choose end date in Pos Release Summary Report Page")
    public void posReleaseSummaryReportPageChooseEndDate(String endDate) {
        posreleasesummarypage.posReleaseSummaryPageChooseEndDate(endDate);
    }

    @Step("User click Bank PF Filter in Pos Release Summary Report Page")
    public void userClickBankPFFilterInPosReleaseSummaryReportPage() {
        posreleasesummarypage.bankListPosReleaseSummaryReportSubmit();
    }

    @Step("User type bank name to search field in Pos Release Summary Report Page")
    public void userTypeBankNameToSearchFieldInPosReleaseSummaryReportPage() {
        posreleasesummarypage.typeBankNameBankListPosReleaseSummaryReportSubmit();
    }

    @Step("User click bank name to search field in Pos Release Summary Report Page")
    public void userClickBankNameToSearchFieldInPosReleaseSummaryReportPage() {
        posreleasesummarypage.bankListSearchPosReleaseSummaryReportSubmit();
    }

    @Step("User click bank name selection in Pos Release Summary Report Page")
    public void userClickBankNameSelectionInPosReleaseSummaryReportPage() {
        posreleasesummarypage.bankListSelectedCheckboxPosReleaseSummaryReportSubmit();
    }

    @Step("User click Pos Filter in Pos Release Summary Report Page")
    public void userClickPosFilterInPosReleaseSummaryReportPage() {
        posreleasesummarypage.posListPosReleaseSummaryReportSubmit();
    }

    @Step("User type Pos to search field in Pos Release Summary Report Page")
    public void userTypePosToSearchFieldInPosReleaseSummaryReportPage() {
        posreleasesummarypage.typePosNamePosListPosReleaseSummaryReportSubmit();
    }

    @Step("User click Pos to search field in Pos Release Summary Report Page")
    public void userClickPosToSearchFieldInPosReleaseSummaryReportPage() {
        posreleasesummarypage.posListSearchPosReleaseSummaryReportSubmit();
    }

    @Step("User click Pos selection in Pos Release Summary Report Page")
    public void userClickPosSelectionInPosReleaseSummaryReportPage() {
        posreleasesummarypage.posListSelectedCheckboxPosReleaseSummaryReportSubmit();
    }

    @Step("User click search button on Pos Release Summary Report Page")
    public void userClickSearchButtonOnPosReleaseSummaryReportPage() {
        posreleasesummarypage.posReleaseSummaryReportPageSearchButtonSubmit();
    }

    @Step("User see merchant name on list in Pos Release Summary Report Page")
    public void userSeeMerchantNameOnListInPosReleaseSummaryReportPage() {
        posreleasesummarypage.seeMerchantNameOnListPosReleaseSummaryReport();
    }

    @Step("User click Pos Release Summary Report Page Export")
    public void userClickPosReleaseSummaryReportPageExport() {
        posreleasesummarypage.posReleaseSummaryReportExportSubmit();
    }

    @Step("User see success message on Pos Release Summary Report Page")
    public void userSeeSuccessMessageOnPosReleaseSummaryReportPage() {
        posreleasesummarypage.seePosReleaseSummaryReportExportSuccessMessage();
    }

    @Step("User click Pos Release Summary Report Export History")
    public void userClickPosReleaseSummaryReportExportHistory() {
        posreleasesummarypage.posReleaseSummaryReportExportHistorySubmit();
    }

    @Step("User see Pos Release Summary Report in Report History")
    public void userSeePosReleaseSummaryReportInReportHistory() {
        posreleasesummarypage.seePosReleaseSummaryReportExportToHistoryReportType();
    }
}
