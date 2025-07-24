package serenitysteps;

import net.thucydides.core.annotations.Step;
import pages.ManualCorrectionsPage;


public class ManualCorrectionsPageSteps {
    ManualCorrectionsPage manualcorrectionspage;

    @Step("User click manual corrections sub left menu")
    public void userClickManualCorrectionsSubLeftMenu() {
        manualcorrectionspage.leftSubMenuManualCorrectionsSubmit();
    }

    @Step("User see manual corrections Page")
    public void userSeeManualCorrectionsPage() throws Exception {
        manualcorrectionspage.manualCorrectionsPageControlUrl();
    }

    @Step("User click more filters in Manual Corrections Page")
    public void userClickMoreFiltersInManualCorrectionsPage() {
        manualcorrectionspage.leftSubMenuManualCorrectionsMoreFiltersSubmit();
    }

    @Step("User see all elements in Manual Corrections Page")
    public void userSeeAllElementsInManualCorrectionsPage() {
        manualcorrectionspage.manualCorrectionsPageAllElementsAreDisplayed();
    }

    @Step("User click add in Manual Corrections Page")
    public void userClickAddInManualCorrectionsPage() {
        manualcorrectionspage.manualCorrectionsPageAddCorrectionsSubmit();
    }

    @Step("User see Add Manual Corrections")
    public void userSeeAddManualCorrections() {
        manualcorrectionspage.manualCorrectionsPageControlPopUp();
    }

    @Step("User see all elements in Manual Corrections Add Page")
    public void userSeeAllElementsInManualCorrectionsAddPage() {
        manualcorrectionspage.manualCorrectionsPageAddCorrectionsAllElementsAreDisplayed();
    }

    @Step("User click start date button in Manual Corrections Page")
    public void manualCorrectionsPageClickStartDateButton() {
        manualcorrectionspage.manualCorrectionsPageClickStartDateButton();
    }

    @Step("User choose start date in Manual Corrections Page")
    public void manualCorrectionsPageChooseStartDate(String startDate) {
        manualcorrectionspage.manualCorrectionsPageChooseStartDate(startDate);
    }

    @Step("User click end date button in Manual Corrections Page")
    public void manualCorrectionsPageClickEndDateButton() {

        manualcorrectionspage.manualCorrectionsPageClickEndDateButton();
    }

    @Step("User choose end date in Manual Corrections Page")
    public void manualCorrectionsPageChooseEndDate(String endDate) {
        manualcorrectionspage.manualCorrectionsPageChooseEndDate(endDate);
    }

    @Step("User click status in Manual Corrections Page")
    public void userClickStatusInManualCorrectionsPage() {
        manualcorrectionspage.manualCorrectionsStatusSubmit();
    }

    @Step("User select status in Manual Corrections Page")
    public void userSelectStatusInManualCorrectionsPage() {
        manualcorrectionspage.manualCorrectionsSelectSubmit();
    }

    @Step("User click Merchant Filter in Manual Corrections Page")
    public void userClickMerchantFilterInManualCorrectionsPage() {
        manualcorrectionspage.merchantListManualCorrectionsPageSubmit();
    }

    @Step("User type merchant name to search field in Manual Corrections Page")
    public void userTypeMerchantNameToSearchFieldInManualCorrectionsPage() {
        manualcorrectionspage.typeMerchantNameMerchantListManualCorrectionsPageSubmit();
    }

    @Step("User click merchant name search in Manual Corrections Page")
    public void userClickMerchantNameSearchInManualCorrectionsPage() {
        manualcorrectionspage.merchantListSearchManualCorrectionsPageSubmit();
    }

    @Step("User click merchant name selection in Manual Corrections Page")
    public void userClickMerchantNameSelectionInManualCorrectionsPage() {
        manualcorrectionspage.merchantListSelectedCheckboxManualCorrectionsPageSubmit();
    }

    @Step("User click report type in Manual Corrections Page")
    public void userClickReportTypeInManualCorrectionsPage() {
        manualcorrectionspage.manualCorrectionsReportTypeSubmit();
    }

    @Step("User select report type in Manual Corrections Page")
    public void userSelectReportTypeInManualCorrectionsPage() {
        manualcorrectionspage.manualCorrectionsReportTypeSelectSubmit();
    }

    @Step("User click search button in Manual Corrections Page")
    public void userClickSearchButtonInManualCorrectionsPage() {
        manualcorrectionspage.manualCorrectionsSearchSubmit();
    }

