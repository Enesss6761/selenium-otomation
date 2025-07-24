package pages;

import base.BasePage;
import org.openqa.selenium.By;

public class ProtectedAmountPage extends BasePage {
    By protectedAmountPageSubLeftMenuButton = By.cssSelector(".MuiCollapse-wrapperInner div:nth-of-type(9) > .MuiButtonBase-root");
    By protectedAmountPageMoreFiltersButton = By.cssSelector(".MuiButton-text");
    By protectedAmountPageOrderButton = By.cssSelector(".css-1s72i5x > .MuiButtonBase-root");
    By protectedAmountPageShowHide = By.cssSelector(".css-2ertzu > .MuiButtonBase-root");
    By protectedAmountPageClearAllFilters = By.id("clear_filters_button");
    By protectedAmountSearchButton = By.id("search_button");
    By protectedAmountPageExportHistoryButton = By.cssSelector(".MuiGrid-spacing-xs-1 > div:nth-of-type(1) > .MuiButtonBase-root");
    By protectedAmountPageExportButton = By.cssSelector(".MuiGrid-spacing-xs-1 > div:nth-of-type(2) > .MuiButtonBase-root");
    By protectedAmountPageTNoRegistrations = By.cssSelector("h3:nth-of-type(2)");
    By protectedAmountPagePerPage = By.id(".MuiInputBase-inputSizeSmall");
    By protectedAmountMerchant = By.cssSelector("#search-select");
    By protectedAmountReportPageMerchantListInputText = By.cssSelector("#text_input_search");
    By protectedAmountReportPageMerchantListSearchButton = By.cssSelector("#button_search");
    By protectedAmountReportPageMerchantListSelectedMerchantCheckbox = By.cssSelector(".css-d037su > .MuiButtonBase-root");
    By protectedAmountReportPageMerchantListCloseButton = By.cssSelector("#button_close");
    By protectedAmountReportMerchantNameText = By.cssSelector("tr:nth-of-type(2) > td:nth-of-type(2)");
    By protectedAmountReportExportSuccessMessageText = By.cssSelector("#notistack-snackbar");

    public void protectedAmountPageAllElementsAreDisplayed() {
        isElementDisplay(protectedAmountPageMoreFiltersButton);
        isElementDisplay(protectedAmountPageOrderButton);
        isElementDisplay(protectedAmountPageShowHide);
        isElementDisplay(protectedAmountPageClearAllFilters);
        isElementDisplay(protectedAmountSearchButton);
        isElementDisplay(protectedAmountPageExportHistoryButton);
        isElementDisplay(protectedAmountPageExportButton);
        isElementDisplay(protectedAmountPageTNoRegistrations);
        isElementDisplay(protectedAmountPagePerPage);
        isElementDisplay(protectedAmountMerchant);
    }

    public void leftSubMenuProtectedAmountSubmit() {
        click(protectedAmountPageSubLeftMenuButton);
        waitBySeconds(2);
    }

    public void protectedAmountPageControlUrl() throws Exception {
        controlUrl("protected-amount", "pages.protectedamount");
    }

    public void merchantListProtectedAmountReportSubmit() {
        click(protectedAmountMerchant);
        waitBySeconds(2);
    }

    public void typeMerchantNameMerchantListProtectedAmountReportSubmit() {
        type(protectedAmountReportPageMerchantListInputText, "Mahalle");
        waitBySeconds(2);
    }

    public void merchantListSearchProtectedAmountReportSubmit() {
        click(protectedAmountReportPageMerchantListSearchButton);
        waitBySeconds(2);
    }

    public void merchantListSelectedCheckboxProtectedAmountReportSubmit() {
        click(protectedAmountReportPageMerchantListSelectedMerchantCheckbox);
        waitBySeconds(2);
    }

    public void merchantListCloseAndSearchProtectedAmountReportSubmit() {
        click(protectedAmountReportPageMerchantListCloseButton);
        waitBySeconds(1);
        click(protectedAmountSearchButton);
        waitBySeconds(1);
    }

    public void seeMerchantNameOnListProtectedAmountReport() {
        String merchantNameActual = "YEMEK SEPETİ MAHALLE";
        String merchantNameExpected = getText(protectedAmountReportMerchantNameText);
        assertTextEquals(merchantNameActual, merchantNameExpected);
    }

    public void protectedAmountReportExportSubmit() {
        click(protectedAmountPageExportButton);
        waitBySeconds(2);
    }

    public void seeProtectedAmountReportExportSuccessMessage() {
        String successMessageActual = "Başarıyla dışa aktarıldı, lütfen mailinizi kontrol edin.";
        String successMessageExpected = getText(protectedAmountReportExportSuccessMessageText);
        assertTextEquals(successMessageActual, successMessageExpected);
    }

    public void protectedAmountReportExportHistorySubmit() {
        click(protectedAmountPageExportHistoryButton);
        waitBySeconds(2);
    }

    public void seeProtectedAmountReportExportToHistoryReportType() {
        PastReportsPage x = new PastReportsPage();
        String successMessageActual = "Korumalı Miktar";
        String successMessageExpected = getText(x.pastReportsListReportTypeProtectedAmountReport);
        assertTextEquals(successMessageActual, successMessageExpected);
    }
}
