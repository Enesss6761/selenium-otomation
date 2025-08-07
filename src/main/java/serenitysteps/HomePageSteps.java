package serenitysteps;

import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import pages.HomePage;
public class HomePageSteps {
    @Page
    HomePage homepage;

    @Step("User opens Yemeksepeti HomePage")
    public void userOpensYemeksepetiHomePage() {
        homepage.navigateToHomePage();
    }

    @Step("User accepts cookie if visible")
    public void acceptCookiesIfVisible() {
        homepage.clickAcceptCookies();
    }


    @Step("User see Yemeksepeti Text")
    public void userSeeYemeksepetiText() {
        homepage.isYemeksepetiTextDisplayed();
    }



    @Step("User clicks Login Button")
    public void userClicksLoginButton() {
        homepage.userClicksLoginButton();
    }
    @Step("Verify text in popup: {0}")
    public void verifyTextInPopup(String expectedText) {
        homepage.assertPopupContainsText(expectedText);
    }
    @Step("User sees {0} button in the popup")
    public void assertButtonDisplayed(String buttonText) {
        homepage.assertButtonDisplayed(buttonText);
    }

    @Step("Assert that '{0}' button is displayed")
    public void assertButtonSignDisplayed(String buttonText) {
        homepage.assertButtonSignDisplayed(buttonText);
    }

    @Step("User click  {0} button in the popup")
    public void clickButton(String buttonText) {
        homepage.clickButtonWithText(buttonText);
    }
    @Step("User enters email: {0}")
    public void enterEmail(String email) {
        homepage.enterEmail(email);
    }

    @Step("User clicks continue button")
    public void clickContinueButton() {
        homepage.clickContinueButton();
    }

    @Step("User enters password: {0}")
    public void enterPassword(String password) {
        homepage.enterPassword(password);
    }

    @Step("User clicks on login with password button")
    public void clickLoginWithPasswordButton() {
        homepage.clickLoginWithPasswordButton();
    }
/// /////////////////////////////////////////////////////////////////////
    @Step("User enters postal code: {0}")
    public void enterPostalCode(String postalCode) {
        homepage.enterPostalCode(postalCode);
}
    @Step("User clicks Discover button")
    public void clickDiscoverButton() {
        homepage.clickDiscoverButton();
    }

    @Step("User clicks on a restaurant")
    public void userClicksOnRestaurant() {
        homepage.clickOnRestaurant();
    }

    @Step("User clicks the first product")
    public void clickFirstProduct() {
        homepage.clickFirstProduct();
    }

    @Step("User clicks the Add to Cart button")
    public void clickAddToCartButton() {
        homepage.clickAddToCartButton();
    }
    @Step("User clicks confirm cart button")
    public void userClicksConfirmCartButton() {
        homepage.clickConfirmCartButton();
    }


}
