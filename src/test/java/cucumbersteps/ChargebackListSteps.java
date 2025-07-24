package cucumbersteps;

import context.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import serenitysteps.ChargebackListPageSteps;

public class ChargebackListSteps {
    @Steps
    ChargebackListPageSteps chargebacklistpagesteps;

    @And("User click Chargeback List sub left menu")
    public void userClickChargebackListSubLeftMenu() {
        chargebacklistpagesteps.userClickChargebackListSubLeftMenu();
    }

    @And("User see chargeback list Page")
    public void userSeeChargebackListPage() throws Exception {
        chargebacklistpagesteps.userSeeChargebackListPage();
    }

    @When("User click more filters in Chargeback List Page")
    public void userClickMoreFiltersInChargebackListPage() {
        chargebacklistpagesteps.userClickMoreFiltersInChargebackListPage();
    }

    @Then("User see all elements in Chargeback List Page")
    public void userSeeAllElementsInChargebackListPage() {
        chargebacklistpagesteps.userSeeAllElementsInChargebackListPage();
    }

    @And("User click add in Chargeback List Page")
    public void userClickAddInChargebackListPage() {
        chargebacklistpagesteps.userClickAddInChargebackListPage();
    }

    @When("User see Add Chargeback List")
    public void userSeeAddChargebackList() {
        chargebacklistpagesteps.userSeeAddChargebackList();
    }

    @Then("User see all elements in Chargeback List Add Page")
    public void userSeeAllElementsInChargebackListAddPage() {
        chargebacklistpagesteps.userSeeAllElementsInChargebackListAddPage();
    }

    @And("User fill Order No on New Chargeback")
    public void userFillOrderNoOnNewChargeback() {
        String orderRef = TestContext.getOrderReferenceNumber();
        chargebacklistpagesteps.userTypeOrderNumberOnNewChargeback(orderRef);
    }

    @And("User fill DateTime on New Chargeback")
    public void userFillDateTimeOnNewChargeback() {
        chargebacklistpagesteps.userSelectDateTimeOnNewChargeback();
    }

    @And("User fill Amount on New Chargeback")
    public void userFillAmountOnNewChargeback() {
        chargebacklistpagesteps.userTypeAmountOnNewChargeback();
    }

    @And("User choose Chargeback Reason {string} on New Chargeback")
    public void userChooseChargebackReasonOnNewChargeback(String reason) {
        chargebacklistpagesteps.userSelectChargebackReason(reason);
    }

    @And("User type Description on New Chargeback")
    public void userTypeDescriptionOnNewChargeback() {
        chargebacklistpagesteps.userTypeDescriptionOnNewChargeback();
    }

    @And("User click Save Button on New Chargeback")
    public void userClickSaveButtonOnNewChargeback() {
        chargebacklistpagesteps.userClickSaveButtonOnNewChargeback();
    }

    @And("User see {string} information on Chargeback List Page")
    public void userSeeInformationOnChargebackListPage(String info) {
        chargebacklistpagesteps.userSeeInformation(info);
    }
}
