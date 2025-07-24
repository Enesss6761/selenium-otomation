package serenitysteps;

import io.cucumber.java.en.And;
import net.thucydides.core.annotations.Step;
import pages.TransactionsPage;

public class TransactionsPageSteps {
    TransactionsPage transactionspage;

    @Step("User click Transactions sub left menu")
    public void userClickTransactionsSubLeftMenu() {
        transactionspage.leftSubMenuTransactionsSubmit();
    }

    @Step("User see Transactions Page")
    public void userSeeTransactionsPage() throws Exception {
        transactionspage.transactionsPageControlUrl();
    }

    @Step("User click more filters in Transactions Page")
    public void userClickMoreFiltersInTransactionsPage() {
        transactionspage.transactionsPageMoreFiltersButtonClick();
    }

    @Step("User see all elements in Transactions Page")
    public void userSeeAllElementsInTransactionsPage() {
        transactionspage.transactionsAllElementsAreDisplayed();
    }

    @Step("User type random order number")
    public void userTypeRandomOrderNumber() {
        transactionspage.paymentTransactionsTypeRandomOrderNumber();
    }

    @Step("User type random platform order number")
    public void userTypeRandomPlatformOrderNumber() {
        transactionspage.paymentTransactionsTypeRandomPlatformOrderNumber();
    }

    @Step("User click search button")
    public void userClickSearchButton() {
        transactionspage.transactionsSearchButtonClick();
    }

    @Step("User see filtered on data table")
    public void userSeeFilteredOnDataTable(String valueOnTable) {
        transactionspage.checkDataTable(valueOnTable);
    }

    @Step("User click transaction type dropdown")
    public void userClickTransactionTypeDropDown() {
        transactionspage.paymentTransactionsTransactionTypeDropDownClick();
    }

    @Step("User filter by transaction type")
    public void userFilterByTransactionType(String transactionType) {
        transactionspage.paymentTransactionsPageTransactionTypeClick(transactionType);
    }

    @Step("User click transaction status dropdown")
    public void userClickTransactionStatusDropDown() {
        transactionspage.paymentTransactionsTransactionStatusDropDownClick();
    }

    @Step("User filter by transaction status")
    public void userFilterByTransactionStatus(String transactionStatus) {
        transactionspage.paymentTransactionsPageTransactionStatusClick(transactionStatus);
    }

    @Step("User click transaction details button")
    public void userClickTransactionDetailsButton() {
        transactionspage.paymentTransactionsDetailsClick();
    }

    @Step("User click transaction details page button")
    public void userClickTransactionDetailsPageButton() {
        transactionspage.paymentTransactionsDetailsPageClick();
    }

    @Step("User check transaction details")
    public void userCheckTransactionDetails(String value, String parameter) {
        transactionspage.checkTransactionDetails(value, parameter);
    }

    @Step("User click start date button")
    public void userClickStartDateButton() {
        transactionspage.clickStartDateButton();
    }

    @Step("User choose start date")
    public void userChooseStartDate(String startDate) {
        transactionspage.chooseStartDate(startDate);
    }

    @Step("User click end date button")
    public void userClickEndDateButton() {
        transactionspage.clickEndDateButton();
    }

    @Step("User choose end date")
    public void userChooseEndDate(String endDate) {
        transactionspage.chooseEndDate(endDate);
    }

    @Step("User click OK button after choose date")
    public void userClickOKButton() {
        transactionspage.clickOKButton();
    }

    @Step("User check selected date on table")
    public void userCheckSelectedDateOnTable(String dateTime) {
        transactionspage.paymentTransactionscheckDateTime(dateTime);
    }

    @Step("User click export to excel on Payment Transactions Page")
    public void userClickExportToExcel() {
        transactionspage.paymentTransactionsPageExportToExcelClick();
    }
}
