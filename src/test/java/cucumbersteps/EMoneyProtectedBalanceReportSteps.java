package cucumbersteps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import serenitysteps.EMoneyProtectedBalanceReportPageSteps;

public class EMoneyProtectedBalanceReportSteps {
    @Steps
    EMoneyProtectedBalanceReportPageSteps emoneyprotectedbalancereportpagesteps;

    @And("User click emoney protected balance report sub left menu")
    public void userClickEmoneyProtectedBalanceReportSubLeftMenu() {
        emoneyprotectedbalancereportpagesteps.userClickEmoneyProtectedBalanceReportSubLeftMenu();
    }

    @And("User see emoney protected balance report Page")
    public void userSeeEmoneyProtectedBalanceReportPage() throws Exception {
        emoneyprotectedbalancereportpagesteps.userSeeEmoneyProtectedBalanceReportPage();
    }

    @When("User see all elements in EMoney Protected Balance Report Page")
    public void userSeeAllElementsInEMoneyProtectedBalanceReportPage() {
        emoneyprotectedbalancereportpagesteps.userSeeAllElementsInEMoneyProtectedBalanceReportPage();
    }

    @And("User click Merchant Filter in EMoney Protected Balance Report Page")
    public void userClickMerchantFilter() {
        emoneyprotectedbalancereportpagesteps.userClickMerchantFilter();
    }

    @And("User type merchant name to search field in EMoney Protected Balance Report Page")
    public void userTypeMerchantNameToSearchField() {
        emoneyprotectedbalancereportpagesteps.userTypeMerchantNameToSearchField();
    }

    @And("User click merchant name search in EMoney Protected Balance Report Page")
    public void userClickMerchantNameSearch() {
        emoneyprotectedbalancereportpagesteps.userClickMerchantNameSearch();
    }

    @And("User click merchant name selection in EMoney Protected Balance Report Page")
    public void userClickMerchantNameSelection() {
        emoneyprotectedbalancereportpagesteps.userClickMerchantNameSelection();
    }

    @When("User click search button on EMoney Protected Amount Balance Report")
    public void userClickSearchButtonOnEMoneyProtectedAmountBalanceReport() {
        emoneyprotectedbalancereportpagesteps.userClickSearchButtonOnEMoneyProtectedAmountBalanceReport();
    }

    @Then("User see merchant name on list in EMoney Protected Balance Report Page")
    public void userSeeMerchantNameOnList() {
        emoneyprotectedbalancereportpagesteps.userSeeMerchantNameOnList();
    }

    @And("User click EMoney Protected Balance Report Export")
    public void userClickEMoneyProtectedBalanceReportExport() {
        emoneyprotectedbalancereportpagesteps.userClickEMoneyProtectedBalanceReportExport();
    }

    @And("User see success message on EMoney Protected Balance Report Page")
    public void userSeeSuccessMessageOnEMoneyProtectedBalanceReportPage() {
        emoneyprotectedbalancereportpagesteps.userSeeSuccessMessageOnEMoneyProtectedBalanceReportPage();
    }

    @And("User click EMoney Protected Balance Report Export History")
    public void userClickEMoneyProtectedBalanceReportExportHistory() {
        emoneyprotectedbalancereportpagesteps.userClickEMoneyProtectedBalanceReportExportHistory();
    }

    @When("User see EMoney Protected Balance Report in Report History")
    public void userSeeEMoneyProtectedBalanceReportInReportHistory() {
        emoneyprotectedbalancereportpagesteps.userSeeEMoneyProtectedBalanceReportInReportHistory();
    }
}
