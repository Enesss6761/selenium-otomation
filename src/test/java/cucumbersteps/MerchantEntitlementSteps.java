package cucumbersteps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import serenitysteps.MerchantEntitlementPageSteps;

public class MerchantEntitlementSteps {
    @Steps
    MerchantEntitlementPageSteps merchantentitlementpagesteps;

    @And("User click merchant entitlemement sub left menu")
    public void userClickMerchantEntitlemementSubLeftMenu() {
        merchantentitlementpagesteps.userClickMerchantEntitlemementSubLeftMenu();
    }

    @And("User see merchant entitlemement Page")
    public void userSeeMerchantEntitlemementPage() throws Exception {
        merchantentitlementpagesteps.userSeeMerchantEntitlemementPage();
    }

    @When("User see all elements in Merchant Entitlemement Page")
    public void userSeeAllElementsInMerchantEntitlemementPage() {
        merchantentitlementpagesteps.userSeeAllElementsInMerchantEntitlemementPage();
    }

    @And("User click Merchant Filter in Merchant Entitlement Report Page")
    public void userClickMerchantFilterInMerchantEntitlementReportPage() {
        merchantentitlementpagesteps.userClickMerchantFilterInMerchantEntitlementReportPage();
    }

    @And("User type merchant name to search field in Merchant Entitlement Report Page")
    public void userTypeMerchantNameToSearchFieldInMerchantEntitlementReportPage() {
        merchantentitlementpagesteps.userTypeMerchantNameToSearchFieldInMerchantEntitlementReportPage();
    }

    @And("User click merchant name search in Merchant Entitlement Report Page")
    public void userClickMerchantNameSearchInMerchantEntitlementReportPage() {
        merchantentitlementpagesteps.userClickMerchantNameSearchInMerchantEntitlementReportPage();
    }

    @And("User click merchant name selection in Merchant Entitlement Report Page")
    public void userClickMerchantNameSelectionInMerchantEntitlementReportPage() {
        merchantentitlementpagesteps.userClickMerchantNameSelectionInMerchantEntitlementReportPage();
    }

    @When("User click search button on Merchant Entitlement Report")
    public void userClickSearchButtonOnMerchantEntitlementReport() {
        merchantentitlementpagesteps.userClickSearchButtonOnMerchantEntitlementReport();
    }

    @Then("User see merchant name on list in Merchant Entitlement Report Page")
    public void userSeeMerchantNameOnListInMerchantEntitlementReportPage() {
        merchantentitlementpagesteps.userSeeMerchantNameOnListInMerchantEntitlementReportPage();
    }

    @And("User click Merchant Entitlement Report Export")
    public void userClickMerchantEntitlementReportExport() {
        merchantentitlementpagesteps.userClickMerchantEntitlementReportExport();
    }

    @And("User see success message on Merchant Entitlement Report Page")
    public void userSeeSuccessMessageOnMerchantEntitlementReportPage() {
        merchantentitlementpagesteps.userSeeSuccessMessageOnMerchantEntitlementReportPage();
    }

    @And("User click Merchant Entitlement Report Export History")
    public void userClickMerchantEntitlementReportExportHistory() {
        merchantentitlementpagesteps.userClickMerchantEntitlementReportExportHistory();
    }

    @When("User see Merchant Entitlement Report in Report History")
    public void userSeeMerchantEntitlementReportInReportHistory() {
        merchantentitlementpagesteps.userSeeMerchantEntitlementReportInReportHistory();
    }
}
