package context;

import lombok.Getter;

public class TestContext {

    @Getter
    private static String orderReferenceNumber;

    public static void setOrderReferenceNumber(String orderReferenceNumber) {
        TestContext.orderReferenceNumber = orderReferenceNumber;
    }
}
