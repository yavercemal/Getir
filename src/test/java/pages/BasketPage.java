package pages;

import backend.AutomationContext;
import base.BasePage;
import model.Product;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class BasketPage extends BasePage {

    Product product = new Product();
    private static BasketPage instance;

    public static synchronized BasketPage getInstance() {
        if (instance == null)
            instance = new BasketPage();
        return instance;
    }

    public void basketProductControl() {
        log.info("Basket Product Control");
        List<WebElement> basketProductControl = driver.findElements(By.xpath("//android.widget.ImageView[@resource-id='com.getir.casestudy.dev:id/tvTitle']"));
        int productSize = basketProductControl.size();
        int sayac = 0;
        while (productSize>sayac){
            if (basketProductControl.get(sayac).equals(AutomationContext.getProduct().getProductPrice())){
                break;
            }
             sayac++;
        }
    }

    public void twiceProductRemove()
    {
        log.info("Twice Product Remove");
        List<WebElement> basketProductControl = driver.findElements(By.xpath("//android.widget.ImageView[@resource-id='com.getir.casestudy.dev:id/btnRemove']"));
        int productSize = basketProductControl.size()*2;
        int sayac = 1;
        while (productSize>=sayac) {
            driver.findElement(By.xpath("//android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.ImageView[1]")).click();
            sayac++;
        }
    }

   public void singleProductRemove()
    {
        log.info("Single Product Remove");
        List<WebElement> basketProductControl = driver.findElements(By.xpath("//android.widget.ImageView[@resource-id='com.getir.casestudy.dev:id/btnRemove']"));
        int productSize = basketProductControl.size();
        int sayac = 1;
        while (productSize>=sayac) {
            driver.findElement(By.xpath("//android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.ImageView[1]")).click();
            sayac++;
        }
    }

    public void emptyPageCheck() {
        log.info("Empty Page Check");
        driver.findElement(By.xpath("//android.widget.TextView[@text='There is no result']"));
    }

    public void paymentButtonClick() {
        log.info("Payment Button Click");
        driver.findElement(By.id("com.getir.casestudy.dev:id/btnCheckout")).click();
    }

    public void basketCalculateTotalAmount() {
        log.info("Basket Calculate Total Amount");
        String getTotalAmount = driver.findElement(By.id("com.getir.casestudy.dev:id/tvTotalTitle")).getText();
        product.setProductPrice(getTotalAmount);
        AutomationContext.setProduct(product);
    }

    public void incrementAllProducts() {
        log.info("increment All Products");
        List<WebElement> basketProductControl = driver.findElements(By.xpath("//android.widget.ImageView[@resource-id='com.getir.casestudy.dev:id/btnAdd']"));
        int productSize = basketProductControl.size();
        int sayac = 0;
        while (productSize>sayac){
            basketProductControl.get(sayac).click();
            sayac++;
        }
    }
}
