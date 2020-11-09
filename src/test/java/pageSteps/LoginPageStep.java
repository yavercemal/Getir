package pageSteps;

import base.BasePage;
import com.thoughtworks.gauge.Step;
import pages.LoginPage;

public class LoginPageStep extends BasePage {

    private static LoginPage loginPage = LoginPage.getInstance();

    @Step("Login with email account <userName> <password>")
    public void emailWithLogin(String userName, String password) {
        loginPage.emailWithLogin(userName, password);
    }

    @Step("Profile click")
    public void profileClick() {
        loginPage.profileClick();
    }

    @Step("Logout click")
    public void logoutClick() {
        loginPage.logoutClick();
    }

    @Step("Expect login error message")
    public void loginErrorMessage() {
        loginPage.loginErrorMessage();
    }
}
