package serenitysteps;

import net.thucydides.core.annotations.Step;
import pages.UserManagementPage;

public class UserManagementPageSteps {
    UserManagementPage usermanagementpage;

    @Step("User click user management sub left menu")
    public void userClickUserManagementSubLeftMenu() {
        usermanagementpage.leftSubMenuUserManagementSubmit();
    }

    @Step("User see user Management Page")
    public void userSeeUserManagementPage() throws Exception {
        usermanagementpage.userManagementPageControlUrl();
    }

    @Step("User see all elements in User Management Page")
    public void userSeeAllElementsInUserManagementPage() {
        usermanagementpage.userManagementPageAllElementsAreDisplayed();
    }

    @Step("User click add in User Management Page")
    public void userClickAddInUserManagementPage() {
        usermanagementpage.userManagementPageAddSubmit();
    }

    @Step("User see Add User Page")
    public void userSeeAddUserPage() throws Exception {
        usermanagementpage.userManagementPageAddUserControlUrl();
    }

    @Step("User see all elements in User Add Page")
    public void userSeeAllElementsInUserAddPage() {
        usermanagementpage.userManagementPageAddUserAllElementsAreDisplayed();
    }
}
