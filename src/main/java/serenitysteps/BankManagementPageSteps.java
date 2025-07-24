package serenitysteps;

import io.cucumber.java.en.And;
import net.thucydides.core.annotations.Step;
import pages.BankManagementPage;

public class BankManagementPageSteps {
    BankManagementPage bankmanagementpage;

    @Step("User click Bank Management sub left menu")
    public void userClickBankManagementSubLeftMenu() {
        bankmanagementpage.leftSubMenuBankManagementSubmit();
    }

    @Step("User see Bank Management Page")
    public void userSeeBankManagementPage() throws Exception {
        bankmanagementpage.bankManagementPageControlUrl();
    }

    @Step("User click more filters in Bank Management Page")
    public void userClickMoreFiltersInBankManagementPage() {
        bankmanagementpage.bankManagementPageMoreFiltersButtonClick();
    }

    @Step("User see all elements in Bank Management Page")
    public void userSeeAllElementsInBankManagementPage() {
        bankmanagementpage.bankManagementAllElementsAreDisplayed();
    }

    @Step("User click add in Bank Management Page")
    public void userClickAddInBankManagementPage() {
        bankmanagementpage.bankManagementAddBankSubmit();
    }

    @Step("User see all elements in Bank Add Page")
    public void userSeeAllElementsInBankAddPage() {
        bankmanagementpage.addBankAllElementsAreDisplayed();
    }

    @Step("User see Add Bank Page")
    public void userSeeAddBankPage() throws Exception {
        bankmanagementpage.bankManagementAddBankPageControlUrl();
    }

    @Step("User select Bank Name")
    public void userSelectBankName(String bankName) {
        bankmanagementpage.bankManagementBankNameDropdownClick(bankName);
    }

    @Step("User select Cancel Flow")
    public void userSelectCancelFlow(String cancelFlow) {
        bankmanagementpage.bankManagementCancelFlowDropdownClick(cancelFlow);
    }

    @Step("User select Status")
    public void userSelectStatus(String status) {
        bankmanagementpage.bankManagementStatusDropdownClick(status);
    }

    @Step("User type Service Provider")
    public void userTypeServiceProvider(String serviceProvider) {
        bankmanagementpage.bankManagementTypeServiceProvider(serviceProvider);
    }

    @Step("User type Bank Ica field")
    public void userTypeBankIcaField() {
        bankmanagementpage.bankManagementTypeBankIca();
    }

    @Step("User see information text")
    public void userSeeInformation(String info) {
        bankmanagementpage.bankManagementInformationText(info);
    }

    @Step("User click Save button")
    public void userClickSaveButton() {
        bankmanagementpage.bankManagementAddBankSaveButtonClick();
    }

    @Step("User click Edit button")
    public void userClickEditButton() {
        bankmanagementpage.bankManagementEditButtonClick();
    }

    @Step("User clear text field")
    public void userClearTextField() {
        bankmanagementpage.bankManagementClearTextField();
    }

    @Step("User type Bank Name")
    public void userTypeBankName(String bankName) {
        bankmanagementpage.bankManagementTypeBankName(bankName);
    }

    @Step("User click Search button")
    public void userClickSearchButton() {
        bankmanagementpage.bankManagementSearchButtonClick();
    }

    @Step("User check Bank Name on table")
    public void userCheckBankNameOnDataTable(String bankName) {
        bankmanagementpage.bankManagementCheckBankName(bankName);
    }

    @Step("User see filtered on data table")
    public void userSeeFilteredOnDataTable(String valueOnTable) {
        bankmanagementpage.checkDataTable(valueOnTable);
    }

    @Step("User type Service Provider on Add Bank Page")
    public void userTypeServiceProviderAddBank(String serviceProvider) {
        bankmanagementpage.bankManagementAddBankTypeServiceProvider(serviceProvider);
    }
}

