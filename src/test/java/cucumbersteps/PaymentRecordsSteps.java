package cucumbersteps;

import context.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.openqa.selenium.By;
import serenitysteps.PaymentRecordsPageSteps;

public class PaymentRecordsSteps {
    @Steps
    PaymentRecordsPageSteps paymentrecordspagesteps;

    @And("User click Payment Records sub left menu")
    public void userClickPaymentRecordsSubLeftMenu() {
        paymentrecordspagesteps.userClickPaymentRecordsSubLeftMenu();
    }

    @And("User see Payment Records Page")
    public void userSeePaymentRecordsPage() throws Exception {
        paymentrecordspagesteps.userSeePaymentRecordsPage();
    }

    @And("User see all elements on Payment Records Page")
    public void userSeeAllElementsOnPaymentRecordsPage() {
        paymentrecordspagesteps.userSeeAllElementsInPaymentRecordsPage();
    }

    @When("User click more filters on Payment Records Page")
    public void userClickMoreFiltersOnPaymentRecordsPage() {
        paymentrecordspagesteps.userClickMoreFilters();
    }

    @And("User filters by order number on Payment Records Page")
    public void userFiltersByOrderNumberOnPaymentRecordsPage() {
        paymentrecordspagesteps.userTypeRandomOrderNumber();
    }

    @And("User filter by platform order number on Payment Records Page")
    public void userFilterByPlatformOrderNumberOnPaymentRecordsPage() {
        paymentrecordspagesteps.userTypeRandomPlatformOrderNumber();
    }

    @And("User filter by payment status {string} on Payment Records Page")
    public void userFilterByPaymentStatusOnPaymentRecordsPage(String paymentStatus) {
        paymentrecordspagesteps.userFilterByPaymentStatus(paymentStatus);
    }

    @And("User filter by merchant name {string} on Payment Records Page")
    public void userFilterByMerchantNameOnPaymentRecordsPage(String merchantName) {
        paymentrecordspagesteps.userFilterByMerchantName(merchantName);
    }

    @And("User filter by threeD info {string} on Payment Records Page")
    public void userFilterByThreeDInfoOnPaymentRecordsPage(String threeDInfo) {
        paymentrecordspagesteps.userFilterByThreeDInfo(threeDInfo);
    }

    @Then("User see filtered {string} on data table Payment Records Page")
    public void userSeeFilteredOnDataTablePaymentRecordsPage(String valueOnTable) {
        paymentrecordspagesteps.userSeeFilteredOnDataTable(valueOnTable);
    }

    @Then("User check {string} is value of {string} on payment details")
    public void userCheckIsValueOfOnPaymentDetails(String value, String parameter) {
        paymentrecordspagesteps.userClickPaymentDetailsButton();
        paymentrecordspagesteps.userCheckPaymentDetails(value, parameter);
    }

    @And("User filter by date {string} between {string} days on Payment Records Page")
    public void userFilterByDateBetweenDaysOnPaymentRecordsPage(String startDay, String endDay) {
        paymentrecordspagesteps.userClickStartDateButton();
        paymentrecordspagesteps.userChooseStartDate(startDay);
        paymentrecordspagesteps.userClickOKButton();
        paymentrecordspagesteps.userClickEndDateButton();
        paymentrecordspagesteps.userChooseEndDate(endDay);
        paymentrecordspagesteps.userClickOKButton();
    }

    @Then("User check {string} date on data table Payment Records Page")
    public void userCheckDateOnDataTablePaymentRecordsPage(String dateTime) {
        paymentrecordspagesteps.userCheckSelectedDateOnTable(dateTime);
    }

    @And("User click Export to Excel on Payment Records Page")
    public void userClickExportToExcelOnPaymentRecordsPage() {
        paymentrecordspagesteps.userClickExportToExcel();
    }

    @And("User click manuel refund on Payment Records Page")
    public void userClickManuelRefundOnPaymentRecordsPage() {
        paymentrecordspagesteps.userClickRefundButtonOnPaymentRecordsPage();
    }

    @And("User fill manuel refund {string} reason and {string} amount on Payment Records Page")
    public void userFillManuelRefundReasonAndAmountOnPaymentRecordsPage(String reason, String amount) {
        paymentrecordspagesteps.userClickRefundReasonDropDownOnPaymentRecordsPage();
        paymentrecordspagesteps.userSelectRefundReasonOnPaymentRecordsPage(reason);
        paymentrecordspagesteps.userTypeRefundAmountOnPaymentRecordsPage(amount);
        paymentrecordspagesteps.userClickRefundSubmitOnPaymentRecordsPage();
    }

    @And("User click search button on Payment Records Page")
    public void userClickSearchButtonOnPaymentRecordsPage() {
        paymentrecordspagesteps.userClickSearchButton();
    }

    @And("User filters by internal order number on Payment Records Page")
    public void userFiltersByInternalOrderNumberOnPaymentRecordsPage() {
        String orderRef = TestContext.getOrderReferenceNumber();
        paymentrecordspagesteps.userTypeInternalOrderNumberOnPaymentRecordsPage(orderRef);
    }

    @Then("User see {string} information on Payment Records Page")
    public void userSeeInformationOnPaymentRecordsPage(String info) {
        paymentrecordspagesteps.userSeeInformation(info);
    }
}
