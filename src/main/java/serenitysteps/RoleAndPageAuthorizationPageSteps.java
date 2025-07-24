package serenitysteps;

import net.thucydides.core.annotations.Step;
import pages.RoleAndPageAuthorizationPage;

public class RoleAndPageAuthorizationPageSteps {
    RoleAndPageAuthorizationPage roleandpageauthorizationpage;

    @Step("User click Role and Page Authorization sub left menu")
    public void userClickRoleAndPageAuthorizationSubLeftMenu() {
        roleandpageauthorizationpage.leftSubMenuRoleAndPageAuthorizationSubmit();
    }

    @Step("User see Role and Page Authorization Page")
    public void userSeeRoleAndPageAuthorizationPage() throws Exception {
        roleandpageauthorizationpage.roleAndPageAuthorizationPageControlUrl();
    }

    @Step("User see all elements in Role and Page Authorization Page")
    public void userSeeAllElementsInRoleAndPageAuthorizationPage() {
        roleandpageauthorizationpage.roleAndPageAuthorizationPageAllElementsAreDisplayed();
    }
}
