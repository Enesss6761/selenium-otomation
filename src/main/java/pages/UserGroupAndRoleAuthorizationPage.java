package pages;

import base.BasePage;
import org.openqa.selenium.By;

public class UserGroupAndRoleAuthorizationPage extends BasePage {
    By userGroupAndRoleAuthorizationPageSubLeftMenuButton = By.cssSelector(".MuiCollapse-wrapperInner div:nth-of-type(4) > .MuiButtonBase-root");
    By userGroupAndRoleAuthorizationPageCurrentRolesCheckbox = By.cssSelector(".css-x5js9y > div:nth-of-type(1) .MuiCardHeader-root .PrivateSwitchBase-input");
    By userGroupAndRoleAuthorizationPageCurrentRolesBox = By.cssSelector(".css-x5js9y > div:nth-of-type(1) .MuiList-root");
    By userGroupAndRoleAuthorizationPageSelectedRolesCheckbox = By.cssSelector(".css-x5js9y > div:nth-of-type(3) .MuiCardHeader-root .PrivateSwitchBase-input");
    By userGroupAndRoleAuthorizationPageSelectedRolesBox = By.cssSelector(".css-x5js9y > div:nth-of-type(3) .MuiList-root");
    By userGroupAndRoleAuthorizationPageSelectedRolesRight = By.cssSelector(".css-ivk0aw");
    By userGroupAndRoleAuthorizationPageSelectedRolesLeft = By.cssSelector(".css-tohg4d");
    By userGroupAndRoleAuthorizationPageSaveButton = By.id("submit_button");
    By userGroupAndRoleAuthorizationPageUserGroupList = By.cssSelector("#dropdown-select");

    public void userGroupAndRoleAuthorizationPageAllElementsAreDisplayed() {
        isElementDisplay(userGroupAndRoleAuthorizationPageCurrentRolesCheckbox);
        isElementDisplay(userGroupAndRoleAuthorizationPageCurrentRolesBox);
        isElementDisplay(userGroupAndRoleAuthorizationPageSelectedRolesCheckbox);
        isElementDisplay(userGroupAndRoleAuthorizationPageSelectedRolesBox);
        isElementDisplay(userGroupAndRoleAuthorizationPageSelectedRolesRight);
        isElementDisplay(userGroupAndRoleAuthorizationPageSelectedRolesLeft);
        isElementDisplay(userGroupAndRoleAuthorizationPageSaveButton);
        isElementDisplay(userGroupAndRoleAuthorizationPageUserGroupList);
    }

    public void userGroupAndRoleAuthorizationPageControlUrl() throws Exception {
        controlUrl("group-role", "pages.usergroupandroleauthorization");
    }

    public void leftSubMenuUserGroupAndRoleAuthorizationSubmit() {
        click(userGroupAndRoleAuthorizationPageSubLeftMenuButton);
        waitBySeconds(2);
    }
}
