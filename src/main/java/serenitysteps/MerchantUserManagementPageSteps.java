package serenitysteps;

import net.thucydides.core.annotations.Step;
import pages.MerchantUserManagementPage;

public class MerchantUserManagementPageSteps {
    MerchantUserManagementPage merchantusermanagementpage;

    @Step("User click merchant user management sub left menu")
    public void userClickMerchantUserManagementSubLeftMenu() {
        merchantusermanagementpage.leftSubMenuMerchantUserManagementSubmit();
    }

    @Step("User see merchants user management Page")
    public void userSeeMerchantsUserManagementPage() throws Exception {
        merchantusermanagementpage.merchantUserManagementPagePageControlUrl();
    }

    @Step("User see all elements in Merchant User Management Page")
    public void userSeeAllElementsInMerchantUserManagementPage() {
        merchantusermanagementpage.merchantUserManagementPageAllElementsAreDisplayed();
    }

    @Step("User click merchant user edit in Merchant User Management Page")
    public void userClickMerchantUserEditInMerchantUserManagementPage() {
        merchantusermanagementpage.merchantUserManagementPageEditSubmit();
    }

    @Step("User see all elements in Merchant User Management Edit Page")
    public void userSeeAllElementsInMerchantUserManagementEditPage() {
        merchantusermanagementpage.merchantUserManagementEditPageAllElementsAreDisplayed();
    }

    @Step("User click merchant list in Merchant User Management Page")
    public void userClickMerchantListInMerchantUserManagementPage() {
        merchantusermanagementpage.merchantUserManagementPageMerchantListSubmit();
    }

    @Step("User select merchant in Merchant User Management Page")
    public void userSelectMerchantInMerchantUserManagementPage() {
        merchantusermanagementpage.merchantUserManagementPageMerchantListSelectMerchant();
    }

    @Step("User type merchant user name to name field in Merchant User Management Page")
    public void userTypeMerchantUserNameToNameFieldInMerchantUserManagementPage() {
        merchantusermanagementpage.typeMerchantUserManagementPageName();
    }

    @Step("User type merchant user surname to surname field in Merchant User Management Page")
    public void userTypeMerchantUserSurnameToSurnameFieldInMerchantUserManagementPage() {
        merchantusermanagementpage.typeMerchantUserManagementPageSurname();
    }

    @Step("User type merchant user email to email field in Merchant User Management Page")
    public void userTypeMerchantUserEmailToEmailFieldInMerchantUserManagementPage() {
        merchantusermanagementpage.typeMerchantUserManagementPageEmail();
    }

    @Step("User click search button in Merchant User Management Page")
    public void userClickSearchButtonInMerchantUserManagementPage() {
        merchantusermanagementpage.merchantUserManagementPageSearchSubmit();
    }

    @Step("User see merchant user records on list in Merchant User Management Page")
    public void userSeeMerchantUserRecordsOnListInMerchantUserManagementPage() {
        merchantusermanagementpage.seeMerchantUserRecordsOnListMerchantUserManagementPage();
    }
}
