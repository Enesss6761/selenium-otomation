package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    By emailEntry = By.id("email-input");
    By passwordEntry = By.id("password-input");
    By loginButton = By.id("otp-button");
    By resendOtpButton = By.id("resend-otp-button");
    By otpTimer = By.id("otp-timer");



    public void enterEmail(String email) {
        type(emailEntry, email);
    }

    public void enterPassword(String password) {
        type(passwordEntry, password);
    }

    public void loginSubmit() {
        click(loginButton);
    }

    public void resendSubmit() {
        waitForElementToBeClickable(resendOtpButton);
        click(resendOtpButton);
    }

    public void verifyOtpTimerIsDisplayed() {
        assertTrue(isElementDisplay(otpTimer), "OTP timer görünmeli");
    }

    public void waitForResendOtpButton() {
        find(resendOtpButton).waitUntilClickable();
    }
}
