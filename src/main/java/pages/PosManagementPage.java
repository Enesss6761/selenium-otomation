package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.Random;

public class PosManagementPage extends BasePage {
    By posManagementSubLeftMenuButton = By.cssSelector(".css-c4sutr div:nth-of-type(2) > .MuiButtonBase-root");
    By posManagementMoreFiltersButton = By.cssSelector(".MuiButton-text");
    By posManagementSearchButton = By.id("search_button");
    By posManagementCreateButton = By.cssSelector(".css-9urz1a");
    By posManagementID = By.name("id");
    By posManagementPosName = By.id("search-select");
    By posManagementPosBank = By.name("bankName");
    By posManagementStatus = By.xpath("//div[@class='MuiGrid-root MuiGrid-container MuiGrid-item MuiGrid-spacing-xs-2 css-ymzd56']/div[@class='MuiGrid-root MuiGrid-container MuiGrid-item MuiGrid-spacing-xs-2 css-7aty7k']/div[1]//div[@class='MuiInputBase-root MuiOutlinedInput-root MuiInputBase-colorPrimary MuiInputBase-fullWidth MuiInputBase-formControl  css-xwx9z3']/div[@id='dropdown-select']");
    By posManagementValueDate = By.name("valueDate");
    By posManagementDefaultPos = By.xpath("//div[@class='MuiGrid-root MuiGrid-container MuiGrid-item MuiGrid-spacing-xs-2 css-ymzd56']//div[3]//div[@id='dropdown-select']");
    By posManagementBankCode = By.xpath("//div[@class='MuiInputBase-root MuiOutlinedInput-root MuiInputBase-colorPrimary MuiInputBase-formControl  css-1qkwyl5']/div[@id='dropdown-select']");
    By posManagementExport = By.xpath("//div[@class='MuiSelect-select MuiSelect-outlined Mui-disabled MuiInputBase-input MuiOutlinedInput-input Mui-disabled css-2wbphm']");
    By posManagementExportButton = By.id("exportButton");
    By posManagementExportHistory = By.id("exportHistoryButton");
    By posManagementOrderButton = By.cssSelector(".css-1s72i5x > .MuiButtonBase-root");
    By posManagementShowHide = By.cssSelector(".css-2ertzu > .MuiButtonBase-root");
    By posManagementClearAllFilters = By.id("clear_filters_button");
    By posManagementEditButton = By.cssSelector(".MuiTableBody-root > tr:nth-of-type(1) [data-testid='EditIcon']");
    By posManagementDetailButton = By.cssSelector(".MuiTableBody-root > tr:nth-of-type(1) [data-testid='VisibilityIcon']");
    By posManagementPerPage = By.cssSelector(".MuiInputBase-inputSizeSmall");
    By posManagementTNoRegistrations = By.cssSelector("h3:nth-of-type(2)");
    By posManagementDefaultPosRadioButton = By.cssSelector(".MuiTableBody-root > tr:nth-of-type(1) .PrivateSwitchBase-input");
    By posManagementAddPosPageList = By.cssSelector(".css-9urz1a");
    By posManagementAddPosPageGeneralInformation = By.xpath("//button[@class='MuiButtonBase-root MuiTab-root MuiTab-textColorPrimary Mui-selected css-1rk3k83']");
    By posManagementAddPosPageCommissionSettings = By.cssSelector(".MuiTabs-flexContainer > button:nth-of-type(2)");
    By posManagementAddPosPagePosCredentials = By.cssSelector("button:nth-of-type(3)");
    By posManagementAddPosPagePosName = By.cssSelector(".MuiGrid-grid-lg-10 > div:nth-of-type(1) .MuiInputBase-input");
    By posManagementAddPosPagePosBank = By.id("pos-dropdown_bank");
    By posManagementAddPosPageCurrency = By.id("pos-dropdown_currency");
    By posManagementAddPosPageValueDate = By.name("valueDate");
    By posManagementAddPosPageCardProgram = By.id("pos-dropdown_card_family");
    By posManagementAddPosPageStatus = By.id("pos-dropdown_status_dropdown");
    By posManagementAddPosPageBinNumbers = By.xpath("//div[@class='MuiGrid-root MuiGrid-item MuiGrid-grid-xs-12 MuiGrid-grid-md-6 css-iol86l'][7]//input");
    By posManagementAddPosPageDefaultPosCheckbox = By.cssSelector(".MuiFormGroup-root > label:nth-of-type(1) .PrivateSwitchBase-input");
    By posManagementAddPosPageAllowAuthorizationCheckbox = By.xpath("//div[@class='MuiFormGroup-root css-1h7anqn']/label[2]/span/input");
    By posManagementAddPosPageAllowPreAuthorizationCheckbox = By.xpath("//div[@class='MuiFormGroup-root css-1h7anqn']/label[3]/span/input");
    By posManagementAddPosPageAllowForeignCardsCheckbox = By.cssSelector("label:nth-of-type(4) .PrivateSwitchBase-input");
    By posManagementAddPosPageNextButton = By.cssSelector(".MuiButton-fullWidth");
    By posManagementAddPosPageCommissionOnusCreditCardRate = By.cssSelector(".MuiGrid-grid-md-10 > div:nth-of-type(1) .MuiInputBase-input");
    By posManagementAddPosPageCommissionOnusCreditCardAmount = By.cssSelector(".MuiGrid-grid-md-10 > div:nth-of-type(2) .MuiInputBase-input");
    By posManagementAddPosPageCommissionNotOnusCreditCardRate = By.cssSelector(".MuiGrid-grid-md-10 > div:nth-of-type(3) .MuiInputBase-input");
    By posManagementAddPosPageCommissionNotOnusCreditCardAmount = By.cssSelector(".MuiGrid-grid-md-10 > div:nth-of-type(4) .MuiInputBase-input");
    By posManagementAddPosPageCommissionOnusDebitCardRate = By.cssSelector(".MuiGrid-grid-md-10 > div:nth-of-type(5) .MuiInputBase-input");
    By posManagementAddPosPageCommissionOnusDebitCardAmount = By.cssSelector(".MuiGrid-grid-md-10 > div:nth-of-type(6) .MuiInputBase-input");
    By posManagementAddPosPageCommissionNotOnusDebitCardRate = By.cssSelector(".MuiGrid-grid-md-10 > div:nth-of-type(7) .MuiInputBase-input");
    By posManagementAddPosPageCommissionNotOnusDebitCardAmount = By.cssSelector(".MuiGrid-grid-md-10 > div:nth-of-type(8) .MuiInputBase-input");
    By posManagementAddPosPageCommissionForeignCardRate = By.cssSelector(".MuiGrid-grid-md-10 > div:nth-of-type(9) .MuiInputBase-input");
    By posManagementAddPosPageCommissionForeignCardAmount = By.cssSelector("div:nth-of-type(10) .MuiInputBase-input");
    By posManagementAddPosPageCommissionSettingsNextButton = By.cssSelector(".css-1d92r0r");
    By posManagementAddPosPageCommissionSettingsBackButton = By.cssSelector(".css-bbh6tn");
    By posManagementAddPosPagePosCredentialsParameterName = By.cssSelector(".css-1x5jdmq");
    By posManagementAddPosPagePosCredentialsParameterValue = By.cssSelector(".MuiInputBase-inputAdornedEnd");
    By posManagementAddPosPagePosCredentialsParameterValueEye = By.cssSelector(".css-m9xqr6");
    By posManagementAddPosPagePosCredentialsSensitiveInformation = By.cssSelector(".PrivateSwitchBase-input");
    By posManagementAddPosPagePosCredentialsDeleteIcon = By.cssSelector(".MuiGrid-grid-xs-4");
    By posManagementAddPosPagePosCredentialsAddParameter = By.cssSelector(".css-1xz4wel");
    By posManagementAddPosPagePosCredentialsSaveButton = By.cssSelector(".css-1s8mci6 > div:nth-of-type(2)");
    By posManagementAddPosPagePosCredentialsBackButton = By.cssSelector(".css-bbh6tn");
    By posManagementAddPosPageCommissionSettingsList = By.cssSelector(".css-9urz1a");
    By posManagementAddPosPagePosCredentialsList = By.cssSelector(".css-9urz1a");
    By posManagementUpdatePosPagePosName = By.xpath("//div[@class='MuiGrid-root MuiGrid-item MuiGrid-grid-xs-12 MuiGrid-grid-md-6 css-iol86l'][1]//input");
    By posManagementUpdatePosPageValueDate = By.xpath("//div[@class='MuiGrid-root MuiGrid-item MuiGrid-grid-xs-12 MuiGrid-grid-md-6 css-iol86l'][4]//input");
    By posManagementPosNameInput = By.xpath("//div[@class='MuiGrid-root MuiGrid-item MuiGrid-grid-xs-12 css-919krq']//input");
    By posManagementPosNameSearchButton = By.xpath("//div[@class='MuiGrid-root MuiGrid-item MuiGrid-grid-xs-12 css-919krq']//button");
    By posManagementSelectPosName = By.xpath("//div[@class='MuiGrid-root MuiGrid-item MuiGrid-grid-xs-12 css-15j76c0']/ul/li");
    By posManagementPosNameExit = By.xpath("//div[@class='MuiGrid-root MuiGrid-item MuiGrid-grid-xs-6 css-1foflnh']/button");
    By posManagementPosNameList = By.xpath("//tr[@class='MuiTableRow-root MuiTableRow-hover css-1mryfrx']/td[@class='MuiTableCell-root MuiTableCell-body MuiTableCell-alignLeft MuiTableCell-sizeMedium css-q34dxg'][2]");
    By posManagementPosBankList = By.xpath("//tr[@class='MuiTableRow-root MuiTableRow-hover css-1mryfrx']/td[@class='MuiTableCell-root MuiTableCell-body MuiTableCell-alignLeft MuiTableCell-sizeMedium css-q34dxg'][3]");
    By posManagementPosDefaultSwitch = By.xpath("//tr[@class='MuiTableRow-root MuiTableRow-hover css-1mryfrx']/td[7]//input");
    By posManagementPosStatusSwitch = By.xpath("//tr[@class='MuiTableRow-root MuiTableRow-hover css-1mryfrx']/td[4]//input");

