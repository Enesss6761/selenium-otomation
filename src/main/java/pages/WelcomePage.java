package pages;

import base.BasePage;
import org.openqa.selenium.By;

public class WelcomePage extends BasePage {
    By welcomeButton = By.xpath("//button[@login_button='Welcome']");

    public WelcomePage navigateToWelcomePage() {
        openPageNamed("welcome");
        return this;
    }

    public void isWelcomeButtonDisplayed() {
        isElementDisplay(welcomeButton);
    }

    public void welcomeSubmit() {
        click(welcomeButton);
        waitBySeconds(1);
    }
}



