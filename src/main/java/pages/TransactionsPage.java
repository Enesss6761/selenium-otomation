package pages;

import base.BasePage;
import org.openqa.selenium.By;

public class TransactionsPage extends BasePage {
    By transactionsSubLeftMenuButton = By.cssSelector(".MuiCollapse-entered div:nth-of-type(4) > .MuiButtonBase-root");
    By transactionsMoreFiltersButton = By.cssSelector(".MuiButton-text");
    By transactionsSearchButton = By.id("search_button");
    By transactionsOrderNo = By.name("internalOrderId");
    By transactionsPlatformOrderNo = By.name("platformOrderId");
    By transactionsPosName = By.id("search-select");
    By transactionsStatus = By.id("transaction-dropdown_transaction_status");
    By transactions3DsInfo = By.xpath("//div[@class='MuiGrid-root MuiGrid-container MuiGrid-item MuiGrid-spacing-xs-2 css-ymzd56']/div[1]/div[2]//div[@id='dropdown-select']");
    By transactionsPaymentMethod = By.xpath("//div[@class='MuiGrid-root MuiGrid-container MuiGrid-item MuiGrid-spacing-xs-2 css-ymzd56']/div[1]/div[3]//div[@id='dropdown-select']");
    By transactionsValueDate = By.name("valueDate");
    By transactionsStartDate = By.cssSelector(".css-ymzd56 > .MuiGrid-root > div:nth-of-type(2) [placeholder='MM/DD/YYYY hh:mm aa']");
    By transactionsEndDate = By.cssSelector(".css-ymzd56 div:nth-of-type(3) [placeholder='MM/DD/YYYY hh:mm aa']");
    By transactionsMerchantID = By.id(":rd:");
    By transactionsMerchantName = By.xpath("//div[@class='MuiGrid-root MuiGrid-container MuiGrid-item MuiGrid-spacing-xs-2 css-ymzd56']/div[3]/div[2]//div[@id='dropdown-select']");
    By transactionsType = By.xpath("//div[@class='MuiGrid-root MuiGrid-container MuiGrid-item MuiGrid-spacing-xs-2 css-7aty7k'][3]/div[3]//div[@id='transaction-dropdown_merchant']");
    By transactionsBinNo = By.id(":rg:");
    By transactionsLast4Digit = By.id(":rh:");
    By transactionsBankName = By.xpath("//div[@class='MuiGrid-root MuiGrid-container MuiGrid-item MuiGrid-spacing-xs-2 css-ymzd56']/div[4]//div[@id='dropdown-select']");
    By transactionsCardType = By.xpath("//div[@class='MuiGrid-root MuiGrid-container MuiGrid-item MuiGrid-spacing-xs-2 css-ymzd56']/div[5]/div[1]//div[@id='dropdown-select']");
    By transactionsCardProgram = By.xpath("//div[@class='MuiGrid-root MuiGrid-container MuiGrid-item MuiGrid-spacing-xs-2 css-ymzd56']/div[5]/div[2]//div[@id='dropdown-select']");
    By transactionsCardScheme = By.xpath("//div[@class='MuiGrid-root MuiGrid-container MuiGrid-item MuiGrid-spacing-xs-2 css-ymzd56']/div[5]/div[3]//div[@id='dropdown-select']");
    By transactionsPosProgram = By.xpath("//div[@class='MuiGrid-root MuiGrid-container MuiGrid-item MuiGrid-spacing-xs-2 css-ymzd56']/div[6]/div[@class='MuiGrid-root MuiGrid-container MuiGrid-item MuiGrid-grid-xs-12 MuiGrid-grid-md-4 css-3dnk7d']//div[@id='dropdown-select']");
    By transactionsBankReferenceNo = By.id(":rn:");
    By transactionsBankResponseCode = By.id(":ro:");
    By transactionsBankAuthCode = By.id(":rp:");
    By transactionsExcelExport = By.xpath("//div[@class='MuiSelect-select MuiSelect-outlined Mui-disabled MuiInputBase-input MuiOutlinedInput-input Mui-disabled css-2wbphm']");
    By transactionsExcelExportButton = By.id("export_button");
    By transactionsOrderButton = By.cssSelector(".css-1s72i5x > .MuiButtonBase-root");
    By transactionsShowHide = By.cssSelector(".css-2ertzu > .MuiButtonBase-root");
    By transactionsClearAllFilters = By.id("clear_filters_button");
    By transactionsPerPage = By.cssSelector(".MuiInputBase-inputSizeSmall");
    By transactionsTNoRegistrations = By.cssSelector("h3:nth-of-type(2)");
    By transactionsDetailButton = By.cssSelector(".MuiTableBody-root > tr:nth-of-type(1) .MuiSvgIcon-root");
    By paymentTransactionsOrderNumberList = By.xpath("//tr[@class=\"MuiTableRow-root MuiTableRow-hover css-1mryfrx\"]/td[@class=\"MuiTableCell-root MuiTableCell-body MuiTableCell-alignLeft MuiTableCell-sizeMedium css-q34dxg\"][2]");
    By paymentTransactionsPlatformOrderNumberList = By.xpath("//tr[@class=\"MuiTableRow-root MuiTableRow-hover css-1mryfrx\"]/td[@class=\"MuiTableCell-root MuiTableCell-body MuiTableCell-alignLeft MuiTableCell-sizeMedium css-q34dxg\"][3]");
    By paymentTransactionsTransactionTypeAuthorize = By.xpath("//li[@data-value='AUTHORIZE']");
    By paymentTransactionsTransactionTypeCancel = By.xpath("//li[@data-value='CANCEL']");
    By paymentTransactionsTransactionTypeCapture = By.xpath("//li[@data-value='CAPTURE']");
    By paymentTransactionsTransactionTypeChargeback = By.xpath("//li[@data-value='CHARGEBACK']");
    By paymentTransactionsTransactionTypePreauthorize = By.xpath("//li[@data-value='PREAUTHORIZE']");
    By paymentTransactionsTransactionTypeRefund = By.xpath("//li[@data-value='REFUND']");
    By paymentTransactionsMerchantNameYemeksepeti = By.xpath("//li[@data-value='YEMEK SEPETİ ELEKTRONİK İLETİŞİM PERAKENDE GIDA A.Ş.']");
    By paymentTransactionsMerchantNameBanabi = By.xpath("//li[@data-value='YEMEK SEPETİ BANABİ PERAKENDE GIDA A.Ş.']");
    By paymentTransactionsMerchantNameMahalle = By.xpath("//li[@data-value='YEMEK SEPETİ MAHALLE']");
    By paymentTransactionsTransactionTypeList = By.xpath("//tr[@class=\"MuiTableRow-root MuiTableRow-hover css-1mryfrx\"]/td[@class=\"MuiTableCell-root MuiTableCell-body MuiTableCell-alignLeft MuiTableCell-sizeMedium css-q34dxg\"][7]");
    By paymentTransactionsMerchantNameList = By.xpath("//tr[@class=\"MuiTableRow-root MuiTableRow-hover css-1mryfrx\"]/td[@class=\"MuiTableCell-root MuiTableCell-body MuiTableCell-alignLeft MuiTableCell-sizeMedium css-q34dxg\"][8]");
    By paymentTransactionsTransactionStatusList = By.xpath("//tr[@class=\"MuiTableRow-root MuiTableRow-hover css-1mryfrx\"]/td[@class=\"MuiTableCell-root MuiTableCell-body MuiTableCell-alignLeft MuiTableCell-sizeMedium css-30c854\"]");
    By paymentTransactionsStatusSuccess = By.xpath("//li[@data-value='SUCCESS']");
    By paymentTransactionsStatusFail = By.xpath("//li[@data-value='FAIL']");
    By paymentTransactionsStatusInProgress = By.xpath("//li[@data-value='IN_PROGRESS']");
    By paymentTransactionsStatusUnknown = By.xpath("//li[@data-value='UNKNOWN']");
    By paymentTransactionsDetailPageButton = By.xpath("//button[@class='MuiButtonBase-root MuiTab-root MuiTab-textColorPrimary css-16vk4jp']");
    By paymentTransactionsStartDateButton = By.xpath("//div[@class='MuiGrid-root MuiGrid-container MuiGrid-item MuiGrid-spacing-xs-2 css-ymzd56']/div[2]/div[2]//button");
    By paymentTransactionsEndDateButton = By.xpath("//div[@class='MuiGrid-root MuiGrid-container MuiGrid-item MuiGrid-spacing-xs-2 css-ymzd56']/div[2]/div[3]//button");
    By paymentTransactionsDateOKButton = By.xpath("//div[@class='MuiDialogActions-root MuiDialogActions-spacing MuiPickersLayout-actionBar css-sl509e']/button");
    By paymentTransactionsDateTimeList = By.xpath("//tr[@class=\"MuiTableRow-root MuiTableRow-hover css-1mryfrx\"]/td[@class=\"MuiTableCell-root MuiTableCell-body MuiTableCell-alignLeft MuiTableCell-sizeMedium css-q34dxg\"][1]");

