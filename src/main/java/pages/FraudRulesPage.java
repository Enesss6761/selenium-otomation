package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.Random;

public class FraudRulesPage extends BasePage {
    By fraudRulesPageSubLeftMenuButton = By.cssSelector(".MuiCollapse-wrapperInner div:nth-of-type(1) > .MuiButtonBase-root");
    By fraudRulesPageStartDate = By.cssSelector(".css-16c2vxo > .MuiGrid-root > div:nth-of-type(1) > .MuiFormControl-root > .MuiInputBase-root");
    By fraudRulesPageEndDate = By.cssSelector(".css-16c2vxo > .MuiGrid-root > div:nth-of-type(2) .MuiInputBase-root");
    By fraudRulesPageID = By.name("id");
    By fraudRulesPageRuleName = By.name("ruleName");
    By fraudRulesPageRuleCategory = By.xpath("//div[@class='MuiGrid-root MuiGrid-container MuiGrid-item MuiGrid-spacing-xs-2 css-ymzd56']//div[2]//div[@id='dropdown-select']");
    By fraudRulesPageStatus = By.xpath("//div[@class='MuiGrid-root MuiGrid-container MuiGrid-item MuiGrid-spacing-xs-2 css-ymzd56']//div[3]//div[@id='dropdown-select']");
    By fraudRulesPageExcel = By.xpath("//div[@class='MuiSelect-select MuiSelect-outlined Mui-disabled MuiInputBase-input MuiOutlinedInput-input Mui-disabled css-2wbphm']");
    By fraudRulesPageExcelExport = By.xpath("//div[@class='MuiGrid-root MuiGrid-container MuiGrid-item MuiGrid-spacing-xs-2 css-ymzd56']//div[2]//div[@id='dropdown-select']");
    By fraudRulesPageMoreFiltersButton = By.cssSelector(".MuiButton-text");
    By fraudRulesPageOrderButton = By.cssSelector(".css-1s72i5x > .MuiButtonBase-root");
    By fraudRulesPageShowHide = By.cssSelector(".css-2ertzu > .MuiButtonBase-root");
    By fraudRulesPageClearAllFilters = By.id("clear_filters_button");
    By fraudRulesPageSearchButton = By.id("search_button");
    By fraudRulesPageEditButton = By.cssSelector(".MuiTableBody-root > tr:nth-of-type(1) .MuiButtonBase-root");
    By fraudRulesPagePerPage = By.cssSelector(".MuiInputBase-inputSizeSmall");
    By fraudRulesPageTNoRegistrations = By.cssSelector("h3:nth-of-type(2)");
    By fraudRulesPageAddButton = By.cssSelector(".css-9urz1a");
    By fraudRulesAddPageListButton = By.cssSelector(".css-9urz1a");
    By fraudRulesAddPageRuleName = By.name("ruleName");
    By fraudRulesAddPageRuleDescription = By.name("ruleDescription");
    By fraudRulesAddPageRuleCategory = By.xpath("//div[@id='dropdown-select']");
    By fraudRulesAddPageRuleScore = By.name("ruleScore");
    By fraudRulesAddPageRuleNOV = By.name("notifyOnViolation");
    By fraudRulesAddPageRuleAR = By.name("ruleStatus");
    By fraudRulesAddPageInfo1 = By.cssSelector("li:nth-of-type(1) > .MuiTypography-root");
    By fraudRulesAddPageInfo2 = By.cssSelector("li:nth-of-type(2) > .MuiTypography-root");
    By fraudRulesAddPageAddCondition = By.xpath("//*[@class='MuiGrid-root MuiGrid-item MuiGrid-grid-xs-12 css-15j76c0']/button[starts-with(text(), 'Koşul Ekle')]");
    By fraudRulesAddPageAddConditionTitle = By.cssSelector(".css-2xgtc5");
    By fraudRulesAddPageSaveButton = By.cssSelector(".css-8gmuww[type='submit']");
    By fraudRulesAddPageAddConditionPaymentMethod = By.xpath("//button[@class='MuiButtonBase-root MuiTab-root MuiTab-textColorPrimary Mui-selected css-15j2kbb']");
    By fraudRulesAddPageAddConditionOCC = By.name("ONLINE_CREDIT_CARD");
    By fraudRulesAddPageAddConditionSoftPos = By.name("SOFT_POS");
    By fraudRulesAddPageAddConditionCancelButton = By.cssSelector(".css-1i3yq2i");
    By fraudRulesAddPageAddConditionSaveButton = By.cssSelector(".MuiGrid-spacing-xs-2 > div:nth-of-type(2)");
    By fraudRulesAddPageAddConditionTransactionType = By.xpath("//button[.='İşlem Tipi']");
    By fraudRulesAddPageAddConditionTransactionTypeAuthorize = By.name("AUTHORIZE");
    By fraudRulesAddPageAddConditionTransactionTypePreAuthorize = By.name("PREAUTHORIZE");
    By fraudRulesAddPageAddConditionTransactionTypeCapture = By.name("CAPTURE");
    By fraudRulesAddPageAddConditionTransactionTypeRefund = By.name("REFUND");
    By fraudRulesAddPageAddConditionTransactionTypeCancel = By.name("CANCEL");
    By fraudRulesAddPageAddConditionCardType = By.xpath("//button[.='Kart Tipi']");
    By fraudRulesAddPageAddConditionCardTypeSelectAll = By.name("PREAUTHORIZE");
    By fraudRulesAddPageAddConditionCardTypeDebitCard = By.name("CAPTURE");
    By fraudRulesAddPageAddConditionCardTypeCreditCard = By.name("REFUND");
    By fraudRulesAddPageAddConditionCardTypePrepaidCard = By.name("CANCEL");
    By fraudRulesAddPageAddConditionAmount = By.xpath("//button[.='İşlem Tutarı']");
    By fraudRulesAddPageAddConditionAmountSelectArea = By.cssSelector("#amount-field");
    By fraudRulesAddPageAddConditionAmountComparisonType = By.cssSelector("#comparison-type");
    By fraudRulesAddPageAddConditionAmountAmount = By.cssSelector("[inputmode='decimal']");
    By fraudRulesAddPageAddConditionAmountInfo1 = By.cssSelector(".css-rfnosa li:nth-of-type(1) > .MuiTypography-root");
    By fraudRulesAddPageAddConditionAmountInfo2 = By.cssSelector(".css-rfnosa li:nth-of-type(2) > .MuiTypography-root");
    By fraudRulesAddPageAddConditionTransactionStatus = By.xpath("//button[.='İşlem Durumu']");
    By fraudRulesAddPageAddConditionTransactionStatusSelectAll = By.name("selectAll");
    By fraudRulesAddPageAddConditionTransactionStatusSuccess = By.name("SUCCESS");
    By fraudRulesAddPageAddConditionTransactionStatusFailed = By.name("FAIL");
    By fraudRulesAddPageAddConditionTransactionStatusUnknown = By.name("UNKNOWN");
    By fraudRulesAddPageAddConditionForeignCards = By.xpath("//button[.='Yabancı Kartlar']");
    By fraudRulesAddPageAddConditionForeignCardsIFC = By.name("includeForeignCards");
    By fraudRulesAddPageAddConditionBin = By.xpath("//button[.='BIN']");
    By fraudRulesAddPageAddConditionBinBin = By.cssSelector(".MuiInputBase-fullWidth");
    By fraudRulesAddPageAddConditionBinInfo1 = By.cssSelector(".css-rfnosa li:nth-of-type(1) > .MuiTypography-root");
    By fraudRulesAddPageAddConditionBinInfo2 = By.cssSelector(".css-rfnosa li:nth-of-type(2) > .MuiTypography-root");
    By fraudRulesAddPageAddConditionBinInfo3 = By.cssSelector(".css-rfnosa li:nth-of-type(3) > .MuiTypography-root");
    By fraudRulesAddPageAddConditionErrorCodes = By.xpath("//button[.='Hata Kodları']");
    By fraudRulesAddPageAddConditionErrorCodesErrorCodes = By.cssSelector(".MuiInputBase-fullWidth");
    By fraudRulesAddPageAddConditionErrorCodesInfo1 = By.cssSelector(".css-rfnosa li:nth-of-type(1) > .MuiTypography-root");
    By fraudRulesAddPageAddConditionErrorCodesInfo2 = By.cssSelector(".css-rfnosa li:nth-of-type(2) > .MuiTypography-root");
    By fraudRulesAddPageAddConditionErrorCodesInfo3 = By.cssSelector(".css-rfnosa li:nth-of-type(3) > .MuiTypography-root");
    By fraudRulesAddPageAddConditionMinimumEvent = By.xpath("//button[.='Minimum Olay']");
    By fraudRulesAddPageAddConditionMinimumEventMinimumEvent = By.cssSelector("[placeholder='1']");
    By fraudRulesAddPageAddConditionMinimumEventInfo1 = By.cssSelector(".css-rfnosa li:nth-of-type(1) > .MuiTypography-root");
    By fraudRulesAddPageAddConditionMinimumEventInfo2 = By.cssSelector(".css-rfnosa li:nth-of-type(2) > .MuiTypography-root");
    By fraudRulesAddPageAddConditionMinimumEventInfo3 = By.cssSelector(".css-rfnosa li:nth-of-type(3) > .MuiTypography-root");
    By fraudRulesAddPageAddConditionTransactionPeriod = By.xpath("//button[.='İşlem Periyodu']");
    By fraudRulesAddPageAddConditionTransactionPeriodInfo1 = By.cssSelector(".css-rfnosa li:nth-of-type(1) > .MuiTypography-root");
    By fraudRulesAddPageAddConditionTransactionPeriodInfo2 = By.cssSelector(".css-rfnosa li:nth-of-type(2) > .MuiTypography-root");
    By fraudRulesAddPageAddConditionTransactionPeriodStartHour = By.xpath("//div[@class='MuiGrid-root MuiGrid-container MuiGrid-spacing-xs-2 css-isbt42']/div[1]//div[@class='MuiSelect-select MuiSelect-outlined MuiInputBase-input MuiOutlinedInput-input css-2wbphm']");
    By fraudRulesAddPageAddConditionTransactionPeriodEndHour = By.xpath("//div[@class='MuiGrid-root MuiGrid-container MuiGrid-spacing-xs-2 css-isbt42']/div[2]//div[@class='MuiSelect-select MuiSelect-outlined MuiInputBase-input MuiOutlinedInput-input css-2wbphm']");
    By fraudRulesAddPageAddConditionTimeLimit = By.xpath("//button[.='Süre Limiti']");
    By fraudRulesAddPageAddConditionTimeLimitDay = By.xpath("//div[.='Gün']");
    By fraudRulesAddPageAddConditionTimeLimitAmount = By.cssSelector("[placeholder='0']");
    By fraudRulesAddPageAddConditionTimeLimitInfo1 = By.cssSelector(".css-rfnosa li:nth-of-type(1) > .MuiTypography-root");
    By fraudRulesAddPageAddConditionTimeLimitInfo2 = By.cssSelector(".css-rfnosa li:nth-of-type(2) > .MuiTypography-root");
    By fraudRulesAddPageAddConditionTimeLimitInfo3 = By.cssSelector(".css-rfnosa li:nth-of-type(3) > .MuiTypography-root");
    By fraudRulesAddPageAddConditionAmountText = By.id("text_input_amount");
    By fraudRulesAddPageConditionAddButtton = By.xpath("//div[@class='MuiGrid-root MuiGrid-container MuiGrid-item MuiGrid-spacing-xs-2 MuiGrid-grid-xs-12 css-1pdxuwb']/div/button[@type='submit']");
    By fraudRulesAddPageSaveButton2 = By.xpath("//div[@class='MuiGrid-root MuiGrid-container MuiGrid-item MuiGrid-grid-xs-12 css-1ghpfnl']/div/button[@type='submit']");
    By fraudRulesFraudTypeAML = By.xpath("//li[@data-value='AML']");
    By fraudRulesFraudTypeOfflineFraud = By.xpath("//li[@data-value='PASSIVE_FRAUD']");
    By fraudRulesFraudTypeList = By.xpath("//tr[@class='MuiTableRow-root MuiTableRow-hover css-1mryfrx']/td[@class='MuiTableCell-root MuiTableCell-body MuiTableCell-alignLeft MuiTableCell-sizeMedium css-q34dxg'][3]");
    By fraudRulesFraudNameList = By.xpath("//tr[@class='MuiTableRow-root MuiTableRow-hover css-1mryfrx']/td[@class='MuiTableCell-root MuiTableCell-body MuiTableCell-alignLeft MuiTableCell-sizeMedium css-q34dxg'][2]");

