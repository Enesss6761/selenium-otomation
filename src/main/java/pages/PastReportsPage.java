package pages;

import base.BasePage;
import org.openqa.selenium.By;

public class PastReportsPage extends BasePage {
    By pastReportsPageSubLeftMenuButton = By.cssSelector(".css-c4sutr div:nth-of-type(3) > .MuiButtonBase-root");
    By pastReportsPayoutsPageMoreFiltersButton = By.cssSelector(".MuiButton-text");
    By pastReportsPageOrderButton = By.cssSelector(".css-1s72i5x > .MuiButtonBase-root");
    By pastReportsPageShowHide = By.cssSelector(".css-2ertzu > .MuiButtonBase-root");
    By pastReportsPageClearAllFilters = By.id("clear_filters_button");
    By pastReportsSearchButton = By.id("search_button");
    By pastReportsPageReceiptDownloadButton = By.cssSelector("tr:nth-of-type(1) [data-testid='DownloadIcon']");
    By pastReportsPagePerPage = By.id(".MuiInputBase-inputSizeSmall");
    By pastReportsPageTNoRegistrations = By.cssSelector("h3:nth-of-type(2)");
    By pastReportsStartDate = By.cssSelector(".css-16c2vxo > .MuiGrid-root > div:nth-of-type(1) > .MuiFormControl-root > .MuiInputBase-root");
    By pastReportsEndDate = By.cssSelector(".css-16c2vxo > .MuiGrid-root > div:nth-of-type(2) .MuiInputBase-root");
    By pastReportsStartDateIcon = By.xpath("//div[@class='MuiGrid-root MuiGrid-container MuiGrid-item MuiGrid-spacing-xs-2 css-7aty7k']/div[1]//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-edgeEnd MuiIconButton-sizeMedium css-slyssw']");
    By pastReportsEndDateIcon = By.xpath("//div[@class='MuiGrid-root MuiGrid-container MuiGrid-item MuiGrid-spacing-xs-2 css-7aty7k']/div[2]//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-edgeEnd MuiIconButton-sizeMedium css-slyssw']");
    By pastReportsStatus = By.xpath("//div[@class='MuiGrid-root MuiGrid-container MuiGrid-item css-16c2vxo']/div[@class='MuiGrid-root MuiGrid-container MuiGrid-item MuiGrid-spacing-xs-2 css-7aty7k']//div[@id='sticky-multiple-select']");
    By pastReportsStatusSelect = By.cssSelector("[data-value='SUCCESS']");
    By pastReportsReportType = By.xpath("//div[@class='MuiGrid-root MuiGrid-container MuiGrid-item MuiGrid-spacing-xs-2 css-ymzd56']//div[@id='sticky-multiple-select']");
    By pastReportsReportTypeSelect = By.cssSelector("[data-value='ACCOUNT_STATEMENT']");
    By pastReportsRequestor = By.name("user");
    By pastReportsPageReceiptDetailButton = By.cssSelector(".MuiTableBody-root > tr:nth-of-type(1) .MuiIconButton-colorSuccess");
    By pastReportsListReportTypeEMoneyProtectedBalanceReport = By.xpath("//tbody[@class='MuiTableBody-root css-1xnox0e']/tr[1]/td[.='E-Para Korumalı Miktar Bakiyesi Raporu']");
    By pastReportsListReportTypeProtectedAmountReport = By.xpath("//tbody[@class='MuiTableBody-root css-1xnox0e']/tr[1]/td[.='Korumalı Miktar']");
    By pastReportsListReportTypeBillingSummaryReport = By.xpath("//tbody[@class='MuiTableBody-root css-1xnox0e']/tr[1]/td[.='Fatura Özeti']");
    By pastReportsListReportTypeMerchantEntitlementReport = By.xpath("//tbody[@class='MuiTableBody-root css-1xnox0e']/tr[1]/td[.='Üye İşyeri Hakediş']");
    By pastReportsListReportTypePosTransactionsReport = By.xpath("//tbody[@class='MuiTableBody-root css-1xnox0e']/tr[1]/td[.='POS Hareketleri']");
    By pastReportsListReportTypePosReleaseSummaryReport = By.xpath("//tbody[@class='MuiTableBody-root css-1xnox0e']/tr[1]/td[.='POS Çözüm/Komisyon']");
    By pastReportsListReportTypeAccountStatementReport = By.xpath("//tbody[@class='MuiTableBody-root css-1xnox0e']/tr[1]/td[.='İşlem Dökümü']");
    By pastReportsStatusText = By.cssSelector(".MuiTableBody-root > tr:nth-of-type(1) > td:nth-of-type(4)");
    By pastReportsReportTypeText = By.cssSelector(".MuiTableBody-root > tr:nth-of-type(1) > td:nth-of-type(3)");
    By pastReportsRequestorNameText = By.cssSelector(".MuiTableBody-root > tr:nth-of-type(1) > td:nth-of-type(5)");
    By pastReportExportSuccessMessageText = By.cssSelector("#notistack-snackbar");
    By pastReportsScreenClick = By.cssSelector("#menu- > div.MuiBackdrop-root.MuiBackdrop-invisible.MuiModal-backdrop.css-esi9ax");

