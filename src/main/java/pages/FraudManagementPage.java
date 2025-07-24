package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.Random;

public class FraudManagementPage extends BasePage {
    By fraudManagementPageSubLeftMenuButton = By.cssSelector(".css-c4sutr div:nth-of-type(2) > .MuiButtonBase-root");
    By fraudManagementPageStartDate = By.cssSelector(".css-16c2vxo > .MuiGrid-root > div:nth-of-type(1) > .MuiFormControl-root > .MuiInputBase-root");
    By fraudManagementPageEndDate = By.cssSelector(".css-16c2vxo > .MuiGrid-root > div:nth-of-type(2) .MuiInputBase-root");
    By fraudManagementPageOrderID = By.name("internalOrderId");
    By fraudManagementPagePlatformOrderID = By.name("platformOrderId");
    By fraudManagementPageMinScore = By.name("minScore");
    By fraudManagementPageMaxScore = By.name("maxScore");
    By fraudManagementPageMinAmount = By.cssSelector("[name='minAmount']");
    By fraudManagementPageMaxAmount = By.cssSelector("[name='maxAmount']");
    By fraudManagementPageRules = By.cssSelector("#search-select");
    By fraudManagementPageTransactionStatus = By.cssSelector("#sticky-multiple-select");
    By fraudManagementPageBinNumber = By.cssSelector("[name='binNumber']");
    By fraudManagementPageCL4Digit = By.cssSelector("[name='cardLastFourDigit']");
    By fraudManagementPageBankResponseCode = By.cssSelector("[name='transactionResponseCode']");
    By fraudManagementPageMerchantName = By.xpath("//div[@class='MuiSelect-select MuiSelect-outlined MuiInputBase-input MuiOutlinedInput-input css-2wbphm']");
    By fraudManagementPageExcel = By.xpath("//div[@class='MuiSelect-select MuiSelect-outlined Mui-disabled MuiInputBase-input MuiOutlinedInput-input Mui-disabled css-2wbphm']");
    By fraudManagementPageExcelExport = By.id("exportButton");
    By fraudManagementPageMoreFiltersButton = By.cssSelector(".MuiButton-text");
    By fraudManagementPageOrderButton = By.cssSelector(".css-1s72i5x > .MuiButtonBase-root");
    By fraudManagementPageShowHide = By.cssSelector(".css-2ertzu > .MuiButtonBase-root");
    By fraudManagementPageClearAllFilters = By.id("clear_filters_button");
    By fraudManagementPageSearchButton = By.id("search_button");
    By fraudManagementPageDetailButton = By.cssSelector(".MuiTableBody-root > tr:nth-of-type(1) > .MuiTableCell-root > .MuiButtonBase-root");
    By fraudManagementPagePerPage = By.cssSelector(".MuiInputBase-inputSizeSmall");
    By fraudManagementPageTNoRegistrations = By.cssSelector("h3:nth-of-type(2)");
    By fraudManagementPageScoreList = By.xpath("//tr[@class='MuiTableRow-root MuiTableRow-hover css-1mryfrx']/td[@class='MuiTableCell-root MuiTableCell-body MuiTableCell-alignLeft MuiTableCell-sizeMedium css-q34dxg'][3]");
    By fraudManagementPageAmountList = By.xpath("//tr[@class='MuiTableRow-root MuiTableRow-hover css-1mryfrx']/td[@class='MuiTableCell-root MuiTableCell-body MuiTableCell-alignLeft MuiTableCell-sizeMedium css-q34dxg'][8]");
    By fraudManagementMerchantNameList = By.xpath("//tr[@class='MuiTableRow-root MuiTableRow-hover css-1mryfrx']/td[@class='MuiTableCell-root MuiTableCell-body MuiTableCell-alignLeft MuiTableCell-sizeMedium css-q34dxg'][6]");
    By fraudManagementMerchantStatusSuccessList = By.xpath("//tr[@class='MuiTableRow-root MuiTableRow-hover css-1mryfrx']/td[@class='MuiTableCell-root MuiTableCell-body MuiTableCell-alignLeft MuiTableCell-sizeMedium css-30c854']");
    By fraudManagementMerchantStatusFailList = By.xpath("//tr[@class='MuiTableRow-root MuiTableRow-hover css-1mryfrx']/td[@class='MuiTableCell-root MuiTableCell-body MuiTableCell-alignLeft MuiTableCell-sizeMedium css-1w3asrb']");
    By fraudManagementMerchantStatusUnknownList = By.xpath("//tr[@class='MuiTableRow-root MuiTableRow-hover css-1mryfrx']/td[@class='MuiTableCell-root MuiTableCell-body MuiTableCell-alignLeft MuiTableCell-sizeMedium css-1r3pfak']");
    By fraudManagementMerchantNameYemeksepeti = By.id("dropdown_item_YEMEK SEPETİ ELEKTRONİK İLETİŞİM PERAKENDE GIDA A.Ş.");
    By fraudManagementMerchantNameMahalle = By.id("dropdown_item_YEMEK SEPETİ MAHALLE");
    By fraudManagementMerchantNameBanabi = By.id("dropdown_item_YEMEK SEPETİ BANABİ PERAKENDE GIDA A.Ş.");
    By fraudManagementStatusSuccess = By.xpath("//li[@data-value='SUCCESS']");
    By fraudManagementStatusFail = By.xpath("//li[@data-value='FAIL']");
    By fraudManagementStatusUnknown = By.xpath("//li[@data-value='UNKNOWN']");


