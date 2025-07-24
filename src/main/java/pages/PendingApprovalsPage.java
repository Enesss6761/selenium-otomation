package pages;

import base.BasePage;
import org.openqa.selenium.By;

public class PendingApprovalsPage extends BasePage {
    By pendingApprovalsPageSubLeftMenuButton = By.cssSelector(".MuiCollapse-wrapperInner .MuiButtonBase-root");
    By pendingApprovalsPageApproveButton = By.cssSelector("[aria-labelledby='simple-tab-0'] tr:nth-of-type(1) button:nth-of-type(1)");
    By pendingApprovalsPageRejectButton = By.cssSelector("[aria-labelledby='simple-tab-0'] tr:nth-of-type(1) button:nth-of-type(2)");
    By pendingApprovalsPageViewButton = By.cssSelector("[aria-labelledby='simple-tab-0'] tr:nth-of-type(1) button:nth-of-type(3)");
    By pendingApprovalsPagePerPage = By.id("pagination-dropdown_page_size");
    By pendingApprovalsPageTNoRegistrations = By.cssSelector("h3:nth-of-type(2)");
    By pendingApprovalsPageArchiveButton = By.id("pending_approval_list-archive_button");
    By pendingApprovalsPageUsersCategoriesButton = By.id("pending_approval-user_categories_tab");
    By pendingApprovalsPageExportsButton = By.id("pending_approval-exports_tab");
    By pendingApprovalsPageApproverListButton = By.id("pending_approval-approver_list_tab");
    By pendingApprovalsPageViewTitle = By.cssSelector(".css-2xgtc5");
    By pendingApprovalsPageDescriptionText = By.xpath("//div[@class='MuiFormControl-root MuiTextField-root css-1885gr7']/div/textarea[1]");
    By pendingApprovalsPageSaveButton = By.xpath("//div[@class='MuiStack-root css-1v70lhz']/button[2]");
    By pendingApprovalsPageArchiveApprovalStatusDropdown = By.xpath("//div[@class='MuiGrid-root MuiGrid-container MuiGrid-item MuiGrid-spacing-xs-2 css-1vp1j9j']/div[3]//div[@id='pending_approval_archive-status_dropdown']");
    By pendingApprovalsPageArchiveTrxStatusDropdown = By.xpath("//div[@class='MuiGrid-root MuiGrid-container MuiGrid-item MuiGrid-spacing-xs-2 css-1vp1j9j']/div[4]//div[@id='pending_approval_archive-status_dropdown']");
    By pendingApprovalsPageArchiveSearchButton = By.xpath("//div[@class='MuiGrid-root MuiGrid-container MuiGrid-item MuiGrid-spacing-xs-2 css-1vp1j9j']/div[5]//button");
    By pendingApprovalsPageArchiveApprovalStatusApproved = By.xpath("//div[@class='MuiPaper-root MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation8 MuiPopover-paper MuiMenu-paper MuiMenu-paper css-pwxzbm']/ul/li[2]");
    By pendingApprovalsPageArchiveApprovalStatusDeclined = By.xpath("//div[@class='MuiPaper-root MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation8 MuiPopover-paper MuiMenu-paper MuiMenu-paper css-pwxzbm']/ul/li[3]");
    By pendingApprovalsPageArchiveApprovalStatusPending = By.xpath("//div[@class='MuiPaper-root MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation8 MuiPopover-paper MuiMenu-paper MuiMenu-paper css-pwxzbm']/ul/li[4]");
    By pendingApprovalsPageArchiveTrxStatusUnknown = By.xpath("//div[@class='MuiPaper-root MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation8 MuiPopover-paper MuiMenu-paper MuiMenu-paper css-pwxzbm']/ul/li[2]");
    By pendingApprovalsPageArchiveTrxStatusSuccess = By.xpath("//div[@class='MuiPaper-root MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation8 MuiPopover-paper MuiMenu-paper MuiMenu-paper css-pwxzbm']/ul/li[3]");
    By pendingApprovalsPageArchiveTrxStatusFail = By.xpath("//div[@class='MuiPaper-root MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation8 MuiPopover-paper MuiMenu-paper MuiMenu-paper css-pwxzbm']/ul/li[4]");
    By pendingApprovalsPageArchiveTrxStatusRetrying = By.xpath("//div[@class='MuiPaper-root MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation8 MuiPopover-paper MuiMenu-paper MuiMenu-paper css-pwxzbm']/ul/li[5]");
    By pendingApprovalsPageArchiveApprovalStatusList = By.xpath("//tr[@class=\"MuiTableRow-root css-1mryfrx\"]/td[@class=\"MuiTableCell-root MuiTableCell-body MuiTableCell-alignLeft MuiTableCell-sizeMedium css-30c854\"][1]");
    By pendingApprovalsPageArchiveTrxStatusList = By.xpath("//tr[@class=\"MuiTableRow-root css-1mryfrx\"]/td[@class=\"MuiTableCell-root MuiTableCell-body MuiTableCell-alignLeft MuiTableCell-sizeMedium css-30c854\"][2]");
    By pendingApprovalsDetailForManualCorrectionsDescription = By.cssSelector(".css-1qgs9e2 div:nth-of-type(7) .css-vwyz2t");
    By pendingApprovalsDetailForManualCorrectionsTransactionType = By.cssSelector(".css-1qgs9e2 div:nth-of-type(5) .css-vwyz2t");
    By pendingApprovalsDetailForManualCorrectionsPageName = By.cssSelector(".css-8rnkcc > div:nth-of-type(2) .css-g1tppl");
    By pendingApprovalsDetailCloseButton = By.cssSelector("#button_close");
    By pendingApprovalsPageInformationOkButton = By.cssSelector(".css-9u7ede");
    By pendingApprovalsPageNameText = By.cssSelector("[aria-labelledby='simple-tab-0'] tr:nth-of-type(1) > td:nth-of-type(4)");

