package serenitysteps;

import base.BasePage;
import net.thucydides.core.annotations.Step;
import pages.OtpPage;
public class OtpPageSteps {
    OtpPage otpPage;
    BasePage basePage;
    @Step("User verify otp code")
    public void userVerifyOtpCode(String otp) {
        basePage.waitBySeconds(2);
        otpPage.enterOtp(otp);
        basePage.waitBySeconds(2);
        otpPage.clickOtpVerifyButton();
        basePage.waitBySeconds(2);
    }
}
