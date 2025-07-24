package serenitysteps;

import net.thucydides.core.annotations.Step;
import pages.BillingSummaryPage;

public class BillingSummaryPageSteps {
    BillingSummaryPage billingsummarypage;

    @Step("User click billing summary sub left menu")
    public void userClickBillingSummarySubLeftMenu() {
        billingsummarypage.leftSubMenuBillingSummarySubmit();
    }

    @Step("User see billing summary Page")
    public void userSeeBillingSummaryPage() throws Exception {
        billingsummarypage.billingSummaryPageControlUrl();
    }

    @Step("User see all elements in Billing Summary Page")
    public void userSeeAllElementsInBillingSummaryPage() {
        billingsummarypage.billingSummaryPageAllElementsAreDisplayed();
    }

    @Step("User click Merchant Filter in Billing Summary Report Page")
    public void userClickMerchantFilterInBillingSummaryReportPage() {
        billingsummarypage.merchantListBillingSummaryReportSubmit();
    }

    @Step("User type merchant name to search field in Billing Summary Report Page")
    public void userTypeMerchantNameToSearchFieldInBillingSummaryReportPage() {
        billingsummarypage.typeMerchantNameMerchantListBillingSummaryReportSubmit();
    }

    @Step("User click merchant name search in Billing Summary Report Page")
    public void userClickMerchantNameSearchInBillingSummaryReportPage() {
        billingsummarypage.merchantListSearchBillingSummaryReportSubmit();
    }

    @Step("User click merchant name selection in Billing Summary Report Page")
    public void userClickMerchantNameSelectionInBillingSummaryReportPage() {
        billingsummarypage.merchantListSelectedCheckboxBillingSummaryReportSubmit();
    }

    @Step("User click search button on Billing Summary Report")
    public void userClickSearchButtonOnBillingSummaryReport() {
        billingsummarypage.merchantListCloseAndSearchBillingSummaryReportSubmit();
    }

    @Step("User see merchant name on list in Billing Summary Report Page")
    public void userSeeMerchantNameOnListInBillingSummaryReportPage() {
        billingsummarypage.seeMerchantNameOnListBillingSummaryReport();
    }

    @Step("User click start date button in Billing Summary Report Page")
    public void billingSummaryPageClickStartDateButton() {
        billingsummarypage.billingSummaryPageClickStartDateButton();
    }

    @Step("User choose start date in Billing Summary Report Page")
    public void billingSummaryPageChooseStartDate(String startDate) {
        billingsummarypage.billingSummaryPageChooseStartDate(startDate);
    }

    @Step("User click end date button in Billing Summary Report Page")
    public void billingSummaryPageClickEndDateButton() {
        billingsummarypage.billingSummaryPageClickEndDateButton();
    }

    @Step("User choose end date in Billing Summary Report Page")
    public void billingSummaryPageChooseEndDate(String endDate) {
        billingsummarypage.billingSummaryPageChooseEndDate(endDate);
    }

    @Step("User click Billing Summary Report Export")
    public void userClickBillingSummaryReportExport() {
        billingsummarypage.billingSummaryReportExportSubmit();
    }

    @Step("User see success message on Billing Summary Report Page")
    public void userSeeSuccessMessageOnBillingSummaryReportPage() {
        billingsummarypage.seeBillingSummaryReportExportSuccessMessage();
    }

    @Step("User click Billing Summary Report Export History")
    public void userClickBillingSummaryReportExportHistory() {
        billingsummarypage.billingSummaryReportExportHistorySubmit();
    }

    @Step("User see Billing Summary Report in Report History")
    public void userSeeBillingSummaryReportInReportHistory() {
        billingsummarypage.seeBillingSummaryReportExportToHistoryReportType();
    }
}
