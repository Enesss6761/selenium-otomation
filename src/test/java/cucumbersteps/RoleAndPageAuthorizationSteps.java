package cucumbersteps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import serenitysteps.RoleAndPageAuthorizationPageSteps;

public class RoleAndPageAuthorizationSteps {
    @Steps
    RoleAndPageAuthorizationPageSteps roleanpageauthorizationpagesteps;

    @And("User click Role and Page Authorization sub left menu")
    public void userClickRoleAndPageAuthorizationSubLeftMenu() {
        roleanpageauthorizationpagesteps.userClickRoleAndPageAuthorizationSubLeftMenu();
    }

    @And("User see Role and Page Authorization Page")
    public void userSeeRoleAndPageAuthorizationPage() throws Exception {
        roleanpageauthorizationpagesteps.userSeeRoleAndPageAuthorizationPage();
    }

    @When("User see all elements in Role and Page Authorization Page")
    public void userSeeAllElementsInRoleAndPageAuthorizationPage() {
        roleanpageauthorizationpagesteps.userSeeAllElementsInRoleAndPageAuthorizationPage();
    }
}
