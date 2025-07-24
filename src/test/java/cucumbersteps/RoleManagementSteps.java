package cucumbersteps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import serenitysteps.RoleManagementPageSteps;

public class RoleManagementSteps {
    @Steps
    RoleManagementPageSteps rolemanagementpagesteps;

    @And("User click role management sub left menu")
    public void userClickRoleManagementSubLeftMenu() {
        rolemanagementpagesteps.userClickRoleManagementSubLeftMenu();
    }

    @And("User see Role Management Page")
    public void userSeeRoleManagementPage() throws Exception {
        rolemanagementpagesteps.userSeeRoleManagementPage();
    }

    @When("User see all elements in Role Management Page")
    public void userSeeAllElementsInRoleManagementPage() {
        rolemanagementpagesteps.userSeeAllElementsInRoleManagementPage();
    }

    @And("User click add in Role Management Page")
    public void userClickAddInRoleManagementPage() {
        rolemanagementpagesteps.userClickAddInRoleManagementPage();
    }

    @When("User see Add Role Page")
    public void userSeeAddRolePage() throws Exception {
        rolemanagementpagesteps.userSeeAddRolePage();
    }

    @Then("User see all elements in Role Add Page")
    public void userSeeAllElementsInRoleAddPage() {
        rolemanagementpagesteps.userSeeAllElementsInRoleAddPage();
    }
}
