package pageSteps;

import base.BasePage;
import com.thoughtworks.gauge.Step;
import pages.BasketPage;

public class BasketPageStep extends BasePage {

    private static BasketPage basketPage = BasketPage.getInstance();

    @Step("Basket product control")
    public void basketProductControl() {
        basketPage.basketProductControl();
    }

    @Step("Twice product remove")
    public void twiceProductRemove() {
        basketPage.twiceProductRemove();
    }

    @Step("Single product remove")
    public void singleProductRemove() {
        basketPage.singleProductRemove();
    }
    @Step("Empty page check")
    public void emptyPageCheck() {
        basketPage.emptyPageCheck();
    }

    @Step("Increment all products")
    public void incrementAllProducts() {
        basketPage.incrementAllProducts();
    }

    @Step("Basket calculate total amount")
    public void basketCalculateTotalAmount() {
        basketPage.basketCalculateTotalAmount();
    }

    @Step("Payment button click")
    public void paymentButtonClick() {
        basketPage.paymentButtonClick();
    }
}
