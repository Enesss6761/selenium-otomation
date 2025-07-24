package serenitysteps;

import net.thucydides.core.annotations.Step;
import pages.MerchantEntitlementPage;


public class MerchantEntitlementPageSteps {
    MerchantEntitlementPage merchantentitlementpage;

    @Step("User click merchant entitlemement sub left menu")
    public void userClickMerchantEntitlemementSubLeftMenu() {
        merchantentitlementpage.leftSubMenuMerchantEntitlementSubmit();
    }

    @Step("User see merchant entitlemement Page")
    public void userSeeMerchantEntitlemementPage() throws Exception {
        merchantentitlementpage.merchantEntitlementPageControlUrl();
    }

    @Step("User see all elements in Merchant Entitlemement Page")
    public void userSeeAllElementsInMerchantEntitlemementPage() {
        merchantentitlementpage.merchantEntitlementPageAllElementsAreDisplayed();
    }

    @Step("User click Merchant Filter in Merchant Entitlement Report Page")
    public void userClickMerchantFilterInMerchantEntitlementReportPage() {
        merchantentitlementpage.merchantListMerchantEntitlementReportSubmit();

    }

    @Step("User type merchant name to search field in Merchant Entitlement Report Page")
    public void userTypeMerchantNameToSearchFieldInMerchantEntitlementReportPage() {
        merchantentitlementpage.typeMerchantNameMerchantListMerchantEntitlementReportSubmit();
    }

    @Step("User click merchant name search in Merchant Entitlement Report Page")
    public void userClickMerchantNameSearchInMerchantEntitlementReportPage() {
        merchantentitlementpage.merchantListSearchMerchantEntitlementReportSubmit();
    }

    @Step("User click merchant name selection in Merchant Entitlement Report Page")
    public void userClickMerchantNameSelectionInMerchantEntitlementReportPage() {
        merchantentitlementpage.merchantListSelectedCheckboxMerchantEntitlementReportSubmit();
    }

    @Step("User click search button on Merchant Entitlement Report")
    public void userClickSearchButtonOnMerchantEntitlementReport() {
        merchantentitlementpage.merchantListCloseAndSearchMerchantEntitlementReportSubmit();
    }

    @Step("User see merchant name on list in Merchant Entitlement Report Page")
    public void userSeeMerchantNameOnListInMerchantEntitlementReportPage() {
        merchantentitlementpage.seeMerchantNameOnListMerchantEntitlementReport();
    }

    @Step("User click Merchant Entitlement Report Export")
    public void userClickMerchantEntitlementReportExport() {
        merchantentitlementpage.merchantEntitlementReportExportSubmit();
    }

    @Step("User see success message on Merchant Entitlement Report Page")
    public void userSeeSuccessMessageOnMerchantEntitlementReportPage() {
        merchantentitlementpage.seeMerchantEntitlementReportExportSuccessMessage();
    }

    @Step("User click Merchant Entitlement Report Export History")
    public void userClickMerchantEntitlementReportExportHistory() {
        merchantentitlementpage.merchantEntitlementReportExportHistorySubmit();
    }

    @Step("User see Merchant Entitlement Report in Report History")
    public void userSeeMerchantEntitlementReportInReportHistory() {
        merchantentitlementpage.seeMerchantEntitlementReportExportToHistoryReportType();
    }
}