    public void leftSubMenuTransactionsSubmit() {
        click(transactionsSubLeftMenuButton);
        waitBySeconds(2);
    }

    public void transactionsPageControlUrl() throws Exception {
        controlUrl("transactions", "pages.transactions");
    }

    public void transactionsPageMoreFiltersButtonClick() {
        click(transactionsMoreFiltersButton);
        waitBySeconds(1);
    }

    public void transactionsSearchButtonClick() {
        click(transactionsSearchButton);
        waitBySeconds(2);
    }

    public void transactionsAllElementsAreDisplayed() {
        isElementDisplay(transactionsSearchButton);
        isElementDisplay(transactionsOrderNo);
        isElementDisplay(transactionsPlatformOrderNo);
        isElementDisplay(transactionsPosName);
        isElementDisplay(transactionsStatus);
        isElementDisplay(transactions3DsInfo);
        isElementDisplay(transactionsPaymentMethod);
        isElementDisplay(transactionsValueDate);
        isElementDisplay(transactionsStartDate);
        isElementDisplay(transactionsEndDate);
        isElementDisplay(transactionsMerchantID);
        isElementDisplay(transactionsMerchantName);
        isElementDisplay(transactionsType);
        isElementDisplay(transactionsBinNo);
        isElementDisplay(transactionsLast4Digit);
        isElementDisplay(transactionsBankName);
        isElementDisplay(transactionsCardType);
        isElementDisplay(transactionsCardProgram);
        isElementDisplay(transactionsCardScheme);
        isElementDisplay(transactionsPosProgram);
        isElementDisplay(transactionsBankReferenceNo);
        isElementDisplay(transactionsBankResponseCode);
        isElementDisplay(transactionsBankAuthCode);
        isElementDisplay(transactionsExcelExport);
        isElementDisplay(transactionsExcelExportButton);
        isElementDisplay(transactionsOrderButton);
        isElementDisplay(transactionsShowHide);
        isElementDisplay(transactionsClearAllFilters);
        isElementDisplay(transactionsPerPage);
        isElementDisplay(transactionsTNoRegistrations);
        isElementDisplay(transactionsDetailButton);
    }

