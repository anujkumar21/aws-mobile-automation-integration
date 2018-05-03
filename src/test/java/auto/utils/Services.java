package auto.utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;

/**
 * Created by: Anuj Kumar
 * Email: cdac.anuj@gmail.com
 * Date: May 03, 2018
 */

public class Services {

    AppiumDriver<MobileElement> driver;
    public WebDriverWait wait;

    public Services(AppiumDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 30);
    }

    public MobileElement waitForElement(MobileElement ele) {

        wait.until(ExpectedConditions.elementToBeClickable(ele));
        return ele;
    }

    public void waitForElementXpath(String xpath) {
        wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions
                .presenceOfElementLocated(By.xpath(xpath)));
    }

    /**
     * Take Screenshot
     *
     * @param name file name
     * @return true if successful
     */
    public boolean takeScreenshot(final String name) {
        String screenshotDirectory = System.getProperty("appium.screenshots.dir");
        File screenshot = driver.getScreenshotAs(OutputType.FILE);
        return screenshot.renameTo(new File(screenshotDirectory, String.format("%s.png", name)));
    }
}