    public void pendingApprovalsPageNameControlManualCorrectionText() {
        String title = getText(pendingApprovalsPageNameText);
        String expected = "Finans ve Muhasebe Manuel Düzeltme";
        assertTextEquals(title, expected);
    }

    public void pendingApprovalsPageNameControlMerchantPayoutsText() {
        String title = getText(pendingApprovalsPageNameText);
        String expected = "Üye İş Yeri Hakediş Ödemeleri";
        assertTextEquals(title, expected);
    }

    public void viewApprovalsPendingApprovalsCloseSubmit() {
        click(pendingApprovalsDetailCloseButton);
        waitBySeconds(2);
    }

    public void pendingApprovalsPageViewControlForManualCorrections() {
        String ManualCorrectionsDetailActual = getText(pendingApprovalsDetailForManualCorrectionsDescription);
        String ManualCorrectionsTransactionTypeActual = getText(pendingApprovalsDetailForManualCorrectionsTransactionType);
        String ManualCorrectionsPageNameActual = getText(pendingApprovalsDetailForManualCorrectionsPageName);
        String ManualCorrectionsDetailExpected = "Test Automation MANUAL_INCOMING_TRANSFER";
        String ManualCorrectionsTransactionTypeExpected = "MANUAL_INCOMING_TRANSFER";
        String ManualCorrectionsPageNameExpected = "Finans ve Muhasebe Manuel Düzeltme";
        assertTextEquals(ManualCorrectionsDetailActual, ManualCorrectionsDetailExpected);
        assertTextEquals(ManualCorrectionsTransactionTypeActual, ManualCorrectionsTransactionTypeExpected);
        assertTextEquals(ManualCorrectionsPageNameActual, ManualCorrectionsPageNameExpected);
    }

    public void pendingApprovalsPageViewControlForMerchantPayouts() {
        String ManualCorrectionsPageNameActual = getText(pendingApprovalsDetailForManualCorrectionsPageName);
        String ManualCorrectionsPageNameExpected = "Üye İş Yeri Hakediş Ödemeleri";
        assertTextEquals(ManualCorrectionsPageNameActual, ManualCorrectionsPageNameExpected);
    }

    public void viewApprovalsPendingApprovalsSubmit() {
        click(pendingApprovalsPageViewButton);
        waitBySeconds(2);
    }

    public void pendingApprovalsPageAllElementsAreDisplayed() {
        isElementDisplay(pendingApprovalsPageApproveButton);
        isElementDisplay(pendingApprovalsPageRejectButton);
        isElementDisplay(pendingApprovalsPageViewButton);
        isElementDisplay(pendingApprovalsPagePerPage);
        isElementDisplay(pendingApprovalsPageTNoRegistrations);
        isElementDisplay(pendingApprovalsPageArchiveButton);
        isElementDisplay(pendingApprovalsPageUsersCategoriesButton);
        isElementDisplay(pendingApprovalsPageExportsButton);
        isElementDisplay(pendingApprovalsPageApproverListButton);
    }

