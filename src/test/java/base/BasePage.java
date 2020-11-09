package base;

import com.thoughtworks.gauge.AfterScenario;
import com.thoughtworks.gauge.BeforeScenario;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.apache.commons.logging.Log;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

public class BasePage {

    public static Logger log = Logger.getLogger(Log.class.getName());
    private static final String APPPACKAGE = System.getenv("PACKAGE_NAME");
    private static final String APPACTIVITY = System.getenv("ACTIVITY_NAME");
    public static AndroidDriver driver;

    @BeforeScenario
    public void setUp() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("appPackage", APPPACKAGE);
        capabilities.setCapability("appActivity", APPACTIVITY);
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Automation");
        capabilities.setCapability(MobileCapabilityType.UDID, "RF8N116BFDX");
        capabilities.setCapability("platformName", "ANDROID");
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");
        try {
            driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterScenario
    public void end() {
        driver.quit();
    }
}