    public void leftSubMenuPosManagementSubmit() {
        click(posManagementSubLeftMenuButton);
        waitBySeconds(2);
    }

    public void posManagementPageControlUrl() throws Exception {
        controlUrl("pos", "pages.posmanagement");
    }

    public void posManagementPageMoreFiltersButtonClick() {
        click(posManagementMoreFiltersButton);
        waitBySeconds(1);
    }

    public void posManagementSearchButtonSubmit() {
        click(posManagementSearchButton);
        waitBySeconds(2);
    }

    public void posManagementAllElementsAreDisplayed() {
        isElementDisplay(posManagementCreateButton);
        isElementDisplay(posManagementID);
        isElementDisplay(posManagementPosName);
        isElementDisplay(posManagementPosBank);
        isElementDisplay(posManagementStatus);
        isElementDisplay(posManagementValueDate);
        isElementDisplay(posManagementDefaultPos);
        isElementDisplay(posManagementBankCode);
        isElementDisplay(posManagementExport);
        isElementDisplay(posManagementExportButton);
        isElementDisplay(posManagementExportHistory);
        isElementDisplay(posManagementOrderButton);
        isElementDisplay(posManagementShowHide);
        isElementDisplay(posManagementClearAllFilters);
        isElementDisplay(posManagementEditButton);
        isElementDisplay(posManagementDetailButton);
        isElementDisplay(posManagementPerPage);
        isElementDisplay(posManagementTNoRegistrations);
        isElementDisplay(posManagementDefaultPosRadioButton);
    }

