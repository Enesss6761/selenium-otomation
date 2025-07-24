package serenitysteps;

import net.thucydides.core.annotations.Step;
import pages.UserGroupManagementPage;

public class UserGroupManagementPageSteps {
    UserGroupManagementPage usergroupmanagementpage;

    @Step("User click user group management sub left menu")
    public void userClickUserGroupManagementSubLeftMenu() {
        usergroupmanagementpage.leftSubMenuUserGroupManagementSubmit();
    }

    @Step("User see User Group Management Page")
    public void userSeeUserGroupManagementPage() throws Exception {
        usergroupmanagementpage.userGroupManagementPageControlUrl();
    }

    @Step("User see all elements in User Group Management Page")
    public void userSeeAllElementsInUserGroupManagementPage() {
        usergroupmanagementpage.userGroupManagementPageAllElementsAreDisplayed();
    }

    @Step("User click add in User Group Management Page")
    public void userClickAddInUserGroupManagementPage() {
        usergroupmanagementpage.userGroupManagementPageAddSubmit();
    }

    @Step("User see Add User Group Page")
    public void userSeeAddUserGroupPage() throws Exception {
        usergroupmanagementpage.userGroupManagementPageAddUserGroupControlUrl();
    }

    @Step("User see all elements in User Group Add Page")
    public void userSeeAllElementsInUserGroupAddPage() {
        usergroupmanagementpage.userGroupManagementPageAddUserGroupAllElementsAreDisplayed();
    }
}
