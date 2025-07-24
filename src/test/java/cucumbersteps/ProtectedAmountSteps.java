package cucumbersteps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import serenitysteps.ProtectedAmountPageSteps;

public class ProtectedAmountSteps {
    @Steps
    ProtectedAmountPageSteps protectedamountpagesteps;

    @And("User click protected amount sub left menu")
    public void userClickProtectedAmountSubLeftMenu() {
        protectedamountpagesteps.userClickProtectedAmountSubLeftMenu();
    }

    @And("User see protected amount Page")
    public void userSeeProtectedAmountPage() throws Exception {
        protectedamountpagesteps.userSeeProtectedAmountPage();

    }

    @When("User see all elements in Protected Amount Page")
    public void userSeeAllElementsInProtectedAmountPage() {
        protectedamountpagesteps.userSeeAllElementsInProtectedAmountPage();
    }

    @And("User click Merchant Filter in Protected Amount Report Page")
    public void userClickMerchantFilterInProtectedAmountReportPage() {
        protectedamountpagesteps.userClickMerchantFilterInProtectedAmountReportPage();
    }

    @And("User type merchant name to search field in Protected Amount Report Page")
    public void userTypeMerchantNameToSearchFieldInProtectedAmountReportPage() {
        protectedamountpagesteps.userTypeMerchantNameToSearchFieldInProtectedAmountReportPage();
    }

    @And("User click merchant name search in Protected Amount Report Page")
    public void userClickMerchantNameSearchInProtectedAmountReportPage() {
        protectedamountpagesteps.userClickMerchantNameSearchInProtectedAmountReportPage();
    }

    @And("User click merchant name selection in Protected Amount Report Page")
    public void userClickMerchantNameSelectionInProtectedAmountReportPage() {
        protectedamountpagesteps.userClickMerchantNameSelectionInProtectedAmountReportPage();
    }

    @When("User click search button on Protected Amount Report")
    public void userClickSearchButtonOnProtectedAmountReport() {
        protectedamountpagesteps.userClickSearchButtonOnProtectedAmountReport();
    }

    @Then("User see merchant name on list in Protected Amount Report Page")
    public void userSeeMerchantNameOnListInProtectedAmountReportPage() {
        protectedamountpagesteps.userSeeMerchantNameOnListInProtectedAmountReportPage();
    }

    @And("User click Protected Amount Report Export")
    public void userClickProtectedAmountReportExport() {
        protectedamountpagesteps.userClickProtectedAmountReportExport();
    }

    @And("User see success message on Protected Amount Report Page")
    public void userSeeSuccessMessageOnProtectedAmountReportPage() {
        protectedamountpagesteps.userSeeSuccessMessageOnProtectedAmountReportPage();
    }

    @And("User click Protected Amount Report Export History")
    public void userClickProtectedAmountReportExportHistory() {
        protectedamountpagesteps.userClickProtectedAmountReportExportHistory();
    }

    @When("User see Protected Amount Report in Report History")
    public void userSeeProtectedAmountReportInReportHistory() {
        protectedamountpagesteps.userSeeProtectedAmountReportInReportHistory();
    }
}
