package serenitysteps;

import net.thucydides.core.annotations.Step;
import pages.LeftMenuList;

public class LeftMenuListSteps {
    LeftMenuList leftmenulist;

    @Step("User click management left menu")
    public void userClickManagementLeftMenu() {
        leftmenulist.leftMenuManagementSubmit();
    }

    @Step("User click merchant management left menu")
    public void userClickMerchantManagementLeftMenu() {
        leftmenulist.leftMenuMerchantsManagementSubmit();
    }

    @Step("User click reports left menu")
    public void userClickReportsLeftMenu() {
        leftmenulist.leftMenuReportsSubmit();
    }

    @Step("User click fraud left menu")
    public void userClickFraudLeftMenu() {
        leftmenulist.leftMenuFraudSubmit();
    }

    @Step("User click chargeback left menu")
    public void userClickChargebackLeftMenu() {
        leftmenulist.leftMenuChargebackSubmit();
    }

    @Step("User click pending jobs left menu")
    public void userClickPendingJobsLeftMenu() {
        leftmenulist.leftMenuPendingJobsSubmit();
    }

    @Step("User click login management left menu")
    public void userClickLoginManagementLeftMenu() {
        leftmenulist.leftMenuLoginManagementSubmit();
    }

    @Step("User click merchant user management module left menu")
    public void userClickMerchantUserManagementModuleLeftMenu() {
        leftmenulist.leftMenuMerchantUserManagementSubmit();
    }
}
