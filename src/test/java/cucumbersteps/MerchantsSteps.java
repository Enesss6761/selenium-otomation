package cucumbersteps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import serenitysteps.MerchantsPageSteps;

public class MerchantsSteps {
    @Steps
    MerchantsPageSteps merchantspagesteps;

    @When("User see all elements in Merchant Management Page")
    public void userSeeAllElementsInMerchantManagementPage() {
        merchantspagesteps.userSeeAllElementsInMerchantManagementPage();
    }

    @And("User click merchants sub left menu")
    public void userClickMerchantsSubLeftMenu() {
        merchantspagesteps.userClickMerchantsSubLeftMenu();
    }

    @And("User see merchants Page")
    public void userSeeMerchantsPage() throws Exception {
        merchantspagesteps.userSeeMerchantsPage();
    }

    @And("User click more filters in Merchant Management Page")
    public void userClickMoreFiltersInMerchantManagementPage() {
        merchantspagesteps.userClickMoreFiltersInMerchantManagementPage();
    }

    @And("User filter by date {string} between {string} days in Merchant Management Page")
    public void userFilterByDateBetweenDaysInMerchantManagementPage(String startDay, String endDay) {
        merchantspagesteps.merchantsPageClickDateRangeButton();
        merchantspagesteps.merchantsPageClickDateRangeYearIconButton();
        merchantspagesteps.merchantsPageClickDateRangeYearButton();
        merchantspagesteps.merchantsPageClickDateRangeMonthButton();
        merchantspagesteps.merchantsPageClickDateRangeDayButton();
        merchantspagesteps.merchantsPageChooseStartDate(startDay);
        merchantspagesteps.merchantsPageChooseEndDate(endDay);
    }

    @And("User type merchant name in Merchant Management Page")
    public void userTypeMerchantNameInMerchantManagementPage() {
        merchantspagesteps.userTypeMerchantNameInMerchantManagementPage();
    }

    @And("User type merchant legal name in Merchant Management Page")
    public void userTypeMerchantLegalNameInMerchantManagementPage() {
        merchantspagesteps.userTypeMerchantLegalNameInMerchantManagementPage();
    }

    @And("User type authorized name in Merchant Management Page")
    public void userTypeAuthorizedNameInMerchantManagementPage() {
        merchantspagesteps.userTypeAuthorizedNameInMerchantManagementPage();
    }

    @And("User type authorized email in Merchant Management Page")
    public void userTypeAuthorizedEmailInMerchantManagementPage() {
        merchantspagesteps.userTypeAuthorizedEmailInMerchantManagementPage();
    }

    @And("User type authorized phone number in Merchant Management Page")
    public void userTypeAuthorizedPhoneNumberInMerchantManagementPage() {
        merchantspagesteps.userTypeAuthorizedPhoneNumberInMerchantManagementPage();
    }

    @And("User click status filter in Merchant Management Page")
    public void userClickStatusFilterInMerchantManagementPage() {
        merchantspagesteps.userClickStatusFilterInMerchantManagementPage();
    }

    @And("User select status in Merchant Management Page")
    public void userSelectStatusInMerchantManagementPage() {
        merchantspagesteps.userSelectStatusInMerchantManagementPage();
    }

    @And("User click date type filter in Merchant Management Page")
    public void userClickDateTypeFilterInMerchantManagementPage() {
        merchantspagesteps.userClickDateTypeFilterInMerchantManagementPage();
    }

    @And("User select date type in Merchant Management Page")
    public void userSelectDateTypeInMerchantManagementPage() {
        merchantspagesteps.userSelectDateTypeInMerchantManagementPage();
    }

    @When("User click search button in Merchant Management Page")
    public void userClickSearchButtonInMerchantManagementPage() {
        merchantspagesteps.userClickSearchButtonInMerchantManagementPage();
    }

    @Then("User see merchant name on list in Merchant Management Page")
    public void userSeeMerchantNameOnListInMerchantManagementPage() {
        merchantspagesteps.userSeeMerchantNameOnListInMerchantManagementPage();
    }

    @And("User click merchant detail in Merchant Management Page")
    public void userClickMerchantDetailInMerchantManagementPage() {
        merchantspagesteps.userClickMerchantDetailInMerchantManagementPage();
    }

    @When("User see merchant name of merchant detail in Merchant Management Page")
    public void userSeeMerchantNameOfMerchantDetailInMerchantManagementPage() {
        merchantspagesteps.userSeeMerchantNameOfMerchantDetailInMerchantManagementPage();
    }
}
