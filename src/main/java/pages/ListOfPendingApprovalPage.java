package pages;

import base.BasePage;
import org.openqa.selenium.By;

public class ListOfPendingApprovalPage extends BasePage {
    By listOfPendingApprovalPageSubLeftMenuButton = By.cssSelector(".MuiCollapse-wrapperInner div:nth-of-type(2) > .MuiButtonBase-root");
    By listOfPendingApprovalPageApprove = By.cssSelector(".MuiTableBody-root > tr:nth-of-type(1) .MuiButton-containedSuccess");
    By listOfPendingApprovalPageReject = By.cssSelector(".MuiTableBody-root > tr:nth-of-type(1) .MuiButton-containedError");
    By listOfPendingApprovalPageView = By.cssSelector(".MuiTableBody-root > tr:nth-of-type(1) .MuiButton-outlined");
    By listOfPendingApprovalPageDescription = By.id("outlined-multiline-static");
    By listOfPendingApprovalPageSaveButton = By.xpath("//div[@class='MuiStack-root css-f2hf18']/button[2]");

    public void listOfPendingApprovalPageAllElementsAreDisplayed() {
        isElementDisplay(listOfPendingApprovalPageApprove);
        isElementDisplay(listOfPendingApprovalPageReject);
        isElementDisplay(listOfPendingApprovalPageView);
    }

    public void leftSubMenuListOfPendingApprovalSubmit() {
        click(listOfPendingApprovalPageSubLeftMenuButton);
        waitBySeconds(2);
    }

    public void listOfPendingApprovalPagePageControlUrl() throws Exception {
        controlUrl("pendings", "pages.chargebacklistofpendingapproval");
    }

    public void pendingApprovalsListPageApproveButtonClick() {
        click(listOfPendingApprovalPageApprove);
        waitBySeconds(1);
    }

    public void pendingApprovalsListPageTypeDescription(String description) {
        type(listOfPendingApprovalPageDescription,description);
        waitBySeconds(1);
    }

    public void pendingApprovalsListPageSaveButtonClick() {
        click(listOfPendingApprovalPageSaveButton);
        waitBySeconds(1);
    }
}
