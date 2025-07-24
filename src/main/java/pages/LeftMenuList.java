package pages;

import base.BasePage;
import org.openqa.selenium.By;

public class LeftMenuList extends BasePage {
    By management = By.xpath("//div[@class='MuiPaper-root MuiPaper-elevation MuiPaper-elevation0 MuiDrawer-paper MuiDrawer-paperAnchorLeft MuiDrawer-paperAnchorDockedLeft css-1l8j5k8']//div[@class='MuiBox-root css-vuyiw1']/div[.='Yönetim']");
    By merchantsManagement = By.xpath("//ul[@class='MuiList-root MuiList-padding css-1ontqvh']/div[@class='MuiBox-root css-vuyiw1']/div[.='Üye İşyeri Yönetimi']");
    By dashboard = By.xpath("//div[@class='MuiPaper-root MuiPaper-elevation MuiPaper-elevation0 MuiDrawer-paper MuiDrawer-paperAnchorLeft MuiDrawer-paperAnchorDockedLeft css-1l8j5k8']//div[@class='MuiBox-root css-vuyiw1']/div[.='Gösterge Paneli']");
    By loginManagement = By.xpath("//ul[@class='MuiList-root MuiList-padding css-1ontqvh']/div[@class='MuiBox-root css-vuyiw1']/div[.='Giriş Kontrolü']");
    By pendingJobs = By.cssSelector(".MuiPaper-elevation0 > .MuiList-root > div:nth-of-type(3) > .MuiButtonBase-root");
    By reports = By.xpath("//ul[@class='MuiList-root MuiList-padding css-1ontqvh']/div[@class='MuiBox-root css-vuyiw1']/div[.='Raporlar']");
    By fraud = By.xpath("//div[7]/div[@class='MuiButtonBase-root MuiListItemButton-root MuiListItemButton-gutters MuiListItemButton-root MuiListItemButton-gutters css-2nxwnu']");
    By chargeback = By.xpath("//div[8]/div[@class='MuiButtonBase-root MuiListItemButton-root MuiListItemButton-gutters MuiListItemButton-root MuiListItemButton-gutters css-2nxwnu']");
    By settings = By.xpath("//div[9]/div[@class='MuiButtonBase-root MuiListItemButton-root MuiListItemButton-gutters MuiListItemButton-root MuiListItemButton-gutters css-2nxwnu']");
    By merchantUserManagementModule = By.xpath("//div[9]/div[@class='MuiButtonBase-root MuiListItemButton-root MuiListItemButton-gutters MuiListItemButton-root MuiListItemButton-gutters css-2nxwnu']");

    public void leftMenuMerchantUserManagementSubmit() {
        click(merchantUserManagementModule);
        waitBySeconds(2);
    }

    public void leftMenuManagementSubmit() {
        click(management);
        waitBySeconds(2);
    }

    public void leftMenuMerchantsManagementSubmit() {
        click(merchantsManagement);
        waitBySeconds(2);
    }

    public void leftMenuDashboardSubmit() {
        click(dashboard);
        waitBySeconds(2);
    }

    public void leftMenuLoginManagementSubmit() {
        click(loginManagement);
        waitBySeconds(2);
    }

    public void leftMenuPendingJobsSubmit() {
        click(pendingJobs);
        waitBySeconds(2);
    }

    public void leftMenuReportsSubmit() {
        click(reports);
        waitBySeconds(2);
    }

    public void leftMenuFraudSubmit() {
        click(fraud);
        waitBySeconds(2);
    }

    public void leftMenuChargebackSubmit() {
        click(chargeback);
        waitBySeconds(2);
    }

    public void leftMenuSettingsSubmit() {
        click(settings);
        waitBySeconds(2);
    }
}
