package pages;

import base.BasePage;
import org.openqa.selenium.By;

public class MerchantPayoutsPage extends BasePage {
    By merchantPayoutsPageSubLeftMenuButton = By.cssSelector(".MuiPaper-elevation0 div:nth-of-type(6) ul:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(1)");
    By merchantPayoutsPageMoreFiltersButton = By.cssSelector(".MuiButton-text");
    By merchantPayoutsPageOrderButton = By.cssSelector(".css-1s72i5x > .MuiButtonBase-root");
    By merchantPayoutsPageShowHide = By.cssSelector(".css-2ertzu > .MuiButtonBase-root");
    By merchantPayoutsPageClearAllFilters = By.id("clear_filters_button");
    By merchantPayoutsPageSearchButton = By.id("search_button");
    By merchantPayoutsPageAddButton = By.cssSelector(".css-9urz1a");
    By merchantPayoutsStartDate = By.cssSelector(".css-16c2vxo > .MuiGrid-root > div:nth-of-type(1) > .MuiFormControl-root > .MuiInputBase-root");
    By merchantPayoutsEndDate = By.cssSelector(".css-16c2vxo > .MuiGrid-root > div:nth-of-type(2) .MuiInputBase-root");
    By merchantPayoutsStatus = By.xpath("//div[@id='dropdown-select']");
    By merchantPayoutsPageMerchant = By.id("search-select");
    By merchantPayoutsPageMinAmount = By.name("minAmount");
    By merchantPayoutsPageMaxAmount = By.name("maxAmount");
    By merchantPayoutsPageTransactionID = By.cssSelector("[name='transactionId']");
    By merchantPayoutsPageReceipt = By.cssSelector(".MuiTableBody-root > tr:nth-of-type(1) .MuiButtonBase-root");
    By merchantPayoutsPagePerPage = By.id("pagination-dropdown_page_size");
    By merchantPayoutsPageTNoRegistrations = By.cssSelector("h3:nth-of-type(2)");
    By merchantPayoutsPageAddPayoutTitle = By.cssSelector(".css-2xgtc5");
    By merchantPayoutsPageAddPayoutMerchant = By.xpath("//div[@class='MuiStack-root css-1hv6bp7']//div[@id='search-select']");
    By merchantPayoutsPageAddPayoutPayoutGrossAmount = By.cssSelector("[name='payoutGrossAmount']");
    By merchantPayoutsPageAddPayoutPayoutNetAmount = By.cssSelector("[name='amount']");
    By merchantPayoutsPageAddPayoutMerchantCommissionAmount = By.cssSelector("[name='payoutMerchantComAmount']");
    By merchantPayoutsPageAddPayoutCurrency = By.xpath("//div[.='Türk Lirası']");
    By merchantPayoutsPageAddPayoutCancel = By.cssSelector(".css-nlzl0u > .MuiButton-outlined");
    By merchantPayoutsPageAddPayoutSave = By.cssSelector(".css-nlzl0u > .MuiButton-contained");
    By merchantPayoutsStartDateIcon = By.xpath("//div[@class='MuiGrid-root MuiGrid-container MuiGrid-item MuiGrid-spacing-xs-2 css-7aty7k']/div[1]//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-edgeEnd MuiIconButton-sizeMedium css-slyssw']");
    By merchantPayoutsEndDateIcon = By.xpath("//div[@class='MuiGrid-root MuiGrid-container MuiGrid-item MuiGrid-spacing-xs-2 css-7aty7k']/div[2]//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-edgeEnd MuiIconButton-sizeMedium css-slyssw']");
    By merchantPayoutsScreenClick = By.cssSelector("#menu- > div.MuiBackdrop-root.MuiBackdrop-invisible.MuiModal-backdrop.css-esi9ax");
    By merchantPayoutsStatusSelect = By.cssSelector("#dropdown_item_SUCCESS");
    By merchantPayoutsPageMerchantListInputText = By.cssSelector("#text_input_search");
    By merchantPayoutsPageMerchantListSearchButton = By.cssSelector("#button_search");
    By merchantPayoutsPageMerchantListSelectedBakCheckbox = By.cssSelector(".css-d037su > .MuiButtonBase-root:nth-of-type(1)");
    By merchantPayoutsPageMerchantListCloseButton = By.cssSelector(".css-1nvsyjw");
    By merchantPayoutsPageIbanText = By.cssSelector("td:nth-of-type(11)");
    By merchantPayoutsPageMerchantNameText = By.cssSelector("td:nth-of-type(5)");
    By merchantPayoutsPageStatusText = By.cssSelector("td:nth-of-type(6)");
    By merchantPayoutsPageReceiptDownload = By.cssSelector("#receipt_pdf-button_download");
    By merchantPayoutsPageReceiptOk = By.cssSelector("#receipt_pdf-button_close.MuiButton-root");
    By merchantPayoutsPageReceiptClose = By.cssSelector(".css-2snpl6");
    By merchantPayoutsPageReceiptPopUpControlTitle = By.cssSelector(".css-2xgtc5");
    By merchantPayoutsPageCurrencySelect = By.cssSelector("#dropdown_item_TRY");
    By merchantPayoutsPageSuccessMessage = By.xpath("//div[@class='go1888806478 notistack-MuiContent notistack-MuiContent-success go167266335 go1725278324 go3162094071']");
    By merchantPayoutsPageOrderSuccessMessage = By.xpath("//div[@class='notistack-SnackbarContainer go1453831412 go2989568495 go1141946668']//div[@class='notistack-Snackbar go3963613292']/div[.='Başarıyla kaydedildi.']");

