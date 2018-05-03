package auto.objectpack;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

/**
 * Created by: Anuj Kumar
 * Email: cdac.anuj@gmail.com
 * Date: May 03, 2018
 */

public class PasswordPageObjects {

    @AndroidFindBy(id = "org.wordpress.android:id/password_layout")
    public MobileElement passwordLink;

    @AndroidFindBy(id = "org.wordpress.android:id/nux_password")
    public MobileElement password;

    @AndroidFindBy(id = "org.wordpress.android:id/nux_sign_in_button")
    public MobileElement nextBtn;

}