    public void fraudRulesPageAllElementsAreDisplayed() {
        isElementDisplay(fraudManagementPageStartDate);
        isElementDisplay(fraudManagementPageEndDate);
        isElementDisplay(fraudManagementPageOrderID);
        isElementDisplay(fraudManagementPagePlatformOrderID);
        isElementDisplay(fraudManagementPageMinScore);
        isElementDisplay(fraudManagementPageMaxScore);
        isElementDisplay(fraudManagementPageMinAmount);
        isElementDisplay(fraudManagementPageMaxAmount);
        isElementDisplay(fraudManagementPageRules);
        isElementDisplay(fraudManagementPageTransactionStatus);
        isElementDisplay(fraudManagementPageBinNumber);
        isElementDisplay(fraudManagementPageCL4Digit);
        isElementDisplay(fraudManagementPageBankResponseCode);
        isElementDisplay(fraudManagementPageMerchantName);
        isElementDisplay(fraudManagementPageExcel);
        isElementDisplay(fraudManagementPageExcelExport);
        isElementDisplay(fraudManagementPageOrderButton);
        isElementDisplay(fraudManagementPageShowHide);
        isElementDisplay(fraudManagementPageClearAllFilters);
        isElementDisplay(fraudManagementPageSearchButton);
        isElementDisplay(fraudManagementPageDetailButton);
        isElementDisplay(fraudManagementPagePerPage);
        isElementDisplay(fraudManagementPageTNoRegistrations);
    }

    public void leftSubMenuFraudManagementSubmit() {
        click(fraudManagementPageSubLeftMenuButton);
        waitBySeconds(2);
    }

    public void leftSubMenuFraudManagementMoreFiltersSubmit() {
        click(fraudManagementPageMoreFiltersButton);
        waitBySeconds(2);
    }

    public void fraudManagementPagePageControlUrl() throws Exception {
        controlUrl("transactions", "pages.fraudmanagement");
    }

    public void fraudManagementTypeMinMaxScoresAndAmounts(String minScore, String maxScore, String minAmount, String maxAmount) {
        type(fraudManagementPageMinScore,minScore);
        type(fraudManagementPageMaxScore,maxScore);
        type(fraudManagementPageMinAmount,minAmount);
        type(fraudManagementPageMaxAmount,maxAmount);
        waitBySeconds(1);
    }

    public void fraudManagementSearchButtonClick() {
        click(fraudManagementPageSearchButton);
        waitBySeconds(1);
    }

    public void fraudManagementCheckScoreOnTable(String score) {
        checkNumericValue(fraudManagementPageScoreList,score);
    }

    public void fraudManagementCheckAmountOnTable(String amount) {
        checkNumericValue(fraudManagementPageAmountList,amount);
    }

    public void fraudManagementPageMerchantNameDropDownClick() {
        click(fraudManagementPageMerchantName);
        waitBySeconds(1);
    }

    public void fraudManagementPageMerchantNameClick(String merchantName) {

        switch (merchantName) {
            case "YEMEKSEPETI":
                click(fraudManagementMerchantNameYemeksepeti);
                break;
            case "BANABI":
                click(fraudManagementMerchantNameBanabi);
                break;
            case "MAHALLE":
                click(fraudManagementMerchantNameMahalle);
                break;
        }
        waitBySeconds(1);
    }

    public void checkDataTable(String valueOnTable) {

        switch (valueOnTable) {
            case "Yemeksepeti":
                String merchantNameYemeksepeti = getText(fraudManagementMerchantNameList);
                assertTextEquals(merchantNameYemeksepeti, "YEMEK SEPETİ ELEKTRONİK İLETİŞİM PERAKENDE GIDA A.Ş.");
                break;
            case "Mahalle":
                String merchantNameMahalle = getText(fraudManagementMerchantNameList);
                assertTextEquals(merchantNameMahalle, "YEMEK SEPETİ MAHALLE");
                break;
            case "Banabi":
                String merchantNameBanabi = getText(fraudManagementMerchantNameList);
                assertTextEquals(merchantNameBanabi, "YEMEK SEPETİ BANABİ PERAKENDE GIDA A.Ş.");
                break;
            case "Başarılı":
                String successStatus = getText(fraudManagementMerchantStatusSuccessList);
                assertTextEquals(successStatus, "Başarılı");
                break;
            case "Başarısız":
                String failStatus = getText(fraudManagementMerchantStatusFailList);
                assertTextEquals(failStatus, "Başarısız");
                break;
            case "Bilinmiyor":
                String unknownStatus = getText(fraudManagementMerchantStatusUnknownList);
                assertTextEquals(unknownStatus, "Bilinmiyor");
                break;
        }
    }

    public void fraudManagementPageTransactionStatusDropDownClick() {
        click(fraudManagementPageTransactionStatus);
        waitBySeconds(1);
    }

    public void fraudManagementPageTransactionStatusClick(String status) {

        switch (status) {
            case "BAŞARILI":
                click(fraudManagementStatusSuccess);
                break;
            case "BAŞARISIZ":
                click(fraudManagementStatusFail);
                break;
            case "BİLİNMİYOR":
                click(fraudManagementStatusUnknown);
                break;
        }
        waitBySeconds(1);
        Actions action = new Actions(getDriver());
        action.sendKeys(Keys.ESCAPE).build().perform();
        waitBySeconds(1);
    }

    public void fraudManagementPageExportToExcelClick() {
        click(fraudManagementPageExcelExport);
        waitBySeconds(1);
    }
}
