package pages;

import base.BasePage;
import org.openqa.selenium.By;

public class MerchantEntitlementPage extends BasePage {
    By merchantEntitlementPageSubLeftMenuButton = By.cssSelector(".MuiCollapse-wrapperInner div:nth-of-type(8) > .MuiButtonBase-root");
    By merchantEntitlementPageMoreFiltersButton = By.cssSelector(".MuiButton-text");
    By merchantEntitlementPageOrderButton = By.cssSelector(".css-1s72i5x > .MuiButtonBase-root");
    By merchantEntitlementPageShowHide = By.cssSelector(".css-2ertzu > .MuiButtonBase-root");
    By merchantEntitlementPageClearAllFilters = By.id("clear_filters_button");
    By merchantEntitlementSearchButton = By.id("search_button");
    By merchantEntitlementPageExportHistoryButton = By.cssSelector(".MuiGrid-spacing-xs-1 > div:nth-of-type(1) > .MuiButtonBase-root");
    By merchantEntitlementPageExportButton = By.cssSelector(".MuiGrid-spacing-xs-1 > div:nth-of-type(2) > .MuiButtonBase-root");
    By merchantEntitlementPageTNoRegistrations = By.cssSelector("h3:nth-of-type(2)");
    By merchantEntitlementPagePerPage = By.id(".MuiInputBase-inputSizeSmall");
    By merchantEntitlementMerchant = By.cssSelector("#search-select");
    By merchantEntitlementReportPageMerchantListInputText = By.cssSelector("#text_input_search");
    By merchantEntitlementReportPageMerchantListSearchButton = By.cssSelector("#button_search");
    By merchantEntitlementReportPageMerchantListSelectedMerchantCheckbox = By.cssSelector(".css-d037su > .MuiButtonBase-root");
    By merchantEntitlementReportPageMerchantListCloseButton = By.cssSelector("#button_close");
    By merchantEntitlementReportMerchantNameText = By.cssSelector("tr:nth-of-type(2) > td:nth-of-type(2)");
    By merchantEntitlementReportExportSuccessMessageText = By.cssSelector("#notistack-snackbar");

    public void merchantEntitlementPageAllElementsAreDisplayed() {
        isElementDisplay(merchantEntitlementPageMoreFiltersButton);
        isElementDisplay(merchantEntitlementPageOrderButton);
        isElementDisplay(merchantEntitlementPageShowHide);
        isElementDisplay(merchantEntitlementPageClearAllFilters);
        isElementDisplay(merchantEntitlementSearchButton);
        isElementDisplay(merchantEntitlementPageExportHistoryButton);
        isElementDisplay(merchantEntitlementPageExportButton);
        isElementDisplay(merchantEntitlementPageTNoRegistrations);
        isElementDisplay(merchantEntitlementPagePerPage);
        isElementDisplay(merchantEntitlementMerchant);
    }

    public void leftSubMenuMerchantEntitlementSubmit() {
        click(merchantEntitlementPageSubLeftMenuButton);
        waitBySeconds(2);
    }

    public void merchantEntitlementPageControlUrl() throws Exception {
        controlUrl("merchant-entitlement", "pages.merchantentitlement");
    }

    public void merchantListMerchantEntitlementReportSubmit() {
        click(merchantEntitlementMerchant);
        waitBySeconds(2);
    }

    public void typeMerchantNameMerchantListMerchantEntitlementReportSubmit() {
        type(merchantEntitlementReportPageMerchantListInputText, "Market");
        waitBySeconds(2);
    }

    public void merchantListSearchMerchantEntitlementReportSubmit() {
        click(merchantEntitlementReportPageMerchantListSearchButton);
        waitBySeconds(2);
    }

    public void merchantListSelectedCheckboxMerchantEntitlementReportSubmit() {
        click(merchantEntitlementReportPageMerchantListSelectedMerchantCheckbox);
        waitBySeconds(2);
    }

    public void merchantListCloseAndSearchMerchantEntitlementReportSubmit() {
        click(merchantEntitlementReportPageMerchantListCloseButton);
        waitBySeconds(1);
        click(merchantEntitlementSearchButton);
        waitBySeconds(1);
    }

    public void seeMerchantNameOnListMerchantEntitlementReport() {
        String merchantNameActual = "YEMEK SEPETİ BANABİ PERAKENDE GIDA A.Ş.";
        String merchantNameExpected = getText(merchantEntitlementReportMerchantNameText);
        assertTextEquals(merchantNameActual, merchantNameExpected);
    }

    public void merchantEntitlementReportExportSubmit() {
        click(merchantEntitlementPageExportButton);
        waitBySeconds(2);
    }

    public void seeMerchantEntitlementReportExportSuccessMessage() {
        String successMessageActual = "Başarıyla dışa aktarıldı, lütfen mailinizi kontrol edin.";
        String successMessageExpected = getText(merchantEntitlementReportExportSuccessMessageText);
        assertTextEquals(successMessageActual, successMessageExpected);
    }

    public void merchantEntitlementReportExportHistorySubmit() {
        click(merchantEntitlementPageExportHistoryButton);
        waitBySeconds(2);
    }

    public void seeMerchantEntitlementReportExportToHistoryReportType() {
        PastReportsPage x = new PastReportsPage();
        String successMessageActual = "Üye İşyeri Hakediş";
        String successMessageExpected = getText(x.pastReportsListReportTypeMerchantEntitlementReport);
        assertTextEquals(successMessageActual, successMessageExpected);
    }
}
