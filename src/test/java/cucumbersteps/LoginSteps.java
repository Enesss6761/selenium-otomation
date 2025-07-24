package cucumbersteps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import serenitysteps.LoginPageSteps;
import utilities.PropReader;

import java.io.IOException;
public class LoginSteps {
    @Steps
    LoginPageSteps loginpagesteps;

    @When("User logins from homepage")
    public void userLoginsFromHomepage() throws IOException {
        String mailAddress = PropReader.getGlobalData("default_mailAddress");
        String password = PropReader.getGlobalData("default_password");
        loginpagesteps.userLoginsFromHomepage(mailAddress, password);
    }

    @When("User logins from homepage with Admin")
    public void userLoginsFromHomepageWithAdmin() throws IOException {
        String mailAddress = PropReader.getGlobalData("default_AdminMailAddress");
        String password = PropReader.getGlobalData("default_adminPassword");
        loginpagesteps.userLoginsFromHomepage(mailAddress, password);
    }

    @When("User click resend otp button")
    public void userClickResendOtpButton() {
        loginpagesteps.userClickResendOtpButton();
    }

    @Then("User see otp timer")
    public void userSeeOtpTimer() {
        loginpagesteps.userSeeOtpTimer();
    }
}
