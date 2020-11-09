package pages;

import backend.AutomationContext;
import base.BasePage;
import model.Product;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;

public class CategoryDetailPage extends BasePage {

    Product product = new Product();
    private static CategoryDetailPage instance;

    public static synchronized CategoryDetailPage getInstance() {
        if (instance == null)
            instance = new CategoryDetailPage();
        return instance;
    }

    public void addProduct() {
        log.info("Add Product");
        List<WebElement> productAdd = driver.findElements(By.xpath("//android.widget.ImageView[@resource-id='com.getir.casestudy.dev:id/btnAdd']"));
        List<WebElement> getProductPrice = driver.findElements(By.xpath("//android.widget.TextView[@resource-id='com.getir.casestudy.dev:id/tvPrice']"));
        int productSize = productAdd.size();
        Random random = new Random();
        int randomProduct = random.nextInt(productSize);
        String productPrice = getProductPrice.get(randomProduct).getText();
        product.setProductPrice(productPrice);
        AutomationContext.setProduct(product);
        productAdd.get(randomProduct).click();
    }

    public void basketClick() {
        log.info("Basket Click");
        driver.findElement(By.xpath("//android.widget.ImageView[@resource-id='com.getir.casestudy.dev:id/ga_toolbar_getir10GABasketButton']")).click();
    }
}
