package pages;

import base.BasePage;
import org.openqa.selenium.By;

public class PosReleaseSummaryPage extends BasePage {
    By posReleaseSummaryReportPageSubLeftMenuButton = By.cssSelector(".css-c4sutr div:nth-of-type(6) > .MuiButtonBase-root");
    By posReleaseSummaryReportPayoutsPageMoreFiltersButton = By.cssSelector(".MuiButton-text");
    By posReleaseSummaryReportPageOrderButton = By.cssSelector(".css-1s72i5x > .MuiButtonBase-root");
    By posReleaseSummaryReportPageShowHide = By.cssSelector(".css-2ertzu > .MuiButtonBase-root");
    By posReleaseSummaryReportPageClearAllFilters = By.id("clear_filters_button");
    By posReleaseSummaryReportSearchButton = By.id("search_button");
    By posReleaseSummaryReportPageExportHistoryButton = By.cssSelector(".MuiGrid-spacing-xs-1 > div:nth-of-type(1) > .MuiButtonBase-root");
    By posReleaseSummaryReportPageExportButton = By.cssSelector(".MuiGrid-spacing-xs-1 > div:nth-of-type(2) > .MuiButtonBase-root");
    By posReleaseSummaryReportPageTNoRegistrations = By.cssSelector("h3:nth-of-type(2)");
    By posReleaseSummaryReportPagePerPage = By.id(".MuiInputBase-inputSizeSmall");
    By posReleaseSummaryReportStartDate = By.cssSelector(".css-16c2vxo > .MuiGrid-root > div:nth-of-type(1) > .MuiFormControl-root > .MuiInputBase-root");
    By posReleaseSummaryReportEndDate = By.cssSelector(".css-16c2vxo > .MuiGrid-root > div:nth-of-type(2) .MuiInputBase-root");
    By posReleaseSummaryReportStartDateIcon = By.xpath("//div[@class='MuiGrid-root MuiGrid-container MuiGrid-item MuiGrid-spacing-xs-2 css-7aty7k']/div[1]//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-edgeEnd MuiIconButton-sizeMedium css-slyssw']");
    By posReleaseSummaryReportEndDateIcon = By.xpath("//div[@class='MuiGrid-root MuiGrid-container MuiGrid-item MuiGrid-spacing-xs-2 css-7aty7k']/div[2]//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-edgeEnd MuiIconButton-sizeMedium css-slyssw']");
    By posReleaseSummaryReportPos = By.xpath("//div[@class='MuiGrid-root MuiGrid-container MuiGrid-item MuiGrid-spacing-xs-2 css-ymzd56']//div[@id='search-select']");
    By posReleaseSummaryReportBankPF = By.xpath("//div[@class='MuiGrid-root MuiGrid-container MuiGrid-item css-16c2vxo']/div[@class='MuiGrid-root MuiGrid-container MuiGrid-item MuiGrid-spacing-xs-2 css-7aty7k']//div[@id='search-select']");
    By posReleaseSummaryReportPageBankListInputText = By.cssSelector("#text_input_search");
    By posReleaseSummaryReportPageBankListSearchButton = By.cssSelector("#button_search");
    By posReleaseSummaryReportPageBankListSelectedBakCheckbox = By.cssSelector(".css-d037su > .MuiButtonBase-root");
    By posReleaseSummaryReportPageBankListCloseButton = By.cssSelector("#button_close");
    By posReleaseSummaryReportPagePosListInputText = By.cssSelector("#text_input_search");
    By posReleaseSummaryReportPagePosListSearchButton = By.cssSelector("#button_search");
    By posReleaseSummaryReportPagePosListSelectedBakCheckbox = By.cssSelector(".css-d037su > .MuiButtonBase-root");
    By posReleaseSummaryReportPagePosListCloseButton = By.cssSelector("#button_close");
    By posReleaseSummaryReportBankNameText = By.cssSelector("td:nth-of-type(3)");
    By posReleaseSummaryReportPosNameText = By.cssSelector("td:nth-of-type(4)");
    By posReleaseSummaryReportExportSuccessMessageText = By.cssSelector("#notistack-snackbar");

    public void posReleaseSummaryPageAllElementsAreDisplayed() {
        isElementDisplay(posReleaseSummaryReportPageOrderButton);
        isElementDisplay(posReleaseSummaryReportPageShowHide);
        isElementDisplay(posReleaseSummaryReportPageClearAllFilters);
        isElementDisplay(posReleaseSummaryReportSearchButton);
        isElementDisplay(posReleaseSummaryReportPageExportHistoryButton);
        isElementDisplay(posReleaseSummaryReportPageExportButton);
        isElementDisplay(posReleaseSummaryReportPageTNoRegistrations);
        isElementDisplay(posReleaseSummaryReportPagePerPage);
        isElementDisplay(posReleaseSummaryReportStartDate);
        isElementDisplay(posReleaseSummaryReportEndDate);
        isElementDisplay(posReleaseSummaryReportPos);
        isElementDisplay(posReleaseSummaryReportBankPF);
    }

