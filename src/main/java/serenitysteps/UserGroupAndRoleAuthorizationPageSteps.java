package serenitysteps;

import net.thucydides.core.annotations.Step;
import pages.UserGroupAndRoleAuthorizationPage;

public class UserGroupAndRoleAuthorizationPageSteps {
    UserGroupAndRoleAuthorizationPage usergroupandroleauthorizationpage;

    @Step("User click user group and role authorization sub left menu")
    public void userClickUserGroupAndRoleAuthorizationSubLeftMenu() {
        usergroupandroleauthorizationpage.leftSubMenuUserGroupAndRoleAuthorizationSubmit();
    }

    @Step("User see User Group And Role Authorization Page")
    public void userSeeUserGroupAndRoleAuthorizationPage() throws Exception {
        usergroupandroleauthorizationpage.userGroupAndRoleAuthorizationPageControlUrl();
    }

    @Step("User see all elements in User Group And Role Authorization Page")
    public void userSeeAllElementsInUserGroupAndRoleAuthorizationPage() {
        usergroupandroleauthorizationpage.userGroupAndRoleAuthorizationPageAllElementsAreDisplayed();
    }
}
