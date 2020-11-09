package pageSteps;

import com.thoughtworks.gauge.Step;
import pages.CategoryPage;

public class CategoryPageStep {

    private static CategoryPage categoriPage = CategoryPage.getInstance();

    @Step("Food category click")
    public void foodCategoryClick() {
        categoriPage.foodCategoryClick();
    }

    @Step("Baby category click")
    public void babyCategoryClick() {
        categoriPage.babyCategoryClick();
    }

    @Step("Milk breakfast category click")
    public void milkBreakfastCategoryClick() {
        categoriPage.milkBreakfastCategoryClick();
    }
}
