package pages;

import base.BasePage;
import org.openqa.selenium.By;

public class CategoryPage extends BasePage {

    private static CategoryPage instance;

    public static synchronized CategoryPage getInstance() {
        if (instance == null)
            instance = new CategoryPage();
        return instance;
    }

    public void foodCategoryClick() {
        log.info("Food Category Click");
        driver.findElement(By.xpath("//android.widget.TextView[@text='Yiyecek']")).click();
    }

    public void babyCategoryClick() {
        log.info("Baby Category Click");
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"" + "Bebek" +"\"))").click();
    }

    public void milkBreakfastCategoryClick() {
        log.info("Milk Breakfast Category Click");
        driver.findElement(By.xpath("//android.widget.TextView[@text='Süt & Kahvaltı']")).click();
    }
}
