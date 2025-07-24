package serenitysteps;

import net.thucydides.core.annotations.Step;
import pages.FraudManagementPage;

public class FraudManagementPageSteps {
    FraudManagementPage fraudmanagementpage;

    @Step("User click fraud management sub left menu")
    public void userClickFraudManagementSubLeftMenu() {
        fraudmanagementpage.leftSubMenuFraudManagementSubmit();
    }

    @Step("User see fraud management Page")
    public void userSeeFraudManagementPage() throws Exception {
        fraudmanagementpage.fraudManagementPagePageControlUrl();
    }

    @Step("User click more filters in Fraud Management Page")
    public void userClickMoreFiltersInFraudManagementPage() {
        fraudmanagementpage.leftSubMenuFraudManagementMoreFiltersSubmit();
    }

    @Step("User see all elements in Fraud Management Page")
    public void userSeeAllElementsInFraudManagementPage() {
        fraudmanagementpage.fraudRulesPageAllElementsAreDisplayed();
    }

    @Step("User type Min Score Max Score Min Amount Max Amount")
    public void userTypeMinMaxScoresAndAmounts(String minScore, String maxScore, String minAmount, String maxAmount) {
        fraudmanagementpage.fraudManagementTypeMinMaxScoresAndAmounts(minScore,maxScore,minAmount,maxAmount);
    }

    @Step("User click Search Button")
    public void userClickSearchButton() {
        fraudmanagementpage.fraudManagementSearchButtonClick();
    }

    @Step("User check score on data table")
    public void userCheckScoreOnTable(String score) {
        fraudmanagementpage.fraudManagementCheckScoreOnTable(score);
    }

    @Step("User check amount on data table")
    public void userCheckAmountOnTable(String amount) {
        fraudmanagementpage.fraudManagementCheckAmountOnTable(amount);
    }

    @Step("User click merchant name drop down")
    public void userClickMerchantNameDropdown() {
        fraudmanagementpage.fraudManagementPageMerchantNameDropDownClick();
    }

    @Step("User select merchant name")
    public void userSelectMerchantName(String merchantName) {
        fraudmanagementpage.fraudManagementPageMerchantNameClick(merchantName);
    }

    @Step("User see filtered on data table")
    public void userSeeFilteredOnDataTable(String valueOnTable) {
        fraudmanagementpage.checkDataTable(valueOnTable);
    }

    @Step("User click transaction status drop down")
    public void userClickTransactionStausDropdown() {
        fraudmanagementpage.fraudManagementPageTransactionStatusDropDownClick();
    }

    @Step("User select transaction status")
    public void userSelectTransactionStaus(String status) {
        fraudmanagementpage.fraudManagementPageTransactionStatusClick(status);
    }

    @Step("User click export to excel on Fraud Management Page")
    public void userClickExportToExcel() {
        fraudmanagementpage.fraudManagementPageExportToExcelClick();
    }
}
