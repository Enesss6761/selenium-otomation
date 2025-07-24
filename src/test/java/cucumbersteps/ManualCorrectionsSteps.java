package cucumbersteps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import serenitysteps.ManualCorrectionsPageSteps;

public class ManualCorrectionsSteps {
    @Steps
    ManualCorrectionsPageSteps manualcorrectionspagesteps;

    @And("User click manual corrections sub left menu")
    public void userClickManualCorrectionsSubLeftMenu() {
        manualcorrectionspagesteps.userClickManualCorrectionsSubLeftMenu();
    }

    @And("User see manual corrections Page")
    public void userSeeManualCorrectionsPage() throws Exception {
        manualcorrectionspagesteps.userSeeManualCorrectionsPage();
    }

    @And("User click more filters in Manual Corrections Page")
    public void userClickMoreFiltersInManualCorrectionsPage() {
        manualcorrectionspagesteps.userClickMoreFiltersInManualCorrectionsPage();
    }

    @When("User see all elements in Manual Corrections Page")
    public void userSeeAllElementsInManualCorrectionsPage() {
        manualcorrectionspagesteps.userSeeAllElementsInManualCorrectionsPage();
    }

    @And("User click add in Manual Corrections Page")
    public void userClickAddInManualCorrectionsPage() {
        manualcorrectionspagesteps.userClickAddInManualCorrectionsPage();
    }

    @When("User see Add Manual Corrections")
    public void userSeeAddManualCorrections() {
        manualcorrectionspagesteps.userSeeAddManualCorrections();
    }

    @Then("User see all elements in Manual Corrections Add Page")
    public void userSeeAllElementsInManualCorrectionsAddPage() {
        manualcorrectionspagesteps.userSeeAllElementsInManualCorrectionsAddPage();
    }

    @And("User filter by date {string} between {string} days in Manual Corrections Page")
    public void userFilterByDateBetweenDaysInManualCorrectionsPage(String startDay, String endDay) {
        manualcorrectionspagesteps.manualCorrectionsPageClickStartDateButton();
        manualcorrectionspagesteps.manualCorrectionsPageChooseStartDate(startDay);
        manualcorrectionspagesteps.manualCorrectionsPageClickEndDateButton();
        manualcorrectionspagesteps.manualCorrectionsPageChooseEndDate(endDay);
    }

    @And("User click status in Manual Corrections Page")
    public void userClickStatusInManualCorrectionsPage() {
        manualcorrectionspagesteps.userClickStatusInManualCorrectionsPage();
    }

    @And("User select status in Manual Corrections Page")
    public void userSelectStatusInManualCorrectionsPage() {
        manualcorrectionspagesteps.userSelectStatusInManualCorrectionsPage();
    }

    @And("User click Merchant Filter in Manual Corrections Page")
    public void userClickMerchantFilterInManualCorrectionsPage() {
        manualcorrectionspagesteps.userClickMerchantFilterInManualCorrectionsPage();
    }

    @And("User type merchant name to search field in Manual Corrections Page")
    public void userTypeMerchantNameToSearchFieldInManualCorrectionsPage() {
        manualcorrectionspagesteps.userTypeMerchantNameToSearchFieldInManualCorrectionsPage();
    }

    @And("User click merchant name search in Manual Corrections Page")
    public void userClickMerchantNameSearchInManualCorrectionsPage() {
        manualcorrectionspagesteps.userClickMerchantNameSearchInManualCorrectionsPage();
    }

    @And("User click merchant name selection in Manual Corrections Page")
    public void userClickMerchantNameSelectionInManualCorrectionsPage() {
        manualcorrectionspagesteps.userClickMerchantNameSelectionInManualCorrectionsPage();
    }

    @And("User click report type in Manual Corrections Page")
    public void userClickReportTypeInManualCorrectionsPage() {
        manualcorrectionspagesteps.userClickReportTypeInManualCorrectionsPage();
    }

    @And("User select report type in Manual Corrections Page")
    public void userSelectReportTypeInManualCorrectionsPage() {
        manualcorrectionspagesteps.userSelectReportTypeInManualCorrectionsPage();
    }

    @When("User click search button in Manual Corrections Page")
    public void userClickSearchButtonInManualCorrectionsPage() {
        manualcorrectionspagesteps.userClickSearchButtonInManualCorrectionsPage();
    }

