package serenitysteps;

import net.thucydides.core.annotations.Step;
import pages.MerchantsPage;

public class MerchantsPageSteps {
    MerchantsPage merchantPage;

    @Step("User click merchants sub left menu")
    public void userClickMerchantsSubLeftMenu() {
        merchantPage.leftSubMenuMerchantsSubmit();
    }

    @Step("User see merchants Page")
    public void userSeeMerchantsPage() throws Exception {
        merchantPage.merchantPagePageControlUrl();
    }

    @Step("User see all elements in Merchant Management Page")
    public void userSeeAllElementsInMerchantManagementPage() {
        merchantPage.merchantsPageAllElementsAreDisplayed();
    }

    @Step("User click more filters in Merchant Management Page")
    public void userClickMoreFiltersInMerchantManagementPage() {
        merchantPage.leftSubMenuMerchantsMoreFiltersSubmit();
    }

    @Step("User click date range button in Merchant Management Page")
    public void merchantsPageClickDateRangeButton() {
        merchantPage.merchantsPageClickDateRangeButton();
    }

    @Step("User choose start date in in Merchant Management Page")
    public void merchantsPageChooseStartDate(String startDate) {
        merchantPage.merchantsPageChooseStartDate(startDate);
    }

    @Step("User choose end date in in Merchant Management Page")
    public void merchantsPageChooseEndDate(String endDate) {
        merchantPage.merchantsPageChooseEndDate(endDate);
        merchantPage.merchantsPageCloseDateRange();
    }

    @Step("User click date range month button in Merchant Management Page")
    public void merchantsPageClickDateRangeMonthButton() {
        merchantPage.merchantsPageClickDateRangeMonth();
    }

    @Step("User click date range day button in Merchant Management Page")
    public void merchantsPageClickDateRangeDayButton() {
        merchantPage.merchantsPageClickDateRangeDay();
    }

    @Step("User click date range year icon button in Merchant Management Page")
    public void merchantsPageClickDateRangeYearIconButton() {
        merchantPage.merchantsPageClickDateRangeYearIcon();
    }

    @Step("User click date range year button in Merchant Management Page")
    public void merchantsPageClickDateRangeYearButton() {
        merchantPage.merchantsPageClickDateRangeYear();
    }

    @Step("User type merchant name in Merchant Management Page")
    public void userTypeMerchantNameInMerchantManagementPage() {
        merchantPage.typeMerchantNameMerchantsPageSubmit();
    }

    @Step("User type merchant legal name in Merchant Management Page")
    public void userTypeMerchantLegalNameInMerchantManagementPage() {
        merchantPage.typeMerchantLegalNameMerchantsPageSubmit();
    }

    @Step("User type authorized name in Merchant Management Page")
    public void userTypeAuthorizedNameInMerchantManagementPage() {
        merchantPage.typeMerchantAuthorizedNameMerchantsPageSubmit();
    }

    @Step("User type authorized email in Merchant Management Page")
    public void userTypeAuthorizedEmailInMerchantManagementPage() {
        merchantPage.typeMerchantAuthorizedEmailMerchantsPageSubmit();
    }

    @Step("User type authorized phone number in Merchant Management Page")
    public void userTypeAuthorizedPhoneNumberInMerchantManagementPage() {
        merchantPage.typeMerchantAuthorizedPhoneNoMerchantsPageSubmit();
    }

    @Step("User click status filter in Merchant Management Page")
    public void userClickStatusFilterInMerchantManagementPage() {
        merchantPage.merchantsPageClickStatus();
    }

    @Step("User select status in Merchant Management Page")
    public void userSelectStatusInMerchantManagementPage() {
        merchantPage.merchantsPageClickStatusSelectSubmit();
    }

    @Step("User click date type filter in Merchant Management Page")
    public void userClickDateTypeFilterInMerchantManagementPage() {
        merchantPage.merchantsPageClickDateType();
    }

    @Step("User select date type in Merchant Management Page")
    public void userSelectDateTypeInMerchantManagementPage() {
        merchantPage.merchantsPageClickDateTypeSelectSubmit();
    }

    @Step("User click search button in Merchant Management Page")
    public void userClickSearchButtonInMerchantManagementPage() {
        merchantPage.merchantsPageClickSearchButton();
    }

    @Step("User see merchant name on list in Merchant Management Page")
    public void userSeeMerchantNameOnListInMerchantManagementPage() {
        merchantPage.seeMerchantNameOnListMerchantsPage();
    }

    @Step("User click merchant detail in Merchant Management Page")
    public void userClickMerchantDetailInMerchantManagementPage() {
        merchantPage.merchantsDetailButtonSubmit();
    }

    @Step("User see merchant name of merchant detail in Merchant Management Page")
    public void userSeeMerchantNameOfMerchantDetailInMerchantManagementPage() {
        merchantPage.seeMerchantNameOfMerchantsDetail();
    }
}
