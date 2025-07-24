package pages;

import base.BasePage;
import org.openqa.selenium.By;

public class RoleManagementPage extends BasePage {
    By roleManagementPageSubLeftMenuButton = By.cssSelector(".MuiCollapse-wrapperInner div:nth-of-type(2) > .MuiButtonBase-root");
    By roleManagementPageBulkActions = By.cssSelector("#dropdown-select");
    By roleManagementPageBulkActionsApply = By.cssSelector(".MuiGrid-spacing-xs-2 > div:nth-of-type(2) .MuiButtonBase-root");
    By roleManagementPageSearch = By.cssSelector(".css-1x5jdmq");
    By roleManagementPageSearchButton = By.cssSelector(".MuiGrid-spacing-xs-2 > div:nth-of-type(1) .MuiButtonBase-root");
    By roleManagementPageOrderButton = By.id("button_order");
    By roleManagementPageAddButton = By.cssSelector(".css-9urz1a");
    By roleManagementPagePerPage = By.id("pagination-dropdown_page_size");
    By roleManagementPageTNoRegistrations = By.cssSelector("h3:nth-of-type(2)");
    By roleManagementPageEditButton = By.cssSelector(".MuiIconButton-colorInfo");
    By roleManagementPageDeleteButton = By.cssSelector(".MuiIconButton-colorError");
    By roleManagementPageSelectCheckbox = By.xpath("//th[@class='MuiTableCell-root MuiTableCell-head MuiTableCell-alignLeft MuiTableCell-paddingCheckbox MuiTableCell-sizeMedium css-1sjzrtv']//input[@class='PrivateSwitchBase-input css-1m9pwf3']");
    By roleManagementPageAddRoleDescription = By.cssSelector(".MuiGrid-grid-lg-6 > div:nth-of-type(2) .MuiInputBase-input");
    By roleManagementPageAddRoleName = By.cssSelector(".MuiGrid-grid-lg-6 > div:nth-of-type(1) .MuiInputBase-input");
    By roleManagementPageAddRoleSaveButton = By.id("submit_button");
    By roleManagementPageAddRoleListButton = By.cssSelector(".css-9urz1a");

    public void roleManagementPageAddRoleAllElementsAreDisplayed() {
        isElementDisplay(roleManagementPageAddRoleListButton);
        isElementDisplay(roleManagementPageAddRoleSaveButton);
        isElementDisplay(roleManagementPageAddRoleName);
        isElementDisplay(roleManagementPageAddRoleDescription);
    }

    public void roleManagementPageAllElementsAreDisplayed() {
        isElementDisplay(roleManagementPageBulkActions);
        isElementDisplay(roleManagementPagePerPage);
        isElementDisplay(roleManagementPageTNoRegistrations);
        isElementDisplay(roleManagementPageEditButton);
        isElementDisplay(roleManagementPageDeleteButton);
        isElementDisplay(roleManagementPageSelectCheckbox);
        isElementDisplay(roleManagementPageOrderButton);
        isElementDisplay(roleManagementPageSearchButton);
        isElementDisplay(roleManagementPageSearch);
        isElementDisplay(roleManagementPageBulkActionsApply);
    }

    public void roleManagementPageControlUrl() throws Exception {
        controlUrl("roles", "pages.rolemanagement");
    }

    public void roleManagementPageAddRoleControlUrl() throws Exception {
        controlUrl("create", "pages.rolemanagementaddrole");
    }

    public void leftSubMenuRoleManagementSubmit() {
        click(roleManagementPageSubLeftMenuButton);
        waitBySeconds(2);
    }

    public void roleManagementPageAddSubmit() {
        click(roleManagementPageAddButton);
        waitBySeconds(2);
    }
}