    public void seeSuccessMessageMerchantPayoutsPage() {
        String orderMessageActual = "İşlem başarılı şekilde kaydedildi ve onaylanması için sıraya alındı.";
        String successMessageActual = "Başarıyla kaydedildi.";
        String orderMessageExpected = getText(merchantPayoutsPageSuccessMessage);
        String successMessageExpected = getText(merchantPayoutsPageOrderSuccessMessage);
        assertTextEquals(orderMessageActual, orderMessageExpected);
        assertTextEquals(successMessageActual, successMessageExpected);
    }

    public void addNewMerchantPayoutsSaveSubmit() {
        click(merchantPayoutsPageAddPayoutSave);
        waitBySeconds(2);
    }

    public void addNewMerchantPayoutsCurrencySelectSubmit() {
        click(merchantPayoutsPageCurrencySelect);
        waitBySeconds(2);
    }

    public void addNewMerchantPayoutsCurrencySubmit() {
        click(merchantPayoutsPageAddPayoutCurrency);
        waitBySeconds(2);
    }

    public void addNewMerchantPayoutsGrossAmountType() {
        type(merchantPayoutsPageAddPayoutPayoutGrossAmount, "1");
        waitBySeconds(2);
    }

    public void addNewMerchantPayoutsNetAmountType() {
        type(merchantPayoutsPageAddPayoutPayoutNetAmount, "1");
        waitBySeconds(2);
    }

    public void addNewMerchantPayoutsMerchantCommissionAmountType() {
        type(merchantPayoutsPageAddPayoutMerchantCommissionAmount, "1");
        waitBySeconds(2);
    }

    public void addNewMerchantPayoutsMerchantSelectSubmit() {
        click(merchantPayoutsPageMerchantListSelectedBakCheckbox);
        waitBySeconds(2);
        click(merchantPayoutsPageMerchantListCloseButton);
    }

    public void addNewMerchantPayoutsMerchantSearchSubmit() {
        click(merchantPayoutsPageMerchantListSearchButton);
        waitBySeconds(2);
    }

    public void typeMerchantNameAddNewMerchantPayoutsSubmit() {
        type(merchantPayoutsPageMerchantListInputText, "Mahalle");
        waitBySeconds(2);
    }

    public void addNewMerchantPayoutsMerchantListSubmit() {
        click(merchantPayoutsPageAddPayoutMerchant);
        waitBySeconds(2);
    }

    public void merchantPayoutsAddNewMerchantPayoutsSubmit() {
        click(merchantPayoutsPageAddButton);
        waitBySeconds(2);
    }

    public void merchantPayoutsPageReceiptPopUpControlTitle() {
        String title = getText(merchantPayoutsPageReceiptPopUpControlTitle);
        String expected = "Dekont";
        assertTextEquals(title, expected);
    }

    public void merchantPayoutsPageReceiptAllElementsAreDisplayed() {
        isElementDisplay(merchantPayoutsPageReceiptDownload);
        isElementDisplay(merchantPayoutsPageReceiptOk);
        isElementDisplay(merchantPayoutsPageReceiptClose);
    }

    public void merchantPayoutsReceiptSubmit() {
        click(merchantPayoutsPageReceipt);
        waitBySeconds(2);
    }

    public void seeTransactionRecordsOnListMerchantPayoutsPage() {
        String merchantNameActual = "YEMEK SEPETİ MAHALLE";
        String merchantIbanActual = "TR700006200011900006295427";
        String StatusActual = "Başarılı";
        String merchantNameExpected = getText(merchantPayoutsPageMerchantNameText);
        String merchantIbanExpected = getText(merchantPayoutsPageIbanText);
        String statusExpected = getText(merchantPayoutsPageStatusText);
        assertTextEquals(merchantNameActual, merchantNameExpected);
        assertTextEquals(merchantIbanActual, merchantIbanExpected);
        assertTextEquals(StatusActual, statusExpected);
    }

