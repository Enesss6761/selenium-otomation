package serenitysteps;

import net.thucydides.core.annotations.Step;
import pages.WelcomePage;
public class WelcomePageSteps {
    WelcomePage welcomePage;

    @Step("User opens Yemekpay BO Url")
    public void userOpensYemekpayBOUrl() {
        welcomePage.navigateToWelcomePage();
    }

    @Step("User see welcome button")
    public void userSeeWelcomeButton() {
        welcomePage.isWelcomeButtonDisplayed();
    }

    @Step("User click welcome button")
    public void userClickWelcomeButton() {
        welcomePage.welcomeSubmit();
    }
}
