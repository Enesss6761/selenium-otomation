package pages;

import base.BasePage;
import org.openqa.selenium.By;

public class OtpPage extends BasePage {
    By otpEntry = By.id("otp-input");
    By otpVerifyButton = By.id("sign-in-button");
    By otpResendButton = By.id("resend-otp-button");

    public void enterOtp(String email) {
        type(otpEntry, email);
    }

    public void clickOtpVerifyButton() {
        click(otpVerifyButton);
    }

    public void clickOtpResendButton() {
        click(otpResendButton);
    }
}
