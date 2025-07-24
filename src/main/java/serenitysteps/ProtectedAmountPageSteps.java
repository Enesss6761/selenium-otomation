package serenitysteps;

import net.thucydides.core.annotations.Step;
import pages.ProtectedAmountPage;

public class ProtectedAmountPageSteps {
    ProtectedAmountPage protectedamountpage;

    @Step("User click protected amount sub left menu")
    public void userClickProtectedAmountSubLeftMenu() {
        protectedamountpage.leftSubMenuProtectedAmountSubmit();

    }

    @Step("User see protected amount Page")
    public void userSeeProtectedAmountPage() throws Exception {
        protectedamountpage.protectedAmountPageControlUrl();
    }

    @Step("User see all elements in Protected Amount Page")
    public void userSeeAllElementsInProtectedAmountPage() {
        protectedamountpage.protectedAmountPageAllElementsAreDisplayed();
    }

    @Step("User click Merchant Filter in Protected Amount Report Page")
    public void userClickMerchantFilterInProtectedAmountReportPage() {
        protectedamountpage.merchantListProtectedAmountReportSubmit();

    }

    @Step("User type merchant name to search field in Protected Amount Report Page")
    public void userTypeMerchantNameToSearchFieldInProtectedAmountReportPage() {
        protectedamountpage.typeMerchantNameMerchantListProtectedAmountReportSubmit();
    }

    @Step("User click merchant name search in Protected Amount Report Page")
    public void userClickMerchantNameSearchInProtectedAmountReportPage() {
        protectedamountpage.merchantListSearchProtectedAmountReportSubmit();
    }

    @Step("User click merchant name selection in Protected Amount Report Page")
    public void userClickMerchantNameSelectionInProtectedAmountReportPage() {
        protectedamountpage.merchantListSelectedCheckboxProtectedAmountReportSubmit();
    }

    @Step("User click search button on Protected Amount Report")
    public void userClickSearchButtonOnProtectedAmountReport() {
        protectedamountpage.merchantListCloseAndSearchProtectedAmountReportSubmit();
    }

    @Step("User see merchant name on list in Protected Amount Report Page")
    public void userSeeMerchantNameOnListInProtectedAmountReportPage() {
        protectedamountpage.seeMerchantNameOnListProtectedAmountReport();
    }

    @Step("User click Protected Amount Report Export")
    public void userClickProtectedAmountReportExport() {
        protectedamountpage.protectedAmountReportExportSubmit();
    }

    @Step("User see success message on Protected Amount Report Page")
    public void userSeeSuccessMessageOnProtectedAmountReportPage() {
        protectedamountpage.seeProtectedAmountReportExportSuccessMessage();
    }

    @Step("User click Protected Amount Report Export History")
    public void userClickProtectedAmountReportExportHistory() {
        protectedamountpage.protectedAmountReportExportHistorySubmit();
    }

    @Step("User see Protected Amount Report in Report History")
    public void userSeeProtectedAmountReportInReportHistory() {
        protectedamountpage.seeProtectedAmountReportExportToHistoryReportType();
    }
}