    public void pendingApprovalsPagePageControlUrl() throws Exception {
        controlUrl("pending-jobs", "pages.pendingjobs");
    }

    public void pendingApprovalsPageViewControlPopUp() {
        String title = getText(pendingApprovalsPageViewTitle);
        String expected = "Detaylar";
        assertTextEquals(title, expected);
    }

    public void leftSubMenuPendingApprovalsSubmit() {
        click(pendingApprovalsPageSubLeftMenuButton);
        waitBySeconds(2);
    }

    public void pendingApprovalsPageArchiveSubmit() {
        click(pendingApprovalsPageArchiveButton);
        waitBySeconds(2);
    }

    public void pendingApprovalsPageApproveButtonClick() {
        click(pendingApprovalsPageApproveButton);
        waitBySeconds(1);
    }

    public void pendingApprovalsPageTypeDescription(String description) {
        type(pendingApprovalsPageDescriptionText,description);
        waitBySeconds(1);
    }

    public void pendingApprovalsPageSaveButtonClick() {
        click(pendingApprovalsPageSaveButton);
        waitBySeconds(1);
    }

    public void pendingApprovalsPageInformationText(String info) {
        informationTextOnPage(info);
    }

    public void pendingApprovalsPageInformationOkSubmit() {
        click(pendingApprovalsPageInformationOkButton);
        waitBySeconds(1);
    }

    public void pendingApprovalsPageArchiveApprovalStatusDropdownClick() {
        click(pendingApprovalsPageArchiveApprovalStatusDropdown);
        waitBySeconds(1);
    }

    public void pendingApprovalsPageArchiveTrxStatusDropdownClick() {
        click(pendingApprovalsPageArchiveTrxStatusDropdown);
        waitBySeconds(1);
    }

    public void pendingApprovalsPageArchiveApprovalStatusClick(String approvalStatus) {

        switch (approvalStatus) {
            case "APPROVED":
                click(pendingApprovalsPageArchiveApprovalStatusApproved);
                break;
            case "DECLINED":
                click(pendingApprovalsPageArchiveApprovalStatusDeclined);
                break;
            case "PENDING":
                click(pendingApprovalsPageArchiveApprovalStatusPending);
                break;
        }
        click(pendingApprovalsPageArchiveSearchButton);
        waitBySeconds(1);
    }

    public void pendingApprovalsPageArchiveTrxStatusClick(String trxStatus) {

        switch (trxStatus) {
            case "UNKNOWN":
                click(pendingApprovalsPageArchiveTrxStatusUnknown);
                break;
            case "SUCCESS":
                click(pendingApprovalsPageArchiveTrxStatusSuccess);
                break;
            case "FAIL":
                click(pendingApprovalsPageArchiveTrxStatusFail);
                break;
            case "RETRYING":
                click(pendingApprovalsPageArchiveTrxStatusRetrying);
                break;
        }
        click(pendingApprovalsPageArchiveSearchButton);
        waitBySeconds(1);
    }

    public void checkDataTable(String valueOnTable) {

        switch (valueOnTable) {
            case "Onaylandı":
                String authorizeStatus = getText(pendingApprovalsPageArchiveApprovalStatusList);
                assertTextEquals(authorizeStatus, "Onaylandı");
                break;
            case "Reddedildi":
                String cancelStatus = getText(pendingApprovalsPageArchiveApprovalStatusList);
                assertTextEquals(cancelStatus, "Reddedildi");
                break;
            case "Onay Bekliyor":
                String captureStatus = getText(pendingApprovalsPageArchiveApprovalStatusList);
                assertTextEquals(captureStatus, "Onay Bekliyor");
                break;
            case "Bilinmiyor":
                String chargebackStatus = getText(pendingApprovalsPageArchiveTrxStatusList);
                assertTextEquals(chargebackStatus, "Bilinmiyor");
                break;
            case "Başarılı":
                String inProgressStatus = getText(pendingApprovalsPageArchiveTrxStatusList);
                assertTextEquals(inProgressStatus, "Başarılı");
                break;
            case "Hatalı":
                String preauthorizeStatus = getText(pendingApprovalsPageArchiveTrxStatusList);
                assertTextEquals(preauthorizeStatus, "Hatalı");
                break;
            case "Tekrar Deneniyor":
                String refundStatus = getText(pendingApprovalsPageArchiveTrxStatusList);
                assertTextEquals(refundStatus, "Tekrar Deneniyor");
                break;
        }
        waitBySeconds(15);
    }

}
