package cucumbersteps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import serenitysteps.UserGroupAndRoleAuthorizationPageSteps;

public class UserGroupAndRoleAuthorizationSteps {
    @Steps
    UserGroupAndRoleAuthorizationPageSteps usergroupandroleauthprzation;

    @And("User click user group and role authorization sub left menu")
    public void userClickUserGroupAndRoleAuthorizationSubLeftMenu() {
        usergroupandroleauthprzation.userClickUserGroupAndRoleAuthorizationSubLeftMenu();
    }

    @And("User see User Group And Role Authorization Page")
    public void userSeeUserGroupAndRoleAuthorizationPage() throws Exception {
        usergroupandroleauthprzation.userSeeUserGroupAndRoleAuthorizationPage();
    }

    @When("User see all elements in User Group And Role Authorization Page")
    public void userSeeAllElementsInUserGroupAndRoleAuthorizationPage() {
        usergroupandroleauthprzation.userSeeAllElementsInUserGroupAndRoleAuthorizationPage();
    }
}
