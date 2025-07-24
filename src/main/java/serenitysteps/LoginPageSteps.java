package serenitysteps;

import base.BasePage;
import net.thucydides.core.annotations.Step;
import pages.LoginPage;
public class LoginPageSteps {
    LoginPage loginPage;
    BasePage basePage;

    @Step("User logins from homepage")
    public void userLoginsFromHomepage(String email, String password) {
        loginPage.enterEmail(email);
        basePage.waitBySeconds(2);
        loginPage.enterPassword(password);
        basePage.waitBySeconds(2);
        loginPage.loginSubmit();
    }

    @Step("User logins from homepage with Admin")
    public void userLoginsFromHomepageWithAdmin(String email, String password) {
        loginPage.enterEmail(email);
        basePage.waitBySeconds(2);
        loginPage.enterPassword(password);
        basePage.waitBySeconds(2);
        loginPage.loginSubmit();
    }

    @Step("User click resend otp button")
    public void userClickResendOtpButton() {
        basePage.waitBySeconds(60);
        loginPage.resendSubmit();
        basePage.waitBySeconds(2);
    }
    @Step("User see otp timer")
    public void userSeeOtpTimer()  {
        loginPage.otpTimerIsDisplay();
    }
}