    public String paymentTransactionsTypeRandomOrderNumber(){
        return typeRandomValueFromDataLists(paymentTransactionsOrderNumberList, transactionsOrderNo);
    }

    public String paymentTransactionsTypeRandomPlatformOrderNumber(){
        return typeRandomValueFromDataLists(paymentTransactionsPlatformOrderNumberList, transactionsPlatformOrderNo);
    }

    public void paymentTransactionsTransactionTypeDropDownClick() {
        click(transactionsType);
        waitBySeconds(1);
    }

    public void paymentTransactionsPageTransactionTypeClick(String transactionType) {

        switch (transactionType) {
            case "AUTHORIZE":
                click(paymentTransactionsTransactionTypeAuthorize);
                break;
            case "CANCEL":
                click(paymentTransactionsTransactionTypeCancel);
                break;
            case "CAPTURE":
                click(paymentTransactionsTransactionTypeCapture);
                break;
            case "CHARGEBACK":
                click(paymentTransactionsTransactionTypeChargeback);
                break;
            case "PREAUTHORIZE":
                click(paymentTransactionsTransactionTypePreauthorize);
                break;
            case "REFUND":
                click(paymentTransactionsTransactionTypeRefund);
                break;
        }
    }

    public void paymentTransactionsTransactionStatusDropDownClick() {
        click(transactionsStatus);
        waitBySeconds(1);
    }

    public void paymentTransactionsPageTransactionStatusClick(String transactionStatus) {

        switch (transactionStatus) {
            case "SUCCESS":
                click(paymentTransactionsStatusSuccess);
                break;
            case "FAIL":
                click(paymentTransactionsStatusFail);
                break;
            case "IN_PROGRESS":
                click(paymentTransactionsStatusInProgress);
                break;
            case "UNKNOWN":
                click(paymentTransactionsStatusUnknown);
                break;
        }
    }

    public void paymentTransactionsPageMerchantNameClick(String merchantName) {

        switch (merchantName) {
            case "YEMEKSEPETI":
                click(paymentTransactionsMerchantNameYemeksepeti);
                break;
            case "BANABI":
                click(paymentTransactionsMerchantNameBanabi);
                break;
            case "MAHALLE":
                click(paymentTransactionsMerchantNameMahalle);
                break;
        }
        click(transactionsSearchButton);
        waitBySeconds(1);
    }

