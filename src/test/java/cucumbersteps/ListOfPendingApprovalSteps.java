package cucumbersteps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import serenitysteps.ListOfPendingApprovalPageSteps;

public class ListOfPendingApprovalSteps {
    @Steps
    ListOfPendingApprovalPageSteps listofpendingapprovalpagesteps;

    @And("User click list of pending approval sub left menu")
    public void userClickListOfPendingApprovalSubLeftMenu() {
        listofpendingapprovalpagesteps.userClickListOfPendingApprovalSubLeftMenu();
    }

    @And("User see list of pending approval Page")
    public void userSeeListOfPendingApprovalPage() throws Exception {
        listofpendingapprovalpagesteps.userSeeListOfPendingApprovalPage();
    }

    @When("User see all elements in List of Pending Approval Page")
    public void userSeeAllElementsInListOfPendingApprovalPage() {
        listofpendingapprovalpagesteps.userSeeAllElementsInListOfPendingApprovalPage();
    }

    @And("User click Approve on Pending Approvals List Page")
    public void userClickApproveOnPendingApprovalsListPage() {
        listofpendingapprovalpagesteps.userClickApproveButtonOnPendingApprovalsPage();
    }

    @And("User type {string} Description on Pending Approvals List Page")
    public void userTypeDescriptionOnPendingApprovalsListPage(String description) {
        listofpendingapprovalpagesteps.userTypeDescriptionOnPendingApprovalsPage(description);
    }

    @And("User click Save button on Pending Approvals List Page")
    public void userClickSaveButtonOnPendingApprovalsListPage() {
        listofpendingapprovalpagesteps.userClickSaveButtonOnPendingApprovalsPage();
    }
}