    @Then("User see transactions records on list in Manual Corrections Page")
    public void userSeeTransactionsRecordsOnListInManualCorrectionsPage() {
        manualcorrectionspagesteps.userSeeTransactionsRecordsOnListInManualCorrectionsPage();
    }

    @And("User click add new manual correction in Manual Corrections Page")
    public void userClickAddNewManualCorrectionInManualCorrectionsPage() {
        manualcorrectionspagesteps.userClickAddNewManualCorrectionInManualCorrectionsPage();
    }

    @And("User click new manual correction merchant filter in Manual Corrections Page")
    public void userClickNewManualCorrectionMerchantFilterInManualCorrectionsPage() {
        manualcorrectionspagesteps.userClickNewManualCorrectionMerchantFilterInManualCorrectionsPage();
    }

    @And("User type new manual correction merchant name to search field in Manual Corrections Page")
    public void userTypeNewManualCorrectionMerchantNameToSearchFieldInManualCorrectionsPage() {
        manualcorrectionspagesteps.userTypeNewManualCorrectionMerchantNameToSearchFieldInManualCorrectionsPage();
    }

    @And("User click new manual correction merchant name search in Manual Corrections Page")
    public void userClickNewManualCorrectionMerchantNameSearchInManualCorrectionsPage() {
        manualcorrectionspagesteps.userClickNewManualCorrectionMerchantNameSearchInManualCorrectionsPage();
    }

    @And("User click new manual correction merchant name selection in Manual Corrections Page")
    public void userClickNewManualCorrectionMerchantNameSelectionInManualCorrectionsPage() {
        manualcorrectionspagesteps.userClickNewManualCorrectionMerchantNameSelectionInManualCorrectionsPage();
    }

    @And("User click new manual correction transaction type list in Manual Corrections Page")
    public void userClickNewManualCorrectionTransactionTypeListInManualCorrectionsPage() {
        manualcorrectionspagesteps.userClickNewManualCorrectionTransactionTypeListInManualCorrectionsPage();
    }

    @And("User select new manual correction transaction type in Manual Corrections Page")
    public void userSelectNewManualCorrectionTransactionTypeInManualCorrectionsPage() {
        manualcorrectionspagesteps.userSelectNewManualCorrectionTransactionTypeInManualCorrectionsPage();
    }

    @And("User type new manual correction gross amount in Manual Corrections Page")
    public void userTypeNewManualCorrectionGrossAmountInManualCorrectionsPage() {
        manualcorrectionspagesteps.userTypeNewManualCorrectionGrossAmountInManualCorrectionsPage();
    }

    @And("User click new manual correction currency list in Manual Corrections Page")
    public void userClickNewManualCorrectionCurrencyListInManualCorrectionsPage() {
        manualcorrectionspagesteps.userClickNewManualCorrectionCurrencyListInManualCorrectionsPage();
    }

    @And("User select new manual correction currency in Manual Corrections Page")
    public void userSelectNewManualCorrectionCurrencyInManualCorrectionsPage() {
        manualcorrectionspagesteps.userSelectNewManualCorrectionCurrencyInManualCorrectionsPage();
    }

    @And("User type new manual correction description in Manual Corrections Page")
    public void userTypeNewManualCorrectionDescriptionInManualCorrectionsPage() {
        manualcorrectionspagesteps.userTypeNewManualCorrectionDescriptionInManualCorrectionsPage();
    }

    @And("User click new manual correction save in Manual Corrections Page")
    public void userClickNewManualCorrectionSaveInManualCorrectionsPage() {
        manualcorrectionspagesteps.userClickNewManualCorrectionSaveInManualCorrectionsPage();
    }

    @And("User see success message in Manual Corrections Page")
    public void userSeeSuccessMessageInManualCorrectionsPage() {
        manualcorrectionspagesteps.userSeeSuccessMessageInManualCorrectionsPage();
    }

    @And("User click new manual corrections popup close in Manual Corrections Page")
    public void userClickNewManualCorrectionsPopupCloseInManualCorrectionsPage() {
        manualcorrectionspagesteps.userClickNewManualCorrectionsPopupCloseInManualCorrectionsPage();
    }

    @And("User click receipt in Manual Corrections Page")
    public void userClickReceiptInManualCorrectionsPage() {
        manualcorrectionspagesteps.userClickReceiptInManualCorrectionsPage();
    }

    @And("User see all elements in Manual Corrections Popup")
    public void userSeeAllElementsInManualCorrectionsPopup() {
        manualcorrectionspagesteps.userSeeAllElementsInManualCorrectionsPopup();
    }
}
