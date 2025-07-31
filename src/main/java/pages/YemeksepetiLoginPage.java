package pages;

import base.BasePage;
import net.serenitybdd.core.Serenity;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class YemeksepetiLoginPage extends BasePage {

    // XPath'lerdeki fazla parantezleri kaldırdım
    private final By girisYapBtn = By.xpath("//span[contains(text(),'Giriş Yap')][1]");
    private final By emailInput = By.id("email"); // ID kullanmak daha iyi
    private final By passwordInput = By.id("password");
    private final By submitBtn = By.xpath("//span[contains(text(),'Şifre ile giriş yap')]"); // Sonundaki 'E' harfi hataydı

    public void openYemeksepeti() {
        openPageNamed("yemeksepeti_url");
        waitForPageToLoad();
    }

    // Sayfanın yüklendiğinden emin olmak için özel metod
    private void waitForPageToLoad() {
        waitFor(ExpectedConditions.visibilityOfElementLocated(By.tagName("body")));
        Serenity.takeScreenshot(); // Açılış anının screenshot'ı
    }

    public void clickGirisYap() {
        waitAndClick(girisYapBtn);
    }

    public void enterCredentials(String email, String password) {
        type(emailInput, email);
        type(passwordInput, password);
        Serenity.takeScreenshot(); // Bilgiler girildikten sonra screenshot
    }

    public void clickSubmit() {
        waitAndClick(submitBtn);
    }

    public boolean isOnMainPage() {
        return getDriver().getCurrentUrl().contains("yemeksepeti.com"); // .com ekledim
    }

    // Ortak click işlemi için yardımcı metod
    private void waitAndClick(By locator) {
        waitFor(ExpectedConditions.elementToBeClickable(locator)).click();
        Serenity.takeScreenshot(); // Her tıklamada screenshot
    }
}