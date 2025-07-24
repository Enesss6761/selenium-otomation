package pages;

import base.BasePage;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;

public class PaymentRecordsPage extends BasePage {
    By paymentRecordsSubLeftMenuButton = By.cssSelector(".MuiCollapse-entered div:nth-of-type(3) > .MuiButtonBase-root");
    By paymentRecordsSearchButton = By.id("search_button");
    By paymentRecordsOrderNo = By.name("internalOrderId");
    By paymentRecordsPlatformOrderNo = By.name("platformOrderId");
    By paymentRecordsMoreFiltersButton = By.cssSelector(".MuiButton-text");
    By paymentRecordsPosName = By.id("search-select");
    By paymentRecordsPaymentStatus = By.id("payment-dropdown_payment_status");
    By paymentRecords3DInfo = By.id("payment-dropdown_three_d_secure");
    By paymentRecordsMerchantName = By.id("payment-dropdown_merchant");
    By paymentRecordsStartDate = By.cssSelector(".css-ymzd56 > .MuiGrid-root > div:nth-of-type(1) [placeholder='DD.MM.YYYY hh:mm']");
    By paymentRecordsEndDate = By.cssSelector(".css-ymzd56 > .MuiGrid-root > div:nth-of-type(2) [placeholder='DD.MM.YYYY hh:mm']");
    By paymentRecordsExport = By.xpath("//div[@class='MuiSelect-select MuiSelect-outlined Mui-disabled MuiInputBase-input MuiOutlinedInput-input Mui-disabled css-2wbphm']");
    By paymentRecordsOrderButton = By.cssSelector(".css-1s72i5x > .MuiButtonBase-root");
    By paymentRecordsShowHide = By.cssSelector(".css-2ertzu > .MuiButtonBase-root");
    By paymentRecordsClearAllFilters = By.id("clear_filters_button");
    By paymentRecordsDetail = By.cssSelector(".MuiTableBody-root > tr:nth-of-type(1) .MuiIconButton-colorSuccess");
    By paymentRecordsMakeRefund = By.cssSelector(".MuiTableBody-root > tr:nth-of-type(1) [data-testid='UpdateIcon']");
    By paymentRecordsExportButton = By.id("export_button");
    By paymentRecordsPerPage = By.cssSelector(".MuiInputBase-inputSizeSmall");
    By paymentRecordsTNoRegistrations = By.cssSelector("h3:nth-of-type(2)");
    By paymentRecordsOrderNumberList = By.xpath("//tr[@class=\"MuiTableRow-root MuiTableRow-hover css-1mryfrx\"]/td[@class=\"MuiTableCell-root MuiTableCell-body MuiTableCell-alignLeft MuiTableCell-sizeMedium css-q34dxg\"][2]");
    By paymentRecordsPlatformOrderNumberList = By.xpath("//tr[@class=\"MuiTableRow-root MuiTableRow-hover css-1mryfrx\"]/td[@class=\"MuiTableCell-root MuiTableCell-body MuiTableCell-alignLeft MuiTableCell-sizeMedium css-q34dxg\"][3]");
    By paymentRecordsPaymentStatusAuthorize = By.xpath("//li[@data-value='AUTHORIZE']");
    By paymentRecordsPaymentStatusCancel = By.xpath("//li[@data-value='CANCEL']");
    By paymentRecordsPaymentStatusCapture = By.xpath("//li[@data-value='CAPTURE']");
    By paymentRecordsPaymentStatusChargeback = By.xpath("//li[@data-value='CHARGEBACK']");
    By paymentRecordsPaymentStatusInProgress = By.xpath("//li[@data-value='IN_PROGRESS']");
    By paymentRecordsPaymentStatusPreauthorize = By.xpath("//li[@data-value='PREAUTHORIZE']");
    By paymentRecordsPaymentStatusRefund = By.xpath("//li[@data-value='REFUND']");
    By paymentRecordsPaymentStatusThreeDForm = By.xpath("//li[@data-value='THREED_FORM']");
    By paymentRecordsMerchantNameYemeksepeti = By.xpath("//li[@data-value='YEMEK SEPETİ ELEKTRONİK İLETİŞİM PERAKENDE GIDA A.Ş.']");
    By paymentRecordsMerchantNameBanabi = By.xpath("//li[@data-value='YEMEK SEPETİ BANABİ PERAKENDE GIDA A.Ş.']");
    By paymentRecordsMerchantNameMahalle = By.xpath("//li[@data-value='YEMEK SEPETİ MAHALLE']");
    By paymentRecordsPaymentStatusList = By.xpath("//tr[@class=\"MuiTableRow-root MuiTableRow-hover css-1mryfrx\"]/td[@class=\"MuiTableCell-root MuiTableCell-body MuiTableCell-alignLeft MuiTableCell-sizeMedium css-xbef10\"]");
    By paymentRecordsThree3DInfoList = By.xpath("//tr[@class=\"MuiTableRow-root MuiTableRow-hover css-1mryfrx\"]/td[@class=\"MuiTableCell-root MuiTableCell-body MuiTableCell-alignLeft MuiTableCell-sizeMedium css-q34dxg\"][7]");
    By paymentRecordsMerchantNameList = By.xpath("//tr[@class=\"MuiTableRow-root MuiTableRow-hover css-1mryfrx\"]/td[@class=\"MuiTableCell-root MuiTableCell-body MuiTableCell-alignLeft MuiTableCell-sizeMedium css-q34dxg\"][9]");
    By paymentRecordsPosNameList = By.xpath("//tr[@class=\"MuiTableRow-root MuiTableRow-hover css-1mryfrx\"]/td[@class=\"MuiTableCell-root MuiTableCell-body MuiTableCell-alignLeft MuiTableCell-sizeMedium css-q34dxg\"][10]");
    By paymentRecordsThree3DYes = By.xpath("//ul[@class=\"MuiList-root MuiList-padding MuiMenu-list css-r8u8y9\"]/li[2]");
    By paymentRecordsThree3DNo = By.xpath("//ul[@class=\"MuiList-root MuiList-padding MuiMenu-list css-r8u8y9\"]/li[3]");
    By paymentDetailsPageButton = By.xpath("//button[@class='MuiButtonBase-root MuiTab-root MuiTab-textColorPrimary css-16vk4jp']");
    By paymentRecordsStartDateButton = By.xpath("//div[@class='MuiGrid-root MuiGrid-container MuiGrid-item MuiGrid-spacing-xs-2 css-ymzd56']/div[2]/div[1]//button");
    By paymentRecordsEndDateButton = By.xpath("//div[@class='MuiGrid-root MuiGrid-container MuiGrid-item MuiGrid-spacing-xs-2 css-ymzd56']/div[2]/div[2]//button");
    By paymentRecordsDateOKButton = By.xpath("//div[@class='MuiDialogActions-root MuiDialogActions-spacing MuiPickersLayout-actionBar css-sl509e']/button");
    By paymentRecordsDateTimeList = By.xpath("//tr[@class=\"MuiTableRow-root MuiTableRow-hover css-1mryfrx\"]/td[@class=\"MuiTableCell-root MuiTableCell-body MuiTableCell-alignLeft MuiTableCell-sizeMedium css-q34dxg\"][1]");
    By paymentRecordsRefundReasonDropdown = By.id("dropdown_refund_reason");
    By paymentRecordsRefundReason = By.id("dropdown_item_Müşteri Memnuniyeti");
    By paymentRecordsRefundReason2 = By.id("dropdown_item_Üye iş yeri talebi");
    By paymentRecordsRefundReason3 = By.id("dropdown_item_Fazla Çekim");
    By paymentRecordsRefundReason4 = By.id("dropdown_item_Mükerrer Çekim");
    By paymentRecordsRefundAmountText = By.id("text_input_amount");
    By paymentRecordsRefundSubmitButton = By.xpath("//div[@class='MuiStack-root css-1v70lhz']/button[2]");


