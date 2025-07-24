package pages;

import base.BasePage;
import org.openqa.selenium.By;
import java.time.LocalDate;

public class ChargebackListPage extends BasePage {
    By chargeBackListPageSubLeftMenuButton = By.cssSelector(".MuiCollapse-entered div:nth-of-type(1) > .MuiButtonBase-root");
    By chargeBackListPageExcel = By.xpath("//div[@class='MuiSelect-select MuiSelect-outlined Mui-disabled MuiInputBase-input MuiOutlinedInput-input Mui-disabled css-2wbphm']");
    By chargeBackListPageExcelExport = By.xpath("//div[@class='MuiGrid-root MuiGrid-container MuiGrid-item MuiGrid-spacing-xs-2 css-ymzd56']//div[2]//div[@id='dropdown-select']");
    By chargeBackListPageMoreFiltersButton = By.cssSelector(".MuiButton-text");
    By chargeBackListPageOrderButton = By.cssSelector(".css-1s72i5x > .MuiButtonBase-root");
    By chargeBackListPageShowHide = By.cssSelector(".css-2ertzu > .MuiButtonBase-root");
    By chargeBackListPageClearAllFilters = By.id("clear_filters_button");
    By chargeBackListPageSearchButton = By.id("search_button");
    By chargeBackListPageDetailButton = By.cssSelector(".MuiTableBody-root > tr:nth-of-type(1) .MuiButtonBase-root");
    By chargeBackListPageAddButton = By.cssSelector(".css-9urz1a");
    By chargeBackListPagePerPage = By.cssSelector(".MuiInputBase-inputSizeSmall");
    By chargeBackListPageTNoRegistrations = By.cssSelector("h3:nth-of-type(2)");
    By chargeBackListPageMinAmount = By.name("minAmount");
    By chargeBackListPageMaxAmount = By.name("maxAmount");
    By chargeBackListPageOrderID = By.name("internalOrderId");
    By chargeBackListPageChargeBackStartDate = By.cssSelector(".css-16c2vxo > .MuiGrid-root > div:nth-of-type(1) > .MuiFormControl-root > .MuiInputBase-root");
    By chargeBackListPageChargeBackEndDate = By.cssSelector(".css-16c2vxo > .MuiGrid-root > div:nth-of-type(2) .MuiInputBase-root");
    By chargeBackListPageBankChargeBackStartDate = By.cssSelector(".css-ymzd56 div:nth-of-type(4) .MuiInputBase-root");
    By chargeBackListPageBankChargeBackEndDate = By.cssSelector(".css-ymzd56 div:nth-of-type(5) .MuiInputBase-root");
    By chargeBackListPageStatus = By.xpath("//div[@class='MuiSelect-select MuiSelect-outlined MuiInputBase-input MuiOutlinedInput-input css-2wbphm']");
    By chargeBackListPageAddChargeBackTitle = By.cssSelector(".css-2xgtc5");
    By chargeBackListPageAddChargeOrderNo = By.name("orderNo");
    By chargeBackListPageAddChargeBackBankChargeBackDate = By.cssSelector(".css-17px36k .MuiInputBase-adornedEnd");
    By chargeBackListPageAddChargeBackChargeBackAmount = By.name("amount");
    By chargeBackListPageAddChargeBackChargeBackReason = By.xpath("//div[@class='MuiInputBase-root MuiOutlinedInput-root MuiInputBase-colorPrimary MuiInputBase-formControl  css-1qkwyl5']/div[@id='dropdown-select']");
    By chargeBackListPageAddChargeBackDescription = By.name("description");
    By chargeBackListPageAddChargeBackUploadFile = By.cssSelector(".css-ln9g0a");
    By chargeBackListPageAddChargeBackCancelButton = By.cssSelector(".css-m4ct4k > .MuiButton-outlined");
    By chargeBackListPageAddChargeBackSaveButton = By.cssSelector(".css-m4ct4k > .MuiButton-contained");
    By chargeBackReasonDamagedProduct = By.id("dropdown_item_DAMAGED_PRODUCT");
    By chargeBackReasonOthers = By.id("dropdown_item_OTHERS");
    By chargeBackReasonIncorrectAmount = By.id("dropdown_item_INCORRECT_AMOUNT");
    By chargeBackReasonDocumentRequests = By.id("dropdown_item_DOCUMENT_REQUESTS");
    By chargeBackReasonRejection = By.id("dropdown_item_REJECTION");
    By chargeBackReasonNotCardOwner = By.id("dropdown_item_NOT_CARD_OWNER");
    By chargeBackReasonCancelRefund = By.id("dropdown_item_CANCEL_REFUND");
    By chargeBackReasonSystemFailure = By.id("dropdown_item_SYSTEM_FAILURE");


