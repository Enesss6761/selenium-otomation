package serenitysteps;

import net.thucydides.core.annotations.Step;
import pages.MerchantPayoutsPage;

public class MerchantPayoutsPageSteps {
    MerchantPayoutsPage merchantpayoutspage;

    @Step("User click merchant payouts sub left menu")
    public void userClickMerchantPayoutsSubLeftMenu() {
        merchantpayoutspage.leftSubMenuMerchantPayoutsSubmit();
    }

    @Step("User see merchant payouts Page")
    public void userSeeMerchantPayoutsPage() throws Exception {
        merchantpayoutspage.merchantPayoutsPagePageControlUrl();
    }

    @Step("User click more filters in Merchant Payouts Page")
    public void userClickMoreFiltersInMerchantPayoutsPage() {
        merchantpayoutspage.leftSubMenuMerchantPayoutsMoreFiltersSubmit();
    }

    @Step("User see all elements in Merchant Payouts Page")
    public void userSeeAllElementsInMerchantPayoutsPage() {
        merchantpayoutspage.merchantPayoutsPageAllElementsAreDisplayed();
    }

    @Step("User click add in Merchant Payouts Page")
    public void userClickAddInMerchantPayoutsPage() {
        merchantpayoutspage.merchantPayoutsPageAddPayoutSubmit();
    }

    @Step("User see Add Payouts Page")
    public void userSeeAddPayoutsPage() {
        merchantpayoutspage.merchantPayoutsPageControlPopUp();
    }

    @Step("User see all elements in Payout Add Page")
    public void userSeeAllElementsInPayoutAddPage() {
        merchantpayoutspage.merchantPayoutsPageAddPayoutAllElementsAreDisplayed();
    }

    @Step("User click start date button in Merchant Payouts Page")
    public void merchantPayoutsPageClickStartDateButton() {
        merchantpayoutspage.merchantPayoutsPageClickStartDateButton();
    }

    @Step("User choose start date in Merchant Payouts Page")
    public void merchantPayoutsPageChooseStartDate(String startDate) {
        merchantpayoutspage.merchantPayoutsPageChooseStartDate(startDate);
    }

    @Step("User click end date button in Merchant Payouts Page")
    public void merchantPayoutsPageClickEndDateButton() {

        merchantpayoutspage.merchantPayoutsPageClickEndDateButton();
    }

    @Step("User choose end date in Merchant Payouts Page")
    public void merchantPayoutsPageChooseEndDate(String endDate) {
        merchantpayoutspage.merchantPayoutsPageChooseEndDate(endDate);
    }

    @Step("User click status in Merchant Payouts Page")
    public void userClickStatusInMerchantPayoutsPage() {
        merchantpayoutspage.merchantPayoutsStatusSubmit();
    }

    @Step("User select status in Merchant Payouts Page")
    public void userSelectStatusInMerchantPayoutsPage() {
        merchantpayoutspage.merchantPayoutsSelectSubmit();
    }

    @Step("User click Merchant Filter in Merchant Payouts Page")
    public void userClickMerchantFilterInMerchantPayoutsPage() {
        merchantpayoutspage.merchantListMerchantPayoutsPageSubmit();
    }

    @Step("User type merchant name to search field in Merchant Payouts Page")
    public void userTypeMerchantNameToSearchFieldInMerchantPayoutsPage() {
        merchantpayoutspage.typeMerchantNameMerchantListMerchantPayoutsPageSubmit();
    }

    @Step("User click merchant name search in Merchant Payouts Page")
    public void userClickMerchantNameSearchInMerchantPayoutsPage() {
        merchantpayoutspage.merchantListSearchMerchantPayoutsPageSubmit();
    }

    @Step("User click merchant name selection in Merchant Payouts Page")
    public void userClickMerchantNameSelectionInMerchantPayoutsPage() {
        merchantpayoutspage.merchantListSelectedCheckboxMerchantPayoutsSubmit();
    }

