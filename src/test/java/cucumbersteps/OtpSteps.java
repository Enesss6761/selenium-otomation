package cucumbersteps;

import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import serenitysteps.OtpPageSteps;
import utilities.PropReader;
import java.io.IOException;
public class OtpSteps {
    @Steps
    OtpPageSteps otpPageSteps;
    @When("User verify otp code")
    public void userVerifyotpCode() throws IOException {
        String otpCode = PropReader.getGlobalData("default_otp");
        otpPageSteps.userVerifyOtpCode(otpCode);
    }
}
