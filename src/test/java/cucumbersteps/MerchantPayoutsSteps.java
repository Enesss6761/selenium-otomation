package cucumbersteps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import serenitysteps.MerchantPayoutsPageSteps;

public class MerchantPayoutsSteps {
    @Steps
    MerchantPayoutsPageSteps merchantpayoutspagesteps;

    @And("User click merchant payouts sub left menu")
    public void userClickMerchantPayoutsSubLeftMenu() {
        merchantpayoutspagesteps.userClickMerchantPayoutsSubLeftMenu();
    }

    @And("User see merchant payouts Page")
    public void userSeeMerchantPayoutPage() throws Exception {
        merchantpayoutspagesteps.userSeeMerchantPayoutsPage();
    }

    @When("User click more filters in Merchant Payouts Page")
    public void userClickMoreFiltersInMerchantPayoutsPage() {
        merchantpayoutspagesteps.userClickMoreFiltersInMerchantPayoutsPage();
    }

    @Then("User see all elements in Merchant Payouts Page")
    public void userSeeAllElementsInMerchantPayoutsPage() {
        merchantpayoutspagesteps.userSeeAllElementsInMerchantPayoutsPage();
    }

    @And("User click add in Merchant Payouts Page")
    public void userClickAddInMerchantPayoutsPage() {
        merchantpayoutspagesteps.userClickAddInMerchantPayoutsPage();
    }

    @When("User see Add Payouts Page")
    public void userSeeAddPayoutsPage() {
        merchantpayoutspagesteps.userSeeAddPayoutsPage();
    }

    @Then("User see all elements in Payout Add Page")
    public void userSeeAllElementsInPayoutAddPage() {
        merchantpayoutspagesteps.userSeeAllElementsInPayoutAddPage();
    }

    @And("User filter by date {string} between {string} days in Merchant Payouts Page")
    public void userFilterByDateBetweenDaysInMerchantPayoutsPage(String startDay, String endDay) {
        merchantpayoutspagesteps.merchantPayoutsPageClickStartDateButton();
        merchantpayoutspagesteps.merchantPayoutsPageChooseStartDate(startDay);
        merchantpayoutspagesteps.merchantPayoutsPageClickEndDateButton();
        merchantpayoutspagesteps.merchantPayoutsPageChooseEndDate(endDay);
    }

    @And("User click status in Merchant Payouts Page")
    public void userClickStatusInMerchantPayoutsPage() {
        merchantpayoutspagesteps.userClickStatusInMerchantPayoutsPage();
    }

    @And("User select status in Merchant Payouts Page")
    public void userSelectStatusInMerchantPayoutsPage() {
        merchantpayoutspagesteps.userSelectStatusInMerchantPayoutsPage();
    }

    @And("User click Merchant Filter in Merchant Payouts Page")
    public void userClickMerchantFilterInMerchantPayoutsPage() {
        merchantpayoutspagesteps.userClickMerchantFilterInMerchantPayoutsPage();
    }

    @And("User type merchant name to search field in Merchant Payouts Page")
    public void userTypeMerchantNameToSearchFieldInMerchantPayoutsPage() {
        merchantpayoutspagesteps.userTypeMerchantNameToSearchFieldInMerchantPayoutsPage();
    }

    @And("User click merchant name search in Merchant Payouts Page")
    public void userClickMerchantNameSearchInMerchantPayoutsPage() {
        merchantpayoutspagesteps.userClickMerchantNameSearchInMerchantPayoutsPage();
    }

    @And("User click merchant name selection in Merchant Payouts Page")
    public void userClickMerchantNameSelectionInMerchantPayoutsPage() {
        merchantpayoutspagesteps.userClickMerchantNameSelectionInMerchantPayoutsPage();
    }

    @When("User click search button in Merchant Payouts Page")
    public void userClickSearchButtonInMerchantPayoutsPage() {
        merchantpayoutspagesteps.userClickSearchButtonInMerchantPayoutsPage();
    }

