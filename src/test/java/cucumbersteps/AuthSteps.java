package cucumbersteps;

import context.TestContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import static io.restassured.RestAssured.given;

public class AuthSteps {
    private Response response;

    @Given("the payment request payload is valid")
    public void thePaymentRequestPayloadIsValid() {
    }

    @When("I send the payment request")
    public void iSendThePaymentRequest() {
        Random rnd = new Random();
        int rndCount = rnd.nextInt(1000000,9999999);
        String platformOrderId = "ypay" + rndCount;
        Map<String, Object> payload = new HashMap<>();
        payload.put("amount", 9787);
        payload.put("cardNumber", "4543600353450151");
        payload.put("expirationYear", "2033");
        payload.put("expirationMonth", "03");
        payload.put("cvv", "755");
        payload.put("additionalData", "vendorCode=yp01|platform=Banabi");
        payload.put("orderReferenceNumber", "20240924141547929756");
        payload.put("platformOrderId", platformOrderId);
        payload.put("paymentType", "AUTHORIZE");
        payload.put("isThreedSecure", false);

        response = given()
                .header("Content-Type", "application/json")
                .header("X-API-KEY", "DYWBujsxKaj5")
                .body(payload)
                .post("https://staging-payment-core-api.yemekpay.com/v1/payment/auth");

        response.then().log().all();
        String orderRef = response.jsonPath().getString("orderReferenceNumber");
        TestContext.setOrderReferenceNumber(orderRef);

    }

    @Then("I store the orderReferenceNumber from responsae")
    public void iStoreTheOrderReferenceNumberFromResponsae() {
        String orderRef = response.jsonPath().getString("orderReferenceNumber");
        TestContext.setOrderReferenceNumber(orderRef);
    }

}
