package cucumbersteps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import serenitysteps.PosManagementPageSteps;


public class PosManagementSteps {
    @Steps
    PosManagementPageSteps posmanagementpagesteps;

    @And("User click Pos Management sub left menu")
    public void userClickPosManagementSubLeftMenu() {
        posmanagementpagesteps.userClickPosManagementSubLeftMenu();
    }

    @And("User see Pos Management Page")
    public void userSeePosManagementPage() throws Exception {
        posmanagementpagesteps.userSeePosManagementPage();
    }

    @When("User click more filters on Pos Management Page")
    public void userClickMoreFiltersOnPosManagementPage() {
        posmanagementpagesteps.userClickMoreFiltersInPosManagementPage();
    }

    @Then("User see all elements on Pos Management Page")
    public void userSeeAllElementsOnPosManagementPage() {
        posmanagementpagesteps.userSeeAllElementsInPosManagementPage();
    }

    @And("User click add on Pos Management Page")
    public void userClickAddOnPosManagementPage() {
        posmanagementpagesteps.userClickAddInPosManagementPage();
    }

    @And("User see Add Pos Page")
    public void userSeeAddPosPage() throws Exception {
        posmanagementpagesteps.userSeeAddPosPage();
    }

    @And("User see all elements General Information in Pos Create Page")
    public void userSeeAllElementsGeneralInformationInPosCreatePage() {
        posmanagementpagesteps.userSeeAllElementsGeneralInformationInPosCreatePage();
    }

    @And("User click Next Button on General Information Page")
    public void userClickNextButtonOnGeneralInformationPage() {
        posmanagementpagesteps.userClickNextButtonInGeneralInformation();
    }

    @And("User see all elements Commission Settings in Pos Create Page")
    public void userSeeAllElementsCommissionSettingsInPosCreatePage() {
        posmanagementpagesteps.userSeeAllElementsCommissionSettingsInPosCreatePage();
    }

    @And("User click Back Button on Commission Settings Page")
    public void userClickBackButtonOnCommissionSettingsPage() {
        posmanagementpagesteps.userClickBackButtonInCommissionSettings();
    }

    @And("User click Next Button on Commission Settings Page")
    public void userClickNextButtonOnCommissionSettingsPage() {
        posmanagementpagesteps.userClickNextButtonInCommissionInformation();
    }

    @And("User see all elements Pos Credentials in Pos Create Page")
    public void userSeeAllElementsPosCredentialsInPosCreatePage() {
        posmanagementpagesteps.userSeeAllElementsPosCredentialsInPosCreatePage();
    }

    @When("User click Back Button in Pos Credentials")
    public void userClickBackButtonInPosCredentials() {
        posmanagementpagesteps.userClickBackButtonInPosCredentials();
    }

    @Then("User see Pos Commission Page")
    public void userSeePosCommissionPage() {
        posmanagementpagesteps.userSeePosCommissionPage();
    }

    @And("User select with {string} Pos Bank and {string} Card Program and {string} Status on General Informations Page")
    public void userSelectWithPosBankAndCardProgramAndStatusOnGeneralInformationsPage(String posBank, String cardProgram, String status) {
        posmanagementpagesteps.userSelectPosBank(posBank);
        posmanagementpagesteps.userSelectCardProgram(cardProgram);
        posmanagementpagesteps.userSelectStatus(status);
        posmanagementpagesteps.userSelectCurrency();
    }

    @And("User fill with {string} Onus CC {string} Not Onus CC and {string} Onus Debit {string} Not Onus Debit commision rate on Commission Settings Page")
    public void userFillWithOnusCCNotOnusCCAndOnusDebitNotOnusDebitCommisionRateOnCommissionSettingsPage(String OnusCC, String NotOnusCC, String OnusDebit, String NotOnusDebit) {
        posmanagementpagesteps.userTypeCommissionRateOnusCC(OnusCC);
        posmanagementpagesteps.userTypeCommissionRateNotOnusCC(NotOnusCC);
        posmanagementpagesteps.userTypeCommissionRateOnusDebit(OnusDebit);
        posmanagementpagesteps.userTypeCommissionRateNotOnusDebit(NotOnusDebit);
    }

    @And("User type {string} Parameter Name and {string} Parameter Value on Pos Credentials Page")
    public void userTypeParameterNameAndParameterValueOnPosCredentialsPage(String name, String value) {
        posmanagementpagesteps.userTypeParameterNameAndParameterValue(name,value);
    }

    @When("User click edit button on Pos Management Page")
    public void userClickEditButtonOnPosManagementPage() {
        posmanagementpagesteps.userClickEditButtonInPosManagementPage();
    }

    @And("User fill with Pos Name Value Date and Bin Number text fields on General Informations Page")
    public void userFillWithPosNameValueDateAndBinNumberTextFieldsOnGeneralInformationsPage() {
        posmanagementpagesteps.userTypePosName();
        posmanagementpagesteps.userTypeValueDate();
        posmanagementpagesteps.userTypeBinNumber();
    }

    @Then("User see {string} information on Pos Management Page")
    public void userSeeInformationOnPosManagementPage(String info) {
        posmanagementpagesteps.userSeeInformation(info);
    }

    @And("User update with Pos Name and Value Date fields on General Informations Page")
    public void userUpdateWithPosNameAndValueDateFieldsOnGeneralInformationsPage() {
        posmanagementpagesteps.userClearTextField();
        posmanagementpagesteps.userTypePosName();
        posmanagementpagesteps.userTypeValueDate();
    }

    @And("User click Save button on Add Pos Page")
    public void userClickSaveButtonOnAddPosPage() {
        posmanagementpagesteps.userClickSaveButton();
    }

    @And("User filter by {string} Pos Name on Pos Management Page")
    public void userFilterByPosNameOnPosManagementPage(String posName) {
        posmanagementpagesteps.userClickPosName();
        posmanagementpagesteps.userSelectPosName(posName);
    }

    @And("User click search button on Pos Management Page")
    public void userClickSearchButtonOnPosManagementPage() {
        posmanagementpagesteps.userClickSearchButton();
    }

    @Then("User check {string} on data table Pos Management Page")
    public void userCheckOnDataTablePosManagementPage(String posName) {
        posmanagementpagesteps.userCheckPosNameOnDataTable(posName);
    }

    @And("User filter by {string} Pos Bank on Pos Management Page")
    public void userFilterByPosBankOnPosManagementPage(String posBank) {
        posmanagementpagesteps.userTypePosBank(posBank);
    }

    @Then("User see filtered {string} on data table Pos Management Page")
    public void userSeeFilteredOnDataTablePosManagementPage(String valueOnTable) {
        posmanagementpagesteps.userSeeFilteredOnDataTable(valueOnTable);
    }

    @And("User click Save button on Update Pos Page")
    public void userClickSaveButtonOnUpdatePosPage() {
        posmanagementpagesteps.userClickSaveButton();
    }

    @And("User click pos status switch on Pos Management Page")
    public void userClickPosStatusSwitchOnPosManagementPage() {
        posmanagementpagesteps.userClickPosDefaultSwitchButton();
    }

    @And("User click pos default switch on Pos Management Page")
    public void userClickPosDefaultSwitchOnPosManagementPage() {
        posmanagementpagesteps.userClickPosStatusSwitchButton();
    }
}
