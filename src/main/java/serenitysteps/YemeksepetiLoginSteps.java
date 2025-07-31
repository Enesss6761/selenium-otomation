package serenitysteps;

import net.thucydides.core.annotations.Step;
import pages.YemeksepetiLoginPage;
import utilities.PropReader;

public class YemeksepetiLoginSteps {

    YemeksepetiLoginPage yemeksepetiLoginPage;

    @Step("Kullanıcı yemeksepeti.com ana sayfasına gider")
    public void openYemeksepeti() {
        yemeksepetiLoginPage.openYemeksepeti();
    }

    @Step("{string} butonuna tıklar")
    public void clickButton(String text) {
        yemeksepetiLoginPage.clickGirisYap();
    }

    @Step("email kutusuna {string} yazar")
    public void enterEmail(String email) {
        yemeksepetiLoginPage.enterCredentials(email, "");
    }

    @Step("şifre kutusuna {string} yazar")
    public void enterPassword(String password) {
        yemeksepetiLoginPage.enterCredentials("", password);
    }

    @Step("giriş butonuna tıklar")
    public void clickSubmit() {
        yemeksepetiLoginPage.clickSubmit();
    }

    @Step("ana sayfa yüklenir")
    public boolean isMainPageDisplayed() {
        return yemeksepetiLoginPage.isOnMainPage();
    }
}