    public void posManagementAddPosCreateButtonSubmit() {
        click(posManagementCreateButton);
        waitBySeconds(4);
    }

    public void posManagementAddPosPageControlUrl() throws Exception {
        controlUrl("create", "pages.posmanagementaddpos");
    }

    public void posManagementPosCreateGeneralInformationAllElementsAreDisplayed() {
        isElementDisplay(posManagementAddPosPageList);
        isElementDisplay(posManagementAddPosPageGeneralInformation);
        isElementDisplay(posManagementAddPosPageCommissionSettings);
        isElementDisplay(posManagementAddPosPagePosCredentials);
        isElementDisplay(posManagementAddPosPagePosName);
        isElementDisplay(posManagementAddPosPagePosBank);
        isElementDisplay(posManagementAddPosPageCurrency);
        isElementDisplay(posManagementAddPosPageValueDate);
        isElementDisplay(posManagementAddPosPageCardProgram);
        isElementDisplay(posManagementAddPosPageStatus);
        isElementDisplay(posManagementAddPosPageBinNumbers);
        isElementDisplay(posManagementAddPosPageDefaultPosCheckbox);
        isElementDisplay(posManagementAddPosPageAllowAuthorizationCheckbox);
        isElementDisplay(posManagementAddPosPageAllowPreAuthorizationCheckbox);
        isElementDisplay(posManagementAddPosPageAllowForeignCardsCheckbox);
        isElementDisplay(posManagementAddPosPageNextButton);
    }

