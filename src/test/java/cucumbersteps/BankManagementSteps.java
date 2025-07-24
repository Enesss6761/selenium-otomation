package cucumbersteps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import serenitysteps.BankManagementPageSteps;

public class BankManagementSteps {
    @Steps
    BankManagementPageSteps bankmanagement;

    @And("User click Bank Management sub left menu")
    public void userClickBankManagementSubLeftMenu() {
        bankmanagement.userClickBankManagementSubLeftMenu();
    }

    @And("User see Bank Management Page")
    public void userSeeBankManagementPage() throws Exception {
        bankmanagement.userSeeBankManagementPage();
    }

    @When("User click more filters on Bank Management Page")
    public void userClickMoreFiltersOnBankManagementPage() {
        bankmanagement.userClickMoreFiltersInBankManagementPage();
    }

    @Then("User see all elements on Bank Management Page")
    public void userSeeAllElementsOnBankManagementPage() {
        bankmanagement.userSeeAllElementsInBankManagementPage();
    }

    @And("User click add on Bank Management Page")
    public void userClickAddOnBankManagementPage() {
        bankmanagement.userClickAddInBankManagementPage();
    }

    @Then("User see all elements on Bank Add Page")
    public void userSeeAllElementsOnBankAddPage() {
        bankmanagement.userSeeAllElementsInBankAddPage();
    }

    @When("User see Add Bank Page")
    public void userSeeAddBankPage() throws Exception {
        bankmanagement.userSeeAddBankPage();
    }

    @And("User select with {string} Bank Name and {string} Cancel Flow and {string} Status on Add Bank Page")
    public void userSelectWithBankNameAndCancelFlowAndStatusOnAddBankPage(String bankName, String cancelFlow, String status) {
        bankmanagement.userSelectBankName(bankName);
        bankmanagement.userSelectCancelFlow(cancelFlow);
        bankmanagement.userSelectStatus(status);
    }

    @And("User fill with {string} Service Provider field on Add Bank Page")
    public void userFillWithServiceProviderFieldOnAddBankPage(String serviceProvider) {
        bankmanagement.userTypeServiceProviderAddBank(serviceProvider);
    }

    @And("User fill Bank Ica field on Add Bank Page")
    public void userFillBankIcaFieldOnAddBankPage() {
        bankmanagement.userTypeBankIcaField();
    }

    @And("User click Save button on Add Bank Page")
    public void userClickSaveButtonOnAddBankPage() {
        bankmanagement.userClickSaveButton();
    }

    @Then("User see {string} information text on Bank Management Page")
    public void userSeeInformationOnBankManagementPage(String info) {
        bankmanagement.userSeeInformation(info);
    }

    @When("User click edit button on Bank Management Page")
    public void userClickEditButtonOnBankManagementPage() {
        bankmanagement.userClickEditButton();
    }

    @And("User update Bank Ica field on Update Bank Page")
    public void userUpdateBankIcaFieldOnUpdateBankPage() {
        bankmanagement.userClearTextField();
        bankmanagement.userTypeBankIcaField();
    }

    @And("User filter by {string} Bank Name on Bank Management Page")
    public void userFilterByBankNameOnBankManagementPage(String bankName) {
        bankmanagement.userTypeBankName(bankName);
    }

    @And("User click search button on Bank Management Page")
    public void userClickSearchButtonOnBankManagementPage() {
        bankmanagement.userClickSearchButton();
    }

    @Then("User check {string} Bank Name on data table Bank Management Page")
    public void userCheckBankNameOnDataTableBankManagementPage(String bankName) {
        bankmanagement.userCheckBankNameOnDataTable(bankName);
    }

    @Then("User see filtered {string} on data table Bank Management Page")
    public void userSeeFilteredOnDataTableBankManagementPage(String valueOnTable) {
        bankmanagement.userSeeFilteredOnDataTable(valueOnTable);
    }

    @And("User click Save button on Update Bank Page")
    public void userClickSaveButtonOnUpdateBankPage() {
        bankmanagement.userClickSaveButton();
    }

    @And("User fill with {string} Service Provider field on Bank Management Page")
    public void userFillWithServiceProviderFieldOnBankManagementPage(String serviceProvider) {
        bankmanagement.userTypeServiceProvider(serviceProvider);
    }
}
