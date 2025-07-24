package pages;

import base.BasePage;
import org.openqa.selenium.By;

public class UserManagementPage extends BasePage {
    By userManagementPageSubLeftMenuButton = By.cssSelector(".MuiPaper-elevation0 > ul:nth-of-type(1) > div:nth-of-type(2) ul:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(1)");
    By userManagementPageBulkActions = By.cssSelector("#dropdown-select");
    By userManagementPageBulkActionsApply = By.cssSelector(".css-7aty7k > div:nth-of-type(1) #submit_button");
    By userManagementPageStatus = By.id("userStatusDropdown");
    By userManagementPageStatusApply = By.cssSelector(".css-7aty7k > div:nth-of-type(2) #submit_button");
    By userManagementPageSearch = By.cssSelector(".css-1x5jdmq");
    By userManagementPageSearchButton = By.id("search_button");
    By userManagementPageExport = By.xpath("//div[@id='export_dropdown']");
    By userManagementPageExportsButton = By.cssSelector("#export_dropdown.MuiButtonBase-root");
    By userManagementPageOrderButton = By.id("button_order");
    By userManagementPageAddButton = By.cssSelector(".css-9urz1a");
    By userManagementPagePerPage = By.id("pagination-dropdown_page_size");
    By userManagementPageTNoRegistrations = By.cssSelector("h3:nth-of-type(2)");
    By userManagementPageEditButton = By.cssSelector(".MuiTableBody-root > tr:nth-of-type(1) .MuiIconButton-colorInfo");
    By userManagementPageDeleteButton = By.cssSelector(".MuiTableBody-root > tr:nth-of-type(1) .MuiIconButton-colorError");
    By userManagementPageDetailButton = By.cssSelector(".MuiTableBody-root > tr:nth-of-type(1) .MuiIconButton-colorSuccess");
    By userManagementPageSelectCheckbox = By.xpath("//th[@class='MuiTableCell-root MuiTableCell-head MuiTableCell-alignLeft MuiTableCell-paddingCheckbox MuiTableCell-sizeMedium css-1sjzrtv']//input[@class='PrivateSwitchBase-input css-1m9pwf3']");
    By userManagementPageAddUserName = By.cssSelector("[name='firstname']");
    By userManagementPageAddUserPhoneNumber = By.cssSelector("#phone_input");

    By userManagementPageAddUserSurname = By.cssSelector("[name='lastname']");

    By userManagementPageAddUserEMail = By.cssSelector("#email_input");

    By userManagementPageAddUserLanguage = By.xpath("//div[@class='MuiGrid-root MuiGrid-container MuiGrid-item MuiGrid-spacing-xs-4 MuiGrid-grid-xs-12 css-8mrq4o']/div[6]//div[@id='dropdown-select']");

    By userManagementPageAddUserUserGroup = By.cssSelector("#demo-multiple-checkbox");

    By userManagementPageAddUserUserType = By.xpath("//div[@class='MuiGrid-root MuiGrid-container MuiGrid-item MuiGrid-spacing-xs-4 MuiGrid-grid-xs-12 css-8mrq4o']/div[8]//div[@id='dropdown-select']");

    By userManagementPageAddUserCancelButton = By.id("back_button");

    By userManagementPageAddUserSaveButton = By.id("submit_button");

    By userManagementPageAddUserListButton = By.cssSelector(".css-9urz1a");


    public void userManagementPageAddUserAllElementsAreDisplayed() {
        isElementDisplay(userManagementPageAddUserName);
        isElementDisplay(userManagementPageAddUserPhoneNumber);
        isElementDisplay(userManagementPageAddUserSurname);
        isElementDisplay(userManagementPageAddUserEMail);
        isElementDisplay(userManagementPageAddUserLanguage);
        isElementDisplay(userManagementPageAddUserUserGroup);
        isElementDisplay(userManagementPageAddUserUserType);
        isElementDisplay(userManagementPageAddUserCancelButton);
        isElementDisplay(userManagementPageAddUserSaveButton);
        isElementDisplay(userManagementPageAddUserListButton);
    }

    public void userManagementPageAllElementsAreDisplayed() {
        isElementDisplay(userManagementPageBulkActions);
        isElementDisplay(userManagementPageBulkActionsApply);
        isElementDisplay(userManagementPageStatus);
        isElementDisplay(userManagementPageStatusApply);
        isElementDisplay(userManagementPageSearch);
        isElementDisplay(userManagementPageSearchButton);
        isElementDisplay(userManagementPageExport);
        isElementDisplay(userManagementPageExportsButton);
        isElementDisplay(userManagementPageOrderButton);
        isElementDisplay(userManagementPagePerPage);
        isElementDisplay(userManagementPageTNoRegistrations);
        isElementDisplay(userManagementPageEditButton);
        isElementDisplay(userManagementPageDeleteButton);
        isElementDisplay(userManagementPageDetailButton);
        isElementDisplay(userManagementPageSelectCheckbox);
    }

    public void userManagementPageControlUrl() throws Exception {
        controlUrl("users", "pages.usermanagement");
    }

    public void userManagementPageAddUserControlUrl() throws Exception {
        controlUrl("create", "pages.usermanagementadduser");
    }

    public void leftSubMenuUserManagementSubmit() {
        click(userManagementPageSubLeftMenuButton);
        waitBySeconds(2);
    }

    public void userManagementPageAddSubmit() {
        click(userManagementPageAddButton);
        waitBySeconds(2);
    }
}
