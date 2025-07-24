package cucumbersteps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import net.thucydides.core.annotations.Steps;
import serenitysteps.WelcomePageSteps;
public class WelcomeSteps {
    @Steps
    WelcomePageSteps welcomePageSteps;

    @Given("User opens Yemekpay BO Url")
    public void userOpensYemekpayBOUrl() {
        welcomePageSteps.userOpensYemekpayBOUrl();
    }

    @And("User see welcome button")
    public void userSeeWelcomeButton() {
        welcomePageSteps.userSeeWelcomeButton();
    }

    @And("User click welcome button")
    public void userClickWelcomeButton() {
        welcomePageSteps.userClickWelcomeButton();
    }
}
