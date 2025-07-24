package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class AccountStatementPage extends BasePage {
    By accountStatementPageSubLeftMenuButton = By.cssSelector(".css-c4sutr div:nth-of-type(4) > .MuiButtonBase-root");
    By accountStatementPayoutsPageMoreFiltersButton = By.cssSelector(".MuiButton-text");
    By accountStatementPageOrderButton = By.cssSelector(".css-1s72i5x > .MuiButtonBase-root");
    By accountStatementPageShowHide = By.cssSelector(".css-2ertzu > .MuiButtonBase-root");
    By accountStatementPageClearAllFilters = By.id("clear_filters_button");
    By accountStatementSearchButton = By.id("search_button");
    By accountStatementPageExportHistoryButton = By.cssSelector(".MuiGrid-spacing-xs-1 > div:nth-of-type(1) > .MuiButtonBase-root");
    By accountStatementPageExportButton = By.cssSelector(".MuiGrid-spacing-xs-1 > div:nth-of-type(2) > .MuiButtonBase-root");
    By accountStatementPageTNoRegistrations = By.cssSelector("h3:nth-of-type(2)");
    By accountStatementPagePerPage = By.id(".MuiInputBase-inputSizeSmall");
    By accountStatementStartDate = By.cssSelector(".css-16c2vxo > .MuiGrid-root > div:nth-of-type(1) > .MuiFormControl-root > .MuiInputBase-root");
    By accountStatementEndDate = By.cssSelector(".css-16c2vxo > .MuiGrid-root > div:nth-of-type(2) .MuiInputBase-root");
    By accountStatementMerchant = By.xpath("//div[@class='MuiGrid-root MuiGrid-container MuiGrid-item css-16c2vxo']/div[@class='MuiGrid-root MuiGrid-container MuiGrid-item MuiGrid-spacing-xs-2 css-7aty7k']//div[@id='search-select']");
    By accountStatementTransactionID = By.name("orderId");
    By accountStatementTransactionType = By.cssSelector("#sticky-multiple-select");
    By accountStatementTransactionTypeSelect = By.cssSelector("[data-value='SALES']");
    By accountStatementPos = By.xpath("//div[@class='MuiGrid-root MuiGrid-container MuiGrid-item MuiGrid-spacing-xs-2 css-ymzd56']//div[3]//div[@id='search-select']");
    By accountStatementBankPF = By.xpath("//div[@class='MuiGrid-root MuiGrid-container MuiGrid-item MuiGrid-spacing-xs-2 css-ymzd56']//div[4]//div[@id='search-select']");
    By accountStatementStartDateIcon = By.xpath("//div[@class='MuiGrid-root MuiGrid-container MuiGrid-item MuiGrid-spacing-xs-2 css-7aty7k']/div[1]//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-edgeEnd MuiIconButton-sizeMedium css-slyssw']");
    By accountStatementEndDateIcon = By.xpath("//div[@class='MuiGrid-root MuiGrid-container MuiGrid-item MuiGrid-spacing-xs-2 css-7aty7k']/div[2]//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-edgeEnd MuiIconButton-sizeMedium css-slyssw']");
    By accountStatementStartDateOkButton = By.cssSelector(".css-m9xqr6");
    By accountStatementEndDateOkButton = By.cssSelector(".css-m9xqr6");
    By accountStatementReportPageBankListInputText = By.cssSelector("#text_input_search");
    By accountStatementReportPageBankListSearchButton = By.cssSelector("#button_search");
    By accountStatementReportPageBankListSelectedBakCheckbox = By.cssSelector(".css-d037su > .MuiButtonBase-root");
    By accountStatementReportPageBankListCloseButton = By.cssSelector("#button_close");
    By accountStatementReportPagePosListInputText = By.cssSelector("#text_input_search");
    By accountStatementReportPagePosListSearchButton = By.cssSelector("#button_search");
    By accountStatementReportPagePosListSelectedBakCheckbox = By.cssSelector(".css-d037su > .MuiButtonBase-root");
    By accountStatementReportPagePosListCloseButton = By.cssSelector("#button_close");
    By accountStatementReportPageMerchantListInputText = By.cssSelector("#text_input_search");
    By accountStatementReportPageMerchantListSearchButton = By.cssSelector("#button_search");
    By accountStatementReportPageMerchantListSelectedBakCheckbox = By.cssSelector(".css-d037su > .MuiButtonBase-root:nth-of-type(1)");
    By accountStatementReportPageMerchantListCloseButton = By.cssSelector("#button_close");
    By accountStatementReportMerchantNameText = By.cssSelector("td:nth-of-type(5)");
    By accountStatementReportBankNameText = By.cssSelector("td:nth-of-type(15)");
    By accountStatementReportPosNameText = By.cssSelector("td:nth-of-type(16)");
    By accountStatementReportExportSuccessMessageText = By.cssSelector("#notistack-snackbar");
    public void accountStatementPageChooseStartDate(String startDay) {
        click(By.xpath("//div[@class='MuiDayCalendar-monthContainer css-i6bazn']//button[text() = '" + startDay + "']"));
        waitBySeconds(1);
        click(accountStatementStartDateOkButton);
    }

    public void accountStatementPageChooseEndDate(String endDay) {
        click(By.xpath("//div[@class='MuiDayCalendar-monthContainer css-i6bazn']//button[text() = '" + endDay + "']"));
        waitBySeconds(1);
        click(accountStatementEndDateOkButton);
        waitBySeconds(1);
    }

    public void accountStatementPageClickStartDateButton() {
        click(accountStatementStartDateIcon);
        waitBySeconds(1);
    }

    public void accountStatementPageClickEndDateButton() {
        click(accountStatementEndDateIcon);
        waitBySeconds(1);
    }

    public void accountStatementPageAllElementsAreDisplayed() {
        isElementDisplay(accountStatementPageOrderButton);
        isElementDisplay(accountStatementPageShowHide);
        isElementDisplay(accountStatementPageClearAllFilters);
        isElementDisplay(accountStatementSearchButton);
        isElementDisplay(accountStatementPageExportHistoryButton);
        isElementDisplay(accountStatementPageExportButton);
        isElementDisplay(accountStatementPageTNoRegistrations);
        isElementDisplay(accountStatementPagePerPage);
        isElementDisplay(accountStatementStartDate);
        isElementDisplay(accountStatementEndDate);
        isElementDisplay(accountStatementMerchant);
        isElementDisplay(accountStatementTransactionID);
        isElementDisplay(accountStatementTransactionType);
        isElementDisplay(accountStatementPos);
        isElementDisplay(accountStatementBankPF);
    }

    public void leftSubMenuAccountStatementSubmit() {
        click(accountStatementPageSubLeftMenuButton);
        waitBySeconds(2);
    }

    public void leftSubMenuAccountStatementMoreFiltersSubmit() {
        click(accountStatementPayoutsPageMoreFiltersButton);
        waitBySeconds(2);
    }

    public void accountStatementPageControlUrl() throws Exception {
        controlUrl("account-statement", "pages.accountstatement");
    }

    public void bankListAccountStatementReportSubmit() {
        click(accountStatementBankPF);
        waitBySeconds(2);
    }

    public void typeBankNameBankListAccountStatementReportSubmit() {
        type(accountStatementReportPageBankListInputText, "ZIRAAT");
        waitBySeconds(2);
    }

    public void bankListSearchAccountStatementReportSubmit() {
        click(accountStatementReportPageBankListSearchButton);
        waitBySeconds(2);
    }

    public void bankListSelectedCheckboxAccountStatementReportSubmit() {
        click(accountStatementReportPageBankListSelectedBakCheckbox);
        waitBySeconds(2);
        click(accountStatementReportPageBankListCloseButton);
        waitBySeconds(1);
    }

    public void posListAccountStatementReportSubmit() {
        click(accountStatementPos);
        waitBySeconds(2);
    }

    public void typePosNamePosListAccountStatementReportSubmit() {
        type(accountStatementReportPagePosListInputText, "Ziraat UAT Pos");
        waitBySeconds(2);
    }

    public void posListSearchAccountStatementReportSubmit() {
        click(accountStatementReportPagePosListSearchButton);
        waitBySeconds(2);
    }

    public void posListSelectedCheckboxAccountStatementReportSubmit() {
        click(accountStatementReportPagePosListSelectedBakCheckbox);
        waitBySeconds(2);
        click(accountStatementReportPagePosListCloseButton);
        waitBySeconds(1);
    }

    public void merchantListAccountStatementReportSubmit() {
        click(accountStatementMerchant);
        waitBySeconds(2);
    }

    public void typeMerchantNameMerchantListAccountStatementReportSubmit() {
        type(accountStatementReportPageMerchantListInputText, "Mahalle");
        waitBySeconds(2);
    }

    public void merchantListSearchAccountStatementReportSubmit() {
        click(accountStatementReportPageMerchantListSearchButton);
        waitBySeconds(2);
    }

    public void merchantListSelectedCheckboxAccountStatementReportSubmit() {
        click(accountStatementReportPageMerchantListSelectedBakCheckbox);
        waitBySeconds(2);
        click(accountStatementReportPageMerchantListCloseButton);
        waitBySeconds(1);
    }

    public void typeTransactionIdAccountStatementReportSubmit(String orderId) {
        click(accountStatementTransactionID);
        type(accountStatementTransactionID, orderId);
        waitBySeconds(2);
    }

    public void transactionTypeAccountStatementReportSubmit() {
        click(accountStatementTransactionType);
        waitBySeconds(2);
    }

    public void transactionTypeSelectAccountStatementReportSubmit() {
        click(accountStatementTransactionTypeSelect);
        waitBySeconds(2);
        Actions action = new Actions(getDriver());
        action.sendKeys(Keys.ESCAPE).build().perform();
    }

    public void accountStatementReportSearchSubmit() {
        click(accountStatementSearchButton);
        waitBySeconds(2);
    }

    public void seeTransactionRecordsOnListAccountStatementReport() {
        String merchantNameActual = "YEMEK SEPETİ MAHALLE";
        String bankNameActual = "ZIRAAT";
        String posNameActual = "Ziraat UAT Pos";
        String merchantNameExpected = getText(accountStatementReportMerchantNameText);
        String bankNameExpected = getText(accountStatementReportBankNameText);
        String posNameExpected = getText(accountStatementReportPosNameText);
        assertTextEquals(merchantNameActual, merchantNameExpected);
        assertTextEquals(bankNameActual, bankNameExpected);
        assertTextEquals(posNameActual, posNameExpected);
    }

    public void accountStatementReportExportSubmit() {
        click(accountStatementPageExportButton);
        waitBySeconds(2);
    }

    public void seeAccountStatementReportExportSuccessMessage() {
        String successMessageActual = "Başarıyla dışa aktarıldı, lütfen mailinizi kontrol edin.";
        String successMessageExpected = getText(accountStatementReportExportSuccessMessageText);
        assertTextEquals(successMessageActual, successMessageExpected);
    }

    public void accountStatementReportExportHistorySubmit() {
        click(accountStatementPageExportHistoryButton);
        waitBySeconds(2);
    }

    public void seeAccountStatementReportExportToHistoryReportType() {
        PastReportsPage x = new PastReportsPage();
        String successMessageActual = "İşlem Dökümü";
        String successMessageExpected = getText(x.pastReportsListReportTypeAccountStatementReport);
        assertTextEquals(successMessageActual, successMessageExpected);
    }
}
