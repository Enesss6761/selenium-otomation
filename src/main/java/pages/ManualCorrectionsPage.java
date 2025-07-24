package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class ManualCorrectionsPage extends BasePage {
    By manualCorrectionsPageSubLeftMenuButton = By.cssSelector(".css-c4sutr div:nth-of-type(2) > .MuiButtonBase-root");
    By manualCorrectionsPayoutsPageMoreFiltersButton = By.cssSelector(".MuiButton-text");
    By manualCorrectionsPageOrderButton = By.cssSelector(".css-1s72i5x > .MuiButtonBase-root");
    By manualCorrectionsPageShowHide = By.cssSelector(".css-2ertzu > .MuiButtonBase-root");
    By manualCorrectionsPageClearAllFilters = By.id("clear_filters_button");
    By manualCorrectionsSearchButton = By.id("search_button");
    By manualCorrectionsAddButton = By.cssSelector(".MuiGrid-spacing-xs-1 > div:nth-of-type(3) > .MuiButtonBase-root");
    By manualCorrectionsExportButton = By.cssSelector(".MuiGrid-spacing-xs-1 > div:nth-of-type(2) > .MuiButtonBase-root");
    By manualCorrectionsExportHistoryButton = By.cssSelector(".MuiGrid-spacing-xs-1 > div:nth-of-type(1) > .MuiButtonBase-root");
    By manualCorrectionsPageReceiptDownloadButton = By.cssSelector(".MuiTableBody-root > tr:nth-of-type(1) .MuiButtonBase-root");
    By manualCorrectionsPagePerPage = By.id("pagination-dropdown_page_size");
    By manualCorrectionsPageTNoRegistrations = By.cssSelector("h3:nth-of-type(2)");
    By manualCorrectionsPageAddCorrectionsTitle = By.cssSelector(".css-2xgtc5");
    By manualCorrectionsPageAddCorrectionsMerchant = By.xpath("//div[@class='MuiStack-root css-1hv6bp7']//div[@id='search-select']");
    By manualCorrectionsPageAddCorrectionsTransactionType = By.xpath("//div[@class='MuiStack-root css-1hv6bp7']/div[2]//div[@id='dropdown-select']");
    By manualCorrectionsPageAddCorrectionsGrossAmount = By.name("[name='amount']");
    By manualCorrectionsPageAddCorrectionsCurrency = By.xpath("//div[@class='MuiStack-root css-1hv6bp7']/div[4]//div[@id='dropdown-select']");
    By manualCorrectionsPageAddCorrectionsDescription = By.cssSelector(".MuiInputBase-multiline");
    By manualCorrectionsPageAddCorrectionsCancel = By.cssSelector(".css-nlzl0u > .MuiButton-outlined");
    By manualCorrectionsPageAddCorrectionsSave = By.cssSelector(".css-nlzl0u > .MuiButton-contained");
    By manualCorrectionsStartDate = By.cssSelector(".css-16c2vxo > .MuiGrid-root > div:nth-of-type(1) > .MuiFormControl-root > .MuiInputBase-root");
    By manualCorrectionsEndDate = By.cssSelector(".css-16c2vxo > .MuiGrid-root > div:nth-of-type(2) .MuiInputBase-root");
    By manualCorrectionsStatus = By.xpath("//div[@class='MuiGrid-root MuiGrid-container MuiGrid-item css-16c2vxo']/div[@class='MuiGrid-root MuiGrid-container MuiGrid-item MuiGrid-spacing-xs-2 css-7aty7k']//div[@id='sticky-multiple-select']");
    By manualCorrectionsPageMerchant = By.id("search-select");
    By manualCorrectionsPageMinAmount = By.name("minAmount");
    By manualCorrectionsPageMaxAmount = By.name("maxAmount");
    By manualCorrectionsPageTransactionID = By.cssSelector("[name='transactionId']");
    By manualCorrectionsPageTransactionType = By.xpath("//div[@class='MuiGrid-root MuiGrid-container MuiGrid-item MuiGrid-spacing-xs-2 css-ymzd56']//div[@id='sticky-multiple-select']");
    By manualCorrectionsStartDateIcon = By.xpath("//div[@class='MuiGrid-root MuiGrid-container MuiGrid-item MuiGrid-spacing-xs-2 css-7aty7k']/div[1]//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-edgeEnd MuiIconButton-sizeMedium css-slyssw']");
    By manualCorrectionsEndDateIcon = By.xpath("//div[@class='MuiGrid-root MuiGrid-container MuiGrid-item MuiGrid-spacing-xs-2 css-7aty7k']/div[2]//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-edgeEnd MuiIconButton-sizeMedium css-slyssw']");
    By manualCorrectionsStatusSelect = By.cssSelector("[data-value='SUCCESS']");
    By manualCorrectionsReportType = By.xpath("//div[@class='MuiGrid-root MuiGrid-container MuiGrid-item MuiGrid-spacing-xs-2 css-ymzd56']//div[@id='sticky-multiple-select']");
    By manualCorrectionsReportTypeSelect = By.cssSelector("[data-value='MANUAL_INCOMING_TRANSFER']");
    By manualCorrectionsPageMerchantListInputText = By.cssSelector("#text_input_search");
    By manualCorrectionsPageMerchantListSearchButton = By.cssSelector("#button_search");
    By manualCorrectionsPageMerchantListSelectedBakCheckbox = By.cssSelector(".css-d037su > .MuiButtonBase-root:nth-of-type(1)");
    By manualCorrectionsPageAddNewManualCorrectionsPopupCloseButton = By.cssSelector("#button_close");
    By manualCorrectionsPageMerchantListCloseButton = By.cssSelector(".css-1nvsyjw");
    By manualCorrectionsPageTransactionTypeText = By.cssSelector("td:nth-of-type(5)");
    By manualCorrectionsPageMerchantNameText = By.cssSelector("td:nth-of-type(4)");
    By manualCorrectionsPageStatusText = By.cssSelector("td:nth-of-type(6)");
    By manualCorrectionsPageTransactionTypeList = By.xpath("//div[@class='MuiStack-root css-1hv6bp7']/div[2]//div[@id='dropdown-select']");
    By manualCorrectionsPageTransactionTypeSelect = By.cssSelector("[data-value='MANUAL_INCOMING_TRANSFER']");
    By manualCorrectionsPageGrossAmountType = By.cssSelector("#text_input_amount");
    By manualCorrectionsPageCurrencySelect = By.cssSelector("#dropdown_item_TRY");
    By manualCorrectionsPageDescription = By.cssSelector("#description");
    By manualCorrectionsPageSuccessMessage = By.xpath("//div[@class='go1888806478 notistack-MuiContent notistack-MuiContent-success go167266335 go1725278324 go3162094071']");
    By manualCorrectionsPageOrderSuccessMessage = By.xpath("//div[@class='notistack-SnackbarContainer go1453831412 go2989568495 go1141946668']//div[@class='notistack-Snackbar go3963613292']/div[.='Başarıyla kaydedildi.']");
    By manualCorrectionsPageReceiptDownload = By.cssSelector("#receipt_pdf-button_download");
    By manualCorrectionsPageReceiptOk = By.cssSelector("#receipt_pdf-button_close.MuiButton-root");
    By manualCorrectionsPageReceiptClose = By.cssSelector(".css-2snpl6");
    By manualCorrectionsPageReceiptPopUpControlTitle = By.cssSelector(".css-2xgtc5");

    public void manualCorrectionsReceiptSubmit() {
        click(manualCorrectionsPageReceiptDownloadButton);
        waitBySeconds(2);
    }

    public void manualCorrectionsPageReceiptPopUpControlTitle() {
        String title = getText(manualCorrectionsPageReceiptPopUpControlTitle);
        String expected = "Dekont";
        assertTextEquals(title, expected);
    }

    public void manualCorrectionsPageReceiptAllElementsAreDisplayed() {
        isElementDisplay(manualCorrectionsPageReceiptDownload);
        isElementDisplay(manualCorrectionsPageReceiptOk);
        isElementDisplay(manualCorrectionsPageReceiptClose);
    }

    public void addNewManualCorrectionsCancelSubmit() {
        click(manualCorrectionsPageAddCorrectionsCancel);
    }

    public void seeSuccessMessageManualCorrectionsPage() {
        String orderMessageActual = "İşlem başarılı şekilde kaydedildi ve onaylanması için sıraya alındı.";
        String successMessageActual = "Başarıyla kaydedildi.";
        String orderMessageExpected = getText(manualCorrectionsPageSuccessMessage);
        String successMessageExpected = getText(manualCorrectionsPageOrderSuccessMessage);
        assertTextEquals(orderMessageActual, orderMessageExpected);
        assertTextEquals(successMessageActual, successMessageExpected);
    }

    public void addNewManualCorrectionsSaveSubmit() {
        click(manualCorrectionsPageAddCorrectionsSave);
        waitBySeconds(2);
    }

    public void typeDescriptionAddNewManualCorrectionsSubmit() {
        type(manualCorrectionsPageDescription, "Test Automation MANUAL_INCOMING_TRANSFER");
        waitBySeconds(2);
    }

    public void addNewManualCorrectionsCurrencySelectSubmit() {
        click(manualCorrectionsPageCurrencySelect);
        waitBySeconds(2);
    }

    public void addNewManualCorrectionsCurrencySubmit() {
        click(manualCorrectionsPageAddCorrectionsCurrency);
        waitBySeconds(2);
    }

    public void addNewManualCorrectionsGrossAmountTypeSubmit() {
        type(manualCorrectionsPageGrossAmountType, "1");
        waitBySeconds(2);
    }

    public void addNewManualCorrectionsTransactionTypeSelectSubmit() {
        click(manualCorrectionsPageTransactionTypeSelect);
        waitBySeconds(2);
    }

    public void addNewManualCorrectionsTransactionTypeSubmit() {
        click(manualCorrectionsPageTransactionTypeList);
        waitBySeconds(2);
    }

    public void addNewManualCorrectionsMerchantSelectSubmit() {
        click(manualCorrectionsPageMerchantListSelectedBakCheckbox);
        waitBySeconds(2);
        click(manualCorrectionsPageMerchantListCloseButton);
    }

    public void addNewManualCorrectionsMerchantSearchSubmit() {
        click(manualCorrectionsPageMerchantListSearchButton);
        waitBySeconds(2);
    }

    public void typeMerchantNameAddNewManualCorrectionsSubmit() {
        type(manualCorrectionsPageMerchantListInputText, "Mahalle");
        waitBySeconds(2);
    }

    public void addNewManualCorrectionsMerchantListSubmit() {
        click(manualCorrectionsPageAddCorrectionsMerchant);
        waitBySeconds(2);
    }

    public void addNewManualCorrectionsSubmit() {
        click(manualCorrectionsAddButton);
        waitBySeconds(2);
    }

    public void seeTransactionRecordsOnListManualCorrectionsPage() {
        String merchantNameActual = "YEMEK SEPETİ MAHALLE";
        String transactionTypeActual = "Bekleyen Alacak Gelen Transfer (+)";
        String statusActual = "Başarılı";
        String merchantNameExpected = getText(manualCorrectionsPageMerchantNameText);
        String transactionTypeExpected = getText(manualCorrectionsPageTransactionTypeText);
        String statusExpected = getText(manualCorrectionsPageStatusText);
        assertTextEquals(merchantNameActual, merchantNameExpected);
        assertTextEquals(transactionTypeActual, transactionTypeExpected);
        assertTextEquals(statusActual, statusExpected);
    }

    public void merchantListManualCorrectionsPageSubmit() {
        click(manualCorrectionsPageMerchant);
        waitBySeconds(2);
    }

    public void typeMerchantNameMerchantListManualCorrectionsPageSubmit() {
        type(manualCorrectionsPageMerchantListInputText, "Mahalle");
        waitBySeconds(2);
    }

    public void merchantListSearchManualCorrectionsPageSubmit() {
        click(manualCorrectionsPageMerchantListSearchButton);
        waitBySeconds(2);
    }

    public void merchantListSelectedCheckboxManualCorrectionsPageSubmit() {
        click(manualCorrectionsPageMerchantListSelectedBakCheckbox);
        waitBySeconds(2);
        click(manualCorrectionsPageMerchantListCloseButton);
        waitBySeconds(1);
    }

    public void manualCorrectionsSearchSubmit() {
        click(manualCorrectionsSearchButton);
        waitBySeconds(2);
    }

    public void manualCorrectionsReportTypeSubmit() {
        click(manualCorrectionsReportType);
        waitBySeconds(2);
    }

    public void manualCorrectionsReportTypeSelectSubmit() {
        click(manualCorrectionsReportTypeSelect);
        waitBySeconds(2);
        Actions action = new Actions(getDriver());
        action.sendKeys(Keys.ESCAPE).build().perform();
    }

    public void manualCorrectionsStatusSubmit() {
        click(manualCorrectionsStatus);
        waitBySeconds(2);
    }

    public void manualCorrectionsSelectSubmit() {
        click(manualCorrectionsStatusSelect);
        waitBySeconds(2);
        Actions action = new Actions(getDriver());
        action.sendKeys(Keys.ESCAPE).build().perform();
    }

    public void manualCorrectionsPageChooseStartDate(String startDay) {
        click(By.xpath("//div[@class='MuiDayCalendar-monthContainer css-i6bazn']//button[text() = '" + startDay + "']"));
        waitBySeconds(1);
    }

    public void manualCorrectionsPageChooseEndDate(String endDay) {
        click(By.xpath("//div[@class='MuiDayCalendar-monthContainer css-i6bazn']//button[text() = '" + endDay + "']"));
        waitBySeconds(1);
    }

    public void manualCorrectionsPageClickStartDateButton() {
        click(manualCorrectionsStartDateIcon);
        waitBySeconds(1);
    }

    public void manualCorrectionsPageClickEndDateButton() {
        click(manualCorrectionsEndDateIcon);
        waitBySeconds(1);
    }

    public void manualCorrectionsPageAddCorrectionsAllElementsAreDisplayed() {
        isElementDisplay(manualCorrectionsPageAddCorrectionsMerchant);
        isElementDisplay(manualCorrectionsPageAddCorrectionsTransactionType);
        isElementDisplay(manualCorrectionsPageAddCorrectionsGrossAmount);
        isElementDisplay(manualCorrectionsPageAddCorrectionsCurrency);
        isElementDisplay(manualCorrectionsPageAddCorrectionsDescription);
        isElementDisplay(manualCorrectionsPageAddCorrectionsCancel);
        isElementDisplay(manualCorrectionsPageAddCorrectionsSave);
    }

    public void manualCorrectionsPageAllElementsAreDisplayed() {
        isElementDisplay(manualCorrectionsPageOrderButton);
        isElementDisplay(manualCorrectionsPageShowHide);
        isElementDisplay(manualCorrectionsPageClearAllFilters);
        isElementDisplay(manualCorrectionsSearchButton);
        isElementDisplay(manualCorrectionsPageReceiptDownloadButton);
        isElementDisplay(manualCorrectionsPagePerPage);
        isElementDisplay(manualCorrectionsPageTNoRegistrations);
        isElementDisplay(manualCorrectionsStartDate);
        isElementDisplay(manualCorrectionsEndDate);
        isElementDisplay(manualCorrectionsStatus);
        isElementDisplay(manualCorrectionsPageMerchant);
        isElementDisplay(manualCorrectionsPageMinAmount);
        isElementDisplay(manualCorrectionsPageMaxAmount);
        isElementDisplay(manualCorrectionsPageTransactionID);
        isElementDisplay(manualCorrectionsPageTransactionType);
    }

    public void leftSubMenuManualCorrectionsSubmit() {
        waitBySeconds(2);
        click(manualCorrectionsPageSubLeftMenuButton);
        waitBySeconds(2);
    }

    public void manualCorrectionsPageAddCorrectionsSubmit() {
        click(manualCorrectionsAddButton);
        waitBySeconds(2);
    }

    public void leftSubMenuManualCorrectionsMoreFiltersSubmit() {
        click(manualCorrectionsPayoutsPageMoreFiltersButton);
        waitBySeconds(2);
    }

    public void manualCorrectionsPageControlUrl() throws Exception {
        controlUrl("manual-correction", "pages.manualcorrections");
    }

    public void manualCorrectionsPageControlPopUp() {
        String title = getText(manualCorrectionsPageAddCorrectionsTitle);
        String expected = "Yeni Manuel Düzeltme";
        assertTextEquals(title, expected);
    }
}
