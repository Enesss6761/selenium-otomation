package serenitysteps;


import net.thucydides.core.annotations.Step;
import pages.PosManagementPage;

public class PosManagementPageSteps {
    PosManagementPage posmanagementpage;

    @Step("User click Pos Management sub left menu")
    public void userClickPosManagementSubLeftMenu() {
        posmanagementpage.leftSubMenuPosManagementSubmit();
    }

    @Step("User see Pos Management Page")
    public void userSeePosManagementPage() throws Exception {
        posmanagementpage.posManagementPageControlUrl();
    }

    @Step("User click more filters in Pos Management Page")
    public void userClickMoreFiltersInPosManagementPage() {
        posmanagementpage.posManagementPageMoreFiltersButtonClick();
    }

    @Step("User see all elements in Pos Management Page")
    public void userSeeAllElementsInPosManagementPage() {
        posmanagementpage.posManagementAllElementsAreDisplayed();
    }

    @Step("User click add in Pos Management Page")
    public void userClickAddInPosManagementPage() {
        posmanagementpage.posManagementAddPosCreateButtonSubmit();
    }

    @Step("User see Add Pos Page")
    public void userSeeAddPosPage() throws Exception {
        posmanagementpage.posManagementAddPosPageControlUrl();
    }

    @Step("User see all elements General Information in Pos Create Page")
    public void userSeeAllElementsGeneralInformationInPosCreatePage() {
        posmanagementpage.posManagementPosCreateGeneralInformationAllElementsAreDisplayed();
    }

    @Step("User click Next Button in General Information")
    public void userClickNextButtonInGeneralInformation() {
        posmanagementpage.posManagementPosCreateGeneralInformationNextButtonSubmit();
    }

    @Step("User see all elements Commission Settings in Pos Create Page")
    public void userSeeAllElementsCommissionSettingsInPosCreatePage() {
        posmanagementpage.posManagementPosCreateCommissionSettingsAllElementsAreDisplayed();
    }

    @Step("User click Back Button in Commission Settings")
    public void userClickBackButtonInCommissionSettings() {
        posmanagementpage.posManagementPosCreateCommissionSettingsBackButtonSubmit();
    }

    @Step("User click Next Button in Commission Information")
    public void userClickNextButtonInCommissionInformation() {
        posmanagementpage.posManagementPosCreateCommissionSettingsNextButtonSubmit();
    }

    @Step("User see all elements Pos Credentials in Pos Create Page")
    public void userSeeAllElementsPosCredentialsInPosCreatePage() {
        posmanagementpage.posManagementPosCreatePosCredentialsAllElementsAreDisplayed();
    }

    @Step("User click Back Button in Pos Credentials")
    public void userClickBackButtonInPosCredentials() {
        posmanagementpage.posManagementPosCreatePosCredentialsBackButtonSubmit();
    }

    @Step("User see Pos Commission Page")
    public void userSeePosCommissionPage() {
        posmanagementpage.posManagementOneElementIsDisplayed();
    }

    @Step("User type Pos Name")
    public void userTypePosName() {
        posmanagementpage.posManagementTypePosName();
    }

    @Step("User type Value Date")
    public void userTypeValueDate() {
        posmanagementpage.posManagementTypeValueDate();
    }

    @Step("User type Bin Number")
    public void userTypeBinNumber() {
        posmanagementpage.posManagementTypeBinNumber();
    }

    @Step("User select Pos Bank")
    public void userSelectPosBank(String posBank) {
        posmanagementpage.posManagementPosBankDropdownClick(posBank);
    }

    @Step("User select Card Program")
    public void userSelectCardProgram(String cardProgram) {
        posmanagementpage.posManagementCardProgramDropdownClick(cardProgram);
    }

    @Step("User select Status")
    public void userSelectStatus(String status) {
        posmanagementpage.posManagementStatusDropdownClick(status);
    }

    @Step("User select Currency")
    public void userSelectCurrency() {
        posmanagementpage.posManagementCurrencyDropdownClick();
    }

    @Step("User type Onus CC commission rate")
    public void userTypeCommissionRateOnusCC(String OnusCC) {
        posmanagementpage.posManagementTypeCommissionRateOnusCC(OnusCC);
    }

    @Step("User type NotOnus CC commission rate")
    public void userTypeCommissionRateNotOnusCC(String NotOnusCC) {
        posmanagementpage.posManagementTypeCommissionRateNotOnusCC(NotOnusCC);
    }

    @Step("User type Onus Debit commission rate")
    public void userTypeCommissionRateOnusDebit(String OnusDebit) {
        posmanagementpage.posManagementTypeCommissionRateOnusDebit(OnusDebit);
    }

    @Step("User type NotOnus Debit commission rate")
    public void userTypeCommissionRateNotOnusDebit(String NotOnusDebit) {
        posmanagementpage.posManagementTypeCommissionRateNotOnusDebit(NotOnusDebit);
    }

    @Step("User select Allow Authorize checkbox")
    public void userSelectAllowAuthorizeCheckbox() {
        posmanagementpage.posManagementAllowAuthorizationCheckboxClick();
    }

    @Step("User select Allow PreAuthorize checkbox")
    public void userSelectAllowPreAuthorizeCheckbox() {
        posmanagementpage.posManagementAllowPreAuthorizationCheckboxClick();
    }

    @Step("User type Parameter Name and Parameter Value")
    public void userTypeParameterNameAndParameterValue(String parameterName, String parameterValue) {
        posmanagementpage.posManagementTypeParameterNameAndParameterValue(parameterName,parameterValue);
    }

    @Step("User click edit button in Pos Management Page")
    public void userClickEditButtonInPosManagementPage() {
        posmanagementpage.posManagementUpdateButtonClick();
    }
    @Step("User see information text")
    public void userSeeInformation(String info) {
        posmanagementpage.posManagementInformationText(info);
    }

    @Step("User clear text field")
    public void userClearTextField() {
        posmanagementpage.posManagementClearTextField();
    }

    @Step("User click save button")
    public void userClickSaveButton() {
        posmanagementpage.posManagementSaveButtonClick();
    }

    @Step("User click Pos Name")
    public void userClickPosName() {
        posmanagementpage.posManagementPosNameClick();
    }

    @Step("User select Pos Name")
    public void userSelectPosName(String posName) {
        posmanagementpage.posManagementSelectPosName(posName);
    }

    @Step("User click search button")
    public void userClickSearchButton() {
        posmanagementpage.posManagementSearchButtonSubmit();
    }

    @Step("User check Pos Name on table")
    public void userCheckPosNameOnDataTable(String posName) {
        posmanagementpage.posManagementCheckPosName(posName);
    }

    @Step("User type Pos Bank")
    public void userTypePosBank(String posBank) {
        posmanagementpage.posManagementTypePosBank(posBank);
    }

    @Step("User see filtered on data table")
    public void userSeeFilteredOnDataTable(String valueOnTable) {
        posmanagementpage.checkDataTable(valueOnTable);
    }

    @Step("User click pos default switch button")
    public void userClickPosDefaultSwitchButton() {
        posmanagementpage.posManagementPosDefaultSwitchButtonClick();
    }

    @Step("User click pos status switch button")
    public void userClickPosStatusSwitchButton() {
        posmanagementpage.posManagementPosStatusSwitchButtonClick();
    }
}
