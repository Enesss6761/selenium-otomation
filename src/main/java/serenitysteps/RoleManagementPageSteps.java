package serenitysteps;

import net.thucydides.core.annotations.Step;
import pages.RoleManagementPage;

public class RoleManagementPageSteps {
    RoleManagementPage rolemanagementpage;

    @Step("User click role management sub left menu")
    public void userClickRoleManagementSubLeftMenu() {
        rolemanagementpage.leftSubMenuRoleManagementSubmit();
    }

    @Step("User see Role Management Page")
    public void userSeeRoleManagementPage() throws Exception {
        rolemanagementpage.roleManagementPageControlUrl();
    }

    @Step("User see all elements in Role Management Page")
    public void userSeeAllElementsInRoleManagementPage() {
        rolemanagementpage.roleManagementPageAllElementsAreDisplayed();
    }

    @Step("User click add in Role Management Page")
    public void userClickAddInRoleManagementPage() {
        rolemanagementpage.roleManagementPageAddSubmit();
    }

    @Step("User see Add Role Page")
    public void userSeeAddRolePage() throws Exception {
        rolemanagementpage.roleManagementPageAddRoleControlUrl();
    }

    @Step("User see all elements in Role Add Page")
    public void userSeeAllElementsInRoleAddPage() {
        rolemanagementpage.roleManagementPageAddRoleAllElementsAreDisplayed();
    }
}
