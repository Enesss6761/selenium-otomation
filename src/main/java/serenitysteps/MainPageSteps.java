package serenitysteps;

import base.BasePage;
import net.thucydides.core.annotations.Step;
import pages.MainPage;
import pages.WelcomePage;
public class MainPageSteps {
    MainPage mainPage;
    BasePage basePage;
    WelcomePage welcomePage;

    @Step("User welcome to MainPage")
    public void userWelcomeToMainPage() {
        basePage.waitBySeconds(2);
        mainPage.checkAutomationUserText();
        basePage.waitBySeconds(2);
    }

    @Step("User welcome to MainPage with admin")
    public void userWelcomeToMainPageWithAdmin() {
        mainPage.checkAdminUserText();
        basePage.waitBySeconds(2);
    }

    @Step("User click mainpage profile icon")
    public void userClickMainpageProfileIcon() {
        mainPage.mainPageProfilIconSubmit();
        basePage.waitBySeconds(1);
    }

    @Step("User click mainpage logout button")
    public void userClickMainpageLogutButton() {
        mainPage.mainPageLogoutSubmit();
        basePage.waitBySeconds(1);
    }
    @Step("User click mainpage logout confirm button")
    public void userClickMainpageLogoutConfirmButton() {
            mainPage.mainPageLogoutConfirmSubmit();
            basePage.waitBySeconds(1);
    }
    @Step("User see welcome page")
    public void userSeeWelcomePage() throws Exception {
            mainPage.welcomePageControlUrl();
    }
    @Step("User click profilpage button")
    public void userClickProfilPageButton() {
            mainPage.mainPageProfilPageButton();
    }
    @Step("User click profilpage logout button")
    public void userClickProfilpageLogoutButton() {
            mainPage.profilPageLogoutButton();
    }
    @Step("User click profilpage logout confirm button")
    public void userClickProfilpageLogoutConfirmButton() {
            mainPage.profilPageLogoutConfirmButton();
    }
    @Step("User click pending approvals show all button on Dashboard")
    public void userClickPendingApprovalsShowAllButtonOnDashboard() {
            mainPage.mainPageDashboardPendingApprovalsShowAllButton();
    }
    @Step("User see pending approvals page")
    public void userSeePendingApprovalsPage() throws Exception {
            mainPage.pendingApprovalsPageControlUrl();
    }
    @Step("User click last login attempts show all button on Dashboard")
    public void userClickLastLoginAttemptsShowAllButtonOnDashboard() {
            mainPage.mainPageDashboardLastLoginAttemptsShowAllButton();
    }
    @Step("User see last login attempts list")
    public void userSeeLastLoginAttemptsList() {
            mainPage.mainPageDashboardLastLoginAttemptsList();
    }
}




