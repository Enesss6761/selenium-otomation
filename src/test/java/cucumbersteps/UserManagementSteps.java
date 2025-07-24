package cucumbersteps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import serenitysteps.UserManagementPageSteps;

public class UserManagementSteps {
    @Steps
    UserManagementPageSteps usermanagementpagesteps;

    @And("User click user management sub left menu")
    public void userClickUserManagementSubLeftMenu() {
        usermanagementpagesteps.userClickUserManagementSubLeftMenu();

    }

    @And("User see user Management Page")
    public void userSeeUserManagementPage() throws Exception {
        usermanagementpagesteps.userSeeUserManagementPage();
    }

    @When("User see all elements in User Management Page")
    public void userSeeAllElementsInUserManagementPage() {
        usermanagementpagesteps.userSeeAllElementsInUserManagementPage();
    }

    @And("User click add in User Management Page")
    public void userClickAddInUserManagementPage() {
        usermanagementpagesteps.userClickAddInUserManagementPage();
    }

    @When("User see Add User Page")
    public void userSeeAddUserPage() throws Exception {
        usermanagementpagesteps.userSeeAddUserPage();
    }

    @Then("User see all elements in User Add Page")
    public void userSeeAllElementsInUserAddPage() {
        usermanagementpagesteps.userSeeAllElementsInUserAddPage();
    }
}
