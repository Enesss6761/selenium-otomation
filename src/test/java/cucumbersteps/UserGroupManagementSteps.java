package cucumbersteps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import serenitysteps.UserGroupManagementPageSteps;

public class UserGroupManagementSteps {
    @Steps
    UserGroupManagementPageSteps usergroupmanagementpagesteps;

    @And("User click user group management sub left menu")
    public void userClickUserGroupManagementSubLeftMenu() {
        usergroupmanagementpagesteps.userClickUserGroupManagementSubLeftMenu();
    }

    @And("User see User Group Management Page")
    public void userSeeUserGroupManagementPage() throws Exception {
        usergroupmanagementpagesteps.userSeeUserGroupManagementPage();
    }

    @When("User see all elements in User Group Management Page")
    public void userSeeAllElementsInUserGroupManagementPage() {
        usergroupmanagementpagesteps.userSeeAllElementsInUserGroupManagementPage();
    }

    @And("User click add in User Group Management Page")
    public void userClickAddInUserGroupManagementPage() {
        usergroupmanagementpagesteps.userClickAddInUserGroupManagementPage();
    }

    @When("User see Add User Group Page")
    public void userSeeAddUserGroupPage() throws Exception {
        usergroupmanagementpagesteps.userSeeAddUserGroupPage();
    }

    @Then("User see all elements in User Group Add Page")
    public void userSeeAllElementsInUserGroupAddPage() {
        usergroupmanagementpagesteps.userSeeAllElementsInUserGroupAddPage();
    }
}