    public void fraudRulesAddConditionTimeLimitAllElementsAreDisplayed() {
        isElementDisplay(fraudRulesAddPageAddConditionTimeLimitDay);
        isElementDisplay(fraudRulesAddPageAddConditionTimeLimitAmount);
        isElementDisplay(fraudRulesAddPageAddConditionTimeLimitInfo1);
        isElementDisplay(fraudRulesAddPageAddConditionTimeLimitInfo2);
        isElementDisplay(fraudRulesAddPageAddConditionTimeLimitInfo3);
        isElementDisplay(fraudRulesAddPageAddConditionCancelButton);
        isElementDisplay(fraudRulesAddPageAddConditionSaveButton);
    }

    public void fraudRulesAddConditionTransactionPeriodAllElementsAreDisplayed() {
        isElementDisplay(fraudRulesAddPageAddConditionTransactionPeriodStartHour);
        isElementDisplay(fraudRulesAddPageAddConditionTransactionPeriodEndHour);
        isElementDisplay(fraudRulesAddPageAddConditionTransactionPeriodInfo1);
        isElementDisplay(fraudRulesAddPageAddConditionTransactionPeriodInfo2);
        isElementDisplay(fraudRulesAddPageAddConditionCancelButton);
        isElementDisplay(fraudRulesAddPageAddConditionSaveButton);
    }

