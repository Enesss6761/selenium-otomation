package serenitysteps;

import net.thucydides.core.annotations.Step;
import pages.ListOfPendingApprovalPage;

public class ListOfPendingApprovalPageSteps {
    ListOfPendingApprovalPage listofpendingapprovel;

    @Step("User click list of pending approval sub left menu")
    public void userClickListOfPendingApprovalSubLeftMenu() {
        listofpendingapprovel.leftSubMenuListOfPendingApprovalSubmit();
    }

    @Step("User see list of pending approval Page")
    public void userSeeListOfPendingApprovalPage() throws Exception {
        listofpendingapprovel.listOfPendingApprovalPagePageControlUrl();
    }

    @Step("User see all elements in List of Pending Approval Page")
    public void userSeeAllElementsInListOfPendingApprovalPage() {
        listofpendingapprovel.listOfPendingApprovalPageAllElementsAreDisplayed();
    }

    @Step("User click approve button on Pending Approvals List Page")
    public void userClickApproveButtonOnPendingApprovalsPage() {
        listofpendingapprovel.pendingApprovalsListPageApproveButtonClick();
    }

    @Step("User type description on Pending Approvals List Page")
    public void userTypeDescriptionOnPendingApprovalsPage(String description) {
        listofpendingapprovel.pendingApprovalsListPageTypeDescription(description);
    }

    @Step("User click save button on Pending Approvals Page")
    public void userClickSaveButtonOnPendingApprovalsPage() {
        listofpendingapprovel.pendingApprovalsListPageSaveButtonClick();
    }
}
