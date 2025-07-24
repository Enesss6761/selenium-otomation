package pages;

import base.BasePage;
import org.openqa.selenium.By;

public class EMoneyProtectedBalanceReportPage extends BasePage {
    By eMoneyProtectedBalanceReportPageSubLeftMenuButton = By.cssSelector("div:nth-of-type(10) > .MuiButtonBase-root");
    By eMoneyProtectedBalanceReportPageMoreFiltersButton = By.cssSelector(".MuiButton-text");
    By eMoneyProtectedBalanceReportPageOrderButton = By.cssSelector(".css-1s72i5x > .MuiButtonBase-root");
    By eMoneyProtectedBalanceReportPageShowHide = By.cssSelector(".css-2ertzu > .MuiButtonBase-root");
    By eMoneyProtectedBalanceReportPageClearAllFilters = By.id("clear_filters_button");
    By eMoneyProtectedBalanceReportSearchButton = By.id("search_button");
    By eMoneyProtectedBalanceReportPageExportHistoryButton = By.cssSelector(".MuiGrid-spacing-xs-1 > div:nth-of-type(1) > .MuiButtonBase-root");
    By eMoneyProtectedBalanceReportPageExportButton = By.cssSelector(".MuiGrid-spacing-xs-1 > div:nth-of-type(2) > .MuiButtonBase-root");
    By eMoneyProtectedBalanceReportPageTNoRegistrations = By.cssSelector("h3:nth-of-type(2)");
    By eMoneyProtectedBalanceReportPagePerPage = By.id(".MuiInputBase-inputSizeSmall");
    By eMoneyProtectedBalanceReportMerchant = By.cssSelector("#search-select");
    By eMoneyProtectedBalanceReportPageMerchantListInputText = By.cssSelector("#text_input_search");
    By eMoneyProtectedBalanceReportPageMerchantListSearchButton = By.cssSelector("#button_search > .MuiSvgIcon-root");
    By eMoneyProtectedBalanceReportPageMerchantListSelectedMerchantCheckbox = By.cssSelector(".css-d037su > li:nth-of-type(1)");
    By eMoneyProtectedBalanceReportPageMerchantListCloseButton = By.cssSelector("#button_close");
    By eMoneyProtectedBalanceReportMerchantNameText = By.cssSelector("td:nth-of-type(2)");
    By eMoneyProtectedBalanceReportExportSuccessMessageText = By.cssSelector(".notistack-SnackbarContainer > div:nth-of-type(1) #notistack-snackbar");

    public void merchantEntitlementPageAllElementsAreDisplayed() {
        isElementDisplay(eMoneyProtectedBalanceReportPageMoreFiltersButton);
        isElementDisplay(eMoneyProtectedBalanceReportPageOrderButton);
        isElementDisplay(eMoneyProtectedBalanceReportPageShowHide);
        isElementDisplay(eMoneyProtectedBalanceReportPageClearAllFilters);
        isElementDisplay(eMoneyProtectedBalanceReportSearchButton);
        isElementDisplay(eMoneyProtectedBalanceReportPageExportHistoryButton);
        isElementDisplay(eMoneyProtectedBalanceReportPageExportButton);
        isElementDisplay(eMoneyProtectedBalanceReportPageTNoRegistrations);
        isElementDisplay(eMoneyProtectedBalanceReportPagePerPage);
        isElementDisplay(eMoneyProtectedBalanceReportMerchant);
    }

    public void leftSubMenuEMoneyProtectedBalanceReportSubmit() {
        click(eMoneyProtectedBalanceReportPageSubLeftMenuButton);
        waitBySeconds(2);
    }

    public void eMoneyProtectedBalanceReportPageControlUrl() throws Exception {
        controlUrl("e-money-risk-balance-protected-amount", "pages.emoneyprotectedamountbalancereport");
    }

    public void merchantListEMoneyProtectedBalanceReportSubmit() {
        click(eMoneyProtectedBalanceReportMerchant);
        waitBySeconds(2);
    }

    public void typeMerchantNameMerchantListEMoneyProtectedBalanceReportSubmit() {
        type(eMoneyProtectedBalanceReportPageMerchantListInputText, "Mahalle");
        waitBySeconds(2);
    }

    public void merchantListSearchEMoneyProtectedBalanceReportSubmit() {
        click(eMoneyProtectedBalanceReportPageMerchantListSearchButton);
        waitBySeconds(2);
    }

    public void merchantListSelectedCheckboxEMoneyProtectedBalanceReportSubmit() {
        click(eMoneyProtectedBalanceReportPageMerchantListSelectedMerchantCheckbox);
        waitBySeconds(2);
    }

    public void merchantListCloseAndSearchEMoneyProtectedBalanceReportSubmit() {
        click(eMoneyProtectedBalanceReportPageMerchantListCloseButton);
        waitBySeconds(1);
        click(eMoneyProtectedBalanceReportSearchButton);
        waitBySeconds(1);
    }

    public void seeMerchantNameOnListEMoneyProtectedBalanceReport() {
        String merchantNameActual = "YEMEK SEPETİ MAHALLE";
        String merchantNameExpected = getText(eMoneyProtectedBalanceReportMerchantNameText);
        assertTextEquals(merchantNameActual, merchantNameExpected);
    }

    public void eMoneyProtectedBalanceReportExportSubmit() {
        click(eMoneyProtectedBalanceReportPageExportButton);
        waitBySeconds(2);
    }

    public void seeEMoneyProtectedBalanceReportExportSuccessMessage() {
        String successMessageActual = "Başarıyla dışa aktarıldı, lütfen mailinizi kontrol edin.";
        String successMessageExpected = getText(eMoneyProtectedBalanceReportExportSuccessMessageText);
        assertTextEquals(successMessageActual, successMessageExpected);
    }

    public void eMoneyProtectedBalanceReportExportHistorySubmit() {
        click(eMoneyProtectedBalanceReportPageExportHistoryButton);
        waitBySeconds(2);
    }

    public void seeEMoneyProtectedBalanceReportExportToHistoryReportType() {
        PastReportsPage x = new PastReportsPage();
        String successMessageActual = "E-Para Korumalı Miktar Bakiyesi Raporu";
        String successMessageExpected = getText(x.pastReportsListReportTypeEMoneyProtectedBalanceReport);
        assertTextEquals(successMessageActual, successMessageExpected);
    }
}