    public void fraudRulesAddConditionMinimumEventAllElementsAreDisplayed() {
        isElementDisplay(fraudRulesAddPageAddConditionMinimumEventMinimumEvent);
        isElementDisplay(fraudRulesAddPageAddConditionMinimumEventInfo1);
        isElementDisplay(fraudRulesAddPageAddConditionMinimumEventInfo2);
        isElementDisplay(fraudRulesAddPageAddConditionMinimumEventInfo3);
        isElementDisplay(fraudRulesAddPageAddConditionCancelButton);
        isElementDisplay(fraudRulesAddPageAddConditionSaveButton);
    }

    public void fraudRulesAddConditionErrorCodesAllElementsAreDisplayed() {
        isElementDisplay(fraudRulesAddPageAddConditionErrorCodesErrorCodes);
        isElementDisplay(fraudRulesAddPageAddConditionErrorCodesInfo1);
        isElementDisplay(fraudRulesAddPageAddConditionErrorCodesInfo2);
        isElementDisplay(fraudRulesAddPageAddConditionErrorCodesInfo3);
        isElementDisplay(fraudRulesAddPageAddConditionCancelButton);
        isElementDisplay(fraudRulesAddPageAddConditionSaveButton);
    }

    public void fraudRulesAddConditionBinAllElementsAreDisplayed() {
        isElementDisplay(fraudRulesAddPageAddConditionBinBin);
        isElementDisplay(fraudRulesAddPageAddConditionBinInfo1);
        isElementDisplay(fraudRulesAddPageAddConditionBinInfo2);
        isElementDisplay(fraudRulesAddPageAddConditionBinInfo3);
        isElementDisplay(fraudRulesAddPageAddConditionCancelButton);
        isElementDisplay(fraudRulesAddPageAddConditionSaveButton);
    }

