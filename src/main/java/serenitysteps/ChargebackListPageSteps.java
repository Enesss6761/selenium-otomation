package serenitysteps;

import net.thucydides.core.annotations.Step;
import pages.ChargebackListPage;

public class ChargebackListPageSteps {
    ChargebackListPage chargebacklistpage;

    @Step("User click Chargeback List sub left menu")
    public void userClickChargebackListSubLeftMenu() {
        chargebacklistpage.leftSubMenuChargebackListPageSubmit();
    }

    @Step("User see chargeback list Page")
    public void userSeeChargebackListPage() throws Exception {
        chargebacklistpage.chargeBackListPageControlUrl();
    }

    @Step("User click more filters in Chargeback List Page")
    public void userClickMoreFiltersInChargebackListPage() {
        chargebacklistpage.leftSubMenuChargebackListPageMoreFiltersSubmit();
    }

    @Step("User see all elements in Chargeback List Page")
    public void userSeeAllElementsInChargebackListPage() {
        chargebacklistpage.chargeBackListPageAllElementsAreDisplayed();
    }

    @Step("User click add in Chargeback List Page")
    public void userClickAddInChargebackListPage() {
        chargebacklistpage.chargeBackListPageAddCorrectionsSubmit();
    }

    @Step("User see Add Chargeback List")
    public void userSeeAddChargebackList() {
        chargebacklistpage.chargeBackListPageControlPopUp();
    }

    @Step("User see all elements in Chargeback List Add Page")
    public void userSeeAllElementsInChargebackListAddPage() {
        chargebacklistpage.chargeBackListPageAddChargeBackAllElementsAreDisplayed();
    }

    @Step("User type Order Number On New Chargeback")
    public void userTypeOrderNumberOnNewChargeback(String orderRef) {
        chargebacklistpage.typeInternalOrder(orderRef);
    }

    @Step("User select Date Time On New Chargeback")
    public void userSelectDateTimeOnNewChargeback() {
        chargebacklistpage.chooseDateTime();
    }

    @Step("User type Amount On New Chargeback")
    public void userTypeAmountOnNewChargeback() {
        chargebacklistpage.typeAmount();
    }

    @Step("User select Chargeback Reason On New Chargeback")
    public void userSelectChargebackReason(String reason) {
        chargebacklistpage.chargebackReasonDropDownClick();
        chargebacklistpage.selectChargebackReason(reason);
    }

    @Step("User type Description On New Chargeback")
    public void userTypeDescriptionOnNewChargeback() {
        chargebacklistpage.typeDescription();
    }

    @Step("User click Save Button On New Chargeback")
    public void userClickSaveButtonOnNewChargeback() {
        chargebacklistpage.clickSaveButton();
    }

    @Step("User see information text")
    public void userSeeInformation(String info) {
        chargebacklistpage.chargebackListPagePageInformationText(info);
    }
}
