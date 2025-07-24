package serenitysteps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import pages.PaymentRecordsPage;

public class PaymentRecordsPageSteps {
    PaymentRecordsPage paymentrecordspage;

    @Step("User click Payment Records sub left menu")
    public void userClickPaymentRecordsSubLeftMenu() {
        paymentrecordspage.leftSubMenuPaymentRecordsSubmit();
    }

    @Step("User see Payment Records Page")
    public void userSeePaymentRecordsPage() throws Exception {
        paymentrecordspage.paymentRecordsPageControlUrl();
    }

    @Step("User click search button")
    public void userClickSearchButton() {
        paymentrecordspage.paymentRecordsSearchButtonClick();
    }

    @Step("User see all elements in Payment Records Page")
    public void userSeeAllElementsInPaymentRecordsPage() {
        paymentrecordspage.paymentRecordsAllElementsAreDisplayed();
    }

    @Step("User click more filters in Payment Records Page")
    public void userClickMoreFilters() {
        paymentrecordspage.paymentRecordsPageMoreFiltersButtonClick();
    }

    @Step("User type random order number")
    public void userTypeRandomOrderNumber() {
        paymentrecordspage.paymentRecordsTypeRandomOrderNumber();
    }

    @Step("User filter by platform order number")
    public void userTypeRandomPlatformOrderNumber() {
        paymentrecordspage.paymentRecordsTypeRandomPlatformOrderNumber();
    }

    @Step("User filter by payment status")
    public void userFilterByPaymentStatus(String paymentStatus) {
        paymentrecordspage.paymentRecordsPagePaymentStatusDropDownClick();
        paymentrecordspage.paymentRecordsPagePaymentStatusClick(paymentStatus);
    }

    @Step("User filter by merchant name")
    public void userFilterByMerchantName(String merchantName) {
        paymentrecordspage.paymentRecordsPageMerchantNameDropDownClick();
        paymentrecordspage.paymentRecordsPageMerchantNameClick(merchantName);
    }

    @Step("User filter by threeD info")
    public void userFilterByThreeDInfo(String threeDInfo) {
        paymentrecordspage.paymentRecordsPage3DInfoDropDownClick();
        paymentrecordspage.paymentRecordsPage3DInfoClick(threeDInfo);
    }

    @Step("User see filtered on data table")
    public void userSeeFilteredOnDataTable(String valueOnTable) {
        paymentrecordspage.checkDataTable(valueOnTable);
    }

    @Step("User click payment details button")
    public void userClickPaymentDetailsButton() {
        paymentrecordspage.paymentDetailsClick();
    }

    @Step("User click payment details page button")
    public void userClickPaymentDetailsPageButton() {
        paymentrecordspage.paymentDetailsPageClick();
    }

    @Step("User check payment details")
    public void userCheckPaymentDetails(String value, String parameter) {
        paymentrecordspage.checkPaymentDetails(value, parameter);
    }

    @Step("User click start date button")
    public void userClickStartDateButton() {
        paymentrecordspage.clickStartDateButton();
    }

    @Step("User choose start date")
    public void userChooseStartDate(String startDate) {
        paymentrecordspage.chooseStartDate(startDate);
    }

    @Step("User click end date button")
    public void userClickEndDateButton() {
        paymentrecordspage.clickEndDateButton();
    }

    @Step("User choose end date")
    public void userChooseEndDate(String endDate) {
        paymentrecordspage.chooseEndDate(endDate);
    }

    @Step("User click OK button after choose date")
    public void userClickOKButton() {
        paymentrecordspage.clickOKButton();
    }

    @Step("User check selected date on table")
    public void userCheckSelectedDateOnTable(String dateTime) {
        paymentrecordspage.paymentRecordscheckDateTime(dateTime);
    }

    @Step("User click export to excel on Payment Records Page")
    public void userClickExportToExcel() {
        paymentrecordspage.paymentRecordsPageExportToExcelClick();
    }

    @Step("User click refund button on Payment Records Page")
    public void userClickRefundButtonOnPaymentRecordsPage() {
        paymentrecordspage.paymentRecordsPageRefundButtonClick();
    }

    @Step("User click refund reason dropdown on Payment Records Page")
    public void userClickRefundReasonDropDownOnPaymentRecordsPage() {
        paymentrecordspage.paymentRecordsPageRefundReasonDropdownClick();
    }

    @Step("User select refund reason on Payment Records Page")
    public void userSelectRefundReasonOnPaymentRecordsPage(String reason) {
        paymentrecordspage.paymentRecordsPageRefundReasonClick(reason);
    }

    @Step("User type refund amount on Payment Records Page")
    public void userTypeRefundAmountOnPaymentRecordsPage(String amount) {
        paymentrecordspage.paymentRecordsPageTypeRefundAmount(amount);
    }

    @Step("User click refund submit on Payment Records Page")
    public void userClickRefundSubmitOnPaymentRecordsPage() {
        paymentrecordspage.paymentRecordsPageRefundSubmitButtonClick();
    }

    @Step("User type internal order number on Payment Records Page")
    public void userTypeInternalOrderNumberOnPaymentRecordsPage(String orderRef) {
        paymentrecordspage.typeInternalOrder(orderRef);
    }

    @Step("User see information text")
    public void userSeeInformation(String info) {
        paymentrecordspage.paymentRecordsPageInformationText(info);
    }
}