    public void chargeBackListPageAddChargeBackAllElementsAreDisplayed() {
        isElementDisplay(chargeBackListPageAddChargeOrderNo);
        isElementDisplay(chargeBackListPageAddChargeBackBankChargeBackDate);
        isElementDisplay(chargeBackListPageAddChargeBackChargeBackAmount);
        isElementDisplay(chargeBackListPageAddChargeBackChargeBackReason);
        isElementDisplay(chargeBackListPageAddChargeBackDescription);
        isElementDisplay(chargeBackListPageAddChargeBackUploadFile);
        isElementDisplay(chargeBackListPageAddChargeBackCancelButton);
        isElementDisplay(chargeBackListPageAddChargeBackSaveButton);
    }

    public void chargeBackListPageAllElementsAreDisplayed() {
        isElementDisplay(chargeBackListPageAddButton);
        isElementDisplay(chargeBackListPageMoreFiltersButton);
        isElementDisplay(chargeBackListPageExcel);
        isElementDisplay(chargeBackListPageExcelExport);
        isElementDisplay(chargeBackListPageOrderButton);
        isElementDisplay(chargeBackListPageShowHide);
        isElementDisplay(chargeBackListPageClearAllFilters);
        isElementDisplay(chargeBackListPageSearchButton);
        isElementDisplay(chargeBackListPageDetailButton);
        isElementDisplay(chargeBackListPagePerPage);
        isElementDisplay(chargeBackListPageTNoRegistrations);
        isElementDisplay(chargeBackListPageMinAmount);
        isElementDisplay(chargeBackListPageMaxAmount);
        isElementDisplay(chargeBackListPageOrderID);
        isElementDisplay(chargeBackListPageChargeBackStartDate);
        isElementDisplay(chargeBackListPageChargeBackEndDate);
        isElementDisplay(chargeBackListPageBankChargeBackStartDate);
        isElementDisplay(chargeBackListPageBankChargeBackEndDate);
        isElementDisplay(chargeBackListPageStatus);
    }

    public void leftSubMenuChargebackListPageSubmit() {
        click(chargeBackListPageSubLeftMenuButton);
        waitBySeconds(2);
    }

    public void chargeBackListPageAddCorrectionsSubmit() {
        click(chargeBackListPageAddButton);
        waitBySeconds(2);
    }

    public void leftSubMenuChargebackListPageMoreFiltersSubmit() {
        click(chargeBackListPageMoreFiltersButton);
        waitBySeconds(2);
    }

    public void chargeBackListPageControlUrl() throws Exception {
        controlUrl("chargeback", "pages.chargeback");
    }

    public void chargeBackListPageControlPopUp() {
        String title = getText(chargeBackListPageAddChargeBackTitle);
        String expected = "Yeni Harcama İtirazı";
        assertTextEquals(title, expected);
    }

    public void typeInternalOrder(String orderRef) {
        type(chargeBackListPageAddChargeOrderNo, orderRef);
        waitBySeconds(1);
    }

    public void chooseDateTime() {
        String today = String.valueOf(LocalDate.now().getDayOfMonth());
        click(By.xpath("//div[@class='MuiDialogContent-root css-1ty026z']/div/div[2]/div/div/button"));
        click(By.xpath("//div[@class='MuiDayCalendar-monthContainer css-i6bazn']//button[text()= " + today + "]"));
        waitBySeconds(1);
    }

    public void typeAmount() {
        type(chargeBackListPageAddChargeBackChargeBackAmount, "11");
        waitBySeconds(1);
    }

    public void chargebackReasonDropDownClick() {
        click(chargeBackListPageAddChargeBackChargeBackReason);
        waitBySeconds(1);
    }

    public void selectChargebackReason(String reason) {

        switch (reason) {
            case "DAMAGED_PRODUCT":
                click(chargeBackReasonDamagedProduct);
                break;
            case "OTHERS":
                click(chargeBackReasonOthers);
                break;
            case "INCORRECT_AMOUNT":
                click(chargeBackReasonIncorrectAmount);
                break;
            case "DOCUMENT_REQUESTS":
                click(chargeBackReasonDocumentRequests);
                break;
            case "REJECTION":
                click(chargeBackReasonRejection);
                break;
            case "CANCEL_REFUND":
                click(chargeBackReasonCancelRefund);
                break;
            case "NOT_CARD_OWNER":
                click(chargeBackReasonNotCardOwner);
                break;
            case "SYSTEM_FAILURE":
                click(chargeBackReasonSystemFailure);
                break;
        }
        waitBySeconds(1);
    }

    public void typeDescription() {
        type(chargeBackListPageAddChargeBackDescription, "Test");
        waitBySeconds(1);
    }

    public void clickSaveButton() {
        click(chargeBackListPageAddChargeBackSaveButton);
        waitBySeconds(1);
    }

    public void chargebackListPagePageInformationText(String info) {
        informationTextOnPage(info);
        waitBySeconds(1);
    }
}