    public void leftSubMenuPosReleaseSummarySubmit() {
        click(posReleaseSummaryReportPageSubLeftMenuButton);
        waitBySeconds(2);
    }

    public void leftSubMenuPosReleaseSummaryMoreFiltersSubmit() {
        click(posReleaseSummaryReportPayoutsPageMoreFiltersButton);
        waitBySeconds(2);
    }

    public void posReleaseSummaryPageControlUrl() throws Exception {
        controlUrl("pos-release-summary", "pages.posreleasesummary");
    }

    public void posReleaseSummaryPageChooseStartDate(String startDay) {
        click(By.xpath("//div[@class='MuiDayCalendar-monthContainer css-i6bazn']//button[text() = '" + startDay + "']"));
        waitBySeconds(1);
    }

    public void posReleaseSummaryPageChooseEndDate(String endDay) {
        click(By.xpath("//div[@class='MuiDayCalendar-monthContainer css-i6bazn']//button[text() = '" + endDay + "']"));
        waitBySeconds(1);
    }

    public void posReleaseSummaryPageClickStartDateButton() {
        click(posReleaseSummaryReportStartDateIcon);
        waitBySeconds(1);
    }

    public void posReleaseSummaryPageClickEndDateButton() {
        click(posReleaseSummaryReportEndDateIcon);
        waitBySeconds(1);
    }

    public void bankListPosReleaseSummaryReportSubmit() {
        click(posReleaseSummaryReportBankPF);
        waitBySeconds(2);
    }

    public void typeBankNameBankListPosReleaseSummaryReportSubmit() {
        type(posReleaseSummaryReportPageBankListInputText, "akbank");
        waitBySeconds(2);
    }

    public void bankListSearchPosReleaseSummaryReportSubmit() {
        click(posReleaseSummaryReportPageBankListSearchButton);
        waitBySeconds(2);
    }

    public void bankListSelectedCheckboxPosReleaseSummaryReportSubmit() {
        click(posReleaseSummaryReportPageBankListSelectedBakCheckbox);
        waitBySeconds(2);
        click(posReleaseSummaryReportPageBankListCloseButton);
        waitBySeconds(1);
    }

    public void posListPosReleaseSummaryReportSubmit() {
        click(posReleaseSummaryReportPos);
        waitBySeconds(2);
    }

    public void typePosNamePosListPosReleaseSummaryReportSubmit() {
        type(posReleaseSummaryReportPagePosListInputText, "AKBANK UAT POS");
        waitBySeconds(2);
    }

    public void posListSearchPosReleaseSummaryReportSubmit() {
        click(posReleaseSummaryReportPagePosListSearchButton);
        waitBySeconds(2);
    }

    public void posListSelectedCheckboxPosReleaseSummaryReportSubmit() {
        click(posReleaseSummaryReportPagePosListSelectedBakCheckbox);
        waitBySeconds(2);
        click(posReleaseSummaryReportPagePosListCloseButton);
        waitBySeconds(1);
    }

    public void posReleaseSummaryReportPageSearchButtonSubmit() {
        click(posReleaseSummaryReportSearchButton);
        waitBySeconds(1);
    }

    public void seeMerchantNameOnListPosReleaseSummaryReport() {
        String bankNameActual = "AKBANK";
        String posNameActual = "AKBANK UAT POS";
        String bankNameExpected = getText(posReleaseSummaryReportBankNameText);
        String posNameExpected = getText(posReleaseSummaryReportPosNameText);
        assertTextEquals(bankNameActual, bankNameExpected);
        assertTextEquals(posNameActual, posNameExpected);
    }

    public void posReleaseSummaryReportExportSubmit() {
        click(posReleaseSummaryReportPageExportButton);
        waitBySeconds(2);
    }

    public void seePosReleaseSummaryReportExportSuccessMessage() {
        String successMessageActual = "Başarıyla dışa aktarıldı, lütfen mailinizi kontrol edin.";
        String successMessageExpected = getText(posReleaseSummaryReportExportSuccessMessageText);
        assertTextEquals(successMessageActual, successMessageExpected);
    }

    public void posReleaseSummaryReportExportHistorySubmit() {
        click(posReleaseSummaryReportPageExportHistoryButton);
        waitBySeconds(2);
    }

    public void seePosReleaseSummaryReportExportToHistoryReportType() {
        PastReportsPage x = new PastReportsPage();
        String successMessageActual = "POS Çözüm/Komisyon";
        String successMessageExpected = getText(x.pastReportsListReportTypePosReleaseSummaryReport);
        assertTextEquals(successMessageActual, successMessageExpected);
    }
}
