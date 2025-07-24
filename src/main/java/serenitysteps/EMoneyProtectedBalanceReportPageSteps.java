package serenitysteps;

import net.thucydides.core.annotations.Step;
import pages.EMoneyProtectedBalanceReportPage;

public class EMoneyProtectedBalanceReportPageSteps {
    EMoneyProtectedBalanceReportPage emoneyprotectedbalancereportpage;

    @Step("User click emoney protected balance report sub left menu")
    public void userClickEmoneyProtectedBalanceReportSubLeftMenu() {
        emoneyprotectedbalancereportpage.leftSubMenuEMoneyProtectedBalanceReportSubmit();
    }

    @Step("User see emoney protected balance report Page")
    public void userSeeEmoneyProtectedBalanceReportPage() throws Exception {
        emoneyprotectedbalancereportpage.eMoneyProtectedBalanceReportPageControlUrl();
    }

    @Step("User see all elements in EMoney Protected Balance Report Page")
    public void userSeeAllElementsInEMoneyProtectedBalanceReportPage() {
        emoneyprotectedbalancereportpage.merchantEntitlementPageAllElementsAreDisplayed();
    }

    @Step("User click Merchant Filter in EMoney Protected Balance Report Page")
    public void userClickMerchantFilter() {
        emoneyprotectedbalancereportpage.merchantListEMoneyProtectedBalanceReportSubmit();
    }

    @Step("User type merchant name to search field in EMoney Protected Balance Report Page")
    public void userTypeMerchantNameToSearchField() {
        emoneyprotectedbalancereportpage.typeMerchantNameMerchantListEMoneyProtectedBalanceReportSubmit();
    }

    @Step("User click merchant name search in EMoney Protected Balance Report Page")
    public void userClickMerchantNameSearch() {
        emoneyprotectedbalancereportpage.merchantListSearchEMoneyProtectedBalanceReportSubmit();
    }

    @Step("User click merchant name selection in EMoney Protected Balance Report Page")
    public void userClickMerchantNameSelection() {
        emoneyprotectedbalancereportpage.merchantListSelectedCheckboxEMoneyProtectedBalanceReportSubmit();
    }

    @Step("User click search button on EMoney Protected Amount Balance Report")
    public void userClickSearchButtonOnEMoneyProtectedAmountBalanceReport() {
        emoneyprotectedbalancereportpage.merchantListCloseAndSearchEMoneyProtectedBalanceReportSubmit();
    }

    @Step("User see merchant name on list in EMoney Protected Balance Report Page")
    public void userSeeMerchantNameOnList() {
        emoneyprotectedbalancereportpage.seeMerchantNameOnListEMoneyProtectedBalanceReport();
    }

    @Step("User click EMoney Protected Balance Report Export")
    public void userClickEMoneyProtectedBalanceReportExport() {
        emoneyprotectedbalancereportpage.eMoneyProtectedBalanceReportExportSubmit();
    }

    @Step("User see success message on EMoney Protected Balance Report Page")
    public void userSeeSuccessMessageOnEMoneyProtectedBalanceReportPage() {
        emoneyprotectedbalancereportpage.seeEMoneyProtectedBalanceReportExportSuccessMessage();
    }

    @Step("User click EMoney Protected Balance Report Export History")
    public void userClickEMoneyProtectedBalanceReportExportHistory() {
        emoneyprotectedbalancereportpage.eMoneyProtectedBalanceReportExportHistorySubmit();
    }

    @Step("User see EMoney Protected Balance Report in Report History")
    public void userSeeEMoneyProtectedBalanceReportInReportHistory() {
        emoneyprotectedbalancereportpage.seeEMoneyProtectedBalanceReportExportToHistoryReportType();
    }
}