    public void fraudRulesAddConditionForeignCardsAllElementsAreDisplayed() {
        isElementDisplay(fraudRulesAddPageAddConditionForeignCardsIFC);
        isElementDisplay(fraudRulesAddPageAddConditionCancelButton);
        isElementDisplay(fraudRulesAddPageAddConditionSaveButton);
    }

    public void fraudRulesAddConditionTransactionStatusAllElementsAreDisplayed() {
        isElementDisplay(fraudRulesAddPageAddConditionTransactionStatusSelectAll);
        isElementDisplay(fraudRulesAddPageAddConditionTransactionStatusSuccess);
        isElementDisplay(fraudRulesAddPageAddConditionTransactionStatusFailed);
        isElementDisplay(fraudRulesAddPageAddConditionTransactionStatusUnknown);
        isElementDisplay(fraudRulesAddPageAddConditionCancelButton);
        isElementDisplay(fraudRulesAddPageAddConditionSaveButton);
    }

    public void fraudRulesAddConditionAmountAllElementsAreDisplayed() {
        isElementDisplay(fraudRulesAddPageAddConditionAmountSelectArea);
        isElementDisplay(fraudRulesAddPageAddConditionAmountComparisonType);
        isElementDisplay(fraudRulesAddPageAddConditionAmountAmount);
        isElementDisplay(fraudRulesAddPageAddConditionAmountInfo1);
        isElementDisplay(fraudRulesAddPageAddConditionAmountInfo2);
        isElementDisplay(fraudRulesAddPageAddConditionCancelButton);
        isElementDisplay(fraudRulesAddPageAddConditionSaveButton);
    }

