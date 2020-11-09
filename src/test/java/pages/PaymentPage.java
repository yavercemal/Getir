package pages;

import backend.AutomationContext;
import base.BasePage;
import org.openqa.selenium.By;

public class PaymentPage extends BasePage {

    private static PaymentPage instance;

    public static synchronized PaymentPage getInstance() {
        if (instance == null)
            instance = new PaymentPage();
        return instance;
    }

    public void paymentPageControl() {
        log.info("Payment Page Control");
        String getTotalAmount = driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.getir.casestudy.dev:id/tvAmount']")).getText();
        if (getTotalAmount.contains(AutomationContext.getProduct().getProductPrice())){
            log.info("Product price true");
        }
    }
}
