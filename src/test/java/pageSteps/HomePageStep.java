package pageSteps;

import base.BasePage;
import com.thoughtworks.gauge.Step;
import pages.HomePage;

public class HomePageStep extends BasePage {

    private static HomePage homePage = HomePage.getInstance();

    @Step("Back home page")
    public void profileClick() {
        homePage.backHomePage();
    }

    @Step("Back page")
    public void backPage() {
        homePage.backPage();
    }
}