    public void fraudRulesAddConditionCardTypeAllElementsAreDisplayed() {
        isElementDisplay(fraudRulesAddPageAddConditionCardTypeSelectAll);
        isElementDisplay(fraudRulesAddPageAddConditionCardTypeDebitCard);
        isElementDisplay(fraudRulesAddPageAddConditionCardTypeCreditCard);
        isElementDisplay(fraudRulesAddPageAddConditionCardTypePrepaidCard);
        isElementDisplay(fraudRulesAddPageAddConditionCancelButton);
        isElementDisplay(fraudRulesAddPageAddConditionSaveButton);
    }

    public void fraudRulesAddConditionTransactionTypeAllElementsAreDisplayed() {
        isElementDisplay(fraudRulesAddPageAddConditionTransactionTypeAuthorize);
        isElementDisplay(fraudRulesAddPageAddConditionTransactionTypePreAuthorize);
        isElementDisplay(fraudRulesAddPageAddConditionTransactionTypeCapture);
        isElementDisplay(fraudRulesAddPageAddConditionTransactionTypeRefund);
        isElementDisplay(fraudRulesAddPageAddConditionTransactionTypeCancel);
        isElementDisplay(fraudRulesAddPageAddConditionCancelButton);
        isElementDisplay(fraudRulesAddPageAddConditionSaveButton);
    }

    public void fraudRulesAddConditionPaymentMethodAllElementsAreDisplayed() {
        isElementDisplay(fraudRulesAddPageAddConditionPaymentMethod);
        isElementDisplay(fraudRulesAddPageAddConditionOCC);
        isElementDisplay(fraudRulesAddPageAddConditionSoftPos);
        isElementDisplay(fraudRulesAddPageAddConditionCancelButton);
        isElementDisplay(fraudRulesAddPageAddConditionSaveButton);
    }

    public void fraudRulesPageAddRuleAllElementsAreDisplayed() {
        isElementDisplay(fraudRulesAddPageListButton);
        isElementDisplay(fraudRulesAddPageRuleName);
        isElementDisplay(fraudRulesAddPageRuleDescription);
        isElementDisplay(fraudRulesAddPageRuleCategory);
        isElementDisplay(fraudRulesAddPageRuleScore);
        isElementDisplay(fraudRulesAddPageRuleNOV);
        isElementDisplay(fraudRulesAddPageRuleAR);
        isElementDisplay(fraudRulesAddPageInfo1);
        isElementDisplay(fraudRulesAddPageInfo2);
        isElementDisplay(fraudRulesAddPageAddCondition);
        isElementDisplay(fraudRulesAddPageSaveButton);
    }