    public void seePastReportExportSuccessMessage() {
        String successMessageActual = "İndirme başlatıldı, lütfen indirilenler klasörünüzü kontrol edin.";
        String successMessageExpected = getText(pastReportExportSuccessMessageText);
        assertTextEquals(successMessageActual, successMessageExpected);
    }

    public void pastReportsExportSubmit() {
        click(pastReportsPageReceiptDownloadButton);
        waitBySeconds(2);
    }

    public void seeRecordsOnListPastReportsReport() {
        String pastReportsStatusActual = "Başarılı";
        String pastReportsReportTypeActual = "İşlem Dökümü";
        String pastReportsRequestorActual = "otomasyon@yemekpay.com";
        String pastReportsStatusExpected = getText(pastReportsStatusText);
        String pastReportsReportTypeExpected = getText(pastReportsReportTypeText);
        String pastReportsRequestorExpected = getText(pastReportsRequestorNameText);
        assertTextEquals(pastReportsStatusActual, pastReportsStatusExpected);
        assertTextEquals(pastReportsReportTypeActual, pastReportsReportTypeExpected);
        assertTextEquals(pastReportsRequestorActual, pastReportsRequestorExpected);
    }

    public void seeReportDetailsPastReportsReport() {
        String pastReportsDetailStatus = getText(By.cssSelector(".css-j76gr1 > div:nth-of-type(2) > .css-g1tppl"));
        String pastReportsDetailReportType = getText(By.cssSelector(".css-j76gr1 > div:nth-of-type(4) > .css-g1tppl"));
        String pastReportsDetailRequestor = getText(By.cssSelector(".css-j76gr1 > div:nth-of-type(3) > .css-g1tppl"));
        String pastReportsStatusExpected = getText(pastReportsStatusText);
        String pastReportsReportTypeExpected = getText(pastReportsReportTypeText);
        String pastReportsRequestorExpected = getText(pastReportsRequestorNameText);
        assertTextEquals(pastReportsDetailStatus, pastReportsStatusExpected);
        assertTextEquals(pastReportsDetailReportType, pastReportsReportTypeExpected);
        assertTextEquals(pastReportsDetailRequestor, pastReportsRequestorExpected);
    }

    public void pastReportsDetailSubmit() {
        click(pastReportsPageReceiptDetailButton);
        waitBySeconds(2);
    }

    public void pastReportsSearchSubmit() {
        click(pastReportsSearchButton);
        waitBySeconds(2);
    }

    public void typeRequestorPastReports() {
        type(pastReportsRequestor, "otomasyon@yemekpay.com");
        waitBySeconds(2);
    }

    public void pastReportsStatusSubmit() {
        click(pastReportsStatus);
        waitBySeconds(2);
    }

    public void pastReportsStatusSelectSubmit() {
        click(pastReportsStatusSelect);
        waitBySeconds(2);
        click(pastReportsScreenClick);
    }

    public void pastReportsReportTypeSubmit() {
        click(pastReportsReportType);
        waitBySeconds(2);
    }

    public void pastReportsReportTypeSelectSubmit() {
        click(pastReportsReportTypeSelect);
        waitBySeconds(2);
        click(pastReportsScreenClick);
    }

    public void pastReportsPageChooseStartDate(String startDay) {
        click(By.xpath("//div[@class='MuiDayCalendar-monthContainer css-i6bazn']//button[" + startDay + "]"));
        waitBySeconds(1);
    }

    public void pastReportsPageChooseEndDate(String endDay) {
        click(By.xpath("//div[@class='MuiDayCalendar-monthContainer css-i6bazn']//button[text() = '" + endDay + "']"));
        waitBySeconds(1);
    }

    public void pastReportsPageClickStartDateButton() {
        click(pastReportsStartDateIcon);
        waitBySeconds(1);
    }

    public void pastReportsPageClickEndDateButton() {
        click(pastReportsEndDateIcon);
        waitBySeconds(1);
    }

    public void pastReportsPageAllElementsAreDisplayed() {
        isElementDisplay(pastReportsPageOrderButton);
        isElementDisplay(pastReportsPageShowHide);
        isElementDisplay(pastReportsPageClearAllFilters);
        isElementDisplay(pastReportsSearchButton);
        isElementDisplay(pastReportsPageReceiptDownloadButton);
        isElementDisplay(pastReportsPagePerPage);
        isElementDisplay(pastReportsPageTNoRegistrations);
        isElementDisplay(pastReportsStartDate);
        isElementDisplay(pastReportsEndDate);
        isElementDisplay(pastReportsStatus);
        isElementDisplay(pastReportsReportType);
        isElementDisplay(pastReportsRequestor);
        isElementDisplay(pastReportsPageReceiptDetailButton);
    }

    public void leftSubMenuPastReportsSubmit() {
        click(pastReportsPageSubLeftMenuButton);
        waitBySeconds(2);
    }

    public void leftSubMenuPastReportsMoreFiltersSubmit() {
        click(pastReportsPayoutsPageMoreFiltersButton);
        waitBySeconds(2);
    }

    public void pastReportsPageControlUrl() throws Exception {
        controlUrl("history", "pages.pastreporthistory");
    }
}
