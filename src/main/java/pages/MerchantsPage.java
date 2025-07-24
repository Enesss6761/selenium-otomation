package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class MerchantsPage extends BasePage {
    By merchantsPageSubLeftMenuButton = By.cssSelector(".css-16sds3z > .MuiTypography-root");
    By merchantsPageDateRange = By.cssSelector(".css-ncrmt1");
    By merchantsPageDateType = By.xpath("//div[@class='MuiGrid-root MuiGrid-container MuiGrid-item css-16c2vxo']/div[@class='MuiGrid-root MuiGrid-container MuiGrid-item MuiGrid-spacing-xs-2 css-7aty7k']/div[2]//div[@id='dropdown-select']");
    By merchantsPageStatus = By.xpath("//div[@class='MuiGrid-root MuiGrid-container MuiGrid-item css-16c2vxo']/div[@class='MuiGrid-root MuiGrid-container MuiGrid-item MuiGrid-spacing-xs-2 css-7aty7k']/div[3]//div[@id='dropdown-select']");
    By merchantsPageMerchantName = By.name("merchantName");
    By merchantsPageMerchantLegalName = By.name("merchantLegalName");
    By merchantsPageAuthorizedName = By.name("authorizedName");
    By merchantsPageAuthorizedEmail = By.name("authorizedEmail");
    By merchantsPageAuthorizedPhoneNo = By.name("authorizedPhoneNo");
    By merchantsPageExcel = By.xpath("//div[@class='MuiSelect-select MuiSelect-outlined Mui-disabled MuiInputBase-input MuiOutlinedInput-input Mui-disabled css-2wbphm']");
    By merchantsPageExcelExport = By.cssSelector(".MuiGrid-grid-xs-4 > .MuiButtonBase-root");
    By merchantPageMoreFiltersButton = By.cssSelector("#expand_collapse_filters_button");
    By merchantsPageOrderButton = By.cssSelector(".css-1s72i5x > .MuiButtonBase-root");
    By merchantsPageShowHide = By.cssSelector(".css-2ertzu > .MuiButtonBase-root");
    By merchantsPageClearAllFilters = By.id("clear_filters_button");
    By merchantsPageSearchButton = By.id("search_button");
    By merchantsPageEditButton = By.cssSelector(".MuiTableBody-root > tr:nth-of-type(1) .MuiIconButton-colorInfo");
    By merchantsPageDetailButton = By.cssSelector(".MuiTableBody-root > tr:nth-of-type(1) .MuiIconButton-colorSuccess");
    By merchantsPagePerPage = By.cssSelector(".MuiInputBase-inputSizeSmall");
    By merchantsPageTNoRegistrations = By.cssSelector("h3:nth-of-type(2)");
    By merchantsPageDateRangeMonth = By.cssSelector(".css-1f6ngd1 > div:nth-of-type(1) .css-1b1jvye > div:nth-of-type(2)");
    By merchantsPageDateRangeDay = By.cssSelector("[data-value='4']");
    By merchantsPageDateRangeYearIcon = By.xpath("//div[@class='MuiGrid-root MuiGrid-container MuiGrid-wrap-xs-nowrap css-1f6ngd1']/div[1]//div[.='2025']");
    By merchantsPageDateRangeYear = By.cssSelector("[data-value='2024']");
    By merchantsPageStatusSelect = By.cssSelector("#dropdown_item_ACTIVE");
    By merchantsPageDateTypeSelect = By.cssSelector("#dropdown_item_CREATED_DATE");
    By merchantNameInList = By.cssSelector("tr:nth-of-type(1) > td:nth-of-type(3)");
    By merchantLegalNameInList = By.cssSelector("tr:nth-of-type(1) > td:nth-of-type(4)");
    By merchantAuthorizedNameInList = By.cssSelector("tr:nth-of-type(1) > td:nth-of-type(5)");
    By merchantPhoneNoInList = By.cssSelector("tr:nth-of-type(1) > td:nth-of-type(6)");
    By merchantEmailInList = By.cssSelector("tr:nth-of-type(1) > td:nth-of-type(7)");
    By merchantStatusInList = By.cssSelector("tr:nth-of-type(1) > td:nth-of-type(8)");
    By merchantDateRangeCloseButton = By.cssSelector(".css-4irxix");

    public void merchantsPageAllElementsAreDisplayed() {
        isElementDisplay(merchantsPageDateRange);
        isElementDisplay(merchantsPageDateType);
        isElementDisplay(merchantsPageStatus);
        isElementDisplay(merchantsPageMerchantName);
        isElementDisplay(merchantsPageMerchantLegalName);
        isElementDisplay(merchantsPageAuthorizedName);
        isElementDisplay(merchantsPageAuthorizedEmail);
        isElementDisplay(merchantsPageAuthorizedPhoneNo);
        isElementDisplay(merchantsPageExcel);
        isElementDisplay(merchantsPageExcelExport);
        isElementDisplay(merchantsPageOrderButton);
        isElementDisplay(merchantsPageShowHide);
        isElementDisplay(merchantsPageClearAllFilters);
        isElementDisplay(merchantsPageSearchButton);
        isElementDisplay(merchantsPageEditButton);
        isElementDisplay(merchantsPageDetailButton);
        isElementDisplay(merchantsPagePerPage);
        isElementDisplay(merchantsPageTNoRegistrations);
    }

    public void leftSubMenuMerchantsSubmit() {
        click(merchantsPageSubLeftMenuButton);
        waitBySeconds(2);
    }

    public void merchantsDetailButtonSubmit() {
        click(merchantsPageDetailButton);
        waitBySeconds(2);
    }

    public void seeMerchantNameOfMerchantsDetail() {
        String merchantNameActual = "Yemeksepeti";
        String merchantNameExpected = getText(merchantNameInList);
        assertTextEquals(merchantNameActual, merchantNameExpected);
    }

    public void leftSubMenuMerchantsMoreFiltersSubmit() {
        click(merchantPageMoreFiltersButton);
        waitBySeconds(3);
    }

    public void merchantPagePageControlUrl() throws Exception {
        controlUrl("merchants", "pages.merchants");
    }

    public void merchantsPageClickSearchButton() {
        click(merchantsPageSearchButton);
        waitBySeconds(1);
    }

    public void merchantsPageClickDateRangeButton() {
        click(merchantsPageDateRange);
        waitBySeconds(1);
    }

    public void merchantsPageClickDateRangeMonth() {
        click(merchantsPageDateRangeMonth);
        waitBySeconds(1);
    }

    public void merchantsPageClickDateRangeDay() {
        click(merchantsPageDateRangeDay);
        waitBySeconds(1);
    }

    public void merchantsPageClickDateRangeYearIcon() {
        click(merchantsPageDateRangeYearIcon);
        waitBySeconds(1);
    }

    public void merchantsPageClickDateRangeYear() {
        click(merchantsPageDateRangeYear);
        waitBySeconds(1);
    }

    public void merchantsPageCloseDateRange() {
        click(merchantDateRangeCloseButton);
        waitBySeconds(1);
    }

    public void merchantsPageChooseStartDate(String startDay) {
        click(By.xpath("//div[@class='MuiGrid-root MuiGrid-container MuiGrid-wrap-xs-nowrap css-1f6ngd1']//div[4]/button[.='" + startDay + "']"));
        waitBySeconds(1);
    }

    public void merchantsPageChooseEndDate(String endDay) {
        click(By.xpath("//div[@class='MuiGrid-root MuiGrid-container MuiGrid-wrap-xs-nowrap css-1f6ngd1']//div[6]/button[.='" + endDay + "']"));
        waitBySeconds(1);
    }

    public void typeMerchantNameMerchantsPageSubmit() {
        type(merchantsPageMerchantName, "Yemeksepeti Market");
        waitBySeconds(2);
    }

    public void typeMerchantLegalNameMerchantsPageSubmit() {
        type(merchantsPageMerchantLegalName, "Yemeksepeti Market");
        waitBySeconds(2);
    }

    public void typeMerchantAuthorizedNameMerchantsPageSubmit() {
        type(merchantsPageAuthorizedName, "Test Name");
        waitBySeconds(2);
    }

    public void typeMerchantAuthorizedEmailMerchantsPageSubmit() {
        type(merchantsPageAuthorizedEmail, "yemeksepetimarket@gmail.com");
        waitBySeconds(2);
    }

    public void typeMerchantAuthorizedPhoneNoMerchantsPageSubmit() {
        type(merchantsPageAuthorizedPhoneNo, "05846890506");
        waitBySeconds(2);
    }

    public void merchantsPageClickStatus() {
        click(merchantsPageStatus);
        waitBySeconds(1);
    }

    public void merchantsPageClickStatusSelectSubmit() {
        click(merchantsPageStatusSelect);
        waitBySeconds(1);
    }

    public void merchantsPageClickDateType() {
        click(merchantsPageDateType);
        waitBySeconds(1);
    }

    public void merchantsPageClickDateTypeSelectSubmit() {
        click(merchantsPageDateTypeSelect);
        waitBySeconds(1);
        Actions action = new Actions(getDriver());
        action.sendKeys(Keys.ESCAPE).build().perform();
    }

    public void seeMerchantNameOnListMerchantsPage() {
        String merchantNameActual = "Yemeksepeti Market";
        String merchantLegalNameActual = "Yemeksepeti Market";
        String merchantAuthorizedNameActual = "Test Name";
        String merchantAuthorizedEmailActual = "yemeksepetimarket@gmail.com";
        String merchantAuthorizedPhoneNoActual = "+905846890506";
        String merchantAuthorizedStatusActual = "ACTIVE";
        String merchantNameExpected = getText(merchantNameInList);
        String merchantLegalNameExpected = getText(merchantLegalNameInList);
        String merchantAuthorizedNameExpected = getText(merchantAuthorizedNameInList);
        String merchantAuthorizedEmailExpected = getText(merchantEmailInList);
        String merchantAuthorizedPhoneNoExpected = getText(merchantPhoneNoInList);
        String merchantAuthorizedStatusExpected = getText(merchantStatusInList);
        assertTextEquals(merchantNameActual, merchantNameExpected);
        assertTextEquals(merchantLegalNameActual, merchantLegalNameExpected);
        assertTextEquals(merchantAuthorizedNameActual, merchantAuthorizedNameExpected);
        assertTextEquals(merchantAuthorizedEmailActual, merchantAuthorizedEmailExpected);
        assertTextEquals(merchantAuthorizedPhoneNoActual, merchantAuthorizedPhoneNoExpected);
        assertTextEquals(merchantAuthorizedStatusActual, merchantAuthorizedStatusExpected);
    }
}
