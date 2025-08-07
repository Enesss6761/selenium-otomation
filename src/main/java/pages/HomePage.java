package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {
    By loginButton = By.xpath("//button[contains(@class, 'bds-c-btn-secondary') and contains(@class, 'bds-c-btn--size-small') and .//span[contains(text(),'Giriş Yap')]]");
    By homepagetext = By.xpath("//a[@aria-label='Ana sayfaya git']");
    By popupTextLocator = By.xpath("//span[@class='bds-c-modal__header__title--truncate']");
    By emailInput = By.xpath("//input[@id='email']");
    By continueButton = By.xpath("//button[@type='submit']");
    By passwordInput = By.xpath("//input[@id='password']");
    By loginWithPasswordButton = By.xpath("//button[@type='submit']");
    By firstProductButton = By.xpath("//body/div[@id='reactRoot']/div[@id='vendor-details-root']/main[@aria-busy='false']/div[@class='box-flex p-relative']/section[@id='menu']/div[@class='menu']/div[@id='menu__category-id-5755997']/ul[@class='dish-list-grid']/li[1]/button[1]");
    By addToCartButton = By.xpath("//button[contains(@class,'bds-c-btn bds-c-btn-primary bds-c-btn--size-regular bds-is-idle bds-c-btn--layout-full-width-primary zi-surface-base item-modifier-add-to-cart-button')]");
    By confirmCartButton = By.xpath("//button[contains(@data-testid,'cart-summary-checkout-button')]");
    By cookieAcceptButton = By.xpath("//button[@data-testid='uc-accept-all-button']");



    public HomePage navigateToHomePage() {
        openPageNamed("homepage");
        return this;
    }

    public void clickAcceptCookies() { {
        waitBySeconds(200);
        find(cookieAcceptButton).waitUntilVisible().click();
              }
    }



    public void isYemeksepetiTextDisplayed() {
        assertTrue(isElementDisplay(homepagetext), "Yemeksepeti Text'i görünmeli");

    }




    public void userClicksLoginButton() {
        find(loginButton).waitUntilClickable().click();
        waitBySeconds(1);
    }
    public void assertPopupContainsText(String expectedText) {
        String actualText = getText(popupTextLocator);  // popup metnini al
        assertTrue(actualText.contains(expectedText), "'" + expectedText + "' yazısı popup içinde görünmeli.");
        waitBySeconds(1);
    }


    public void assertButtonDisplayed(String buttonText){
        By dynamicButtonLocator = By.xpath("//button[@class='button full' and normalize-space()='" + buttonText + "']");
        assertTrue(isElementDisplay(dynamicButtonLocator), "'" + buttonText + "' butonu görünmeli.");
        waitBySeconds(1);
    }
    public void assertButtonSignDisplayed(String buttonText){
        By dynamicButtonLocator = By.xpath("//button[contains(text(),'" + buttonText + "')]");
        assertTrue(isElementDisplay(dynamicButtonLocator), "'" + buttonText + "' butonu görünmeli.");
        waitBySeconds(1);
    }

    public void clickButtonWithText(String buttonText) {
        By dynamicButtonLocator = By.xpath("//button[@class='button full' and normalize-space()='" + buttonText + "']");
        find(dynamicButtonLocator).waitUntilClickable().click();
        waitBySeconds(1);
    }
    public void enterEmail(String email) {
        find(emailInput).waitUntilVisible().sendKeys(email);
        waitBySeconds(1);
    }

    public void clickContinueButton() {
        find(continueButton).waitUntilClickable().click();
        waitBySeconds(1);
    }

    public void enterPassword(String password) {
        find(passwordInput).waitUntilVisible().sendKeys(password);
        waitBySeconds(1);
    }


    public void clickLoginWithPasswordButton() {
        find(loginWithPasswordButton).waitUntilClickable().click();
        waitBySeconds(1);
    }
/// //////////////////////////////////////////

public void enterPostalCode(String postalCode) {
    By postalCodeInput = By.xpath("//input[@id='delivery-information-postal-index']");
    WebElement input = find(postalCodeInput);
    input.clear();
    input.sendKeys(postalCode);
}

    public void clickDiscoverButton() {

        By discoverButton = By.xpath("//button[@class='bds-c-btn bds-c-btn-primary bds-c-btn--size-regular bds-is-idle bds-c-btn--layout-full-width-primary zi-surface-base address-form-action-button']");
        click(discoverButton); // ya da driver.findElement(discoverButton).click();
    }

    public void clickOnRestaurant() {
        By restaurantLocator = By.xpath("//div[@class='organic-list']//li[1]//a[1]");
        getDriver().findElement(restaurantLocator).click();
    }

    public void clickFirstProduct() {
        find(firstProductButton).waitUntilClickable().click();
    }
    public void clickAddToCartButton() {
        find(addToCartButton).waitUntilClickable().click();
    }

    public void clickConfirmCartButton() {
        find(confirmCartButton).waitUntilClickable().click();
    }


    }








