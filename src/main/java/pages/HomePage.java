package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

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
    By errorMessageLocator = By.xpath("//div[contains(@class, 'input-box')]//div[contains(@class, 'bds-c-btn-circular-cursor')]");
    By googleButton = By.xpath("//div[@class='box-flex welcome-view__button-google pb-sm']");
    By loginIframe = By.xpath("//iframe[@id='gsi_232921_446565']");
    By emailElement = By.xpath("//div[@class='pGzURd']");
    By userAvatar = By.xpath("//div[@data-testid='account-menu']//button[@id='menu-selector']");




    public HomePage navigateToHomePage() {
        openPageNamed("homepage");
        return this;
    }

    public void clickAcceptCookies() {
        if (find(cookieAcceptButton).findElements(cookieAcceptButton).size() > 0) {
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

    public void assertErrorMessageDisplayed(String expectedMessage) {
        String actualMessage = getText(errorMessageLocator);
        assertTrue(actualMessage.contains(expectedMessage),
                "'" + expectedMessage + "' mesajı görünmeli, ama şu çıktı: " + actualMessage);
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
/// ///////////////////////////////////////////////////////
    public void clickGoogleButton() {
        find(googleButton).waitUntilClickable().click();
}
    public void waitAndSwitchToLoginIframe() {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(loginIframe));
    }

    public void clickEmailElement() {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(emailElement));
        element.click();
    }

    public void switchToMainContent() {
        getDriver().switchTo().defaultContent();
    }

    public boolean isLoggedIn() {
        try {
            WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(userAvatar));
            return element.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }



    }