    @Step("User click search button in Merchant Payouts Page")
    public void userClickSearchButtonInMerchantPayoutsPage() {
        merchantpayoutspage.merchantPayoutsSearchSubmit();
    }

    @Step("User see transactions records on list in Merchant Payouts Page")
    public void userSeeTransactionsRecordsOnListInMerchantPayoutsPage() {
        merchantpayoutspage.seeTransactionRecordsOnListMerchantPayoutsPage();
    }

    @Step("User click receipt in Merchant Payouts Page")
    public void userClickReceiptInMerchantPayoutsPage() {
        merchantpayoutspage.merchantPayoutsReceiptSubmit();
    }

    @Step("User see all elements in Payout Receipt Popup")
    public void userSeeAllElementsInPayoutReceiptPopup() {
        merchantpayoutspage.merchantPayoutsPageReceiptAllElementsAreDisplayed();
        merchantpayoutspage.merchantPayoutsPageReceiptPopUpControlTitle();
    }

    @Step("User click add new merchant payouts in Merchant Payouts Page")
    public void userClickAddNewMerchantPayoutsInMerchantPayoutsPage() {
        merchantpayoutspage.merchantPayoutsAddNewMerchantPayoutsSubmit();
    }

    @Step("User click new merchant payouts merchant filter in Merchant Payouts Page")
    public void userClickNewMerchantPayoutsMerchantFilterInMerchantPayoutsPage() {
        merchantpayoutspage.addNewMerchantPayoutsMerchantListSubmit();
    }

    @Step("User type new merchant payouts merchant name to search field in Merchant Payouts Page")
    public void userTypeNewMerchantPayoutsMerchantNameToSearchFieldInMerchantPayoutsPage() {
        merchantpayoutspage.typeMerchantNameAddNewMerchantPayoutsSubmit();
    }

    @Step("User click new merchant payouts merchant name search in Merchant Payouts Page")
    public void userClickNewMerchantPayoutsMerchantNameSearchInMerchantPayoutsPage() {
        merchantpayoutspage.addNewMerchantPayoutsMerchantSearchSubmit();
    }

    @Step("User click new merchant payouts merchant name selection in Merchant Payouts Page")
    public void userClickNewMerchantPayoutsMerchantNameSelectionInMerchantPayoutsPage() {
        merchantpayoutspage.addNewMerchantPayoutsMerchantSelectSubmit();
    }

    @Step("User type new payouts gross amount in Merchant Payouts Page")
    public void userTypeNewPayoutsGrossAmountInMerchantPayoutsPage() {
        merchantpayoutspage.addNewMerchantPayoutsGrossAmountType();
    }

    @Step("User type new payouts net amount in Merchant Payouts Page")
    public void userTypeNewPayoutsNetAmountInMerchantPayoutsPage() {
        merchantpayoutspage.addNewMerchantPayoutsNetAmountType();
    }

    @Step("User type new merchant commission amount amount in Merchant Payouts Page")
    public void userTypeNewMerchantCommissionAmountAmountInMerchantPayoutsPage() {
        merchantpayoutspage.addNewMerchantPayoutsMerchantCommissionAmountType();
    }

    @Step("User click new payouts currency list in Merchant Payouts Page")
    public void userClickNewPayoutsCurrencyListInMerchantPayoutsPage() {
        merchantpayoutspage.addNewMerchantPayoutsCurrencySubmit();
    }

    @Step("User select new payouts currency in Merchant Payouts Page")
    public void userSelectNewPayoutsCurrencyInMerchantPayoutsPage() {
        merchantpayoutspage.addNewMerchantPayoutsCurrencySelectSubmit();
    }

    @Step("User click new payouts save in Merchant Payouts Page")
    public void userClickNewPayoutsSaveInMerchantPayoutsPage() {
        merchantpayoutspage.addNewMerchantPayoutsSaveSubmit();
    }

    @Step("User see success message in Merchant Payouts Page")
    public void userSeeSuccessMessageInMerchantPayoutsPage() {
        merchantpayoutspage.seeSuccessMessageMerchantPayoutsPage();
    }
}
