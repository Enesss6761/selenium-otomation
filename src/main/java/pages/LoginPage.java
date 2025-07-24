package pages;

import base.BasePage;
import org.openqa.selenium.By;

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
        click(resendOtpButton);
    }

    public void otpTimerIsDisplay() {
        isElementDisplay(otpTimer);
    }
}

