package com.crowdar.examples.pages;

import com.crowdar.core.pageObjects.PageBaseMobile;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.server.handler.interactions.touch.Scroll;

public class PHPTravelHotelPage extends PageBaseMobile {
    private final String FIRST_ROOM_XPATH="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.TextView";

    public PHPTravelHotelPage(RemoteWebDriver driver) {
        super(driver);
    }

    public void clickFirstRoom(){
        scrollToElementByResourceId("com.phptravelsnative:id/booking");
        clickElement(MobileBy.xpath(FIRST_ROOM_XPATH));
    }

}
