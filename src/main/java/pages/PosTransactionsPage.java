package pages;

import base.BasePage;
import org.openqa.selenium.By;

public class PosTransactionsPage extends BasePage {
    By posTransactionsPageSubLeftMenuButton = By.cssSelector(".css-c4sutr div:nth-of-type(7) > .MuiButtonBase-root");
    By posTransactionsPayoutsPageMoreFiltersButton = By.cssSelector(".MuiButton-text");
    By posTransactionsPageOrderButton = By.cssSelector(".css-1s72i5x > .MuiButtonBase-root");
    By posTransactionsPageShowHide = By.cssSelector(".css-2ertzu > .MuiButtonBase-root");
    By posTransactionsPageClearAllFilters = By.id("clear_filters_button");
    By posTransactionsSearchButton = By.id("search_button");
    By posTransactionsPageExportHistoryButton = By.cssSelector(".MuiGrid-spacing-xs-1 > div:nth-of-type(1) > .MuiButtonBase-root");
    By posTransactionsPageExportButton = By.cssSelector(".MuiGrid-spacing-xs-1 > div:nth-of-type(2) > .MuiButtonBase-root");
    By posTransactionsPageTNoRegistrations = By.cssSelector("h3:nth-of-type(2)");
    By posTransactionsPagePerPage = By.id(".MuiInputBase-inputSizeSmall");
    By posTransactionsStartDate = By.cssSelector(".css-16c2vxo > .MuiGrid-root > div:nth-of-type(1) > .MuiFormControl-root > .MuiInputBase-root");
    By posTransactionsEndDate = By.cssSelector(".css-16c2vxo > .MuiGrid-root > div:nth-of-type(2) .MuiInputBase-root");
    By posTransactionsBankPF = By.xpath("//div[@class='MuiGrid-root MuiGrid-container MuiGrid-item MuiGrid-spacing-xs-2 css-ymzd56']/div[@class='MuiGrid-root MuiGrid-container MuiGrid-item MuiGrid-spacing-xs-2 css-7aty7k']/div[1]//div[@id='search-select']");
    By posTransactionsPos = By.xpath("//div[@class='MuiGrid-root MuiGrid-container MuiGrid-item MuiGrid-spacing-xs-2 css-ymzd56']//div[2]//div[@id='search-select']");
    By posTransactionsMerchant = By.xpath("//div[@class='MuiGrid-root MuiGrid-container MuiGrid-item css-16c2vxo']/div[@class='MuiGrid-root MuiGrid-container MuiGrid-item MuiGrid-spacing-xs-2 css-7aty7k']//div[@id='search-select']");
    By posTransactionsStartDateIcon = By.xpath("//div[@class='MuiGrid-root MuiGrid-container MuiGrid-item MuiGrid-spacing-xs-2 css-7aty7k']/div[1]//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-edgeEnd MuiIconButton-sizeMedium css-slyssw']");
    By posTransactionsEndDateIcon = By.xpath("//div[@class='MuiGrid-root MuiGrid-container MuiGrid-item MuiGrid-spacing-xs-2 css-7aty7k']/div[2]//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-edgeEnd MuiIconButton-sizeMedium css-slyssw']");
    By posTransactionsReportPageBankListInputText = By.cssSelector("#text_input_search");
    By posTransactionsReportPageBankListSearchButton = By.cssSelector("#button_search");
    By posTransactionsReportPageBankListSelectedBakCheckbox = By.cssSelector(".css-d037su > li:nth-of-type(2)");
    By posTransactionsReportPageBankListCloseButton = By.cssSelector("#button_close");
    By posTransactionsReportPagePosListInputText = By.cssSelector("#text_input_search");
    By posTransactionsReportPagePosListSearchButton = By.cssSelector("#button_search");
    By posTransactionsReportPagePosListSelectedBakCheckbox = By.cssSelector(".css-d037su > .MuiButtonBase-root");
    By posTransactionsReportPagePosListCloseButton = By.cssSelector("#button_close");
    By posTransactionsReportPageMerchantListInputText = By.cssSelector("#text_input_search");
    By posTransactionsReportPageMerchantListSearchButton = By.cssSelector("#button_search");
    By posTransactionsReportPageMerchantListSelectedBakCheckbox = By.cssSelector(".css-d037su > .MuiButtonBase-root:nth-of-type(1)");
    By posTransactionsReportPageMerchantListCloseButton = By.cssSelector("#button_close");
    By posTransactionsReportMerchantNameText = By.cssSelector("td:nth-of-type(2)");
    By posTransactionsReportBankNameText = By.cssSelector("td:nth-of-type(3)");
    By posTransactionsReportPosNameText = By.cssSelector("td:nth-of-type(4)");
    By posTransactionsReportExportSuccessMessageText = By.cssSelector("#notistack-snackbar");

    public void posTransactionsPageAllElementsAreDisplayed() {
        isElementDisplay(posTransactionsPageOrderButton);
        isElementDisplay(posTransactionsPageShowHide);
        isElementDisplay(posTransactionsPageClearAllFilters);
        isElementDisplay(posTransactionsSearchButton);
        isElementDisplay(posTransactionsPageExportHistoryButton);
        isElementDisplay(posTransactionsPageExportButton);
        isElementDisplay(posTransactionsPageTNoRegistrations);
        isElementDisplay(posTransactionsPagePerPage);
        isElementDisplay(posTransactionsStartDate);
        isElementDisplay(posTransactionsEndDate);
        isElementDisplay(posTransactionsBankPF);
        isElementDisplay(posTransactionsPos);
        isElementDisplay(posTransactionsMerchant);
    }

