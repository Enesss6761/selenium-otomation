package cucumbersteps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import serenitysteps.MainPageSteps;
public class MainSteps {
    @Steps
    MainPageSteps mainpagesteps;

    @And("User welcome to MainPage")
    public void userWelcomeToMainPage() {
        mainpagesteps.userWelcomeToMainPage();
    }

    @And("User welcome to MainPage with admin")
    public void userWelcomeToMainPageWithAdmin() {
        mainpagesteps.userWelcomeToMainPageWithAdmin();
    }

    @And("User click mainpage profile icon")
    public void userClickMainpageProfileIcon() {
        mainpagesteps.userClickMainpageProfileIcon();
    }

    @And("User click mainpage logout button")
    public void userClickMainpageLogutButton() {
        mainpagesteps.userClickMainpageLogutButton();
    }

    @When("User click mainpage logout confirm button")
    public void userClickMainpageLogoutConfirmButton() {
        mainpagesteps.userClickMainpageLogoutConfirmButton();
    }
    @Then("User see welcome page")
    public void userSeeWelcomePage() throws Exception  {
        mainpagesteps.userSeeWelcomePage();
    }
    @When("User click profilpage button")
    public void userClickProfilPageButton() {
        mainpagesteps.userClickProfilPageButton();
    }
    @And("User click profilpage logout button")
    public void userClickProfilpageLogoutButton() {
        mainpagesteps.userClickProfilpageLogoutButton();
    }
    @When("User click profilpage logout confirm button")
    public void userClickProfilpageLogoutConfirmButton() {
        mainpagesteps.userClickProfilpageLogoutConfirmButton();
    }
    @When("User click pending approvals show all button on Dashboard")
    public void userClickPendingApprovalsShowAllButtonOnDashboard() {
        mainpagesteps.userClickPendingApprovalsShowAllButtonOnDashboard();
    }
    @Then("User see pending approvals page")
    public void userSeePendingApprovalsPage() throws Exception {
        mainpagesteps.userSeePendingApprovalsPage();
    }
    @When("User click last login attempts show all button on Dashboard")
    public void userClickLastLoginAttemptsShowAllButtonOnDashboard() {
        mainpagesteps.userClickLastLoginAttemptsShowAllButtonOnDashboard();
    }
    @Then("User see last login attempts list")
    public void userSeeLastLoginAttemptsList() {
        mainpagesteps.userSeeLastLoginAttemptsList();
    }
}

