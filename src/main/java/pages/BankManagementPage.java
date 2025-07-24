package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.Random;

public class BankManagementPage extends BasePage {
    By bankManagementSubLeftMenuButton = By.cssSelector(".MuiPaper-elevation0 div:nth-of-type(4) ul:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(1)");
    By bankManagementSearchButton = By.id("search_button");
    By bankManagementMoreFiltersButton = By.id("expand_collapse_filters_button");
    By bankManagementStatus = By.xpath("//div[@class='MuiGrid-root MuiGrid-container MuiGrid-item MuiGrid-spacing-xs-2 css-7aty7k']/div[1]//div[@id='dropdown-select']");
    By bankManagementBankCode = By.xpath("//div[@class='MuiGrid-root MuiGrid-container MuiGrid-item MuiGrid-spacing-xs-2 css-7aty7k']/div[2]//div[@id='dropdown-select']");
    By bankManagementServiceProvider = By.name("provider");
    By bankManagementBankName = By.name("name");
    By bankManagementBankICA = By.name("bankIca");
    By bankManagementExport = By.xpath("//div[@class='MuiSelect-select MuiSelect-outlined Mui-disabled MuiInputBase-input MuiOutlinedInput-input Mui-disabled css-2wbphm']");
    By bankManagementExportButton = By.id("actionExport");
    By bankManagementOrderButton = By.cssSelector(".css-1s72i5x > .MuiButtonBase-root");
    By bankManagementShowHide = By.cssSelector(".css-2ertzu > .MuiButtonBase-root");
    By bankManagementClearAllFilters = By.id("clear_filters_button");
    By bankManagementAddButton = By.cssSelector(".css-9urz1a");
    By bankManagementEditButton = By.cssSelector(".MuiTableBody-root > tr:nth-of-type(1) [data-testid='EditIcon']");
    By bankManagementDetailButton = By.cssSelector(".MuiTableBody-root > tr:nth-of-type(1) [data-testid='VisibilityIcon']");
    By bankManagementPerPage = By.cssSelector(".MuiInputBase-inputSizeSmall");
    By bankManagementTNoRegistrations = By.cssSelector("h3:nth-of-type(2)");
    By bankManagementAddBankPageNameAndCode = By.xpath("//div[@class='MuiGrid-root MuiGrid-container MuiGrid-item MuiGrid-spacing-xs-4 MuiGrid-grid-xs-12 css-g5metc']/div[2]//div[@id='dropdown-select']");
    By bankManagementAddBankPageServiceProvider = By.name("serviceProvider");
    By bankManagementAddBankPageIca = By.name("ica");
    By bankManagementAddBankPageCancelFlow = By.xpath("//div[@class='MuiGrid-root MuiGrid-container MuiGrid-item MuiGrid-spacing-xs-4 MuiGrid-grid-xs-12 css-g5metc']/div[5]//div[@id='dropdown-select']");
    By bankManagementAddBankPageStatus = By.xpath("//div[@class='MuiGrid-root MuiGrid-container MuiGrid-item MuiGrid-spacing-xs-4 MuiGrid-grid-xs-12 css-g5metc']/div[6]//div[@id='dropdown-select']");
    By bankManagementAddBankPageSave = By.cssSelector(".MuiGrid-grid-sm-6");
    By bankManagementAddBankPageListButton = By.cssSelector(".css-9urz1a");
    By bankManagementBankNameList = By.xpath("//tr[@class='MuiTableRow-root MuiTableRow-hover css-1mryfrx']/td[@class='MuiTableCell-root MuiTableCell-body MuiTableCell-alignLeft MuiTableCell-sizeMedium css-q34dxg'][2]");
    By bankManagementBankServiceProvider = By.xpath("//tr[@class='MuiTableRow-root MuiTableRow-hover css-1mryfrx']/td[@class='MuiTableCell-root MuiTableCell-body MuiTableCell-alignLeft MuiTableCell-sizeMedium css-q34dxg'][4]");

    public void leftSubMenuBankManagementSubmit() {
        click(bankManagementSubLeftMenuButton);
        waitBySeconds(2);
    }

    public void bankManagementPageControlUrl() throws Exception {
        controlUrl("banks", "pages.bankmanagement");
    }

    public void bankManagementAddBankPageControlUrl() throws Exception {
        controlUrl("create", "pages.bankmanagementaddbank");
    }

    public void bankManagementSearchButtonClick() {
        click(bankManagementSearchButton);
        waitBySeconds(2);
    }

    public void bankManagementPageMoreFiltersButtonClick() {
        click(bankManagementMoreFiltersButton);
        waitBySeconds(1);
    }