    public void fraudRulesPageAllElementsAreDisplayed() {
        isElementDisplay(fraudRulesPageStartDate);
        isElementDisplay(fraudRulesPageEndDate);
        isElementDisplay(fraudRulesPageID);
        isElementDisplay(fraudRulesPageRuleName);
        isElementDisplay(fraudRulesPageRuleCategory);
        isElementDisplay(fraudRulesPageStatus);
        isElementDisplay(fraudRulesPageExcel);
        isElementDisplay(fraudRulesPageExcelExport);
        isElementDisplay(fraudRulesPageMoreFiltersButton);
        isElementDisplay(fraudRulesPageOrderButton);
        isElementDisplay(fraudRulesPageShowHide);
        isElementDisplay(fraudRulesPageClearAllFilters);
        isElementDisplay(fraudRulesPageSearchButton);
        isElementDisplay(fraudRulesPageEditButton);
        isElementDisplay(fraudRulesPagePerPage);
        isElementDisplay(fraudRulesPageTNoRegistrations);
        isElementDisplay(fraudRulesPageAddButton);
    }

    public void leftSubMenuFraudRulesSubmit() {
        click(fraudRulesPageSubLeftMenuButton);
        waitBySeconds(2);
    }

    public void leftSubMenuFraudRulesMoreFiltersSubmit() {
        click(fraudRulesPageMoreFiltersButton);
        waitBySeconds(2);
    }

    public void fraudRulesPagePageControlUrl() throws Exception {
        controlUrl("rules", "pages.fraudrules");
    }

    public void fraudRulesPageAddFraudSubmit() {
        click(fraudRulesPageAddButton);
        waitBySeconds(2);
    }

    public void fraudRulesPageAddRuleControlUrl() throws Exception {
        controlUrl("rules", "pages.fraudrulesaddrule");
    }

    public void fraudRulesPageAddConditionSubmit() {
        click(fraudRulesAddPageAddCondition);
        waitBySeconds(2);
    }

    public void fraudRulesPageAddConditionPageControlPopUp() {
        String title = getText(fraudRulesAddPageAddConditionTitle);
        String expected = "Koşullar";
        assertTextEquals(title, expected);
    }

    public void fraudRulesPageAddConditionTransactionTypeSubmit() {
        click(fraudRulesAddPageAddConditionTransactionType);
        waitBySeconds(2);
    }

    public void fraudRulesPageAddConditionCardTypeSubmit() {
        click(fraudRulesAddPageAddConditionCardType);
        waitBySeconds(2);
    }

    public void fraudRulesPageAddConditionAmountSubmit() {
        click(fraudRulesAddPageAddConditionAmount);
        waitBySeconds(2);
    }

    public void fraudRulesPageAddConditionTransactionStatusSubmit() {
        click(fraudRulesAddPageAddConditionTransactionStatus);
        waitBySeconds(2);
    }

    public void fraudRulesPageAddConditionForeignCardsSubmit() {
        click(fraudRulesAddPageAddConditionForeignCards);
        waitBySeconds(2);
    }

    public void fraudRulesPageAddConditionBinSubmit() {
        click(fraudRulesAddPageAddConditionBin);
        waitBySeconds(2);
    }

    public void fraudRulesPageAddConditionErrorCodesSubmit() {
        click(fraudRulesAddPageAddConditionErrorCodes);
        waitBySeconds(2);
    }

    public void fraudRulesPageAddConditionMinimumEventSubmit() {
        click(fraudRulesAddPageAddConditionMinimumEvent);
        waitBySeconds(2);
    }

    public void fraudRulesPageAddConditionTransactionPeriodSubmit() {
        click(fraudRulesAddPageAddConditionTransactionPeriod);
        waitBySeconds(2);
    }

    public void fraudRulesPageAddConditionTimeLimitSubmit() {
        click(fraudRulesAddPageAddConditionTimeLimit);
        waitBySeconds(2);
    }

    public void fraudRulesPageAddTypeRuleName() {
        Random rnd = new Random();
        int rndCount = rnd.nextInt(999999);
        String posName = "OtomasyonRuleName" + rndCount;
        type(fraudRulesAddPageRuleName,posName);
        waitBySeconds(1);
    }

    public void fraudRulesPageAddTypeRuleDescription() {
        Random rnd = new Random();
        int rndCount = rnd.nextInt(999999);
        String posName = "OtomasyonDescription" + rndCount;
        type(fraudRulesAddPageRuleDescription,posName);
        waitBySeconds(1);
    }