    public void posManagementPosCreateGeneralInformationNextButtonSubmit() {
        click(posManagementAddPosPageNextButton);
        waitBySeconds(2);
    }

    public void posManagementPosCreateCommissionSettingsAllElementsAreDisplayed() {
        isElementDisplay(posManagementAddPosPageCommissionSettingsList);
        isElementDisplay(posManagementAddPosPageCommissionOnusCreditCardRate);
        isElementDisplay(posManagementAddPosPageCommissionOnusCreditCardAmount);
        isElementDisplay(posManagementAddPosPageCommissionNotOnusCreditCardRate);
        isElementDisplay(posManagementAddPosPageCommissionNotOnusCreditCardAmount);
        isElementDisplay(posManagementAddPosPageCommissionOnusDebitCardRate);
        isElementDisplay(posManagementAddPosPageCommissionOnusDebitCardAmount);
        isElementDisplay(posManagementAddPosPageCommissionNotOnusDebitCardRate);
        isElementDisplay(posManagementAddPosPageCommissionNotOnusDebitCardAmount);
        isElementDisplay(posManagementAddPosPageCommissionForeignCardRate);
        isElementDisplay(posManagementAddPosPageCommissionForeignCardAmount);
        isElementDisplay(posManagementAddPosPageCommissionSettingsNextButton);
        isElementDisplay(posManagementAddPosPageCommissionSettingsBackButton);
    }

    public void posManagementPosCreateCommissionSettingsNextButtonSubmit() {
        click(posManagementAddPosPageCommissionSettingsNextButton);
        waitBySeconds(2);
    }

    public void posManagementPosCreateCommissionSettingsBackButtonSubmit() {
        click(posManagementAddPosPageCommissionSettingsBackButton);
        waitBySeconds(2);
    }

    public void posManagementPosCreatePosCredentialsAllElementsAreDisplayed() {
        isElementDisplay(posManagementAddPosPagePosCredentialsList);
        isElementDisplay(posManagementAddPosPagePosCredentialsParameterName);
        isElementDisplay(posManagementAddPosPagePosCredentialsParameterValue);
        isElementDisplay(posManagementAddPosPagePosCredentialsParameterValueEye);
        isElementDisplay(posManagementAddPosPagePosCredentialsSensitiveInformation);
        isElementDisplay(posManagementAddPosPagePosCredentialsDeleteIcon);
        isElementDisplay(posManagementAddPosPagePosCredentialsAddParameter);
        isElementDisplay(posManagementAddPosPagePosCredentialsSaveButton);
        isElementDisplay(posManagementAddPosPagePosCredentialsBackButton);
    }

    public void posManagementPosCreatePosCredentialsBackButtonSubmit() {
        click(posManagementAddPosPagePosCredentialsBackButton);
        waitBySeconds(2);
    }

    public void posManagementOneElementIsDisplayed() {
        isElementDisplay(posManagementAddPosPageCommissionOnusDebitCardAmount);
    }

    public void posManagementTypePosName() {
        Random rnd = new Random();
        int rndCount = rnd.nextInt(999999);
        String posName = "Otomasyon" + rndCount;
        type(posManagementAddPosPagePosName,posName);
        waitBySeconds(1);
    }

    public void posManagementTypeValueDate() {
        Random rnd = new Random();
        int valueDate = rnd.nextInt(9);
        type(posManagementAddPosPageValueDate, String.valueOf(valueDate));
        waitBySeconds(1);
    }

    public void posManagementTypeBinNumber() {
        Random rnd = new Random();
        int rndBinNumber = rnd.nextInt(99999);
        int binNumber =  100000 + rndBinNumber;
        type(posManagementAddPosPageBinNumbers, String.valueOf(binNumber));
        WebElement bin = getDriver().findElement(posManagementAddPosPageBinNumbers);
        bin.sendKeys(Keys.ENTER);
        waitBySeconds(1);
    }

    public void posManagementPosBankDropdownClick(String posBank) {
        click(posManagementAddPosPagePosBank);
        waitBySeconds(1);
        click(By.xpath("//*[starts-with(text(), '" + posBank + "')]"));
        waitBySeconds(1);
    }

    public void posManagementCardProgramDropdownClick(String cardProgram) {
        click(posManagementAddPosPageCardProgram);
        click(By.xpath("//*[starts-with(text(), '" + cardProgram + "')]"));
        waitBySeconds(1);
    }

