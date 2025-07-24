package pages;

import base.BasePage;
import org.openqa.selenium.By;

public class MerchantUserManagementPage extends BasePage {
    By merchantUserManagementPageSubLeftMenuButton = By.cssSelector(".MuiCollapse-wrapperInner .MuiButtonBase-root");
    By merchantUserManagementPageMerchantList = By.id("merchant-user-dropdown_merchant");
    By merchantUserManagementPageMerchantListSelectMerchant = By.xpath("//li[.='Yemeksepeti']");
    By merchantUserManagementPageName = By.cssSelector("#merchant-user-text_input_name");
    By merchantUserManagementPageSurname = By.cssSelector("#merchant-user-text_input_surname");
    By merchantUserManagementPageEmail = By.cssSelector("#merchant-user-text_input_email_input");
    By merchantUserManagementPageEditButton = By.cssSelector(".MuiTableBody-root > tr:nth-of-type(1) .MuiButtonBase-root");
    By merchantUserManagementPageSearchButton = By.cssSelector("#search_button");
    By merchantUserManagementPageClearButton = By.cssSelector("#clear_filters_button");
    By merchantUserManagementEditPageName = By.cssSelector(".css-g5metc > div:nth-of-type(3) .MuiInputBase-input");
    By merchantUserManagementEditPageSurname = By.cssSelector(".css-g5metc > div:nth-of-type(4) .MuiInputBase-input");
    By merchantUserManagementEditPageEmail = By.cssSelector("#email_input");
    By merchantUserManagementEditPagePhone = By.cssSelector("#phone_input");
    By merchantUserManagementEditPageStatus = By.cssSelector("[value='Aktif']");
    By merchantUserManagementEditPageList = By.cssSelector(".css-9urz1a");
    By merchantUserManagementEditPageSendInvitation = By.cssSelector(".css-zw8bdu > div:nth-of-type(1)");
    By merchantUserManagementEditPageDeleteBloke = By.cssSelector(".css-zw8bdu > div:nth-of-type(2)");
    By merchantUserManagementPageNameOnList = By.cssSelector("td:nth-of-type(1)");
    By merchantUserManagementPageSurnameOnList = By.cssSelector("td:nth-of-type(2)");
    By merchantUserManagementPageEmailOnList = By.cssSelector("td:nth-of-type(3)");

    public void seeMerchantUserRecordsOnListMerchantUserManagementPage() {
        String merchantUserNameActual = "ertürk";
        String merchantUserSurnameActual = "sütcü";
        String merchantUserEmailActual = "erturk.sutcu.ext@yemeksepeti.com";
        String merchantUserNameExpected = getText(merchantUserManagementPageNameOnList);
        String merchantUserSurnameExpected = getText(merchantUserManagementPageSurnameOnList);
        String merchantUserEmailExpected = getText(merchantUserManagementPageEmailOnList);
        assertTextEquals(merchantUserNameActual, merchantUserNameExpected);
        assertTextEquals(merchantUserSurnameActual, merchantUserSurnameExpected);
        assertTextEquals(merchantUserEmailActual, merchantUserEmailExpected);
    }

    public void typeMerchantUserManagementPageName() {
        type(merchantUserManagementPageName, "ertürk");
        waitBySeconds(2);
    }

    public void typeMerchantUserManagementPageSurname() {
        type(merchantUserManagementPageSurname, "sütcü");
        waitBySeconds(2);
    }

    public void typeMerchantUserManagementPageEmail() {
        type(merchantUserManagementPageEmail, "erturk.sutcu.ext@yemeksepeti.com");
        waitBySeconds(2);
    }

    public void merchantUserManagementPageMerchantListSelectMerchant() {
        click(merchantUserManagementPageMerchantListSelectMerchant);
        waitBySeconds(2);
    }

    public void merchantUserManagementPageSearchSubmit() {
        click(merchantUserManagementPageSearchButton);
        waitBySeconds(5);
    }

    public void merchantUserManagementPageMerchantListSubmit() {
        click(merchantUserManagementPageMerchantList);
        waitBySeconds(2);
    }

    public void merchantUserManagementEditPageAllElementsAreDisplayed() {
        isElementDisplay(merchantUserManagementEditPageName);
        isElementDisplay(merchantUserManagementEditPageSurname);
        isElementDisplay(merchantUserManagementEditPageEmail);
        isElementDisplay(merchantUserManagementEditPagePhone);
        isElementDisplay(merchantUserManagementEditPageStatus);
        isElementDisplay(merchantUserManagementEditPageList);
        isElementDisplay(merchantUserManagementEditPageSendInvitation);
        isElementDisplay(merchantUserManagementEditPageDeleteBloke);
    }

    public void merchantUserManagementPageEditSubmit() {
        click(merchantUserManagementPageEditButton);
        waitBySeconds(2);
    }

    public void merchantUserManagementPageAllElementsAreDisplayed() {
        isElementDisplay(merchantUserManagementPageMerchantList);
        isElementDisplay(merchantUserManagementPageName);
        isElementDisplay(merchantUserManagementPageSurname);
        isElementDisplay(merchantUserManagementPageEmail);
        isElementDisplay(merchantUserManagementPageEditButton);
        isElementDisplay(merchantUserManagementPageSearchButton);
        isElementDisplay(merchantUserManagementPageClearButton);
    }

    public void leftSubMenuMerchantUserManagementSubmit() {
        click(merchantUserManagementPageSubLeftMenuButton);
        waitBySeconds(2);
    }

    public void merchantUserManagementPagePageControlUrl() throws Exception {
        controlUrl("merchant-user-management", "pages.merchantsUserManagementModule");
    }
}
