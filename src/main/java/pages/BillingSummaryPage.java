package pages;

import base.BasePage;
import org.openqa.selenium.By;

public class BillingSummaryPage extends BasePage {
    By billingSummaryPageSubLeftMenuButton = By.cssSelector(".MuiCollapse-wrapperInner div:nth-of-type(5) > .MuiButtonBase-root");
    By billingSummaryPageMoreFiltersButton = By.cssSelector(".MuiButton-text");
    By billingSummaryPageOrderButton = By.cssSelector(".css-1s72i5x > .MuiButtonBase-root");
    By billingSummaryPageShowHide = By.cssSelector(".css-2ertzu > .MuiButtonBase-root");
    By billingSummaryPageClearAllFilters = By.id("clear_filters_button");
    By billingSummarySearchButton = By.id("search_button");
    By billingSummaryPageExportHistoryButton = By.cssSelector(".MuiGrid-spacing-xs-1 > div:nth-of-type(1) > .MuiButtonBase-root");
    By billingSummaryPageExportButton = By.cssSelector(".MuiGrid-spacing-xs-1 > div:nth-of-type(2) > .MuiButtonBase-root");
    By billingSummaryPageTNoRegistrations = By.cssSelector("h3:nth-of-type(2)");
    By billingSummaryPagePerPage = By.id(".MuiInputBase-inputSizeSmall");
    By billingSummaryStartDate = By.cssSelector(".css-16c2vxo > .MuiGrid-root > div:nth-of-type(1) > .MuiFormControl-root > .MuiInputBase-root");
    By billingSummaryStartDateIcon = By.xpath("//div[@class='MuiGrid-root MuiGrid-container MuiGrid-item MuiGrid-spacing-xs-2 css-7aty7k']/div[1]//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-edgeEnd MuiIconButton-sizeMedium css-slyssw']");
    By billingSummaryEndDateIcon = By.xpath("//div[@class='MuiGrid-root MuiGrid-container MuiGrid-item MuiGrid-spacing-xs-2 css-7aty7k']/div[2]//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-edgeEnd MuiIconButton-sizeMedium css-slyssw']");
    By billingSummaryEndDate = By.cssSelector(".css-16c2vxo > .MuiGrid-root > div:nth-of-type(2) .MuiInputBase-root");
    By billingSummaryMerchant = By.xpath("//div[@class='MuiGrid-root MuiGrid-container MuiGrid-item css-16c2vxo']/div[@class='MuiGrid-root MuiGrid-container MuiGrid-item MuiGrid-spacing-xs-2 css-7aty7k']//div[@id='search-select']");
    By billingSummaryReportPageMerchantListInputText = By.cssSelector("#text_input_search");
    By billingSummaryReportPageMerchantListSearchButton = By.cssSelector("#button_search");
    By billingSummaryReportPageMerchantListSelectedMerchantCheckbox = By.cssSelector(".css-d037su > .MuiButtonBase-root");
    By billingSummaryReportPageMerchantListCloseButton = By.cssSelector("#button_close");
    By billingSummaryReportMerchantNameText = By.cssSelector("td:nth-of-type(9)");
    By billingSummaryReportExportSuccessMessageText = By.cssSelector("#notistack-snackbar");

    public void billingSummaryPageAllElementsAreDisplayed() {
        isElementDisplay(billingSummaryPageOrderButton);
        isElementDisplay(billingSummaryPageShowHide);
        isElementDisplay(billingSummaryPageClearAllFilters);
        isElementDisplay(billingSummarySearchButton);
        isElementDisplay(billingSummaryPageExportHistoryButton);
        isElementDisplay(billingSummaryPageExportButton);
        isElementDisplay(billingSummaryPageTNoRegistrations);
        isElementDisplay(billingSummaryPagePerPage);
        isElementDisplay(billingSummaryStartDate);
        isElementDisplay(billingSummaryEndDate);
        isElementDisplay(billingSummaryMerchant);
        isElementDisplay(billingSummaryPageMoreFiltersButton);
    }

    public void leftSubMenuBillingSummarySubmit() {
        click(billingSummaryPageSubLeftMenuButton);
        waitBySeconds(2);
    }

    public void billingSummaryPageControlUrl() throws Exception {
        controlUrl("billing-summary", "pages.billingsummary");
    }

    public void billingSummaryPageChooseStartDate(String startDay) {
        click(By.xpath("//div[@class='MuiDayCalendar-monthContainer css-i6bazn']//button[" + startDay + "]"));
        waitBySeconds(1);
    }

    public void billingSummaryPageChooseEndDate(String endDay) {
        click(By.xpath("//div[@class='MuiDayCalendar-monthContainer css-i6bazn']//button[text() = '" + endDay + "']"));
        waitBySeconds(1);
    }

    public void billingSummaryPageClickStartDateButton() {
        click(billingSummaryStartDateIcon);
        waitBySeconds(1);
    }

    public void billingSummaryPageClickEndDateButton() {
        click(billingSummaryEndDateIcon);
        waitBySeconds(1);
    }

    public void merchantListBillingSummaryReportSubmit() {
        click(billingSummaryMerchant);
        waitBySeconds(2);
    }

    public void typeMerchantNameMerchantListBillingSummaryReportSubmit() {
        type(billingSummaryReportPageMerchantListInputText, "Mahalle");
        waitBySeconds(2);
    }

    public void merchantListSearchBillingSummaryReportSubmit() {
        click(billingSummaryReportPageMerchantListSearchButton);
        waitBySeconds(2);
    }

    public void merchantListSelectedCheckboxBillingSummaryReportSubmit() {
        click(billingSummaryReportPageMerchantListSelectedMerchantCheckbox);
        waitBySeconds(2);
    }

    public void merchantListCloseAndSearchBillingSummaryReportSubmit() {
        click(billingSummaryReportPageMerchantListCloseButton);
        waitBySeconds(1);
        click(billingSummarySearchButton);
        waitBySeconds(1);
    }

    public void seeMerchantNameOnListBillingSummaryReport() {
        String merchantNameActual = "YEMEK SEPETİ MAHALLE";
        String merchantNameExpected = getText(billingSummaryReportMerchantNameText);
        assertTextEquals(merchantNameActual, merchantNameExpected);
    }

    public void billingSummaryReportExportSubmit() {
        click(billingSummaryPageExportButton);
        waitBySeconds(2);
    }

    public void seeBillingSummaryReportExportSuccessMessage() {
        String successMessageActual = "Başarıyla dışa aktarıldı, lütfen mailinizi kontrol edin.";
        String successMessageExpected = getText(billingSummaryReportExportSuccessMessageText);
        assertTextEquals(successMessageActual, successMessageExpected);
    }

    public void billingSummaryReportExportHistorySubmit() {
        click(billingSummaryPageExportHistoryButton);
        waitBySeconds(2);
    }

    public void seeBillingSummaryReportExportToHistoryReportType() {
        PastReportsPage x = new PastReportsPage();
        String successMessageActual = "Fatura Özeti";
        String successMessageExpected = getText(x.pastReportsListReportTypeBillingSummaryReport);
        assertTextEquals(successMessageActual, successMessageExpected);
    }
}
