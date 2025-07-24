package pages;

import base.BasePage;
import org.openqa.selenium.By;

public class UserGroupManagementPage extends BasePage {
    By userGroupManagementPageSubLeftMenuButton = By.cssSelector(".MuiPaper-elevation0 > ul:nth-of-type(1) > div:nth-of-type(2) div:nth-of-type(3) > div:nth-of-type(1)");
    By userGroupManagementPageBulkActions = By.cssSelector("#dropdown-select");
    By userGroupManagementPageBulkActionsApply = By.cssSelector(".MuiGrid-spacing-xs-2 > div:nth-of-type(2) .MuiButtonBase-root");
    By userGroupManagementPageSearch = By.cssSelector(".css-1x5jdmq");
    By userGroupManagementPageSearchButton = By.cssSelector(".MuiGrid-spacing-xs-2 > div:nth-of-type(1) .MuiButtonBase-root");
    By userGroupManagementPageOrderButton = By.id("button_order");
    By userGroupManagementPageAddButton = By.cssSelector(".css-9urz1a");
    By userGroupManagementPagePerPage = By.id("pagination-dropdown_page_size");
    By userGroupManagementPageTNoRegistrations = By.cssSelector("h3:nth-of-type(2)");
    By userGroupManagementPageEditButton = By.cssSelector(".MuiIconButton-colorInfo");
    By userGroupManagementPageDeleteButton = By.cssSelector(".MuiIconButton-colorError");
    By userGroupManagementPageDetailButton = By.cssSelector(".MuiIconButton-colorSuccess");
    By userGroupManagementPageSelectCheckbox = By.xpath("//th[@class='MuiTableCell-root MuiTableCell-head MuiTableCell-alignLeft MuiTableCell-paddingCheckbox MuiTableCell-sizeMedium css-1sjzrtv']//input[@class='PrivateSwitchBase-input css-1m9pwf3']");
    By userGroupManagementPageAddUserGroupDescription = By.cssSelector(".MuiGrid-grid-lg-6 > div:nth-of-type(2) .MuiInputBase-input");
    By userGroupManagementPageAddUserGroupGroupName = By.cssSelector(".MuiGrid-grid-lg-6 > div:nth-of-type(1) .MuiInputBase-input");
    By userGroupManagementPageAddUserGroupSaveButton = By.id("submit_button");
    By userGroupManagementPageAddUserGroupCancelButton = By.id("back_button");
    By userGroupManagementPageAddUserGroupListButton = By.cssSelector(".css-9urz1a");
    By userGroupManagementPageAddUserGroupCurrentUsersCheckbox = By.cssSelector(".css-8h776z > div:nth-of-type(1) .MuiCardHeader-root .PrivateSwitchBase-input");
    By userGroupManagementPageAddUserGroupCurrentUsersBox = By.cssSelector(".css-8h776z > div:nth-of-type(1)");
    By userGroupManagementPageAddUserGroupSelectedUsersCheckbox = By.cssSelector(".css-8h776z > div:nth-of-type(3) .MuiCardHeader-avatar");
    By userGroupManagementPageAddUserGroupSelectedUsersBox = By.cssSelector(".css-8h776z > div:nth-of-type(3)");
    By userGroupManagementPageAddUserGroupSelectedUsersRight = By.cssSelector(".css-ivk0aw");
    By userGroupManagementPageAddUserGroupSelectedUsersLeft = By.cssSelector(".css-tohg4d");

    public void userGroupManagementPageAddUserGroupAllElementsAreDisplayed() {
        isElementDisplay(userGroupManagementPageAddUserGroupSelectedUsersLeft);
        isElementDisplay(userGroupManagementPageAddUserGroupSelectedUsersRight);
        isElementDisplay(userGroupManagementPageAddUserGroupSelectedUsersBox);
        isElementDisplay(userGroupManagementPageAddUserGroupSelectedUsersCheckbox);
        isElementDisplay(userGroupManagementPageAddUserGroupCurrentUsersBox);
        isElementDisplay(userGroupManagementPageAddUserGroupCurrentUsersCheckbox);
        isElementDisplay(userGroupManagementPageAddUserGroupListButton);
        isElementDisplay(userGroupManagementPageAddUserGroupCancelButton);
        isElementDisplay(userGroupManagementPageAddUserGroupSaveButton);
        isElementDisplay(userGroupManagementPageAddUserGroupGroupName);
        isElementDisplay(userGroupManagementPageAddUserGroupDescription);

    }

    public void userGroupManagementPageAllElementsAreDisplayed() {
        isElementDisplay(userGroupManagementPageSelectCheckbox);
        isElementDisplay(userGroupManagementPageDetailButton);
        isElementDisplay(userGroupManagementPageDeleteButton);
        isElementDisplay(userGroupManagementPageEditButton);
        isElementDisplay(userGroupManagementPageTNoRegistrations);
        isElementDisplay(userGroupManagementPagePerPage);
        isElementDisplay(userGroupManagementPageOrderButton);
        isElementDisplay(userGroupManagementPageSearchButton);
        isElementDisplay(userGroupManagementPageSearch);
        isElementDisplay(userGroupManagementPageBulkActionsApply);
        isElementDisplay(userGroupManagementPageBulkActions);
    }

    public void userGroupManagementPageControlUrl() throws Exception {
        controlUrl("user-group", "pages.usergroupmanagement");
    }

    public void userGroupManagementPageAddUserGroupControlUrl() throws Exception {
        controlUrl("create", "pages.usergroupmanagementaddusergroup");
    }

    public void leftSubMenuUserGroupManagementSubmit() {
        click(userGroupManagementPageSubLeftMenuButton);
        waitBySeconds(2);
    }

    public void userGroupManagementPageAddSubmit() {
        click(userGroupManagementPageAddButton);
        waitBySeconds(2);
    }
}
