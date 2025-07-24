package cucumbersteps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import serenitysteps.PendingApprovalsPageSteps;

public class PendingApprovalsSteps {
    @Steps
    PendingApprovalsPageSteps pendingapprovalspagesteps;

    @And("User click pending approvals sub left menu")
    public void userClickPendingApprovalsSubLeftMenu() {
        pendingapprovalspagesteps.userClickPendingApprovalsSubLeftMenu();

    }

    @And("User see pending approvals Page")
    public void userSeePendingApprovalsPage() throws Exception {
        pendingapprovalspagesteps.userSeePendingApprovalsPage();
    }

    @When("User see all elements in Pending Approvals Page")
    public void userSeeAllElementsInPendingApprovalsPage() {
        pendingapprovalspagesteps.userSeeAllElementsInPendingApprovalsPage();
    }

    @And("User click Approve on Pending Approvals Page")
    public void userClickApproveOnPendingApprovalsPage() {
        pendingapprovalspagesteps.userClickApproveButtonOnPendingApprovalsPage();
    }

    @And("User type {string} Description on Pending Approvals Page")
    public void userTypeDescriptionOnPendingApprovalsPage(String description) {
        pendingapprovalspagesteps.userTypeDescriptionOnPendingApprovalsPage(description);
    }

    @And("User click Save button on Pending Approvals Page")
    public void userClickSaveButtonOnPendingApprovalsPage() {
        pendingapprovalspagesteps.userClickSaveButtonOnPendingApprovalsPage();
    }

    @Then("User see {string} information text on Pending Approvals Page")
    public void userSeeInformationTextOnPendingApprovalsPage(String info) {
        pendingapprovalspagesteps.userSeeInformation(info);
    }

    @And("User click Archive button on Pending Approvals Page")
    public void userClickArchiveButtonOnPendingApprovalsPage() {
        pendingapprovalspagesteps.userClickArchiveButtonOnPendingApprovalsPage();
    }

    @And("User filter by Approve Status {string} on Pending Approvals Archive")
    public void userFilterByApproveStatusOnPendingApprovalsArchive(String approvalStatus) {
        pendingapprovalspagesteps.userClickApprovalStatusOnPendingApprovalsPage();
        pendingapprovalspagesteps.userFilterByApprovalStatusOnPendingApprovalsPage(approvalStatus);
    }

    @And("User see filtered {string} on Pending Approvals Archive data table")
    public void userSeeFilteredOnPendingApprovalsArchiveDataTable(String valueOnTable) {
        pendingapprovalspagesteps.userSeeFilteredOnPendingApprovalsDataTable(valueOnTable);
    }

    @And("User filter by Transaction Status {string} on Pending Approvals Archive")
    public void userFilterByTransactionStatusOnPendingApprovalsArchive(String trxStatus) {
        pendingapprovalspagesteps.userClickTrxStatusOnPendingApprovalsPage();
        pendingapprovalspagesteps.userFilterByTrxStatusOnPendingApprovalsPage(trxStatus);
    }

    @And("User click approvals view in Pending Approvals Page")
    public void userClickApprovalsViewInPendingApprovalsPage() {
        pendingapprovalspagesteps.userClickApprovalsViewInPendingApprovalsPage();
    }

    @And("User see approvals detail in Pending Approvals Page")
    public void userSeeApprovalsDetailInPendingApprovalsPage() {
        pendingapprovalspagesteps.userSeeApprovalsDetailInPendingApprovalsPage();
    }

    @And("User see manual correction approval in Pending Approvals Page")
    public void userSeeManualCorrectionApprovalInPendingApprovalsPage() {
        pendingapprovalspagesteps.userSeeManualCorrectionApprovalInPendingApprovalsPage();
    }

    @And("User click approve manual correction in Pending Approvals Page")
    public void userClickApproveManualCorrectionInPendingApprovalsPage() {
        pendingapprovalspagesteps.userClickApproveManualCorrectionInPendingApprovalsPage();
    }

    @And("User see merchant payouts approval in Pending Approvals Page")
    public void userSeeMerchantPayoutsApprovalInPendingApprovalsPage() {
        pendingapprovalspagesteps.userSeeMerchantPayoutsApprovalInPendingApprovalsPage();
    }

    @And("User click approve merchant payouts in Pending Approvals Page")
    public void userClickApproveMerchantPayoutsInPendingApprovalsPage() {
        pendingapprovalspagesteps.userClickApproveMerchantPayoutsInPendingApprovalsPage();
    }

}