    public void fraudRulesPageAddTypeRuleScore() {
        Random rnd = new Random();
        int score = rnd.nextInt(99);
        type(fraudRulesAddPageRuleScore, String.valueOf(score));
        waitBySeconds(1);
    }

    public void fraudRulesPageAddCategoryDropDown(String category) {
        click(fraudRulesAddPageRuleCategory);
        click(By.xpath("//*[starts-with(text(), '" + category + "')]"));
        waitBySeconds(1);
    }

    public void fraudRulesPageAddSelectActiveNotify() {
        jsClicker(fraudRulesAddPageRuleAR);
        waitBySeconds(1);
    }

    public void fraudRulesPageAddTypeAmount(String amount) {
        type(fraudRulesAddPageAddConditionAmountText,amount);
        click(fraudRulesAddPageConditionAddButtton);
        waitBySeconds(1);
    }

    public void fraudRulesPageAddTypeMinimumEvent(String event) {
        type(fraudRulesAddPageAddConditionMinimumEventMinimumEvent,event);
        click(fraudRulesAddPageConditionAddButtton);
        waitBySeconds(1);
    }

    public void fraudRulesPageAddSelectStartAndEndHoursDropDown(String startHour, String endHour) {
        click(fraudRulesAddPageAddConditionTransactionPeriodStartHour);
        waitBySeconds(1);
        click(By.xpath("//*[starts-with(text(), '" + startHour + "')]"));
        waitBySeconds(1);
        click(fraudRulesAddPageAddConditionTransactionPeriodEndHour);
        waitBySeconds(1);
        click(By.xpath("//*[starts-with(text(), '" + endHour + "')]"));
        waitBySeconds(1);
        click(fraudRulesAddPageConditionAddButtton);
    }

    public void fraudRulesPageAddSelectTimeLimit(String time, String value) {
        click(fraudRulesAddPageAddConditionTimeLimitDay);
        waitBySeconds(1);
        click(By.xpath("//*[starts-with(text(), '" + time + "')]"));
        waitBySeconds(1);
        type(fraudRulesAddPageAddConditionTimeLimitAmount,value);
        waitBySeconds(1);
        click(fraudRulesAddPageConditionAddButtton);
    }

    public void fraudRulesPageAddSaveButtonClick() {
        click(fraudRulesAddPageSaveButton);
    }

    public void fraudRulesPageTypeRuleName(String ruleName) {
        type(fraudRulesPageRuleName,ruleName);
        waitBySeconds(1);
    }

    public void fraudRulesPageSearchButtonClick() {
        click(fraudRulesPageSearchButton);
        waitBySeconds(1);
    }

    public void fraudRulesPageRuleTypeDropdownClick() {
        waitBySeconds(1);
        click(fraudRulesPageRuleCategory);
        waitBySeconds(1);
    }

    public void fraudRulePageRuleTypeClick(String ruleType) {

        switch (ruleType) {
            case "AML":
                click(fraudRulesFraudTypeAML);
                break;
            case "Offline Fraud":
                click(fraudRulesFraudTypeOfflineFraud);
                break;
        }
        waitBySeconds(1);
    }

    public void checkDataTable(String valueOnTable) {

        switch (valueOnTable) {
            case "AML":
                String amlType = getText(fraudRulesFraudTypeList);
                assertTextEquals(amlType, "AML");
                break;
            case "Offline Fraud":
                String offlineFraudType = getText(fraudRulesFraudTypeList);
                assertTextEquals(offlineFraudType, "Offline Fraud");
                break;
        }
    }

    public void fraudRulesPageEditButtonClick() {
        waitBySeconds(1);
        click(fraudRulesPageEditButton);
        waitBySeconds(1);
    }

    public void fraudRulesCheckFraudNameOnTable(String RuleName) {
        checkStringValue(fraudRulesFraudNameList,RuleName);
    }

    public void fraudRulesPageExportToExcelClick() {
        click(fraudRulesPageExcelExport);
        waitBySeconds(1);
    }

    public void fraudRulesPageInformationText(String info) {
        informationTextOnPage(info);
        waitBySeconds(1);
    }
}
