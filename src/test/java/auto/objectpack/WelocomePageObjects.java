package auto.objectpack;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

/**
 * Created by: Anuj Kumar
 * Email: cdac.anuj@gmail.com
 * Date: May 03, 2018
 */

public class WelocomePageObjects {

    @AndroidFindBy(id = "org.wordpress.android:id/nux_username")
    public MobileElement userName;

    @AndroidFindBy(id = "org.wordpress.android:id/nux_sign_in_button")
    public MobileElement nextBtn;

    @AndroidFindBy(id = "org.wordpress.android:id/password_layout")
    public MobileElement passwordLink;

    @AndroidFindBy(id = "org.wordpress.android:id/nux_password")
    public MobileElement password;

}