    public void checkDataTable(String valueOnTable) {

        switch (valueOnTable) {
            case "Satış":
                String authorizeStatus = getText(paymentTransactionsTransactionTypeList);
                assertTextEquals(authorizeStatus, "Satış");
                break;
            case "İptal":
                String cancelStatus = getText(paymentTransactionsTransactionTypeList);
                assertTextEquals(cancelStatus, "İptal");
                break;
            case "Ön Provizyon Kapama":
                String captureStatus = getText(paymentTransactionsTransactionTypeList);
                assertTextEquals(captureStatus, "Ön Provizyon Kapama");
                break;
            case "Ters İbraz":
                String chargebackStatus = getText(paymentTransactionsTransactionTypeList);
                assertTextEquals(chargebackStatus, "Ters İbraz");
                break;
            case "Ön Provizyon":
                String preauthorizeStatus = getText(paymentTransactionsTransactionTypeList);
                assertTextEquals(preauthorizeStatus, "Ön Provizyon");
                break;
            case "İade":
                String refundStatus = getText(paymentTransactionsTransactionTypeList);
                assertTextEquals(refundStatus, "İade");
                break;
            case "Yemeksepeti":
                String merchantNameYemeksepeti = getText(paymentTransactionsMerchantNameList);
                assertTextEquals(merchantNameYemeksepeti, "YEMEK SEPETİ ELEKTRONİK İLETİŞİM PERAKENDE GIDA A.Ş.");
                break;
            case "Mahalle":
                String merchantNameMahalle = getText(paymentTransactionsMerchantNameList);
                assertTextEquals(merchantNameMahalle, "YEMEK SEPETİ MAHALLE");
                break;
            case "Banabi":
                String merchantNameBanabi = getText(paymentTransactionsMerchantNameList);
                assertTextEquals(merchantNameBanabi, "YEMEK SEPETİ BANABİ PERAKENDE GIDA A.Ş.");
                break;
            case "Order Number":
                String orderNumber = paymentTransactionsTypeRandomOrderNumber();
                String orderNumberGrid = getText(paymentTransactionsOrderNumberList);
                assertTextEquals(orderNumberGrid, orderNumber);
                break;
            case "Platform Order Number":
                String platformOrderNumber = paymentTransactionsTypeRandomPlatformOrderNumber();
                String platformOrderNumberGrid = getText(paymentTransactionsPlatformOrderNumberList);
                assertTextEquals(platformOrderNumberGrid, platformOrderNumber);
                break;
            case "Başarılı":
                String successStatus = getText(paymentTransactionsTransactionStatusList);
                assertTextEquals(successStatus, "Başarılı");
                break;
            case "Başarısız":
                String failStatus = getText(paymentTransactionsTransactionStatusList);
                assertTextEquals(failStatus, "Başarısız");
                break;
            case "Devam Ediyor":
                String inProgressStatus = getText(paymentTransactionsTransactionStatusList);
                assertTextEquals(inProgressStatus, "Devam Ediyor");
                break;
            case "Bilinmiyor":
                String unknownStatus = getText(paymentTransactionsTransactionStatusList);
                assertTextEquals(unknownStatus, "Bilinmiyor");
                break;
        }
    }

    public void paymentTransactionsDetailsClick() {
        click(transactionsDetailButton);
        waitBySeconds(1);
    }

    public void paymentTransactionsDetailsPageClick() {
        click(paymentTransactionsDetailPageButton);
        waitBySeconds(1);
    }

    public void checkTransactionDetails(String value, String parameter) {

        String valueOnDetails = getText(By.xpath("//div[@aria-describedby='payment-detail-default-dialog']//*[starts-with(text(), '" + value + "')]"));
        String parameterOnDetails = getText(By.xpath("//div[@aria-describedby='payment-detail-default-dialog']//*[starts-with(text(), '" + parameter + "')]"));

        assertTextEquals(parameter, parameterOnDetails );
        assertTextEquals(value, valueOnDetails);

    }

    public void chooseStartDate(String startDay) {
        click(By.xpath("//div[@class='MuiDayCalendar-monthContainer css-i6bazn']//button[text()= " + startDay + "]"));
        waitBySeconds(1);
    }

    public void chooseEndDate(String endDay) {
        click(By.xpath("//div[@class='MuiDayCalendar-monthContainer css-i6bazn']//button[text()= " + endDay + "]"));
        waitBySeconds(1);
    }

    public void clickStartDateButton() {
        click(paymentTransactionsStartDateButton);
        waitBySeconds(1);
    }

    public void clickEndDateButton() {
        click(paymentTransactionsEndDateButton);
        waitBySeconds(1);
    }

    public void clickOKButton() {
        click(paymentTransactionsDateOKButton);
        waitBySeconds(1);
    }

    public void paymentTransactionscheckDateTime(String dateTime) {
        checkDateTime(paymentTransactionsDateTimeList,dateTime);
    }

    public void paymentTransactionsPageExportToExcelClick() {
        click(transactionsExcelExportButton);
        waitBySeconds(1);
    }
}
