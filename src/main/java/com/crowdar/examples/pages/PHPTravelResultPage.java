package com.crowdar.examples.pages;

import com.crowdar.core.pageObjects.PageBaseMobile;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.remote.RemoteWebDriver;

public class PHPTravelResultPage extends PageBaseMobile {

    private String FIRST_RESULT_XPATH="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.ListView/android.widget.RelativeLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout[1]/android.widget.ImageView";


    public PHPTravelResultPage(RemoteWebDriver driver) {
        super(driver);
    }

    public void clickFirstResult(){
        clickElement(MobileBy.xpath(FIRST_RESULT_XPATH));
    }

}