    @Then("User see transactions records on list in Merchant Payouts Page")
    public void userSeeTransactionsRecordsOnListInMerchantPayoutsPage() {
        merchantpayoutspagesteps.userSeeTransactionsRecordsOnListInMerchantPayoutsPage();
    }

    @And("User click receipt in Merchant Payouts Page")
    public void userClickReceiptInMerchantPayoutsPage() {
        merchantpayoutspagesteps.userClickReceiptInMerchantPayoutsPage();
    }

    @And("User see all elements in Payout Receipt Popup")
    public void userSeeAllElementsInPayoutReceiptPopup() {
        merchantpayoutspagesteps.userSeeAllElementsInPayoutReceiptPopup();
    }

    @And("User click add new merchant payouts in Merchant Payouts Page")
    public void userClickAddNewMerchantPayoutsInMerchantPayoutsPage() {
        merchantpayoutspagesteps.userClickAddNewMerchantPayoutsInMerchantPayoutsPage();
    }

    @And("User click new merchant payouts merchant filter in Merchant Payouts Page")
    public void userClickNewMerchantPayoutsMerchantFilterInMerchantPayoutsPage() {
        merchantpayoutspagesteps.userClickNewMerchantPayoutsMerchantFilterInMerchantPayoutsPage();
    }

    @And("User type new merchant payouts merchant name to search field in Merchant Payouts Page")
    public void userTypeNewMerchantPayoutsMerchantNameToSearchFieldInMerchantPayoutsPage() {
        merchantpayoutspagesteps.userTypeNewMerchantPayoutsMerchantNameToSearchFieldInMerchantPayoutsPage();
    }

    @And("User click new merchant payouts merchant name search in Merchant Payouts Page")
    public void userClickNewMerchantPayoutsMerchantNameSearchInMerchantPayoutsPage() {
        merchantpayoutspagesteps.userClickNewMerchantPayoutsMerchantNameSearchInMerchantPayoutsPage();
    }

    @And("User click new merchant payouts merchant name selection in Merchant Payouts Page")
    public void userClickNewMerchantPayoutsMerchantNameSelectionInMerchantPayoutsPage() {
        merchantpayoutspagesteps.userClickNewMerchantPayoutsMerchantNameSelectionInMerchantPayoutsPage();
    }

    @And("User type new payouts gross amount in Merchant Payouts Page")
    public void userTypeNewPayoutsGrossAmountInMerchantPayoutsPage() {
        merchantpayoutspagesteps.userTypeNewPayoutsGrossAmountInMerchantPayoutsPage();
    }

    @And("User type new payouts net amount in Merchant Payouts Page")
    public void userTypeNewPayoutsNetAmountInMerchantPayoutsPage() {
        merchantpayoutspagesteps.userTypeNewPayoutsNetAmountInMerchantPayoutsPage();
    }

    @And("User type new merchant commission amount amount in Merchant Payouts Page")
    public void userTypeNewMerchantCommissionAmountAmountInMerchantPayoutsPage() {
        merchantpayoutspagesteps.userTypeNewMerchantCommissionAmountAmountInMerchantPayoutsPage();
    }

    @And("User click new payouts currency list in Merchant Payouts Page")
    public void userClickNewPayoutsCurrencyListInMerchantPayoutsPage() {
        merchantpayoutspagesteps.userClickNewPayoutsCurrencyListInMerchantPayoutsPage();
    }

    @And("User select new payouts currency in Merchant Payouts Page")
    public void userSelectNewPayoutsCurrencyInMerchantPayoutsPage() {
        merchantpayoutspagesteps.userSelectNewPayoutsCurrencyInMerchantPayoutsPage();
    }

    @And("User click new payouts save in Merchant Payouts Page")
    public void userClickNewPayoutsSaveInMerchantPayoutsPage() {
        merchantpayoutspagesteps.userClickNewPayoutsSaveInMerchantPayoutsPage();
    }

    @And("User see success message in Merchant Payouts Page")
    public void userSeeSuccessMessageInMerchantPayoutsPage() {
        merchantpayoutspagesteps.userSeeSuccessMessageInMerchantPayoutsPage();
    }
}
