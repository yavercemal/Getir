package pages;

import base.BasePage;

public class HomePage extends BasePage {

    private static HomePage instance;

    public static synchronized HomePage getInstance() {
        if (instance == null)
            instance = new HomePage();
        return instance;
    }

    public void backHomePage() {
        log.info("Back Home Page");
        for (int page=0; page<2; page++) {
            driver.navigate().back();
        }
    }

    public void backPage() {
        log.info("Back Page");
        driver.navigate().back();
    }
}
