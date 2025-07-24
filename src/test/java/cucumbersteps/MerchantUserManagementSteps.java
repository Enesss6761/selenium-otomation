package cucumbersteps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import serenitysteps.MerchantUserManagementPageSteps;

public class MerchantUserManagementSteps {
    @Steps
    MerchantUserManagementPageSteps merchantusermanagementpagesteps;

    @And("User click merchant user management sub left menu")
    public void userClickMerchantUserManagementSubLeftMenu() {
        merchantusermanagementpagesteps.userClickMerchantUserManagementSubLeftMenu();
    }

    @And("User see merchants user management Page")
    public void userSeeMerchantsUserManagementPage() throws Exception {
        merchantusermanagementpagesteps.userSeeMerchantsUserManagementPage();
    }

    @And("User see all elements in Merchant User Management Page")
    public void userSeeAllElementsInMerchantUserManagementPage() {
        merchantusermanagementpagesteps.userSeeAllElementsInMerchantUserManagementPage();
    }

    @And("User click merchant user edit in Merchant User Management Page")
    public void userClickMerchantUserEditInMerchantUserManagementPage() {
        merchantusermanagementpagesteps.userClickMerchantUserEditInMerchantUserManagementPage();
    }

    @And("User see all elements in Merchant User Management Edit Page")
    public void userSeeAllElementsInMerchantUserManagementEditPage() {
        merchantusermanagementpagesteps.userSeeAllElementsInMerchantUserManagementEditPage();
    }

    @And("User click merchant list in Merchant User Management Page")
    public void userClickMerchantListInMerchantUserManagementPage() {
        merchantusermanagementpagesteps.userClickMerchantListInMerchantUserManagementPage();
    }

    @And("User select merchant in Merchant User Management Page")
    public void userSelectMerchantInMerchantUserManagementPage() {
        merchantusermanagementpagesteps.userSelectMerchantInMerchantUserManagementPage();
    }

    @And("User type merchant user name to name field in Merchant User Management Page")
    public void userTypeMerchantUserNameToNameFieldInMerchantUserManagementPage() {
        merchantusermanagementpagesteps.userTypeMerchantUserNameToNameFieldInMerchantUserManagementPage();
    }

    @And("User type merchant user surname to surname field in Merchant User Management Page")
    public void userTypeMerchantUserSurnameToSurnameFieldInMerchantUserManagementPage() {
        merchantusermanagementpagesteps.userTypeMerchantUserSurnameToSurnameFieldInMerchantUserManagementPage();
    }

    @And("User type merchant user email to email field in Merchant User Management Page")
    public void userTypeMerchantUserEmailToEmailFieldInMerchantUserManagementPage() {
        merchantusermanagementpagesteps.userTypeMerchantUserEmailToEmailFieldInMerchantUserManagementPage();
    }

    @When("User click search button in Merchant User Management Page")
    public void userClickSearchButtonInMerchantUserManagementPage() {
        merchantusermanagementpagesteps.userClickSearchButtonInMerchantUserManagementPage();
    }

    @Then("User see merchant user records on list in Merchant User Management Page")
    public void userSeeMerchantUserRecordsOnListInMerchantUserManagementPage() {
        merchantusermanagementpagesteps.userSeeMerchantUserRecordsOnListInMerchantUserManagementPage();
    }
}
