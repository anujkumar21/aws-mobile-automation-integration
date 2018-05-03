package auto.pages;

import auto.objectpack.WelocomePageObjects;
import auto.utils.Services;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

/**
 * Created by: Anuj Kumar
 * Email: cdac.anuj@gmail.com
 * Date: May 03, 2018
 */
public class WelcomePage extends Services {
    public AppiumDriver driver;
    public WelocomePageObjects welocomePageObjects;


    public WelcomePage(AppiumDriver driver) {
        super(driver);
        welocomePageObjects = new WelocomePageObjects();
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver, 15, TimeUnit.SECONDS), welocomePageObjects);

    }

    public PasswordPage login() {


        waitForElement(welocomePageObjects.userName).sendKeys("cdac.anuj@gmail.com");
        waitForElement(welocomePageObjects.nextBtn).click();
        takeScreenshot("login");
        return new PasswordPage(driver);

    }
}