    public void leftSubMenuPaymentRecordsSubmit() {
        click(paymentRecordsSubLeftMenuButton);
        waitBySeconds(2);
    }

    public void paymentRecordsPageControlUrl() throws Exception {
        controlUrl("payments", "pages.paymentrecords");
    }

    public void paymentRecordsSearchButtonClick() {
        click(paymentRecordsSearchButton);
        waitBySeconds(2);
    }

    public void paymentRecordsAllElementsAreDisplayed() {
        isElementDisplay(paymentRecordsOrderNo);
        isElementDisplay(paymentRecordsPlatformOrderNo);
        isElementDisplay(paymentRecordsPosName);
        isElementDisplay(paymentRecordsPaymentStatus);
        isElementDisplay(paymentRecords3DInfo);
        isElementDisplay(paymentRecordsMerchantName);
        isElementDisplay(paymentRecordsStartDate);
        isElementDisplay(paymentRecordsEndDate);
        isElementDisplay(paymentRecordsExport);
        isElementDisplay(paymentRecordsOrderButton);
        isElementDisplay(paymentRecordsShowHide);
        isElementDisplay(paymentRecordsClearAllFilters);
        isElementDisplay(paymentRecordsSearchButton);
        isElementDisplay(paymentRecordsDetail);
        isElementDisplay(paymentRecordsMakeRefund);
        isElementDisplay(paymentRecordsExportButton);
    }

