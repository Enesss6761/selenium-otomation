package serenitysteps;

import net.thucydides.core.annotations.Step;
import pages.PendingApprovalsPage;

public class PendingApprovalsPageSteps {
    PendingApprovalsPage pendingapprovalspage;

    @Step("User click pending approvals sub left menu")
    public void userClickPendingApprovalsSubLeftMenu() {
        pendingapprovalspage.leftSubMenuPendingApprovalsSubmit();

    }

    @Step("User see pending approvals Page")
    public void userSeePendingApprovalsPage() throws Exception {
        pendingapprovalspage.pendingApprovalsPagePageControlUrl();
    }

    @Step("User see all elements in Pending Approvals Page")
    public void userSeeAllElementsInPendingApprovalsPage() {
        pendingapprovalspage.pendingApprovalsPageAllElementsAreDisplayed();
    }

    @Step("User click aprrove button on Pending Approvals Page")
    public void userClickApproveButtonOnPendingApprovalsPage() {
        pendingapprovalspage.pendingApprovalsPageApproveButtonClick();
    }

    @Step("User type description on Pending Approvals Page")
    public void userTypeDescriptionOnPendingApprovalsPage(String description) {
        pendingapprovalspage.pendingApprovalsPageTypeDescription(description);
    }

    @Step("User click save button on Pending Approvals Page")
    public void userClickSaveButtonOnPendingApprovalsPage() {
        pendingapprovalspage.pendingApprovalsPageSaveButtonClick();
    }

    @Step("User see information on Pending Approvals Page ")
    public void userSeeInformation(String info) {
        pendingapprovalspage.pendingApprovalsPageInformationText(info);
        pendingapprovalspage.pendingApprovalsPageInformationOkSubmit();
    }

    @Step("User filter by approval status on Pending Approvals Page")
    public void userFilterByApprovalStatusOnPendingApprovalsPage(String approvalStatus) {
        pendingapprovalspage.pendingApprovalsPageArchiveApprovalStatusClick(approvalStatus);
    }

    @Step("User filter by transaction status on Pending Approvals Page")
    public void userFilterByTrxStatusOnPendingApprovalsPage(String trxStatus) {
        pendingapprovalspage.pendingApprovalsPageArchiveTrxStatusClick(trxStatus);
    }

    @Step("User click approval status dropdown on Pending Approvals Page")
    public void userClickApprovalStatusOnPendingApprovalsPage() {
        pendingapprovalspage.pendingApprovalsPageArchiveApprovalStatusDropdownClick();
    }

    @Step("User click transaction status dropdown on Pending Approvals Page")
    public void userClickTrxStatusOnPendingApprovalsPage() {
        pendingapprovalspage.pendingApprovalsPageArchiveTrxStatusDropdownClick();
    }

    @Step("User click archive button on Pending Approvals Page")
    public void userClickArchiveButtonOnPendingApprovalsPage() {
        pendingapprovalspage.pendingApprovalsPageArchiveSubmit();
    }

    @Step("User see filtered on Pending Approvals Archive data table")
    public void userSeeFilteredOnPendingApprovalsDataTable(String valueOnTable) {
        pendingapprovalspage.checkDataTable(valueOnTable);
    }

    @Step("User click approvals view in Pending Approvals Page")
    public void userClickApprovalsViewInPendingApprovalsPage() {
        pendingapprovalspage.viewApprovalsPendingApprovalsSubmit();

    }

    @Step("User see approvals detail in Pending Approvals Page")
    public void userSeeApprovalsDetailInPendingApprovalsPage() {
        pendingapprovalspage.pendingApprovalsPageViewControlPopUp();
    }

    @Step("User see manual correction approval in Pending Approvals Page")
    public void userSeeManualCorrectionApprovalInPendingApprovalsPage() {
        pendingapprovalspage.pendingApprovalsPageViewControlForManualCorrections();
        pendingapprovalspage.viewApprovalsPendingApprovalsCloseSubmit();
    }

    @Step("User click approve manual correction in Pending Approvals Page")
    public void userClickApproveManualCorrectionInPendingApprovalsPage() {
        pendingapprovalspage.pendingApprovalsPageNameControlManualCorrectionText();
        pendingapprovalspage.pendingApprovalsPageApproveButtonClick();
    }

    @Step("User see merchant payouts approval in Pending Approvals Page")
    public void userSeeMerchantPayoutsApprovalInPendingApprovalsPage() {
        pendingapprovalspage.pendingApprovalsPageViewControlForMerchantPayouts();
        pendingapprovalspage.viewApprovalsPendingApprovalsCloseSubmit();
    }

    @Step("User click approve merchant payouts in Pending Approvals Page")
    public void userClickApproveMerchantPayoutsInPendingApprovalsPage() {
        pendingapprovalspage.pendingApprovalsPageNameControlMerchantPayoutsText();
        pendingapprovalspage.pendingApprovalsPageApproveButtonClick();
    }
}
