package auto.testcases;

import auto.pages.WelcomePage;
import auto.utils.BaseTest;
import org.testng.annotations.Test;

/**
 * Created by: Anuj Kumar
 * Email: cdac.anuj@gmail.com
 * Date: May 03, 2018
 */

public class WordPressTest extends BaseTest {


    @Test
    public void testlogin() {

        WelcomePage welcomePage = new WelcomePage(driver);
        welcomePage.login().enterPassword();

    }


}
