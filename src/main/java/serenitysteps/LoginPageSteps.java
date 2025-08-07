package serenitysteps;
import net.thucydides.core.annotations.Steps;
import base.BasePage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import pages.LoginPage;
public class LoginPageSteps {
    @Page
    LoginPage loginPage;
    @Page
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
        loginPage.waitForResendOtpButton();  // Buton tıklanabilir olana kadar bekle
        loginPage.resendSubmit();             // Butona tıkla
    }
    @Step("User see otp timer")
    public void userSeeOtpTimer()  {
        loginPage.verifyOtpTimerIsDisplayed();
    }
}
