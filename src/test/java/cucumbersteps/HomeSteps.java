package cucumbersteps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import serenitysteps.HomePageSteps;
public class HomeSteps {
    @Steps
    HomePageSteps homePageSteps;


    @Given("User opens Yemeksepeti URL")
    public void userOpensYemeksepetiURL() {
        homePageSteps.userOpensYemeksepetiHomePage();

    }
    @And("User accepts cookie if visible")
    public void userAcceptsCookieIfVisible() {
        homePageSteps.acceptCookiesIfVisible();
    }

    @And("User see Yemeksepeti Text")
    public void userSeeYemeksepetiText() {
        homePageSteps.userSeeYemeksepetiText();
    }


    @When("User clicks Login Button")
    public void userClicksLoginButton() {
        homePageSteps.userClicksLoginButton();
    }
    @Then("User sees {string} Text Popup")
    public void userSeesTextPopup(String expectedText) {
        homePageSteps.verifyTextInPopup(expectedText);
    }

    @And("User sees {string} Button Popup")
    public void userSeesButtonPopup(String buttonText) {
        homePageSteps.assertButtonDisplayed(buttonText);
    }

    @And("User sees {string} Button Pop")
    public void userSeesButtonPop(String buttonText) {
        homePageSteps.assertButtonSignDisplayed(buttonText);
    }
    @And("User click {string} Button Popup")
    public void userClickButtonPopup(String buttonText) {
        homePageSteps.clickButton(buttonText);
    }
    @And("User enters email as {string}")
    public void userEntersEmail(String email) {
        homePageSteps.enterEmail(email);
    }

    @And("User clicks continue button")
    public void userClicksContinueButton() {
        homePageSteps.clickContinueButton();
    }

    @And("User enters password {string}")
    public void userEntersPassword(String password) {
        homePageSteps.enterPassword(password);
    }

    @And("User clicks on login with password button")
    public void userClicksOnLoginWithPasswordButton() {
        homePageSteps.clickLoginWithPasswordButton();
    }

    @Then("User sees error message {string}")
    public void userSeesErrorMessage(String expectedMessage) {
        homePageSteps.verifyErrorMessageDisplayed(expectedMessage);
    }
//adres alma

    @Then("User enters postal code {string}")
    public void userEntersPostalCode(String postalCode) {
        homePageSteps.enterPostalCode(postalCode);
    }

    @Then("User clicks Discover button")
    public void user_clicks_discover_button() {
        homePageSteps.clickDiscoverButton();
    }
    @Then("User clicks on a restaurant")
    public void user_clicks_on_a_restaurant() {
        homePageSteps.userClicksOnRestaurant();
    }


    @Then("User clicks the first product")
    public void userClicksTheFirstProduct() {
        homePageSteps.clickFirstProduct();
    }

    @And("User clicks Add to Cart button")
    public void userClicksAddToCartButton() {
        homePageSteps.clickAddToCartButton();
    }
    @And("User clicks confirm cart button")
    public void userClicksConfirmCartButton() {
        homePageSteps.userClicksConfirmCartButton();
    }
/// //////////////////////////////////////////////
    @And("User clicks Google button")
     public void userClicksGoogleButton() {
        homePageSteps.userClicksGoogleButton();
}
    @When("the user selects an account from the login iframe")
    public void user_selects_account_from_iframe() {
        homePageSteps.selectAccountInIframe();
    }
    @Then("the user is logged in successfully")
    public void user_is_logged_in_successfully() {
        if (!homePageSteps.isLoggedIn()) {
            throw new AssertionError("Login başarısız!");
        }
    }


}
