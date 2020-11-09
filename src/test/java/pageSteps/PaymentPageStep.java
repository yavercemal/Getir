package pageSteps;

import com.thoughtworks.gauge.Step;
import pages.PaymentPage;

public class PaymentPageStep {

    private static PaymentPage paymentPage = PaymentPage.getInstance();

    @Step("Payment page control")
    public void paymentPageControl() {
        paymentPage.paymentPageControl();
    }
}
