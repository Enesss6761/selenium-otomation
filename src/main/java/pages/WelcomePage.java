package pages;

import base.BasePage;
import org.openqa.selenium.By;

public class WelcomePage extends BasePage {
    By welcomeButton = By.id("login_button");

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