    @Step("User see transactions records on list in Manual Corrections Page")
    public void userSeeTransactionsRecordsOnListInManualCorrectionsPage() {
        manualcorrectionspage.seeTransactionRecordsOnListManualCorrectionsPage();
    }

    @Step("User click add new manual correction in Manual Corrections Page")
    public void userClickAddNewManualCorrectionInManualCorrectionsPage() {
        manualcorrectionspage.addNewManualCorrectionsSubmit();
    }

    @Step("User click new manual correction merchant filter in Manual Corrections Page")
    public void userClickNewManualCorrectionMerchantFilterInManualCorrectionsPage() {
        manualcorrectionspage.addNewManualCorrectionsMerchantListSubmit();
    }

    @Step("User type new manual correction merchant name to search field in Manual Corrections Page")
    public void userTypeNewManualCorrectionMerchantNameToSearchFieldInManualCorrectionsPage() {
        manualcorrectionspage.typeMerchantNameAddNewManualCorrectionsSubmit();
    }

    @Step("User click new manual correction merchant name search in Manual Corrections Page")
    public void userClickNewManualCorrectionMerchantNameSearchInManualCorrectionsPage() {
        manualcorrectionspage.addNewManualCorrectionsMerchantSearchSubmit();
    }

    @Step("User click new manual correction merchant name selection in Manual Corrections Page")
    public void userClickNewManualCorrectionMerchantNameSelectionInManualCorrectionsPage() {
        manualcorrectionspage.addNewManualCorrectionsMerchantSelectSubmit();
    }

    @Step("User click new manual correction transaction type list in Manual Corrections Page")
    public void userClickNewManualCorrectionTransactionTypeListInManualCorrectionsPage() {
        manualcorrectionspage.addNewManualCorrectionsTransactionTypeSubmit();
    }

    @Step("User select new manual correction transaction type in Manual Corrections Page")
    public void userSelectNewManualCorrectionTransactionTypeInManualCorrectionsPage() {
        manualcorrectionspage.addNewManualCorrectionsTransactionTypeSelectSubmit();
    }

    @Step("User type new manual correction gross amount in Manual Corrections Page")
    public void userTypeNewManualCorrectionGrossAmountInManualCorrectionsPage() {
        manualcorrectionspage.addNewManualCorrectionsGrossAmountTypeSubmit();
    }

    @Step("User click new manual correction currency list in Manual Corrections Page")
    public void userClickNewManualCorrectionCurrencyListInManualCorrectionsPage() {
        manualcorrectionspage.addNewManualCorrectionsCurrencySubmit();
    }

    @Step("User select new manual correction currency in Manual Corrections Page")
    public void userSelectNewManualCorrectionCurrencyInManualCorrectionsPage() {
        manualcorrectionspage.addNewManualCorrectionsCurrencySelectSubmit();
    }

    @Step("User type new manual correction description in Manual Corrections Page")
    public void userTypeNewManualCorrectionDescriptionInManualCorrectionsPage() {
        manualcorrectionspage.typeDescriptionAddNewManualCorrectionsSubmit();
    }

    @Step("User click new manual correction save in Manual Corrections Page")
    public void userClickNewManualCorrectionSaveInManualCorrectionsPage() {
        manualcorrectionspage.addNewManualCorrectionsSaveSubmit();
    }

    @Step("User see success message in Manual Corrections Page")
    public void userSeeSuccessMessageInManualCorrectionsPage() {
        manualcorrectionspage.seeSuccessMessageManualCorrectionsPage();
    }

    @Step("User click new manual corrections popup close in Manual Corrections Page")
    public void userClickNewManualCorrectionsPopupCloseInManualCorrectionsPage() {
        manualcorrectionspage.addNewManualCorrectionsCancelSubmit();
    }

    @Step("User click receipt in Manual Corrections Page")
    public void userClickReceiptInManualCorrectionsPage() {
        manualcorrectionspage.manualCorrectionsReceiptSubmit();
    }

    @Step("User see all elements in Manual Corrections Popup")
    public void userSeeAllElementsInManualCorrectionsPopup() {
        manualcorrectionspage.manualCorrectionsPageReceiptAllElementsAreDisplayed();
        manualcorrectionspage.manualCorrectionsPageReceiptPopUpControlTitle();
    }
}
