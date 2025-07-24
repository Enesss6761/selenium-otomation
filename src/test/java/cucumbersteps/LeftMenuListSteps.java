package cucumbersteps;

import io.cucumber.java.en.And;
import net.thucydides.core.annotations.Steps;

public class LeftMenuListSteps {
    @Steps
    serenitysteps.LeftMenuListSteps leftmenuliststeps;

    @And("User click management left menu")
    public void userClickManagementLeftMenu() {
        leftmenuliststeps.userClickManagementLeftMenu();
    }

    @And("User click merchant management left menu")
    public void userClickMerchantManagementLeftMenu() {
        leftmenuliststeps.userClickMerchantManagementLeftMenu();
    }

    @And("User click reports left menu")
    public void userClickReportsLeftMenu() {
        leftmenuliststeps.userClickReportsLeftMenu();
    }

    @And("User click fraud left menu")
    public void userClickFraudLeftMenu() {
        leftmenuliststeps.userClickFraudLeftMenu();
    }

    @And("User click chargeback left menu")
    public void userClickChargebackLeftMenu() {
        leftmenuliststeps.userClickChargebackLeftMenu();
    }

    @And("User click pending jobs left menu")
    public void userClickPendingJobsLeftMenu() {
        leftmenuliststeps.userClickPendingJobsLeftMenu();
    }

    @And("User click login management left menu")
    public void userClickLoginManagementLeftMenu() {
        leftmenuliststeps.userClickLoginManagementLeftMenu();
    }

    @And("User click merchant user management module left menu")
    public void userClickMerchantUserManagementModuleLeftMenu() {
        leftmenuliststeps.userClickMerchantUserManagementModuleLeftMenu();
    }
}