    public void paymentRecordsPageMoreFiltersButtonClick() {
        click(paymentRecordsMoreFiltersButton);
        waitBySeconds(1);
    }

    public String paymentRecordsTypeRandomOrderNumber(){
        return typeRandomValueFromDataLists(paymentRecordsOrderNumberList, paymentRecordsOrderNo);
    }

    public String paymentRecordsTypeRandomPlatformOrderNumber(){
        return typeRandomValueFromDataLists(paymentRecordsPlatformOrderNumberList, paymentRecordsPlatformOrderNo);
    }

    public void paymentRecordsPagePaymentStatusDropDownClick() {
        click(paymentRecordsPaymentStatus);
        waitBySeconds(1);
    }

    public void paymentRecordsPagePaymentStatusClick(String paymentStatus) {

        switch (paymentStatus) {
            case "AUTHORIZE":
                click(paymentRecordsPaymentStatusAuthorize);
                break;
            case "CANCEL":
                click(paymentRecordsPaymentStatusCancel);
                break;
            case "CAPTURE":
                click(paymentRecordsPaymentStatusCapture);
                break;
            case "CHARGEBACK":
                click(paymentRecordsPaymentStatusChargeback);
                break;
            case "IN_PROGRESS":
                click(paymentRecordsPaymentStatusInProgress);
                break;
            case "PREAUTHORIZE":
                click(paymentRecordsPaymentStatusPreauthorize);
                break;
            case "REFUND":
                click(paymentRecordsPaymentStatusRefund);
                break;
            case "THREED_FORM":
                click(paymentRecordsPaymentStatusThreeDForm);
                break;
        }
    }

    public void paymentRecordsPageMerchantNameDropDownClick() {
        click(paymentRecordsMerchantName);
        waitBySeconds(1);
    }

    public void paymentRecordsPageMerchantNameClick(String merchantName) {

        switch (merchantName) {
            case "YEMEKSEPETI":
                click(paymentRecordsMerchantNameYemeksepeti);
                break;
            case "BANABI":
                click(paymentRecordsMerchantNameBanabi);
                break;
            case "MAHALLE":
                click(paymentRecordsMerchantNameMahalle);
                break;
        }
    }

    public void paymentRecordsPage3DInfoDropDownClick() {
        click(paymentRecords3DInfo);
        waitBySeconds(1);
    }

    public void paymentRecordsPage3DInfoClick(String threeDInfo) {

        switch (threeDInfo) {
            case "YES":
                click(paymentRecordsThree3DYes);
                break;
            case "NO":
                click(paymentRecordsThree3DNo);
                break;
        }
    }

    public void checkDataTable(String valueOnTable) {

        switch (valueOnTable) {
            case "Satış":
                String authorizeStatus = getText(paymentRecordsPaymentStatusList);
                assertTextEquals(authorizeStatus, "Satış");
                break;
            case "İptal":
                String cancelStatus = getText(paymentRecordsPaymentStatusList);
                assertTextEquals(cancelStatus, "İptal");
                break;
            case "Ön Provizyon Kapama":
                String captureStatus = getText(paymentRecordsPaymentStatusList);
                assertTextEquals(captureStatus, "Ön Provizyon Kapama");
                break;
            case "Ters İbraz":
                String chargebackStatus = getText(paymentRecordsPaymentStatusList);
                assertTextEquals(chargebackStatus, "Ters İbraz");
                break;
            case "Devam Ediyor":
                String inProgressStatus = getText(paymentRecordsPaymentStatusList);
                assertTextEquals(inProgressStatus, "Devam Ediyor");
                break;
            case "Ön Provizyon":
                String preauthorizeStatus = getText(paymentRecordsPaymentStatusList);
                assertTextEquals(preauthorizeStatus, "Ön Provizyon");
                break;
            case "İade":
                String refundStatus = getText(paymentRecordsPaymentStatusList);
                assertTextEquals(refundStatus, "İade");
                break;
            case "3D Form":
                String threeDStatus = getText(paymentRecordsPaymentStatusList);
                assertTextEquals(threeDStatus, "3D Form");
                break;
            case "Evet":
                String threeDInfoYes = getText(paymentRecordsThree3DInfoList);
                assertTextEquals(threeDInfoYes, "Evet");
                break;
            case "Hayır":
                String threeDInfoNo = getText(paymentRecordsThree3DInfoList);
                assertTextEquals(threeDInfoNo, "Hayır");
                break;
            case "Yemeksepeti":
                String merchantNameYemeksepeti = getText(paymentRecordsMerchantNameList);
                assertTextEquals(merchantNameYemeksepeti, "YEMEK SEPETİ ELEKTRONİK İLETİŞİM PERAKENDE GIDA A.Ş.");
                break;
            case "Mahalle":
                String merchantNameMahalle = getText(paymentRecordsMerchantNameList);
                assertTextEquals(merchantNameMahalle, "YEMEK SEPETİ MAHALLE");
                break;
            case "Banabi":
                String merchantNameBanabi = getText(paymentRecordsMerchantNameList);
                assertTextEquals(merchantNameBanabi, "YEMEK SEPETİ BANABİ PERAKENDE GIDA A.Ş.");
                break;
            case "Order Number":
                String orderNumber = paymentRecordsTypeRandomOrderNumber();
                String orderNumberGrid = getText(paymentRecordsOrderNumberList);
                assertTextEquals(orderNumberGrid, orderNumber);
                break;
            case "Platform Order Number":
                String platformOrderNumber = paymentRecordsTypeRandomPlatformOrderNumber();
                String platformOrderNumberGrid = getText(paymentRecordsPlatformOrderNumberList);
                assertTextEquals(platformOrderNumberGrid, platformOrderNumber);
                break;
        }
    }

