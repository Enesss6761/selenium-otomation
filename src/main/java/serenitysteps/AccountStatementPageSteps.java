package serenitysteps;

import net.thucydides.core.annotations.Step;
import pages.AccountStatementPage;

public class AccountStatementPageSteps {
    AccountStatementPage accountstatementpage;

    @Step("User click account statement sub left menu")
    public void userClickAccountStatementSubLeftMenu() {
        accountstatementpage.leftSubMenuAccountStatementSubmit();
    }

    @Step("User see account statement Page")
    public void userSeeAccountStatementPage() throws Exception {
        accountstatementpage.accountStatementPageControlUrl();
    }

    @Step("User click more filters in Account Statement Page")
    public void userClickMoreFiltersInAccountStatementPage() {
        accountstatementpage.leftSubMenuAccountStatementMoreFiltersSubmit();
    }

    @Step("User see all elements in Account Statement Page")
    public void userSeeAllElementsInAccountStatementPage() {
        accountstatementpage.accountStatementPageAllElementsAreDisplayed();
    }

    @Step("User click Merchant Filter in Account Statement Page")
    public void userClickMerchantFilterInAccountStatementPage() {
        accountstatementpage.merchantListAccountStatementReportSubmit();
    }

    @Step("User type merchant name to search field in Account Statement Page")
    public void userTypeMerchantNameToSearchFieldInAccountStatementPage() {
        accountstatementpage.typeMerchantNameMerchantListAccountStatementReportSubmit();
    }

    @Step("User click merchant name search in Account Statement Page")
    public void userClickMerchantNameSearchInAccountStatementPage() {
        accountstatementpage.merchantListSearchAccountStatementReportSubmit();
    }

    @Step("User click merchant name selection in Account Statement Page")
    public void userClickMerchantNameSelectionInAccountStatementPage() {
        accountstatementpage.merchantListSelectedCheckboxAccountStatementReportSubmit();
    }

    @Step("User click Bank PF Filter in Account Statement Page")
    public void userClickBankPFFilterInAccountStatementPage() {
        accountstatementpage.bankListAccountStatementReportSubmit();
    }

    @Step("User type bank name to search field in Account Statement Page")
    public void userTypeBankNameToSearchFieldInAccountStatementPage() {
        accountstatementpage.typeBankNameBankListAccountStatementReportSubmit();
    }

    @Step("User click bank name to search field in Account Statement Page")
    public void userClickBankNameToSearchFieldInAccountStatementPage() {
        accountstatementpage.bankListSearchAccountStatementReportSubmit();
    }

    @Step("User click bank name selection in Account Statement Page")
    public void userClickBankNameSelectionInAccountStatementPage() {
        accountstatementpage.bankListSelectedCheckboxAccountStatementReportSubmit();
    }

    @Step("User click Pos Filter in Account Statement Page")
    public void userClickPosFilterInAccountStatementPage() {
        accountstatementpage.posListAccountStatementReportSubmit();
    }

    @Step("User type Pos to search field in Account Statement Page")
    public void userTypePosToSearchFieldInAccountStatementPage() {
        accountstatementpage.typePosNamePosListAccountStatementReportSubmit();
    }

    @Step("User click Pos to search field in Account Statement Page")
    public void userClickPosToSearchFieldInAccountStatementPage() {
        accountstatementpage.posListSearchAccountStatementReportSubmit();
    }

    @Step("User click Pos selection in Account Statement Page")
    public void userClickPosSelectionInAccountStatementPage() {
        accountstatementpage.posListSelectedCheckboxAccountStatementReportSubmit();
    }

    @Step("User type order id in Account Statement Page")
    public void userTypeOrderIdInAccountStatementPage(String orderId) {
        accountstatementpage.typeTransactionIdAccountStatementReportSubmit(orderId);
    }

    @Step("User click transaction type in Account Statement Page")
    public void userClickTransactionTypeInAccountStatementPage() {
        accountstatementpage.transactionTypeAccountStatementReportSubmit();
    }

    @Step("User select transaction type in Account Statement Page")
    public void userSelectTransactionTypeInAccountStatementPage() {
        accountstatementpage.transactionTypeSelectAccountStatementReportSubmit();
    }

    @Step("User click search button in Account Statement Page")
    public void userClickSearchButtonInAccountStatementPage() {
        accountstatementpage.accountStatementReportSearchSubmit();
    }

    @Step("User see transaction records on list in Account Statement Page")
    public void userSeeTransactionRecordsOnListInAccountStatementPage() {
        accountstatementpage.seeTransactionRecordsOnListAccountStatementReport();
    }

    @Step("User click start date button in Account Statement Page")
    public void accountStatementPageClickStartDateButton() {
        accountstatementpage.accountStatementPageClickStartDateButton();
    }

    @Step("User choose start date in Account Statement Page")
    public void accountStatementPageChooseStartDate(String startDate) {
        accountstatementpage.accountStatementPageChooseStartDate(startDate);
    }

    @Step("User click end date button in Account Statement Page")
    public void accountStatementPageClickEndDateButton() {
        accountstatementpage.accountStatementPageClickEndDateButton();
    }

    @Step("User choose end date in Account Statement Page")
    public void accountStatementPageChooseEndDate(String endDate) {
        accountstatementpage.accountStatementPageChooseEndDate(endDate);
    }

    @Step("User click Account Statement Report Export")
    public void userClickAccountStatementReportExport() {
        accountstatementpage.accountStatementReportExportSubmit();
    }

    @Step("User see success message on Account Statement Report Page")
    public void userSeeSuccessMessageOnAccountStatementReportPage() {
        accountstatementpage.seeAccountStatementReportExportSuccessMessage();
    }

    @Step("User click Account Statement Report Export History")
    public void userClickAccountStatementReportExportHistory() {
        accountstatementpage.accountStatementReportExportHistorySubmit();
    }

    @Step("User see Account Statement Report in Report History")
    public void userSeeAccountStatementReportInReportHistory() {
        accountstatementpage.seeAccountStatementReportExportToHistoryReportType();
    }
}