    public void leftSubMenuPosTransactionsSubmit() {
        click(posTransactionsPageSubLeftMenuButton);
        waitBySeconds(2);
    }

    public void leftSubMenuPosTransactionsMoreFiltersSubmit() {
        click(posTransactionsPayoutsPageMoreFiltersButton);
        waitBySeconds(2);
    }

    public void posTransactionsPageControlUrl() throws Exception {
        controlUrl("pos-transactions", "pages.postransactions");
    }

    public void posTransactionsPageChooseStartDate(String startDay) {
        click(By.xpath("//div[@class='MuiDayCalendar-monthContainer css-i6bazn']//button[" + startDay + "]"));
        waitBySeconds(1);
    }

    public void posTransactionsPageChooseEndDate(String endDay) {
        click(By.xpath("//div[@class='MuiDayCalendar-monthContainer css-i6bazn']//button[text() = '" + endDay + "']"));
        waitBySeconds(1);
    }

    public void posTransactionsPageClickStartDateButton() {
        click(posTransactionsStartDateIcon);
        waitBySeconds(1);
    }

    public void posTransactionsPageClickEndDateButton() {
        click(posTransactionsEndDateIcon);
        waitBySeconds(1);
    }

    public void bankListPosTransactionsReportSubmit() {
        click(posTransactionsBankPF);
        waitBySeconds(2);
    }

    public void typeBankNameBankListPosTransactionsReportSubmit() {
        type(posTransactionsReportPageBankListInputText, "akbank");
        waitBySeconds(2);
    }

    public void bankListSearchPosTransactionsReportSubmit() {
        click(posTransactionsReportPageBankListSearchButton);
        waitBySeconds(2);
    }

    public void bankListSelectedCheckboxPosTransactionsReportSubmit() {
        click(posTransactionsReportPageBankListSelectedBakCheckbox);
        waitBySeconds(2);
        click(posTransactionsReportPageBankListCloseButton);
        waitBySeconds(1);
    }

    public void posListPosTransactionsReportSubmit() {
        click(posTransactionsPos);
        waitBySeconds(2);
    }

    public void typePosNamePosListPosTransactionsReportSubmit() {
        type(posTransactionsReportPagePosListInputText, "AKBANK UAT POS");
        waitBySeconds(2);
    }

    public void posListSearchPosTransactionsReportSubmit() {
        click(posTransactionsReportPagePosListSearchButton);
        waitBySeconds(2);
    }

    public void posListSelectedCheckboxPosTransactionsReportSubmit() {
        click(posTransactionsReportPagePosListSelectedBakCheckbox);
        waitBySeconds(2);
        click(posTransactionsReportPagePosListCloseButton);
        waitBySeconds(1);
    }

    public void merchantListPosTransactionsReportSubmit() {
        click(posTransactionsMerchant);
        waitBySeconds(2);
    }

    public void typeMerchantNameBankListPosTransactionsReportSubmit() {
        type(posTransactionsReportPageMerchantListInputText, "Yemeksepeti");
        waitBySeconds(2);
    }

    public void merchantListSearchPosTransactionsReportSubmit() {
        click(posTransactionsReportPageMerchantListSearchButton);
        waitBySeconds(2);
    }

    public void merchantListSelectedCheckboxPosTransactionsReportSubmit() {
        click(posTransactionsReportPageMerchantListSelectedBakCheckbox);
        waitBySeconds(2);
        click(posTransactionsReportPageMerchantListCloseButton);
    }

    public void posTransactionsPageSearchButtonSubmit() {
        click(posTransactionsSearchButton);
        waitBySeconds(1);
    }

    public void seeMerchantNameOnListPosTransactionsReport() {
        String merchantNameActual = "YEMEK SEPETİ MAHALLE";
        String bankNameActual = "AKBANK";
        String posNameActual = "AKBANK UAT POS";
        String merchantNameExpected = getText(posTransactionsReportMerchantNameText);
        String bankNameExpected = getText(posTransactionsReportBankNameText);
        String posNameExpected = getText(posTransactionsReportPosNameText);
        assertTextEquals(merchantNameActual, merchantNameExpected);
        assertTextEquals(bankNameActual, bankNameExpected);
        assertTextEquals(posNameActual, posNameExpected);
    }

    public void posTransactionsReportExportSubmit() {
        click(posTransactionsPageExportButton);
        waitBySeconds(2);
    }

    public void seePosTransactionsReportExportSuccessMessage() {
        String successMessageActual = "Başarıyla dışa aktarıldı, lütfen mailinizi kontrol edin.";
        String successMessageExpected = getText(posTransactionsReportExportSuccessMessageText);
        assertTextEquals(successMessageActual, successMessageExpected);
    }

    public void posTransactionsReportExportHistorySubmit() {
        click(posTransactionsPageExportHistoryButton);
        waitBySeconds(2);
    }

    public void seePosTransactionsReportExportToHistoryReportType() {
        PastReportsPage x = new PastReportsPage();
        String successMessageActual = "POS Hareketleri";
        String successMessageExpected = getText(x.pastReportsListReportTypePosTransactionsReport);
        assertTextEquals(successMessageActual, successMessageExpected);
    }
}