    public void merchantPayoutsSearchSubmit() {
        click(merchantPayoutsPageSearchButton);
        waitBySeconds(2);
    }

    public void merchantListMerchantPayoutsPageSubmit() {
        click(merchantPayoutsPageMerchant);
        waitBySeconds(2);
    }

    public void typeMerchantNameMerchantListMerchantPayoutsPageSubmit() {
        type(merchantPayoutsPageMerchantListInputText, "Mahalle");
        waitBySeconds(2);
    }

    public void merchantListSearchMerchantPayoutsPageSubmit() {
        click(merchantPayoutsPageMerchantListSearchButton);
        waitBySeconds(2);
    }

    public void merchantListSelectedCheckboxMerchantPayoutsSubmit() {
        click(merchantPayoutsPageMerchantListSelectedBakCheckbox);
        waitBySeconds(2);
        click(merchantPayoutsPageMerchantListCloseButton);
        waitBySeconds(1);
    }

    public void merchantPayoutsStatusSubmit() {
        click(merchantPayoutsStatus);
        waitBySeconds(2);
    }

    public void merchantPayoutsSelectSubmit() {
        click(merchantPayoutsStatusSelect);
        waitBySeconds(2);
    }

    public void merchantPayoutsPageChooseStartDate(String startDay) {
        click(By.xpath("//div[@class='MuiDayCalendar-monthContainer css-i6bazn']//button[text() = '" + startDay + "']"));
        waitBySeconds(1);
    }

    public void merchantPayoutsPageChooseEndDate(String endDay) {
        click(By.xpath("//div[@class='MuiDayCalendar-monthContainer css-i6bazn']//button[text() = '" + endDay + "']"));
        waitBySeconds(1);
    }

    public void merchantPayoutsPageClickStartDateButton() {
        click(merchantPayoutsStartDateIcon);
        waitBySeconds(1);
    }

    public void merchantPayoutsPageClickEndDateButton() {
        click(merchantPayoutsEndDateIcon);
        waitBySeconds(1);
    }

    public void merchantPayoutsPageAddPayoutAllElementsAreDisplayed() {
        isElementDisplay(merchantPayoutsPageAddPayoutMerchant);
        isElementDisplay(merchantPayoutsPageAddPayoutPayoutGrossAmount);
        isElementDisplay(merchantPayoutsPageAddPayoutPayoutNetAmount);
        isElementDisplay(merchantPayoutsPageAddPayoutMerchantCommissionAmount);
        isElementDisplay(merchantPayoutsPageAddPayoutCurrency);
        isElementDisplay(merchantPayoutsPageAddPayoutCancel);
        isElementDisplay(merchantPayoutsPageAddPayoutSave);
    }

    public void merchantPayoutsPageAllElementsAreDisplayed() {
        isElementDisplay(merchantPayoutsPageOrderButton);
        isElementDisplay(merchantPayoutsPageShowHide);
        isElementDisplay(merchantPayoutsPageClearAllFilters);
        isElementDisplay(merchantPayoutsPageSearchButton);
        isElementDisplay(merchantPayoutsPageAddButton);
        isElementDisplay(merchantPayoutsStartDate);
        isElementDisplay(merchantPayoutsEndDate);
        isElementDisplay(merchantPayoutsStatus);
        isElementDisplay(merchantPayoutsPageMerchant);
        isElementDisplay(merchantPayoutsPageMinAmount);
        isElementDisplay(merchantPayoutsPageMaxAmount);
        isElementDisplay(merchantPayoutsPageTransactionID);
        isElementDisplay(merchantPayoutsPageReceipt);
        isElementDisplay(merchantPayoutsPagePerPage);
        isElementDisplay(merchantPayoutsPageTNoRegistrations);
    }

    public void leftSubMenuMerchantPayoutsSubmit() {
        click(merchantPayoutsPageSubLeftMenuButton);
        waitBySeconds(2);
    }

    public void merchantPayoutsPageAddPayoutSubmit() {
        click(merchantPayoutsPageAddButton);
        waitBySeconds(2);
    }

    public void leftSubMenuMerchantPayoutsMoreFiltersSubmit() {
        click(merchantPayoutsPageMoreFiltersButton);
        waitBySeconds(2);
    }

    public void merchantPayoutsPagePageControlUrl() throws Exception {
        controlUrl("merchant-payout", "pages.merchantpayouts");
    }

    public void merchantPayoutsPageControlPopUp() {
        String title = getText(merchantPayoutsPageAddPayoutTitle);
        String expected = "Yeni Hakediş Ödemesi";
        assertTextEquals(title, expected);
    }

}
