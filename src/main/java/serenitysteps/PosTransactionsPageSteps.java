package serenitysteps;

import net.thucydides.core.annotations.Step;
import pages.PosTransactionsPage;

public class PosTransactionsPageSteps {
    PosTransactionsPage postransactionspage;

    @Step("User click pos transactions sub left menu")
    public void userClickPosTransactionsSubLeftMenu() {
        postransactionspage.leftSubMenuPosTransactionsSubmit();
    }

    @Step("User see pos transactions Page")
    public void userSeePosTransactionsPage() throws Exception {
        postransactionspage.posTransactionsPageControlUrl();
    }

    @Step("User click more filters in Pos Transactions Page")
    public void userClickMoreFiltersInPosTransactionsPage() {
        postransactionspage.leftSubMenuPosTransactionsMoreFiltersSubmit();
    }

    @Step("User see all elements in Pos Transactions Page")
    public void userSeeAllElementsInPosTransactionsPage() {
        postransactionspage.posTransactionsPageAllElementsAreDisplayed();
    }

    @Step("User click Bank PF Filter in Pos Transactions Report Page")
    public void userClickBankPFFilterInPosTransactionsReportPage() {
        postransactionspage.bankListPosTransactionsReportSubmit();
    }

    @Step("User type bank name to search field in Pos Transactions Report Page")
    public void userTypeBankNameToSearchFieldInPosTransactionsReportPage() {
        postransactionspage.typeBankNameBankListPosTransactionsReportSubmit();
    }

    @Step("User click bank name to search field in Pos Transactions Report Page")
    public void userClickBankNameToSearchFieldInPosTransactionsReportPage() {
        postransactionspage.bankListSearchPosTransactionsReportSubmit();
    }

    @Step("User click bank name selection in Pos Transactions Report Page")
    public void userClickBankNameSelectionInPosTransactionsReportPage() {
        postransactionspage.bankListSelectedCheckboxPosTransactionsReportSubmit();
    }

    @Step("User click start date button in Pos Transactions Report Page")
    public void posTransactionsPageClickStartDateButton() {
        postransactionspage.posTransactionsPageClickStartDateButton();
    }

    @Step("User choose start date in Pos Transactions Report Page")
    public void posTransactionsPageChooseStartDate(String startDate) {
        postransactionspage.posTransactionsPageChooseStartDate(startDate);
    }

    @Step("User click end date button in Pos Transactions Report Page")
    public void posTransactionsPageClickEndDateButton() {
        postransactionspage.posTransactionsPageClickEndDateButton();
    }

    @Step("User choose end date in Pos Transactions Report Page")
    public void posTransactionsPageChooseEndDate(String endDate) {
        postransactionspage.posTransactionsPageChooseEndDate(endDate);
    }

    @Step("User click Pos Filter in Pos Transactions Report Page")
    public void userClickPosFilterInPosTransactionsReportPage() {
        postransactionspage.posListPosTransactionsReportSubmit();
    }

    @Step("User type Pos to search field in Pos Transactions Report Page")
    public void userTypePosToSearchFieldInPosTransactionsReportPage() {
        postransactionspage.typePosNamePosListPosTransactionsReportSubmit();
    }

    @Step("User click Pos to search field in Pos Transactions Report Page")
    public void userClickPosToSearchFieldInPosTransactionsReportPage() {
        postransactionspage.posListSearchPosTransactionsReportSubmit();
    }

    @Step("User click Pos selection in Pos Transactions Report Page")
    public void userClickPosSelectionInPosTransactionsReportPage() {
        postransactionspage.posListSelectedCheckboxPosTransactionsReportSubmit();
    }

    @Step("User click Merchant Filter in Pos Transactions Report Page")
    public void userClickMerchantFilterInPosTransactionsReportPage() {
        postransactionspage.merchantListPosTransactionsReportSubmit();
    }

    @Step("User type merchant name to search field in Pos Transactions Report Page")
    public void userTypeMerchantNameToSearchFieldInPosTransactionsReportPage() {
        postransactionspage.typeMerchantNameBankListPosTransactionsReportSubmit();
    }

    @Step("User click merchant name search in Pos Transactions Report Page")
    public void userClickMerchantNameSearchInPosTransactionsReportPage() {
        postransactionspage.merchantListSearchPosTransactionsReportSubmit();
    }

    @Step("User click merchant name selection in Pos Transactions Report Page")
    public void userClickMerchantNameSelectionInPosTransactionsReportPage() {
        postransactionspage.merchantListSelectedCheckboxPosTransactionsReportSubmit();
    }

    @Step("User click search button on Pos Transactions Report")
    public void userClickSearchButtonOnPosTransactionsReport() {
        postransactionspage.posTransactionsPageSearchButtonSubmit();
    }

    @Step("User see merchant name on list in Pos Transactions Report Page")
    public void userSeeMerchantNameOnListInPosTransactionsReportPage() {
        postransactionspage.seeMerchantNameOnListPosTransactionsReport();
    }

    @Step("User click Pos Transactions Report Export")
    public void userClickPosTransactionsReportExport() {
        postransactionspage.posTransactionsReportExportSubmit();
    }

    @Step("User see success message on Pos Transactions Report Page")
    public void userSeeSuccessMessageOnPosTransactionsReportPage() {
        postransactionspage.seePosTransactionsReportExportSuccessMessage();
    }

    @Step("User click Pos Transactions Report Export History")
    public void userClickPosTransactionsReportExportHistory() {
        postransactionspage.posTransactionsReportExportHistorySubmit();
    }

    @Step("User see Pos Transactions Report in Report History")
    public void userSeePosTransactionsReportInReportHistory() {
        postransactionspage.seePosTransactionsReportExportToHistoryReportType();
    }
}
