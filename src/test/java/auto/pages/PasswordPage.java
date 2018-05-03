package auto.pages;

import auto.objectpack.PasswordPageObjects;
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
public class PasswordPage extends Services {
    public AppiumDriver driver;
    public PasswordPageObjects passwordPageObjects;


    public PasswordPage(AppiumDriver driver) {
        super(driver);
        passwordPageObjects = new PasswordPageObjects();
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver, 15, TimeUnit.SECONDS), passwordPageObjects);

    }

    public void enterPassword() {


        waitForElement(passwordPageObjects.passwordLink).click();
        waitForElement(passwordPageObjects.password).sendKeys("<password>");
        waitForElement(passwordPageObjects.nextBtn).click();
        takeScreenshot("enterPassword");

    }
}