    public void bankManagementAllElementsAreDisplayed() {
        isElementDisplay(bankManagementStatus);
        isElementDisplay(bankManagementSearchButton);
        isElementDisplay(bankManagementBankCode);
        isElementDisplay(bankManagementServiceProvider);
        isElementDisplay(bankManagementBankName);
        isElementDisplay(bankManagementBankICA);
        isElementDisplay(bankManagementExport);
        isElementDisplay(bankManagementExportButton);
        isElementDisplay(bankManagementOrderButton);
        isElementDisplay(bankManagementShowHide);
        isElementDisplay(bankManagementClearAllFilters);
        isElementDisplay(bankManagementAddButton);
        isElementDisplay(bankManagementEditButton);
        isElementDisplay(bankManagementDetailButton);
        isElementDisplay(bankManagementPerPage);
        isElementDisplay(bankManagementTNoRegistrations);
    }

    public void bankManagementAddBankSubmit() {
        click(bankManagementAddButton);
        waitBySeconds(2);
    }

    public void addBankAllElementsAreDisplayed() {
        isElementDisplay(bankManagementAddBankPageNameAndCode);
        isElementDisplay(bankManagementAddBankPageServiceProvider);
        isElementDisplay(bankManagementAddBankPageIca);
        isElementDisplay(bankManagementAddBankPageCancelFlow);
        isElementDisplay(bankManagementAddBankPageStatus);
        isElementDisplay(bankManagementAddBankPageSave);
        isElementDisplay(bankManagementAddBankPageListButton);
    }

    public void bankManagementBankNameDropdownClick(String bankName) {
        click(bankManagementAddBankPageNameAndCode);
        click(By.xpath("//*[starts-with(text(), '" + bankName + "')]"));
        waitBySeconds(1);
    }

    public void bankManagementCancelFlowDropdownClick(String cancelFlow) {
        click(bankManagementAddBankPageCancelFlow);
        click(By.xpath("//*[starts-with(text(), '" + cancelFlow + "')]"));
        waitBySeconds(1);
    }

    public void bankManagementStatusDropdownClick(String status) {
        click(bankManagementAddBankPageStatus);
        click(By.xpath("//*[starts-with(text(), '" + status + "')]"));
        waitBySeconds(1);
    }

    public void bankManagementTypeServiceProvider(String serviceProvider) {
        type(bankManagementServiceProvider, serviceProvider);
        waitBySeconds(1);
    }

    public void bankManagementTypeBankIca() {
        Random rnd = new Random();
        int rndIcaNumber = rnd.nextInt(999);
        int icaNumber =  1000 + rndIcaNumber;
        type(bankManagementAddBankPageIca, String.valueOf(icaNumber));
        waitBySeconds(1);
    }

    public void bankManagementInformationText(String info) {
        informationTextOnPage(info);
        waitBySeconds(1);
    }

    public void bankManagementAddBankSaveButtonClick() {
        click(bankManagementAddBankPageSave);
        waitBySeconds(1);
    }

    public void bankManagementEditButtonClick() {
        click(bankManagementEditButton);
        waitBySeconds(1);
    }

    public void bankManagementClearTextField() {
        getDriver().findElement(bankManagementAddBankPageIca).clear();
        waitBySeconds(1);
    }

    public void bankManagementTypeBankName(String bankName) {
        type(bankManagementBankName, bankName);
        waitBySeconds(1);
    }

    public void bankManagementCheckBankName(String bankName) {
        String bankNameOnTable = getText(bankManagementBankNameList);
        assertTextEquals(bankNameOnTable, bankName);
    }

    public void checkDataTable(String valueOnTable) {

        switch (valueOnTable) {
            case "ZiraatGateway":
                String ziraatPosBank = getText(bankManagementBankServiceProvider);
                assertTextEquals(ziraatPosBank, "ZiraatGateway");
                break;
            case "GarantiGateway":
                String akbankPosBank = getText(bankManagementBankServiceProvider);
                assertTextEquals(akbankPosBank, "GarantiGateway");
                break;
            case "AssecoGateway":
                String isbankasiPosBank = getText(bankManagementBankServiceProvider);
                assertTextEquals(isbankasiPosBank, "AssecoGateway");
                break;
            case "AkbankGateway":
                String yapikrediPosBank = getText(bankManagementBankServiceProvider);
                assertTextEquals(yapikrediPosBank, "AkbankGateway");
                break;
            case "YapiKrediGateway":
                String garantiPosBank = getText(bankManagementBankServiceProvider);
                assertTextEquals(garantiPosBank, "YapiKrediGateway");
                break;
            case "ParamGateway":
                String paramPosBank = getText(bankManagementBankServiceProvider);
                assertTextEquals(paramPosBank, "ParamGateway");
                break;
        }
    }

    public void bankManagementAddBankTypeServiceProvider(String serviceProvider) {
        waitBySeconds(1);
        type(bankManagementAddBankPageServiceProvider, serviceProvider);
        waitBySeconds(1);
    }
}
