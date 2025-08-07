package pages;

import base.BasePage;
import net.thucydides.core.util.EnvironmentVariables;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage extends BasePage {
    By mainPageUserName = By.cssSelector(".MuiTypography-noWrap");
    By mainPageProfilIcon=By.cssSelector("[data-testid='AccountCircleIcon']");
    By mainPageLogout=By.xpath("//div[@class='MuiPaper-root MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation8 MuiPopover-paper MuiMenu-paper MuiMenu-paper css-pwxzbm']/ul/ul/li[2]");
    By mainPageLogoutConfirm=By.xpath("//div[@class='MuiDialogActions-root MuiDialogActions-spacing css-sl509e']/button[2]");
    By profilPageLogoutConfirm = By.cssSelector(".css-1sndhiz .MuiButton-contained");
    By mainPageProfilPage = By.cssSelector("li:nth-of-type(1)");
    By profilPageLogout = By.cssSelector("button:nth-of-type(4)");
    By mainPageDashboardPendingApprovalsShowAll = By.cssSelector(".MuiGrid-grid-lg-7 .MuiButtonBase-root");
    By mainPageDashboardLastLoginAttemptsShowAll = By.cssSelector(".MuiGrid-grid-lg-5 .MuiButtonBase-root");
    public By mainPageDashboardLastLoginAttemptsList = By.cssSelector(".css-1uu02n5");


    public void checkAutomationUserText() {
        String userNameText = getText(mainPageUserName);
        assertTextEquals(userNameText, "YEMEKSEPETİ OTOMASYON");
    }

    public void checkAdminUserText() {
        String userNameText = getText(mainPageUserName);
        assertTextEquals(userNameText, "admin admin");
    }

    public void mainPageProfilIconSubmit() {
        click(mainPageProfilIcon);
    }

    public void mainPageLogoutSubmit() {
        click(mainPageLogout);
    }

    public void mainPageLogoutConfirmSubmit() {
        click(mainPageLogoutConfirm);
    }

    public void welcomePageControlUrl() throws Exception {
        controlUrl("auth","pages.welcome");
        }
    public void mainPageProfilPageButton()  {
        click(mainPageProfilPage);
    }
    public void profilPageLogoutButton()  {
        click(profilPageLogout);
    }
    public void profilPageLogoutConfirmButton()  {
        click(profilPageLogoutConfirm);
    }
    public void mainPageDashboardPendingApprovalsShowAllButton()  {
        click(mainPageDashboardPendingApprovalsShowAll);
    }
    public void pendingApprovalsPageControlUrl() throws Exception {
        controlUrl("pending-jobs","pages.pendingapprovals");
    }
    public void mainPageDashboardLastLoginAttemptsShowAllButton()  {
        click(mainPageDashboardLastLoginAttemptsShowAll);
    }
    public void verifyLastLoginAttemptsListDisplayed() {
        assertTrue(isElementDisplay(mainPageDashboardLastLoginAttemptsList), "Son giriş denemeleri listesi görünmeli");
    }
    }