    public void posManagementStatusDropdownClick(String status) {
        click(posManagementAddPosPageStatus);
        click(By.xpath("//*[starts-with(text(), '" + status + "')]"));
        waitBySeconds(1);
    }

    public void posManagementCurrencyDropdownClick() {
        click(posManagementAddPosPageCurrency);
        click(By.xpath("//*[starts-with(text(), 'Türk Lirası')]"));
        waitBySeconds(1);
    }

    public void posManagementTypeCommissionRateOnusCC(String OnusCC) {
        type(posManagementAddPosPageCommissionOnusCreditCardRate,OnusCC);
        waitBySeconds(1);
    }

    public void posManagementTypeCommissionRateNotOnusCC(String NotOnusCC) {
        type(posManagementAddPosPageCommissionNotOnusCreditCardRate,NotOnusCC);
        waitBySeconds(1);
    }

    public void posManagementTypeCommissionRateOnusDebit(String OnusDebit) {
        type(posManagementAddPosPageCommissionOnusDebitCardRate,OnusDebit);
        waitBySeconds(1);
    }

    public void posManagementTypeCommissionRateNotOnusDebit(String NotOnusDebit) {
        type(posManagementAddPosPageCommissionNotOnusDebitCardRate,NotOnusDebit);
        waitBySeconds(1);
    }

    public void posManagementAllowAuthorizationCheckboxClick() {
        click(posManagementAddPosPageAllowAuthorizationCheckbox);
        waitBySeconds(1);
    }

    public void posManagementAllowPreAuthorizationCheckboxClick() {
        click(posManagementAddPosPageAllowPreAuthorizationCheckbox);
        waitBySeconds(1);
    }

    public void posManagementTypeParameterNameAndParameterValue(String name, String value) {
        type(posManagementAddPosPagePosCredentialsParameterName,name);
        type(posManagementAddPosPagePosCredentialsParameterValue,value);
        waitBySeconds(1);
    }

    public void posManagementUpdateButtonClick() {
        click(posManagementEditButton);
        waitBySeconds(1);
    }

    public void posManagementInformationText(String info) {
        informationTextOnPage(info);
        waitBySeconds(1);
    }

    public void posManagementClearTextField() {
        getDriver().findElement(posManagementUpdatePosPagePosName).clear();
        getDriver().findElement(posManagementUpdatePosPageValueDate).clear();
        waitBySeconds(2);

    }

    public void posManagementSaveButtonClick() {
        click(posManagementAddPosPagePosCredentialsSaveButton);
        waitBySeconds(1);
    }

    public void posManagementPosNameClick() {
        click(posManagementPosName);
        waitBySeconds(1);
    }

    public void posManagementSelectPosName(String posName) {
        type(posManagementPosNameInput,posName);
        click(posManagementPosNameSearchButton);
        waitBySeconds(1);
        click(posManagementSelectPosName);
        click(posManagementPosNameExit);
        waitBySeconds(1);
    }

    public void posManagementCheckPosName(String posName) {
        String posNameOnTable = getText(posManagementPosNameList);
        assertTextEquals(posNameOnTable, posName);
    }

    public void posManagementTypePosBank(String posBank) {
        type(posManagementPosBank,posBank);
    }

    public void checkDataTable(String valueOnTable) {

        switch (valueOnTable) {
            case "Ziraat":
                String ziraatPosBank = getText(posManagementPosBankList);
                assertTextEquals(ziraatPosBank, "Ziraat");
                break;
            case "Akbank":
                String akbankPosBank = getText(posManagementPosBankList);
                assertTextEquals(akbankPosBank, "Akbank");
                break;
            case "Is bankasi":
                String isbankasiPosBank = getText(posManagementPosBankList);
                assertTextEquals(isbankasiPosBank, "Is bankasi");
                break;
            case "YapiKredi":
                String yapikrediPosBank = getText(posManagementPosBankList);
                assertTextEquals(yapikrediPosBank, "YapiKredi");
                break;
            case "Garanti":
                String garantiPosBank = getText(posManagementPosBankList);
                assertTextEquals(garantiPosBank, "Garanti");
                break;
            case "Param":
                String paramPosBank = getText(posManagementPosBankList);
                assertTextEquals(paramPosBank, "Param");
                break;
        }
    }

    public void posManagementPosDefaultSwitchButtonClick() {
        jsClicker(posManagementPosDefaultSwitch);
        waitBySeconds(1);
    }

    public void posManagementPosStatusSwitchButtonClick() {
        jsClicker(posManagementPosStatusSwitch);
        waitBySeconds(1);
    }
}
