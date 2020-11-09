package pages;

import base.BasePage;
import org.openqa.selenium.By;

public class LoginPage extends BasePage{

    private static LoginPage instance;

     public static synchronized LoginPage getInstance() {
        if (instance == null)
            instance = new LoginPage();
        return instance;
    }

    public void emailWithLogin(String userName, String password) {
         log.info("Email with login");
        driver.findElement(By.id("com.getir.casestudy.dev:id/usernameEditText")).sendKeys(userName);
        driver.findElement(By.id("com.getir.casestudy.dev:id/passwordEditText")).sendKeys(password);
        driver.findElement(By.id("com.getir.casestudy.dev:id/loginButton")).click();
    }

     public void profileClick() {
         log.info("Profile Click");
         driver.findElement(By.id("com.getir.casestudy.dev:id/ga_toolbar_leftIconImageView")).click();
     }

     public void logoutClick() {
         log.info("Logout Click");
         driver.findElement(By.xpath("//android.widget.TextView[@text='Log out']")).click();
     }

     public void loginErrorMessage() {
         log.info("Login Error Message");
         driver.findElement(By.xpath("//android.widget.Toast[@text='There is an error please review your information and try again']"));
     }
}