    public void paymentDetailsClick() {
        click(paymentRecordsDetail);
        waitBySeconds(1);
    }

    public void paymentDetailsPageClick() {
        click(paymentDetailsPageButton);
        waitBySeconds(1);
    }

    public void checkPaymentDetails(String value, String parameter) {

        String valueOnDetails = getText(By.xpath("//div[@class='MuiGrid-root MuiGrid-item css-php1eh']//*[starts-with(text(), '" + value + "')]"));
        String parameterOnDetails = getText(By.xpath("//div[@class='MuiGrid-root MuiGrid-item css-php1eh']//*[starts-with(text(), '" + parameter + "')]"));

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
        click(paymentRecordsStartDateButton);
        waitBySeconds(1);
    }

    public void clickEndDateButton() {
        click(paymentRecordsEndDateButton);
        waitBySeconds(1);
    }

    public void clickOKButton() {
        click(paymentRecordsDateOKButton);
        waitBySeconds(1);
    }

    public void paymentRecordscheckDateTime(String dateTime) {
        checkDateTime(paymentRecordsDateTimeList,dateTime);
    }

    public void paymentRecordsPageExportToExcelClick() {
        click(paymentRecordsExportButton);
        waitBySeconds(1);
    }

    public void paymentRecordsPageRefundButtonClick() {
        click(paymentRecordsMakeRefund);
        waitBySeconds(1);
    }

    public void paymentRecordsPageRefundReasonDropdownClick() {
        click(paymentRecordsRefundReasonDropdown);
        waitBySeconds(1);
    }

    public void paymentRecordsPageRefundReasonClick(String reason) {
        switch (reason) {
            case "Müşteri Memnuniyeti":
                click(paymentRecordsRefundReason);
                break;
            case "Üye İş Yeri Talebi":
                click(paymentRecordsRefundReason2);
                break;
            case "Fazla Çekim":
                click(paymentRecordsRefundReason3);
                break;
            case "Mükerrer Çekim":
                click(paymentRecordsRefundReason4);
                break;
        }
        waitBySeconds(1);
    }

    public void paymentRecordsPageTypeRefundAmount(String amount) {
        WebElement refundAmountInput = getDriver().findElement(paymentRecordsRefundAmountText);

        getDriver().findElement(paymentRecordsRefundAmountText).sendKeys(Keys.chord(Keys.COMMAND, "a"));
        waitBySeconds(1);
        getDriver().findElement(paymentRecordsRefundAmountText).sendKeys(Keys.DELETE);
        waitBySeconds(1);
        type(paymentRecordsRefundAmountText, amount);
        waitBySeconds(1);
    }

    public void paymentRecordsPageRefundSubmitButtonClick() {
        click(paymentRecordsRefundSubmitButton);
        waitBySeconds(3);
    }

    public void typeInternalOrder(String orderRef) {
        type(paymentRecordsOrderNo, orderRef);
    }

    public void paymentRecordsPageInformationText(String info) {
        informationTextOnPage(info);
        waitBySeconds(1);
    }
}
