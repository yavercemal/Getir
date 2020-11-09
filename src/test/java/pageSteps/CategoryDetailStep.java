package pageSteps;

import com.thoughtworks.gauge.Step;
import pages.CategoryDetailPage;

public class CategoryDetailStep {

    private static CategoryDetailPage categoriPage = CategoryDetailPage.getInstance();

    @Step("Add random product")
    public void addProduct() {
        categoriPage.addProduct();
    }

    @Step("Basket click")
    public void basketClick() {
        categoriPage.basketClick();
    }

}
