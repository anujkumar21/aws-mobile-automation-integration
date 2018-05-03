package auto.utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.net.URL;

/**
 * Created by: Anuj Kumar
 * Email: cdac.anuj@gmail.com
 * Date: May 03, 2018
 */

public class BaseTest {
    public AppiumDriver driver;
    DesiredCapabilities caps;
    public WebDriverWait wait;

    @BeforeMethod(alwaysRun = true)
    public void setUp() throws Exception {
        try {
            caps = new DesiredCapabilities();
            /*caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
            caps.setCapability(MobileCapabilityType.DEVICE_NAME, "knapster");
            caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "6.0");
            caps.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "org.wordpress.android");
            caps.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,
                    "org.wordpress.android.ui.WPLaunchActivity");
            caps.setCapability(MobileCapabilityType.APP,
                    System.getProperty("user.dir") + "/wordpress.apk");
            caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.ANDROID_UIAUTOMATOR2);*/
            driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
        } catch (Exception ex) {
            System.out.println("Exception.");
        }
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() throws Exception {
        driver.quit();
    }


}
