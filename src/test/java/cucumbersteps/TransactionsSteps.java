package cucumbersteps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import serenitysteps.TransactionsPageSteps;

public class TransactionsSteps {
    @Steps
    TransactionsPageSteps transactionspagesteps;

    @And("User click Transactions sub left menu")
    public void userClickTransactionsSubLeftMenu() {
        transactionspagesteps.userClickTransactionsSubLeftMenu();
    }

    @And("User see Transactions Page")
    public void userSeeTransactionsPage() throws Exception {
        transactionspagesteps.userSeeTransactionsPage();
    }

    @When("User click more filters on Payment Transactions Page")
    public void userClickMoreFiltersOnPaymentTransactionsPage() {
        transactionspagesteps.userClickMoreFiltersInTransactionsPage();
    }

    @And("User see all elements on Payment Transactions Page")
    public void userSeeAllElementsOnPaymentTransactionsPage() {
        transactionspagesteps.userSeeAllElementsInTransactionsPage();
    }

    @And("User filters by order number on Payment Transactions Page")
    public void userFiltersByOrderNumberOnPaymentTransactionsPage() {
        transactionspagesteps.userTypeRandomOrderNumber();
    }

    @Then("User see filtered {string} on data table Payment Transactions Page")
    public void userSeeFilteredOnDataTablePaymentTransactionsPage(String valueOnTable) {
        transactionspagesteps.userSeeFilteredOnDataTable(valueOnTable);
    }

    @And("User filters by platform order number on Payment Transactions Page")
    public void userFiltersByPlatformOrderNumberOnPaymentTransactionsPage() {
        transactionspagesteps.userTypeRandomPlatformOrderNumber();
    }

    @And("User filter by transaction type {string} on Payment Transactions Page")
    public void userFilterByTransactionTypeOnPaymentTransactionsPage(String transactionType) {
        transactionspagesteps.userClickTransactionTypeDropDown();
        transactionspagesteps.userFilterByTransactionType(transactionType);
    }

    @And("User filter by transaction status {string} on Payment Transactions Page")
    public void userFilterByTransactionStatusOnPaymentTransactionsPage(String transactionStatus) {
        transactionspagesteps.userClickTransactionStatusDropDown();
        transactionspagesteps.userFilterByTransactionStatus(transactionStatus);
    }

    @Then("User check {string} is value of {string} on transaction details")
    public void userCheckIsValueOfOnTransactionDetails(String value, String parameter) {
        transactionspagesteps.userClickTransactionDetailsButton();
        transactionspagesteps.userClickTransactionDetailsPageButton();
        transactionspagesteps.userCheckTransactionDetails(value, parameter);
    }

    @And("User filter by date {string} between {string} days on Payment Transactions Page")
    public void userFilterByDateBetweenDaysOnPaymentTransactionsPage(String startDay, String endDay) {
        transactionspagesteps.userClickStartDateButton();
        transactionspagesteps.userChooseStartDate(startDay);
        transactionspagesteps.userClickOKButton();
        transactionspagesteps.userClickEndDateButton();
        transactionspagesteps.userChooseEndDate(endDay);
        transactionspagesteps.userClickOKButton();
    }

    @Then("User check {string} date on data table Payment Transactions Page")
    public void userCheckDateOnDataTablePaymentTransactionsPage(String dateTime) {
        transactionspagesteps.userCheckSelectedDateOnTable(dateTime);
    }

    @And("User click Export to Excel on Payment Transactions Page")
    public void userClickExportToExcelOnPaymentTransactionsPage() {
        transactionspagesteps.userClickExportToExcel();
    }

    @And("User click search button on Payment Transactions Page")
    public void userClickSearchButtonOnPaymentTransactionsPage() {
        transactionspagesteps.userClickSearchButton();
    }
}
